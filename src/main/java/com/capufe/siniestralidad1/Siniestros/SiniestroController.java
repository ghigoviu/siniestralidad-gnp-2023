package com.capufe.siniestralidad1.Siniestros;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/siniestros")
public class SiniestroController {

    @GetMapping("/{id}")
    public SiniestroDTO encontrarPorId(@PathVariable String id) {

    }

    @PostMapping
    public SiniestroDTO crear(@RequestBody SiniestroDTO) {

    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable( "id" ) String id, @RequestBody SiniestroDTO usuario) {
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable( "id" ) String id) {
    }

}
