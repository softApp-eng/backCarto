package com.dp.carto.service;

import com.dp.carto.entities.Categorie;
import com.dp.carto.entities.Entite;
import com.dp.carto.repositories.CategorieRepo;
import com.dp.carto.repositories.EntiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieSvc {
    @Autowired
    private CategorieRepo x;

    public Categorie addCat(Categorie cat){
        return x.save(cat);
    }
    public List<Categorie> findAllCat(){
        return x.findAll();
    }
    public Categorie findCatById(Long id){
        return x.findById(id).get();
    }
    public Categorie updateEntite(Categorie cat){
        return x.save(cat);
    }
    public void deleteEntite(Long id){
        x.deleteById(id);
    }
}
