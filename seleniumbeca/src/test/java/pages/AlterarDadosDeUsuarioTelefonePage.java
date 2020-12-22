package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class AlterarDadosDeUsuarioTelefonePage extends CommonsBasePage {

    WebDriverWait wait;
    Actions builder;


    public AlterarDadosDeUsuarioTelefonePage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }


    public void alterarTel(String tel) {
        WebElement alterarTel = _Driver().findElement(By.name("telefonePrincipal"));
        alterarTel.click();
        alterarTel.clear();
        alterarTel.sendKeys(tel);
    }
    
    public void validarTel() {
        WebElement alterarTel = _Driver().findElement(By.name("telefonePrincipal"));
        assertEquals("(11)9827-8528", alterarTel.getAttribute("value"));
    }

}
