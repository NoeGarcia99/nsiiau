package com.cgsait.nsiiaupruebas.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PKRolAccion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="roac_aprol_id")
	private String id_rol;
	@Column(name="roac_apmo_id")
	private String id_modulo;
	@Column(name="roac_apli_id")
	private String id_aplicacion;
	@Column(name="roac_acci_id")
	private String id_accion;
}
