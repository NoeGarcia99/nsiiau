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
	private Timestamp fecha_mov;
	@Column(name = "meti_ip")
	private String ip_mov;
	
	
	public TipoMenu(String id_tipo_menu, String descripcion, String usuario_mov, Timestamp fecha_mov, String ip_mov) {
		super();
		this.id_tipo_menu = id_tipo_menu;
		this.descripcion = descripcion;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Menu> menusList;
}
