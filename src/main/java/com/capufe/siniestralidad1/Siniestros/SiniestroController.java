package com.capufe.siniestralidad1.Siniestros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class SiniestroController {

    @Autowired
    SiniestroService siniestroService;

    @GetMapping("/")
    public String helloWorld() {
        return "Hola Mundo";
    }

    @GetMapping("/siniestros")
    public List<SiniestroModel> findAll() {
        return siniestroService.findAll();
    }

    @GetMapping("/siniestros/{id}")
    @ResponseBody
    public SiniestroModel fingById(@PathVariable Long id) {
        return siniestroService.findById(id);
    }

    @PostMapping("/siniestros")
    @ResponseBody
    public SiniestroModel save(@RequestBody SiniestroModel siniestroModel){
        return siniestroService.save(siniestroModel);
    }

    @DeleteMapping("/siniestros/{id}")
    public void delete(@PathVariable( "id" ) Long id) {
        siniestroService.delete(id);
    }

}
