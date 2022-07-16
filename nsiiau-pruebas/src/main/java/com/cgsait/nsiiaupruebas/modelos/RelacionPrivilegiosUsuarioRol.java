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
@Table(name = "ssgrpriv")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelacionPrivilegiosUsuarioRol {

	@EmbeddedId
	private PKPrivilegiosUsuarioRol pk_privilegios;
	@Column(name="priv_domi_enti")
	private String pertenencia;
	@Column(name="priv_auto")
	private int autorizacion;
	@Column(name = "priv_usua")
	private String usuario_mov;
	@Column(name = "priv_fech")
	private String fecha_mov;
	@Column(name = "priv_ip")
	private String ip_mov;
	
}
