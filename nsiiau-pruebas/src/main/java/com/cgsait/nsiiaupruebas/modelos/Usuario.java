package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Date;
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
@Table(name = "ssgbusua")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor 
public class Usuario {

	@Id
	@Column(name= "usua_id")
	private String id_usuario;
	@Column(name = "usua_acti")
	private int activo;
	@Column(name = "usua_bloq")
	private Date fecha_bloqueo;
	@Column(name = "usua_usua")
	private String usuario_mov;
	@Column(name = "usua_fech")
	private Timestamp fecha_mov;
	@Column(name = "usua_ip")
	private String ip_mov;
	
	public Usuario(String id_usuario, int activo, Date fecha_bloqueo, String usuario_mov, Timestamp fecha_mov,
			String ip_mov) {
		super();
		this.id_usuario = id_usuario;
		this.activo = activo;
		this.fecha_bloqueo = fecha_bloqueo;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Token> tokensList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionUsuarioAplicacion> usuarioAplicacionList;
}
