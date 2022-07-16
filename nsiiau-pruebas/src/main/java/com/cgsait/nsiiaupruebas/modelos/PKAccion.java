package com.cgsait.nsiiaupruebas.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PKAccion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="acci_id")
	private String id_accion;
	@Column(name="acci_apmo_id")
	private String id_modulo;
	@Column(name="acci_apli_id")
	private String id_aplicacion;
}
