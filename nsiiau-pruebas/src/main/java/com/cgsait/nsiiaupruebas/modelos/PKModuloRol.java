package com.cgsait.nsiiaupruebas.modelos;

import java.io.Serializable;
import java.sql.Timestamp;

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
public class PKModuloRol implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="romo_aprol_id")
	private String id_rol;
	@Column(name="romo_apmo_id")
	private String id_modulo;
	@Column(name="romo_apli_id")
	private String id_aplicacion;
}
