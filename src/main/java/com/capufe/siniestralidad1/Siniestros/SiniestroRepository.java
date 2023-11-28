package com.capufe.siniestralidad1.Siniestros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiniestroRepository extends JpaRepository<SiniestroModel, Long> {

}
