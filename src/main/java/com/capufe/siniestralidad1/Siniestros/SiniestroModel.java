package com.capufe.siniestralidad1.Siniestros;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "siniestro")
public class SiniestroModel {
    private Long id;
    private String folio;

}
