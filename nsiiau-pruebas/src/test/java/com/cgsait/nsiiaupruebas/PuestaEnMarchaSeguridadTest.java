package com.cgsait.nsiiaupruebas;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.cgsait.nsiiaupruebas.modelos.Accion;
import com.cgsait.nsiiaupruebas.modelos.CatalogoAplicativos;
import com.cgsait.nsiiaupruebas.modelos.Entidad;
import com.cgsait.nsiiaupruebas.modelos.Menu;
import com.cgsait.nsiiaupruebas.modelos.Modulo;
import com.cgsait.nsiiaupruebas.modelos.PKAccion;
import com.cgsait.nsiiaupruebas.modelos.PKModulo;
import com.cgsait.nsiiaupruebas.modelos.PKModuloRol;
import com.cgsait.nsiiaupruebas.modelos.PKPrivilegiosUsuarioRol;
import com.cgsait.nsiiaupruebas.modelos.PKRolAccion;
import com.cgsait.nsiiaupruebas.modelos.PKRolSistema;
import com.cgsait.nsiiaupruebas.modelos.PKTipoUsuarioAplicacion;
import com.cgsait.nsiiaupruebas.modelos.PKTipoUsuarioRol;
import com.cgsait.nsiiaupruebas.modelos.PKUsuarioAplicacion;
import com.cgsait.nsiiaupruebas.modelos.RelacionModuloRol;
import com.cgsait.nsiiaupruebas.modelos.RelacionPrivilegiosUsuarioRol;
import com.cgsait.nsiiaupruebas.modelos.RelacionRolAccion;
import com.cgsait.nsiiaupruebas.modelos.RelacionTipoUsuarioAplicacion;
import com.cgsait.nsiiaupruebas.modelos.RelacionTipoUsuarioRol;
import com.cgsait.nsiiaupruebas.modelos.RelacionUsuarioAplicacion;
import com.cgsait.nsiiaupruebas.modelos.RolSistema;
import com.cgsait.nsiiaupruebas.modelos.Sistema;
import com.cgsait.nsiiaupruebas.modelos.TipoAplicacion;
import com.cgsait.nsiiaupruebas.modelos.TipoMenu;
import com.cgsait.nsiiaupruebas.modelos.TipoUsuario;
import com.cgsait.nsiiaupruebas.modelos.Token;
import com.cgsait.nsiiaupruebas.modelos.Usuario;
import com.cgsait.nsiiaupruebas.repository.AccionRepository;
import com.cgsait.nsiiaupruebas.repository.CatalogoAplicativosRepository;
import com.cgsait.nsiiaupruebas.repository.EntidadRepository;
import com.cgsait.nsiiaupruebas.repository.MenuRepository;
import com.cgsait.nsiiaupruebas.repository.ModuloRepository;
import com.cgsait.nsiiaupruebas.repository.RelacionModuloRolRepository;
import com.cgsait.nsiiaupruebas.repository.RelacionPrivilegiosUsuarioRolRepository;
import com.cgsait.nsiiaupruebas.repository.RelacionRolAccionRepository;
import com.cgsait.nsiiaupruebas.repository.RelacionTipoUsuarioAplicacionRepository;
import com.cgsait.nsiiaupruebas.repository.RelacionTipoUsuarioRolRepository;
import com.cgsait.nsiiaupruebas.repository.RelacionUsuarioAplicacionRepository;
import com.cgsait.nsiiaupruebas.repository.RolSistemaRepository;
import com.cgsait.nsiiaupruebas.repository.SistemaRepository;
import com.cgsait.nsiiaupruebas.repository.TipoAplicacionRepository;
import com.cgsait.nsiiaupruebas.repository.TipoMenuRepository;
import com.cgsait.nsiiaupruebas.repository.TipoUsuarioRepository;
import com.cgsait.nsiiaupruebas.repository.TokenRepository;
import com.cgsait.nsiiaupruebas.repository.UsuarioRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class PuestaEnMarchaSeguridadTest {

	@Autowired
	private UsuarioRepository usuarioRepo;
	@Autowired
	private TokenRepository tokenRepo;
	@Autowired
	private SistemaRepository sistemaRepo;
	@Autowired
	private TipoAplicacionRepository tipoAplicacionRepo;
	@Autowired
	private CatalogoAplicativosRepository catalogoAplicativosRepo;
	@Autowired
	private RelacionUsuarioAplicacionRepository relacionUsuarioAplicacionRepo;
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepo;
	@Autowired
	private RelacionTipoUsuarioAplicacionRepository relacionTipoUsuarioAplicacionRepo;
	@Autowired
	private RolSistemaRepository rolSistemaRepo;
	@Autowired
	private ModuloRepository moduloRepo;
	@Autowired
	private TipoMenuRepository tipomenuRepo;
	@Autowired
	private MenuRepository menuRepo;
	@Autowired
	private EntidadRepository entidadRepo;
	@Autowired
	private AccionRepository accionRepo;
	@Autowired
	private RelacionTipoUsuarioRolRepository relacionTipoUsuarioRol;
	@Autowired
	private RelacionPrivilegiosUsuarioRolRepository privilegiosRepo;
	@Autowired
	private RelacionModuloRolRepository modulorolRepo;
	@Autowired
	private RelacionRolAccionRepository rolaccionRepo;
	
	//Datos de tipo Fecha
	long millis=System.currentTimeMillis();  
	Date date = new Date(millis);
	Timestamp timeStamp = new Timestamp(millis);
	Time time = new Time(millis);
	
	//Obtener ip
	public String obtenerIP() {
		
		String mi_ip = "";
		
		try {
			InetAddress ip = InetAddress.getLocalHost();
			mi_ip = ip.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return mi_ip;
	}
	
	@Test
	@Rollback(false)
	public void guardarUsuario() {
		Usuario usuario = new Usuario("214796959", 1, date, "Noe Garcia", timeStamp, "148.202.222.67");
		usuarioRepo.save(usuario);
	}
	
	@Test
	@Rollback(false)
	public void guardarToken() {
		Token token = new Token(1, timeStamp, "214796959", "Noe Garcia", timeStamp, "148.202.222.67");
		tokenRepo.save(token);
	}
	
	@Test
	@Rollback(false)
	public void guardarSistema() {
		Sistema sistema = new Sistema("siiauescolar", "Siiau Escolar", "Sistema para control de calificaciones de alumnos", "https://icono.ico", "https://imagen.jpg","Noe Garcia", timeStamp, "148.202.222.67");
		sistemaRepo.save(sistema);
	}
	
	@Test
	@Rollback(false)
	public void guardarTipoAplicacion() {
		TipoAplicacion tipoaplicacion = new TipoAplicacion("registro", "para registrar", "Noe Garcia", time, "148.202.222.67"); 
		tipoAplicacionRepo.save(tipoaplicacion);
	}
	
	@Test
	@Rollback(false)
	public void guardarAplicativo() {
		CatalogoAplicativos aplicativo = new CatalogoAplicativos("regcal", "siiauescolar", "registro calificaciones", "app para registrar aplicaciones", "https://icono.ico", "https://imagen.jpg", "https://mwd.registrosiiau.com", "registro", "Noe Garcia", timeStamp, "148.202.222.67"); 
		catalogoAplicativosRepo.save(aplicativo);
	}
	
	@Test
	@Rollback(false)
	public void guardarRelacionUsuarioAplicacion() {
		PKUsuarioAplicacion pk = new PKUsuarioAplicacion("regcal", "214796959");
		RelacionUsuarioAplicacion usuaaplicacion = new RelacionUsuarioAplicacion(pk,  1, 1, "Noe Garcia", timeStamp, "148.202.222.67"); 
		relacionUsuarioAplicacionRepo.save(usuaaplicacion);
	}
	
	@Test
	@Rollback(false)
	public void guardarTipoUsuario() {
		TipoUsuario tipousuario = new TipoUsuario("admin", "administrador", "puede hacer todo", 1, "Noe Garcia", time, "148.202.222.67"); 
		tipoUsuarioRepo.save(tipousuario);
	}
	
	@Test 
	@Rollback(false)
	public void guardarRelacionTipoUsuarioAplicacion() {

		 PKTipoUsuarioAplicacion pk = new PKTipoUsuarioAplicacion("admin", "regcal");
		 RelacionTipoUsuarioAplicacion r_tipou_app = new RelacionTipoUsuarioAplicacion(pk, "Noe Garcia", timeStamp, obtenerIP());
		 relacionTipoUsuarioAplicacionRepo.save(r_tipou_app);
	}
	
	@Test
	@Rollback(false)
	public void guardarRolSistema() {
		
		PKRolSistema pk = new PKRolSistema("supuser", "regcal");
		RolSistema rolsistema = new RolSistema(pk, "puede hacer todo", 1, "Noe Garcia", timeStamp, obtenerIP());
		rolSistemaRepo.save(rolsistema);
	}
	
	@Test
	@Rollback(false)
	public void guardarModulo() {
		
		PKModulo pk = new PKModulo("formulario", "regcal");
		Modulo modulo = new Modulo(pk, "forumario para registrar calificacion", 1, "Noe Garcia", timeStamp, obtenerIP());
		moduloRepo.save(modulo);
	}
	
	@Test
	@Rollback(false)
	public void guardarTipoMenu() {
		TipoMenu tipomenu = new TipoMenu("P", "Menu tipo P", "Noe Garcia", timeStamp, obtenerIP());
		tipomenuRepo.save(tipomenu);
	}
	
	@Test
	@Rollback(false)
	public void guardarMenu(){
		Menu menu = new Menu(1, "regcal", 1, "P", "formulario", "Menu registro", "Aqui haces el registro", "https://icono.ico", 11, 1, "Noe Garcia", timeStamp, obtenerIP());
		menuRepo.save(menu);
	}
	
	@Test
	@Rollback(false)
	public void guardarEntidad() {
		Entidad entidad = new Entidad(1, "CGSAIT", "Coordinacion general de bla.. bla... bla...", 1, 1, "Noe Garcia", timeStamp, "148.202.222.67");
		entidadRepo.save(entidad);
	}
	
	@Test
	@Rollback(false)
	public void guardarAccion() {
		
		PKAccion pk = new PKAccion("alta-cal", "formulario", "regcal");
		Accion accion = new Accion(pk, "Alta de calificacion", 1, "Noe Garcia", timeStamp, obtenerIP());
		accionRepo.save(accion);
	}
	
	@Test
	@Rollback(false)
	public void guardarRelacionTipoUsuarioRol() {
		
		PKTipoUsuarioRol pk = new PKTipoUsuarioRol("admin", "supuser", "regcal");
		RelacionTipoUsuarioRol r_tipou_rol = new RelacionTipoUsuarioRol(pk, "Noe Garcia", timeStamp, obtenerIP());
		relacionTipoUsuarioRol.save(r_tipou_rol);
	}
	
	@Test
	@Rollback(false)
	public void guardarPrivilegios() {
		
		PKPrivilegiosUsuarioRol pk = new PKPrivilegiosUsuarioRol("regcal", "214796959", "supuser", 1);
		RelacionPrivilegiosUsuarioRol privilegios = new RelacionPrivilegiosUsuarioRol(pk, "U", 1, "Noe Garcia", timeStamp, obtenerIP());
		privilegiosRepo.save(privilegios);
	}
	
	@Test
	@Rollback(false)
	public void guardarRelacionModuloRol() {
		
		PKModuloRol pk = new PKModuloRol("supuser", "formulario", "regcal");
		RelacionModuloRol modulorol = new RelacionModuloRol(pk, "Noe Garcia", timeStamp, obtenerIP());
		modulorolRepo.save(modulorol);
	}
	
	@Test
	@Rollback(false)
	public void guardarRelacionRolAccion() {
		
		PKRolAccion pk = new PKRolAccion("supuser", "alta-cal", "formulario", "regcal");
		RelacionRolAccion rolaccion = new RelacionRolAccion(pk, "Noe Garcia", timeStamp, obtenerIP());
		rolaccionRepo.save(rolaccion);
	}
}
;