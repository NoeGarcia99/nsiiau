package com.cgsait.nsiiaupruebas.modelos;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ssgbtokn")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Token {

	@Id
	@Column(name="tokn_id")
	private int id_token;
	@Column(name="tokn_vige")
	private Timestamp vigencia;
	@Column(name="tokn_usua_id")
	private String usua_id;
	@Column(name = "tokn_usua")
	private String usuario_mov;
	@Column(name = "tokn_fech")
	private Timestamp fecha_mov;
	@Column(name = "tokn_ip")
	private String ip_mov;
	
}
