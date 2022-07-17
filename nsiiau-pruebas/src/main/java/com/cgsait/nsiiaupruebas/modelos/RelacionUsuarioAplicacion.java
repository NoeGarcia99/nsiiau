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
	private Timestamp fecha_mov;
	@Column(name = "usap_ip")
	private String ip_mov;
	
	
	public RelacionUsuarioAplicacion(PKUsuarioAplicacion pk, int activo, int super_usuario, String usuario_mov,
			Timestamp fecha_mov, String ip_mov) {
		super();
		this.pk = pk;
		this.activo = activo;
		this.super_usuario = super_usuario;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionPrivilegiosUsuarioRol> privilegiosList;
	
}
