package com.dp.carto.repositories;

import com.dp.carto.entities.Entite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface EntiteRepo extends JpaRepository<Entite,Long> {
}
