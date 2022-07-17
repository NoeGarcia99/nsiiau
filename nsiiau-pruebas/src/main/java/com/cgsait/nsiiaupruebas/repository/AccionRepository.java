package com.cgsait.nsiiaupruebas.repository;

import org.springframework.data.repository.CrudRepository;

import com.cgsait.nsiiaupruebas.modelos.Accion;
import com.cgsait.nsiiaupruebas.modelos.PKAccion;

public interface AccionRepository extends CrudRepository<Accion, PKAccion>{

}
