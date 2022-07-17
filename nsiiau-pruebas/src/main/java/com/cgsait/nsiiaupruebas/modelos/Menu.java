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
@Table(name = "ssgbmenu")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

	@Id
	@Column(name="menu_id")
	private int id_menu;
	@Column(name="menu_apli_id")
	private String id_aplicacion;
	@Column(name="menu_menu_id")
	private int id_menu_padre;
	@Column(name="menu_meti_id")
	private String id_tipo_menu;
	@Column(name="menu_apmo_id")
	private String id_modulo;
	@Column(name="menu_etiq")
	private String etiqueta;
	@Column(name="menu_ayud")
	private String ayuda;
	@Column(name="menu_icon")
	private String url_icon;
	@Column(name="menu_ordn")
	private int orden_opciones_menu;
	@Column(name="menu_nivl")
	private int nivel_opcion;
	@Column(name = "menu_usua")
	private String usuario_mov;
	@Column(name = "menu_fech")
	private Timestamp fecha_mov;
	@Column(name = "menu_ip")
	private String ip_mov;
	
	
	public Menu(int id_menu, String id_aplicacion, int id_menu_padre, String id_tipo_menu, String id_modulo,
			String etiqueta, String ayuda, String url_icon, int orden_opciones_menu, int nivel_opcion,
			String usuario_mov, Timestamp fecha_mov, String ip_mov) {
		super();
		this.id_menu = id_menu;
		this.id_aplicacion = id_aplicacion;
		this.id_menu_padre = id_menu_padre;
		this.id_tipo_menu = id_tipo_menu;
		this.id_modulo = id_modulo;
		this.etiqueta = etiqueta;
		this.ayuda = ayuda;
		this.url_icon = url_icon;
		this.orden_opciones_menu = orden_opciones_menu;
		this.nivel_opcion = nivel_opcion;
		this.usuario_mov = usuario_mov;
		this.fecha_mov = fecha_mov;
		this.ip_mov = ip_mov;
	}

	
	@Transient
	@OneToMany(fetch = FetchType.LAZY)
	public List<Menu> subMenusList;
}
