package com.puntodeventa.ventanita.model.dto;

import com.puntodeventa.ventanita.model.Entidades.Marca;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductosDTO {
    
     private Integer id_product;
 
    private String nombre;
   
    private Integer cantidad;
  
    private Integer precioDeCompra;
   
    private Integer precioDeVenta;
    private Marca marca;
    

}
