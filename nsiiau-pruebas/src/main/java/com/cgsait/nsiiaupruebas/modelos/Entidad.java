package com.cgsait.nsiiaupruebas.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String fecha_mov;
	@Column(name = "enti_ip")
	private String ip_mov;
}
