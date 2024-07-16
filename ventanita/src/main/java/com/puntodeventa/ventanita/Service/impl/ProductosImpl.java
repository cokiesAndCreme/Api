package com.puntodeventa.ventanita.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntodeventa.ventanita.Service.iProductos;
import com.puntodeventa.ventanita.model.Entidades.Producto;
import com.puntodeventa.ventanita.model.dao.ProductoDao;
import com.puntodeventa.ventanita.model.dto.ProductMapper;
import com.puntodeventa.ventanita.model.dto.ProductosDTO;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductosImpl implements iProductos {

    @Autowired
    private ProductoDao ProductoDao;

    @Autowired
    private ProductMapper productMapper;

    @Transactional
    @Override
    public ProductosDTO save(ProductosDTO productos) {
        Producto producto = productMapper.productoDto(productos);
        ProductoDao.save(producto);
        return productos;
    }

    @Transactional(readOnly = true)
    @Override
    public ProductosDTO findbyid(Integer id) {
        Producto p = ProductoDao.findById(id).orElse(null);
        ProductosDTO productosDTO = productMapper.DtoToProduct(p);
        return productosDTO;
    }

    @Override
    public void deletebyid(Integer id) {
        ProductoDao.deleteById(id);
    }

    @Override
    public Boolean idexist(Integer id) {
        return ProductoDao.existsById(id);
    }

    @Override
    public void deleteAll(ProductosDTO productosDTO) {
        ProductoDao.deleteAll();
    }

    @Transactional
    @Override
    public List<Producto> findAll() {
        return ProductoDao.findAll();
    }


}
