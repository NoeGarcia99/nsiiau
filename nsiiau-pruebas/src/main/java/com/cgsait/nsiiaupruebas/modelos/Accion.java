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
	private String fecha_mov;
	@Column(name = "acci_ip")
	private String ip_mov;
}
