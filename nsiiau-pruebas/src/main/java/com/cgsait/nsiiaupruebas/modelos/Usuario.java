package com.cgsait.nsiiaupruebas.modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgbusua")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor 
public class Usuario {

	@Id
	@Column(name= "usua_id")
	private String id_usuario;
	@Column(name = "usua_acti")
	private int activo;
	@Column(name = "usua_bloq")
	private String fecha_bloqueo;
	@Column(name = "usua_usua")
	private String usuario_mov;
	@Column(name = "usua_fech")
	private String fecha_mov;
	@Column(name = "usua_ip")
	private String ip_mov;
	
	@Transient
	public List<Token> tokens;
	
	
}
