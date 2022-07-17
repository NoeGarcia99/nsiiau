package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
