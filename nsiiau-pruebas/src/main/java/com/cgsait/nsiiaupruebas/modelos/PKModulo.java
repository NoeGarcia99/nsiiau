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
public class PKModulo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="apmo_id")
	private String id_modulo;
	@Column(name="apmo_apli_id")
	private String id_aplicacion;
}
