package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Daten;
import com.example.demo.service.DatenService;

import java.util.*;

@RestController
public class DatenController {
    @Autowired
    DatenService datenService;

    @GetMapping("/daten")
    public List<Daten> list() {
        return datenService.listAllDaten();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Daten> get(@PathVariable Integer id) {
        try {
            Daten daten = datenService.getDaten(id);
            return new ResponseEntity<Daten>(daten, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Daten>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Daten daten) {
        datenService.saveDaten(daten);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Daten daten, @PathVariable Integer id) {
        try {
            //Daten existDaten = datenService.getDaten(id);
            daten.setId(id);            
            datenService.saveDaten(daten);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        datenService.deleteDaten(id);
    }
    
}
