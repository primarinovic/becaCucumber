package stepDefinitions;

import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import pages.PesquisaPage;

public class PesquisaTestsSteps {

    PesquisaPage pesquisaPage = new PesquisaPage();

    @Dado("que eu navego até a página Home do Webmotors")
    public void AcessarPaginaInicial() {
        pesquisaPage.acessarPaginaInicial();
    }

    @Quando("escrever produto na caixa de pesquisa")
    public void pesquisa() {
        pesquisaPage.inserirPesquisa();
    }

    @E("clico na sugestão")
    public void preencherTextoElemento() {
        pesquisaPage.clicarElemento(By.xpath("/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/a/div[2]"));
    }

    @Entao("encontro os resultados correspondentes")
    public void validaPagina() {
        pesquisaPage.validaUrlPerfil();
    }


}
