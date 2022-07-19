package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgvtius")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor 
public class TipoUsuario {
	
	@Id
	@Column(name= "tius_id")
	private String id_tipo_usuario;
	@Column(name= "tius_nomb")
	private String nombre_tipo;
	@Column(name= "tius_desc")
	private String descripcion;
	@Column(name= "tius_acti")
	private int activo;
	@Column(name= "tius_usua")
	private String usuario_mov;
	@Column(name= "tius_fech")
	private Timestamp fecha_mov;
	@Column(name= "tius_ip")
	private String ip_mov;
	
	
	public TipoUsuario(String id_tipo_usuario, String nombre_tipo, String descripcion, int activo, String usuario_mov,
			Timestamp fecha_mov, String ip_mov) {
		super();
		this.id_tipo_usuario = id_tipo_usuario;
		this.nombre_tipo = nombre_tipo;
		this.descripcion = descripcion;
		this.activo = activo;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionTipoUsuarioAplicacion> tipoUsuarioAplicacionList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionTipoUsuarioRol> tipoUsuarioRolList;
}
