package com.capufe.siniestralidad1.Siniestros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiniestroService {

    @Autowired
    SiniestroRepository siniestroRepository;

    public List<SiniestroModel> findAll() {
        return siniestroRepository.findAll();
    }

    public SiniestroModel findById(Long id) {
        return siniestroRepository.findById(id).orElse(null);

    }

    public SiniestroModel save(SiniestroModel siniestroModel) {
        return siniestroRepository.save(siniestroModel);
    }

    public void delete(Long id) {
        siniestroRepository.deleteById(id);
    }
}
