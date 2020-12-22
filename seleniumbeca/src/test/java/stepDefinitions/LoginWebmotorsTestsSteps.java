package stepDefinitions;

import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import pages.LoginWebmotorsPage;

public class LoginWebmotorsTestsSteps {

    LoginWebmotorsPage loginWebmotors = new LoginWebmotorsPage();

    @Dado("que eu navego até a página de login do Webmotors")
    public void navegarAteLogin() {
        loginWebmotors.navegarAteSite("https://login.webmotors.com.br");
    }

    @Quando("eu preencho os meus dados")
    public void preenchoDados() {
        loginWebmotors.preencherTextoElemento(By.id("email"), "folotasm@gmail.com");
        loginWebmotors.preencherTextoElemento(By.id("senha"), "123456");
    }

    @E("clico no botão entrar")
    public void clicarEntrar() {
        loginWebmotors.clicarElemento(By.id("btnEntrar"));
    }

    @Entao("eu estou logado")
    public void verificarPagina() {
        loginWebmotors.validaUrlPerfil();
    }

}

