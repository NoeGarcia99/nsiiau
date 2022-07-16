package com.cgsait.nsiiaupruebas.modelos;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgrustro")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelacionTipoUsuarioRol {

	@EmbeddedId
	private PKTipoUsuarioRol pk_tipo_usuario_rol;
	@Column(name = "ustro_usua")
	private String usuario_mov;
	@Column(name = "ustro_fech")
	private String fecha_mov;
	@Column(name = "ustro_ip")
	private String ip_mov;
}
