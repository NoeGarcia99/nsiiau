package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgvtiap")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoAplicacion {

	@Id
	@Column(name="tiap_id")
	private String id_tipo_aplicacion;
	@Column(name="tiap_desc")
	private String descripcion;
	@Column(name = "tiap_usua")
	private String usuario_mov;
	@Column(name = "tiap_fech")
	private Time fecha_mov;
	@Column(name = "tiap_ip")
	private String ip_mov;
}
