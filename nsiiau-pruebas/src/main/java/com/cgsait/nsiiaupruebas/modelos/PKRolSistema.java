package com.cgsait.nsiiaupruebas.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PKRolSistema implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="aprol_id")
	private String id_rol;
	@Column(name="aprol_apli_id")
	private String id_aplicacion;
}
