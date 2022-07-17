package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgrromo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelacionModuloRol {

	@EmbeddedId
	private PKModuloRol pk_modulo_rol;
	@Column(name = "romo_usua")
	private String usuario_mov;
	@Column(name = "romo_fech")
	private Timestamp fecha_mov;
	@Column(name = "romo_ip")
	private String ip_mov;
	
}
