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
@Table(name = "ssgventi")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Entidad {

	@Id
	@Column(name="enti_id")
	private int id_entidad;
	@Column(name="enti_clav")
	private String clave_conac;
	@Column(name="enti_nomb")
	private String nombre;
	@Column(name="enti_enti_id")
	private int id_entidad_padre;
	@Column(name="enti_acti")
	private int activo;
	@Column(name = "enti_usua")
	private String usuario_mov;
	@Column(name = "enti_fech")
	private Timestamp fecha_mov;
	@Column(name = "enti_ip")
	private String ip_mov;
	

	public Entidad(int id_entidad, String clave_conac, String nombre, int id_entidad_padre, int activo,
			String usuario_mov, Timestamp fecha_mov, String ip_mov) {
		super();
		this.id_entidad = id_entidad;
		this.clave_conac = clave_conac;
		this.nombre = nombre;
		this.id_entidad_padre = id_entidad_padre;
		this.activo = activo;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Entidad> subEntidadesList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionPrivilegiosUsuarioRol> privilegiosUsuarioRolList;
}
