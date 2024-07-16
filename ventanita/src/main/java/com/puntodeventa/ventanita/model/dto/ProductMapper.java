package com.puntodeventa.ventanita.model.dto;

import org.mapstruct.Mapper;

import com.puntodeventa.ventanita.model.Entidades.Producto;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Producto productoDto(ProductosDTO productoDTO);

    ProductosDTO DtoToProduct (Producto producto);
}
