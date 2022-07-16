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
@Table(name = "ssgrroac")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelacionRolAccion {

	@EmbeddedId
	private PKRolAccion pk_rol_accion;
	@Column(name = "roac_usua")
	private String usuario_mov;
	@Column(name = "roac_fech")
	private String fecha_mov;
	@Column(name = "roac_ip")
	private String ip_mov;
}
