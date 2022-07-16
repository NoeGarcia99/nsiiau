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
@Table(name = "ssgbaprol")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RolSistema {

	@EmbeddedId
	private PKRolSistema pk_rol_sistema;
	@Column(name="aprol_apli_id")
	private String descripcion;
	@Column(name="aprol_apli_id")
	private int activo;
	@Column(name = "aprol_usua")
	private String usuario_mov;
	@Column(name = "aprol_fech")
	private String fecha_mov;
	@Column(name = "aprol_ip")
	private String ip_mov;
}
