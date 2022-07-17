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
public class PKTipoUsuarioAplicacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="tuap_tius_id")
	private String id_tipo_usuario;
	@Column(name="tuap_apli_id")
	private String id_aplicacion;
}
