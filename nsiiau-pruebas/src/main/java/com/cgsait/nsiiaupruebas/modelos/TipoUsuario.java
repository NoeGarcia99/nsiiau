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
@Table(name = "ssgvtius")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor 
public class TipoUsuario {
	
	@Id
	@Column(name= "tius_id")
	private String id_tipo_usuario;
	@Column(name= "tius_nomb")
	private String nombre_tipo;
	@Column(name= "tius_desc")
	private String descripcion;
	@Column(name= "tius_acti")
	private int activo;
	@Column(name= "tius_usua")
	private String usuario_mov;
	@Column(name= "tius_fech")
	private String fecha_mov;
	@Column(name= "tius_ip")
	private String ip_mov;
	
}
