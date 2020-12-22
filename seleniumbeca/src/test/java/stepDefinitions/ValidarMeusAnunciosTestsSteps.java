package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pages.LoginWebmotorsPage;
import pages.ValidarMeusAnunciosPage;

public class ValidarMeusAnunciosTestsSteps {

    ValidarMeusAnunciosPage alterarDados = new ValidarMeusAnunciosPage();


    @Quando ("navego até Meus Anúncios")
    public void navegarAnuncios(){
        alterarDados.acessarMeusAnuncios();
    }

    @Entao ("verifico que os elementos da página são exibidos corretamente")
    public void verificaElementos(){
        alterarDados.mapearMeusAnuncios();
    }


}

