package com.dp.carto.repositories;

import com.dp.carto.entities.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface MaterielRepo extends JpaRepository<Materiel,String> {
}
