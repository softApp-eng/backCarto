package com.dp.carto.repositories;

import com.dp.carto.entities.Categorie;
import com.dp.carto.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface MarqueRepo extends JpaRepository<Marque,Long> {
}
