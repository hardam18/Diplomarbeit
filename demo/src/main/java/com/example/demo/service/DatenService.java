package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Daten;
import com.example.demo.repository.DatenRepository;

import java.util.*;

@Service
@Transactional
public class DatenService {
    
    @Autowired
    private DatenRepository datenRepository;
    
    public List<Daten> listAllDaten() {
        return datenRepository.findAll();
    }

    public void saveDaten(Daten daten) {
        datenRepository.save(daten);
    }

    public Daten getDaten(Integer id) {
        return datenRepository.findById(id).get();
    }

    public void deleteDaten(Integer id) {
        datenRepository.deleteById(id);
    }
}
