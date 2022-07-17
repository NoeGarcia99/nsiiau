package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgrtuap")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelacionTipoUsuarioAplicacion {
	
	@EmbeddedId
	private PKTipoUsuarioAplicacion pk_tipo_usuario_aplicacion;
	@Column(name = "tuap_usua")
	private String usuario_mov;
	@Column(name = "tuap_fech")
	private Timestamp fecha_mov;
	@Column(name = "tuap_ip")
	private String ip_mov;
	
	
}
