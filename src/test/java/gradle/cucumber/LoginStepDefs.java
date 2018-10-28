package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import services.LoginService;
import setflix.Usuario;

import static org.junit.Assert.assertTrue;


public class LoginStepDefs {
    private Usuario usuario;
    private LoginService loginService;

    @Given("^Un usuario$")
    public void unUsuario() throws Throwable {
            this.usuario = new Usuario();
            this.loginService = new LoginService();
    }

    @When("^Ingreso mi usuario \"([^\"]*)\" y mi contraseña \"([^\"]*)\"$")
    public void ingresoMiUsuarioYMiContraseña(String user, String password) throws Throwable {
        
           this.usuario.user = user;
           this.usuario.password = password;

    }

    @Then("^Me logeo exitosamente$")
    public void meLogeoExitosamente() throws Throwable {
        assertTrue(this.loginService.login(this.usuario));
    }

    @When("^Ingreso mi usuario \"([^\"]*)\" ,mi contraseña \"([^\"]*)\",mi nombre \"([^\"]*)\" y apellido \"([^\"]*)\"$")
    public void ingresoMiUsuarioMiContraseñaMiNombreYApellido(String user, String password, String name, String lastname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        this.usuario.user = user;
        this.usuario.password = password;
        this.usuario.nombre = name;
        this.usuario.apellido = lastname;
    }

    @Then("^El sistema registro al usuario de forma exitosa$")
    public void elSistemaRegistroAlUsuarioDeFormaExitosa() throws Throwable {
        assertTrue(this.loginService.signUp(this.usuario));
    }


}
