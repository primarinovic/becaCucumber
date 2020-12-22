package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.ValidarElementosHomeCategorias;
import pages.ValidarElementosHomeMaisBuscados;
import pages.ValidarElementosPesquisa;

public class ValidarElementosPesquisaTestsSteps {

    ValidarElementosPesquisa validarElementos = new ValidarElementosPesquisa();

    @Dado("que eu navego até a página de pesquisa")
    public void paginaPesquisa() {
        validarElementos.navegarAteSite("https://www.webmotors.com.br/carros/estoque/volkswagen/up?estadocidade=estoque&marca1=VOLKSWAGEN&modelo1=UP&idcmpint=t1:c17:m07:ultimas-buscas:posicao-1::VOLKSWAGEN-UP");
    }

    @E("verifico os itens do campo filtro")
    public void validaFiltros() {
        validarElementos.validaMenu();
    }

}