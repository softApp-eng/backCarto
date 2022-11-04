package com.dp.carto.service;

import com.dp.carto.entities.Entite;
import com.dp.carto.repositories.EntiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntiteSvc {
    @Autowired
    private EntiteRepo entiteRepo;

    public Entite addEntite(Entite entite){
        return entiteRepo.save(entite);
    }
    public List<Entite> findAllEntite(){
        return entiteRepo.findAll();
    }
    public Entite findByIdEntite(Long id){
        return entiteRepo.findById(id).get();
    }
    public Entite updateEntite(Entite entite){
        return entiteRepo.save(entite);
    }
    public void deleteEntite(Long id){
        entiteRepo.deleteById(id);
    }
}
