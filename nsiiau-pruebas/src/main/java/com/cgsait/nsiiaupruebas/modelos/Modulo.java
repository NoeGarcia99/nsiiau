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
@Table(name = "ssgbapmo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Modulo {

	@EmbeddedId
	private PKModulo pk_modulo;
	@Column(name="apmo_desc")
	private String descripcion;
	@Column(name="apmo_acti")
	private int activo;
	@Column(name = "apmo_usua")
	private String usuario_mov;
	@Column(name = "apmo_fech")
	private Timestamp fecha_mov;
	@Column(name = "apmo_ip")
	private String ip_mov;

	
	public Modulo(PKModulo pk_modulo, String descripcion, int activo, String usuario_mov, Timestamp fecha_mov,
			String ip_mov) {
		super();
		this.pk_modulo = pk_modulo;
		this.descripcion = descripcion;
		this.activo = activo;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Accion> accionesList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Menu> menusList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionModuloRol> modulosRolList;
}
