package com.everis.beca;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CommonsBasePage extends DriverFactory {

	WebDriverWait wait = new WebDriverWait(_Driver(), 15);

    public WebElement validarElementoEmTela(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clicarElemento(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void preencherTextoElemento(By by, String texto){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(texto);
    }

    public void navegarAteSite(String site){
        _Driver().get(site);
        _Driver().manage().window().maximize();
    }

    public void rolarAteElemento(WebElement elemento){
        ((JavascriptExecutor)_Driver()).executeScript("arguments[0].scrollIntoView(true);", elemento);
    }

    public void validaCondicaoVerdadeira(String mensagemFalha, Boolean condicao){
        assertTrue(mensagemFalha, condicao);
    }

    public void fazerLogin() {
        navegarAteSite("http://www.webmotors.com.br/");
        clicarElemento(By.cssSelector(".Menu-User__login > p"));
        clicarElemento(By.id("userLoginRegister"));
        preencherTextoElemento(By.id("email"), "folotasm@gmail.com");
        preencherTextoElemento(By.id("senha"), "123456");
        clicarElemento(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[4]/input"));

    }

    public void navegarAteEditarPerfil() {
        clicarElemento(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]"));
        clicarElemento(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[2]/ul/li[3]"));

        List<String> abas = new ArrayList<>(_Driver().getWindowHandles());
        _Driver().switchTo().window(abas.get(1));

    }


}
