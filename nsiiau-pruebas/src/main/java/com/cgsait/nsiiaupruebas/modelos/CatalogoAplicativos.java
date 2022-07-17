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
	
}
