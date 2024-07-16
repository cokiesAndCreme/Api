package com.puntodeventa.ventanita.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puntodeventa.ventanita.model.Entidades.Producto;

public interface ProductoDao extends JpaRepository<Producto,Integer>{

}
