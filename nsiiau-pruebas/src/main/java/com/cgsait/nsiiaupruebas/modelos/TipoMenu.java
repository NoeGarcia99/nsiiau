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
@Table(name = "ssgvmeti")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoMenu {

	@Id
	@Column(name="meti_id")
	private String id_tipo_menu;
	@Column(name="meti_desc")
	private String descripcion;
	@Column(name = "meti_usua")
	private String usuario_mov;
	@Column(name = "meti_fech")
	private String fecha_mov;
	@Column(name = "meti_ip")
	private String ip_mov;
}
