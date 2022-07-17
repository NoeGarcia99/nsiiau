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
@Table(name = "ssgbacci")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Accion {

	@EmbeddedId
	private PKAccion pk_accion;
	@Column(name="acci_nomb")
	private String nombre;
	@Column(name="acci_acti")
	private int activo;
	@Column(name = "acci_usua")
	private String usuario_mov;
	@Column(name = "acci_fech")
	private Timestamp fecha_mov;
	@Column(name = "acci_ip")
	private String ip_mov;
	
	
	public Accion(PKAccion pk_accion, String nombre, int activo, String usuario_mov, Timestamp fecha_mov,
			String ip_mov) {
		super();
		this.pk_accion = pk_accion;
		this.nombre = nombre;
		this.activo = activo;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionRolAccion> rolAccionList;
}
