package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ValidarElementosTabelaFipePage;
import pages.ValidarMeusAnunciosPage;

public class ValidarElementosTabelaFipeTestsSteps {

    ValidarElementosTabelaFipePage validarElementos = new ValidarElementosTabelaFipePage();


    @Dado("que eu navego até a página da Tabela Fipe")
    public void navegarAteTabela() {
        validarElementos.irAteTabelaFipe();
    }

    @E("verifico que está tudo certo na navbar")
    public void verificaNav() {
        validarElementos.validarNav();
    }

    @E("verifico que está tudo certo nos campos da página")
    public void verificaCampos() {
        validarElementos.validarCamposPagina();
    }

    @E("verifico que está tudo certo na lista de perguntas")
    public void verificaPerguntas() {
        validarElementos.validarListaPerguntas();

    }

}

