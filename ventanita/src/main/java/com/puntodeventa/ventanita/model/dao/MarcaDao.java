package com.puntodeventa.ventanita.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.puntodeventa.ventanita.model.Entidades.Marca;

public interface MarcaDao extends JpaRepository<Marca,Integer>{

}
