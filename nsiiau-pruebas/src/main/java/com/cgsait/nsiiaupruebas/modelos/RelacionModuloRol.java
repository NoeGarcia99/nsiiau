package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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
	
	
	public RelacionModuloRol(PKModuloRol pk_modulo_rol, String usuario_mov, Timestamp fecha_mov, String ip_mov) {
		super();
		this.pk_modulo_rol = pk_modulo_rol;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionRolAccion> rolesAccionList;
}
