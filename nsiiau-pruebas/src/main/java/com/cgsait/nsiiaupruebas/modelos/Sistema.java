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
@Table(name = "ssgbsist")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sistema {

	@Id
	@Column(name= "sist_id")
	private String id_sistema;
	@Column(name= "sist_nomb")
	private String nombre_sis;
	@Column(name= "sist_desc")
	private String descripcion;
	@Column(name= "sist_icon")
	private String icono;
	@Column(name= "sist_imag")
	private String imagen;
	@Column(name = "sist_usua")
	private String usuario_mov;
	@Column(name = "sist_fech")
	private Timestamp fecha_mov;
	@Column(name = "sist_ip")
	private String ip_mov;
	
	
	public Sistema(String id_sistema, String nombre_sis, String descripcion, String icono, String imagen,
			String usuario_mov, Timestamp fecha_mov, String ip_mov) {
		super();
		this.id_sistema = id_sistema;
		this.nombre_sis = nombre_sis;
		this.descripcion = descripcion;
		this.icono = icono;
		this.imagen = imagen;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<CatalogoAplicativos> aplicativosList;
}
