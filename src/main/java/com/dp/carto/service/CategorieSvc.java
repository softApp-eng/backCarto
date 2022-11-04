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
    private CategorieRepo categorieRepo;

    public Categorie addCat(Categorie categorie){
        return categorieRepo.save(categorie);
    }
    public List<Categorie> findAllEntite(){
        return categorieRepo.findAll();
    }
    public Categorie findByIdEntite(Long id){
        return categorieRepo.findById(id).get();
    }
    public Categorie updateEntite(Categorie categorie){
        return categorieRepo.save(categorie);
    }
    public void deleteEntite(Long id){
        categorieRepo.deleteById(id);
    }
}
