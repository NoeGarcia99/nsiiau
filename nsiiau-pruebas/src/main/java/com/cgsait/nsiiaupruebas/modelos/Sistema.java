package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
}
