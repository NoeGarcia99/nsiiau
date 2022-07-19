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
	private Timestamp fecha_mov;
	@Column(name = "tiap_ip")
	private String ip_mov;
	
	
	public TipoAplicacion(String id_tipo_aplicacion, String descripcion, String usuario_mov, Timestamp fecha_mov,
			String ip_mov) {
		super();
		this.id_tipo_aplicacion = id_tipo_aplicacion;
		this.descripcion = descripcion;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<CatalogoAplicativos> aplicativosList;
}
