package com.puntodeventa.ventanita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.puntodeventa.ventanita.Service.iProductos;
import com.puntodeventa.ventanita.model.Entidades.Producto;
import com.puntodeventa.ventanita.model.dto.ProductosDTO;
import com.puntodeventa.ventanita.model.payload.MensajeResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api/v1") // V
public class Controllador {

  @Autowired
  private iProductos iProductos;

  @PostMapping("producto/save")
  public ResponseEntity<?> crear(@RequestBody ProductosDTO productoDTO) {
    ProductosDTO productossave = null;
    try {
      productossave = iProductos.save(productoDTO);
      return new ResponseEntity<>(MensajeResponse
          .builder()
          .mensaje("se logro pibe")
          .objeto(productossave)
          .build(), HttpStatus.OK);

    } catch (Exception e) {
      return new ResponseEntity<>(MensajeResponse
          .builder()
          .mensaje(e.getMessage())
          .objeto(null)
          .build(), HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("producto/{id}")
  public ResponseEntity<?> encontrarporid(@PathVariable Integer id) {
    ProductosDTO chicloso = iProductos.findbyid(id);
    if (!iProductos.idexist(id)) {
      return new ResponseEntity<>(MensajeResponse.builder()
          .mensaje("no se pudo pa")
          .objeto(null)
          .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(MensajeResponse.builder()
        .mensaje("SI SE PUDO PA")
        .objeto(chicloso)
        .build(), HttpStatus.OK);

  }

  @DeleteMapping("eliminar/{id}")
  public ResponseEntity<?> eliminar(@PathVariable Integer id) {
    if (iProductos.idexist(id)) {
      iProductos.deletebyid(id);
      return new ResponseEntity<>(MensajeResponse
          .builder()
          .mensaje("Ya quedo padrino, se fue alv")
          .objeto(null)
          .build(), HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(MensajeResponse
        .builder()
        .mensaje("No se pudo mai el id no exixte ")
        .objeto(null)
        .build(), HttpStatus.NO_CONTENT);

  }

  @DeleteMapping("eliminarlos")
  public ResponseEntity<?> eliminatTodos() {
    iProductos.deleteAll(null);
    return new ResponseEntity<>(MensajeResponse
        .builder()
        .mensaje("ya esta pa")
        .objeto(null)
        .build(), HttpStatus.NO_CONTENT);
        
  }


  @GetMapping("productos")
  public ResponseEntity<?> encontrarTos() {
  List <Producto> productos  = iProductos.findAll();
      return new ResponseEntity<>(MensajeResponse
      .builder()
      .mensaje("aaaaaaa me corooooo ")
      .objeto(productos)
      .build(), HttpStatus.OK);
  }
  


}
