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
@Table(name = "ssgbaprol")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RolSistema {

	@EmbeddedId
	private PKRolSistema pk_rol_sistema;
	@Column(name="aprol_desc")
	private String descripcion;
	@Column(name = "aprol_acti")
	private int activo;
	@Column(name = "aprol_usua")
	private String usuario_mov;
	@Column(name = "aprol_fech")
	private Timestamp fecha_mov;
	@Column(name = "aprol_ip")
	private String ip_mov;
	
	
	public RolSistema(PKRolSistema pk_rol_sistema, String descripcion, int activo, String usuario_mov,
			Timestamp fecha_mov, String ip_mov) {
		super();
		this.pk_rol_sistema = pk_rol_sistema;
		this.descripcion = descripcion;
		this.activo = activo;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionTipoUsuarioRol> tipoUsuarioRolList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionModuloRol> moduloRolList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionPrivilegiosUsuarioRol> privilegiosUsuarioRolList;
}
