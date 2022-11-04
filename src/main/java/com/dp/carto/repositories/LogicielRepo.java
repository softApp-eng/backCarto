package com.dp.carto.repositories;

import com.dp.carto.entities.Logiciel;
import com.dp.carto.entities.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface LogicielRepo  extends JpaRepository<Logiciel,String> {
}
