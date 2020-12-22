package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;


public class ValidarElementosPesquisa extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public ValidarElementosPesquisa() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void paginaPesquisa() {
        navegarAteSite("https://www.webmotors.com.br/carros/estoque/volkswagen/up?estadocidade=estoque&marca1=VOLKSWAGEN&modelo1=UP&idcmpint=t1:c17:m07:ultimas-buscas:posicao-1::VOLKSWAGEN-UP");
    }


    public void validaMenu() {
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Localização"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("O que é interessante pra você?"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Marca do carro"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Carros"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Preço"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Quilometragem"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Opcionais"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Câmbio"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Final da Placa"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Blindagem"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Cores"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Categoria"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Ofertas"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Características"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Apenas anúncios com foto"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Limpar filtros"));

    }

}
