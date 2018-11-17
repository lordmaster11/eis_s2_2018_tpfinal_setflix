package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UsuarioDTO;
import services.LoginService;

import static org.junit.Assert.assertTrue;

public class LoginStepDefsTest {
    private UsuarioDTO usuario;
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
        this.loginService = new LoginService();
        assertTrue(this.loginService.login(this.usuario));
        loginService.eliminarDatos();
    }
}
