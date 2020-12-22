package stepDefinitions;

import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import pages.LoginInvalidoWebmotorsPage;
import pages.LoginWebmotorsPage;

public class LoginInvalidoWebmotorsTestsSteps {

    LoginInvalidoWebmotorsPage loginWebmotors = new LoginInvalidoWebmotorsPage();

    @Quando("eu preencho com dados inválidos")
    public void preenchoDados() {
        loginWebmotors.preencherTextoElemento(By.id("email"),  "logininvaligo@yahoo.com");
        loginWebmotors.preencherTextoElemento(By.id("senha"), "amareloepreto");
    }

    @Entao("o login não é realizado")
    public void verificarBotaoEmailContinuaAparecendo() {
        loginWebmotors.validarElementoEmTela(By.xpath("//*[@id=\"boxEmail\"]"));
    }

}

