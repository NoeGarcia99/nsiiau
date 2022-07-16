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
@Table(name = "ssgrusap")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelacionUsuarioAplicacion {

	@EmbeddedId
	private PKUsuarioAplicacion pk;
	@Column(name="usap_acti")
	private int activo;
	@Column(name="usap_super_usua")
	private int super_usuario;
	@Column(name = "usap_usua")
	private String usuario_mov;
	@Column(name = "usap_fech")
	private String fecha_mov;
	@Column(name = "usap_ip")
	private String ip_mov;
	
}
