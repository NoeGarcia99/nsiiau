package com.cgsait.nsiiaupruebas.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PKModuloRol implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="romo_aprol_id")
	private String id_rol;
	@Column(name="romo_apmo_id")
	private String id_modulo;
	@Column(name="romo_apli_id")
	private String id_aplicacion;
}
