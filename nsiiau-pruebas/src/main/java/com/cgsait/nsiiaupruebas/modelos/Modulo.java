package com.cgsait.nsiiaupruebas.modelos;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgbapmo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Modulo {

	@EmbeddedId
	private PKModulo pk_modulo;
	@Column(name="apmo_desc")
	private String descripcion;
	@Column(name="apmo_acti")
	private int activo;
	@Column(name = "apmo_usua")
	private String usuario_mov;
	@Column(name = "apmo_fech")
	private String fecha_mov;
	@Column(name = "apmo_ip")
	private String ip_mov;
}
