package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class ValidarElementosHomeCategorias extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public ValidarElementosHomeCategorias() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void validaItensCategorias() {
        assertTrue("Não existe a opção Sedans", _Driver().getPageSource().contains("Sedans"));
        assertTrue("Não existe a opção SUVs", _Driver().getPageSource().contains("SUVs"));
        assertTrue("Não existe a opção Frontier 2020", _Driver().getPageSource().contains("Frontier 2020"));
        assertTrue("Não existe a opção Carros para família", _Driver().getPageSource().contains("Carros para família"));
        assertTrue("Não existe a opção Carros a diesel", _Driver().getPageSource().contains("Carros a diesel"));
        assertTrue("Não existe a opção Carros de luxo", _Driver().getPageSource().contains("Carros de luxo"));
        assertTrue("Não existe a opção Carros econômicos", _Driver().getPageSource().contains("Carros econômicos"));
        assertTrue("Não existe a opção Carros antigos", _Driver().getPageSource().contains("Carros antigos"));
        assertTrue("Não existe a opção Conversíveis", _Driver().getPageSource().contains("Conversíveis"));
        assertTrue("Não existe a opção Carros híbridos", _Driver().getPageSource().contains("Carros híbridos"));

    }
}
