package com.cgsait.nsiiaupruebas.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PKPrivilegiosUsuarioRol implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="priv_apli_id")
	private String id_aplicacion;
	@Column(name="priv_usua_id")
	private String id_usuario;
	@Column(name="priv_rol_id")
	private String id_rol;
	@Column(name="priv_enti_id")
	private int id_entidad;
}
