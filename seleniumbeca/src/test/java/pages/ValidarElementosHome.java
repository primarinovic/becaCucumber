package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class ValidarElementosHome extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public ValidarElementosHome() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void validaMenu() {
        assertTrue("Não existe a opção Comprar", _Driver().getPageSource().contains("Comprar"));
        assertTrue("Não existe a opção Vender", _Driver().getPageSource().contains("Vender"));
        assertTrue("Não existe a opção Serviços", _Driver().getPageSource().contains("Serviços"));
        assertTrue("Não existe a opção Ajuda", _Driver().getPageSource().contains("Ajuda"));
        assertTrue("Não existe a opção Entrar", _Driver().getPageSource().contains("Entrar"));

        WebElement coracaoNav = _Driver().findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/div[1]"));
        coracaoNav.isDisplayed();
        WebElement chatNav = _Driver().findElement(By.className("Header-Chat__icon"));
        chatNav.isDisplayed();
        WebElement sinoNav = _Driver().findElement(By.className("Header-Notifications__icon"));
        sinoNav.isDisplayed();
    }

    public void validaMenuBusca() {
        assertTrue("Não existe a opção Comprar Carros", _Driver().getPageSource().contains("Comprar Carros"));
        assertTrue("Não existe a opção Comprar Motos", _Driver().getPageSource().contains("Comprar Motos"));
        assertTrue("Não existe a opção Quero Vender", _Driver().getPageSource().contains("Quero Vender"));
        assertTrue("Não existe a opção Quero Financiar", _Driver().getPageSource().contains("Quero Financiar"));
        assertTrue("Não existe a opção Ver Ofertas", _Driver().getPageSource().contains("Ver Ofertas"));
    }

    public void validarCamposHome() {
        validarElementoEmTela(By.xpath("//*[@id=\"home_categories_carousel\"]/h2"));
        validarElementoEmTela(By.xpath("//*[@id=\"root\"]/main/div[3]/div[2]/h2"));
        validarElementoEmTela(By.xpath("//*[@id=\"root\"]/main/div[3]/div[3]/h2"));
    }
}
