package stepDefinitions;

import io.cucumber.java.pt.E;
import pages.ValidarElementosHome;
import pages.ValidarElementosHomeCategorias;

public class ValidarElementosHomeCategoriasTestsSteps {

    ValidarElementosHomeCategorias validarElementos = new ValidarElementosHomeCategorias();

    @E("verifico os itens em Categorias")
    public void validaCategorias() {
        validarElementos.validaItensCategorias();
    }

}

