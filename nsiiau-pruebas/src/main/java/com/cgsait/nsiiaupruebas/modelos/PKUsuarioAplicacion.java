package com.cgsait.nsiiaupruebas.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PKUsuarioAplicacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="usap_apli_id")
	private String id_aplicacion;
	@Column(name="usap_usua_id")
	private String id_usuario;
}
