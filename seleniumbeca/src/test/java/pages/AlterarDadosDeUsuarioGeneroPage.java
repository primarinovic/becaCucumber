package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AlterarDadosDeUsuarioGeneroPage extends CommonsBasePage {

    WebDriverWait wait;
    Actions builder;


    public void AlterarDadosDeUsuarioGeneroPage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }


    public void alterarGenero() {
        WebElement campoType = _Driver().findElement(By.name("sexo"));
        new Select(campoType).selectByVisibleText("Feminino");

    }

    public void validarAlteracao() {
        assertTrue("Gênero continua o mesmo", wait.until(ExpectedConditions.textToBePresentInElementValue(By.name("sexo"), "F")));
    }


}
