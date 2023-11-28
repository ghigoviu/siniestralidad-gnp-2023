package com.capufe.siniestralidad1.Siniestros;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "siniestro")
public class SiniestroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String folio;

    SiniestroModel(Long id, String folio) {
        this.id = id;
        this. folio = folio;
    }

    SiniestroModel(){}

}
