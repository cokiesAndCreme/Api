package com.puntodeventa.ventanita.Service;

import java.util.List;

import com.puntodeventa.ventanita.model.Entidades.Producto;
import com.puntodeventa.ventanita.model.dto.ProductosDTO;

public interface iProductos {
    ProductosDTO save (ProductosDTO productosDTO);
    ProductosDTO findbyid(Integer id);
    void deletebyid (Integer id);
    void deleteAll(ProductosDTO productosDTO);
    Boolean idexist (Integer id);
    List<Producto> findAll();


    // ProductosDTO save (ProductosDTO productosDTO);
    // ProductosDTO findbyid(Integer id);
    // void deletebyid (Integer id);
    // void delete(ProductosDTO productosDTO);
    
    

}
