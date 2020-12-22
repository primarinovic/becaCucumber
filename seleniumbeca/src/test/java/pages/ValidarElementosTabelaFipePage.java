package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class ValidarElementosTabelaFipePage extends CommonsBasePage {

    WebDriverWait wait;
    Actions builder;

    public ValidarElementosTabelaFipePage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void validarNav() {
        validarElementoEmTela(By.xpath("/html/body/app/section/header/div[2]/menu/a"));
    }

    public void validarCamposPagina() {
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Comece escolhendo o tipo de veículo"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Carro"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Motos"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Mais Buscados"));
    }

    public void validarListaPerguntas() {
        validarElementoEmTela(By.cssSelector(".Accordion__list__info:nth-child(1) h2"));
        validarElementoEmTela(By.cssSelector(".Accordion__list__info:nth-child(2) h2"));
        validarElementoEmTela(By.cssSelector(".Accordion__list__info:nth-child(3) h2"));
        validarElementoEmTela(By.cssSelector(".Accordion__list__info:nth-child(4) h2"));
        validarElementoEmTela(By.cssSelector(".Accordion__list__info:nth-child(5) h2"));
    }


}
