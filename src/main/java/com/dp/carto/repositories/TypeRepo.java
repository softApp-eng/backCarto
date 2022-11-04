package com.dp.carto.repositories;

import com.dp.carto.entities.Entite;
import com.dp.carto.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface TypeRepo extends JpaRepository<Type,Long> {
}
