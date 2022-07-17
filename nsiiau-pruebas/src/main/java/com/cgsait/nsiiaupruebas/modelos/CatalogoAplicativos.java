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
@Table(name = "ssgbapli")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CatalogoAplicativos {

	@Id
	@Column(name="apli_id")
	private String id_aplicativo;
	@Column(name="apli_sist_id")
	private String id_sistema;
	@Column(name="apli_nomb")
	private String nombre;
	@Column(name="apli_desc")
	private String descripcion;
	@Column(name="apli_icono")
	private String icono;
	@Column(name="apli_imag")
	private String imagen;
	@Column(name="apli_url")
	private String url;
	@Column(name="apli_tiap_id")
	private String tipo_aplicacion_id;
	@Column(name = "apli_usua")
	private String usuario_mov;
	@Column(name = "apli_fech")
	private Timestamp fecha_mov;
	@Column(name = "apli_ip")
	private String ip_mov;
	
	
	public CatalogoAplicativos(String id_aplicativo, String id_sistema, String nombre, String descripcion, String icono,
			String imagen, String url, String tipo_aplicacion_id, String usuario_mov, Timestamp fecha_mov,
			String ip_mov) {
		super();
		this.id_aplicativo = id_aplicativo;
		this.id_sistema = id_sistema;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.icono = icono;
		this.imagen = imagen;
		this.url = url;
		this.tipo_aplicacion_id = tipo_aplicacion_id;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionTipoUsuarioAplicacion> tipoUsuarioAplicacionList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Modulo> modulosList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Menu> menusList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RolSistema> rolSistemaList;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<RelacionUsuarioAplicacion> usuarioAplicacionList;
	
	
}
