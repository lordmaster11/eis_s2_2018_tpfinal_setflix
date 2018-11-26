package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Usuario;
import model.UsuarioDTO;
import services.LoginService;

import static org.junit.Assert.assertTrue;

public class StepDefs_Login {
	private UsuarioDTO usuario;
    private Usuario usuarioNuevo;
    private LoginService loginService;

    @Given("^Un usuario$")
    public void unUsuario() throws Throwable {
        loginService = new LoginService();
        loginService.crearSetDatosIniciales();
        this.usuario = new UsuarioDTO();
    }

    @When("^Ingreso mi usuario \"([^\"]*)\" y mi contraseña \"([^\"]*)\"$")
    public void ingresoMiUsuarioYMiContraseña(String user, String password) throws Throwable {
        this.usuario.setUsuario(user);
        this.usuario.setContrasena(password);
    }

    @Then("^Me logeo exitosamente$")
    public void meLogeoExitosamente() throws Throwable {
    	Usuario user = this.loginService.login(this.usuario.getUsuario(), this.usuario.getPassword());
    	
        assertTrue(user.getUsuario().equals("Juan"));
        loginService.eliminarDatos();
    }

    @When("^Ingreso mal mi usuario \"([^\"]*)\" y mi contraseña \"([^\"]*)\"$")
    public void ingresoMalMiUsuarioYMiContraseña(String user, String password) throws Throwable {
        this.usuario.setUsuario(user);
        this.usuario.setContrasena(password);
    }

    @Then("^El usuario no pudo logearse$")
    public void elUsuarioNoPudoLogearse() throws Throwable {
        try {
            this.loginService.login(this.usuario.getUsuario(), this.usuario.getPassword());
        } catch (Exception e) { }

        loginService.eliminarDatos();
    }

    @Given("^Un usuario nuevo$")
    public void unUsuarioNuevo() throws Throwable {
        loginService = new LoginService();
        loginService.crearSetDatosIniciales();
        this.usuarioNuevo = new Usuario();
    }

    @When("^Ingreso mi usuario \"([^\"]*)\", mi contraseña \"([^\"]*)\", mi nombre \"([^\"]*)\" y mi apellido \"([^\"]*)\"$")
    public void ingresoMiUsuarioMiContraseñaMiNombreYMiApellido(String user, String password, String nombre, String apellido) throws Throwable {
        this.usuarioNuevo.setUsuario(user);
        this.usuarioNuevo.setPassword(password);
        this.usuarioNuevo.setNombre(nombre);
        this.usuarioNuevo.setApellido(apellido);

        this.loginService.registrar(this.usuarioNuevo);
    }

    @Then("^Me registro exitosamente$")
    public void meRegistroExitosamente() throws Throwable {
        assertTrue(this.loginService.getUsuarios().size()==9);
        loginService.eliminarDatos();
    }

    @Given("^Otro usuario nuevo$")
    public void otroUsuarioNuevo() throws Throwable {
        loginService = new LoginService();
        loginService.crearSetDatosIniciales();
        this.usuarioNuevo = new Usuario();
    }

    @When("^Mi usuario \"([^\"]*)\", mi contraseña \"([^\"]*)\", mi nombre \"([^\"]*)\" y mi apellido \"([^\"]*)\"$")
    public void miUsuarioMiContraseñaMiNombreYMiApellido(String user, String password, String nombre, String apellido) throws Throwable {
        this.usuarioNuevo.setUsuario(user);
        this.usuarioNuevo.setPassword(password);
        this.usuarioNuevo.setNombre(nombre);
        this.usuarioNuevo.setApellido(apellido);

        try {
            this.loginService.registrar(this.usuarioNuevo);
        } catch (Exception e) { }
    }

    @Then("^El usuario no pudo registrarse$")
    public void elUsuarioNoPudoRegistrarse() throws Throwable {
        assertTrue(this.loginService.getUsuarios().size()==8);
        loginService.eliminarDatos();
    }

	
}
