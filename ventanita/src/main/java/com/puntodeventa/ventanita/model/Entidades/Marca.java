package com.puntodeventa.ventanita.model.Entidades;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Marca implements Serializable{
    @Id
    @Column(name = "id_marca")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "marca_name")
    private String nombre;
    @Column (name ="categoria")
    private String categoria;
    
    public Marca(Integer id) {
        this.id = id;
    }
    

//     @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonIgnoreProperties("marca")
//     private List<Producto> productos;
}
