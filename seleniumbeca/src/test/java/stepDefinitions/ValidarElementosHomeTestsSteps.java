package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.ValidarElementosHome;
import pages.ValidarElementosTabelaFipePage;

public class ValidarElementosHomeTestsSteps {

    ValidarElementosHome validarElementos = new ValidarElementosHome();

    @E("verifico que está tudo certo com o menu")
        public void validarMenu(){
            validarElementos.validaMenu();
    }

    @E("verifico que está tudo certo com o menu de Busca")
    public void validarMenuBusca() {
        validarElementos.validaMenuBusca();
    }

    @E ("verifico que está tudo certo com as demais categorias")
    public void validaCategorias() {
        validarElementos.validarCamposHome();
    }

}

