package Scenarios;

import Pages.BuscaPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBusca {
    WebDriver driver;
    BuscaPage buscaPage;

    @Before
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        buscaPage = new BuscaPage(driver);
        driver.get("http://automationpractice.com/index.php");
    }
    @Test
    public void testBusca()throws InterruptedException{

        buscaPage.digitarItem();
        buscaPage.clicarBusca();
        buscaPage.selecionarProduto();
        buscaPage.adicionarAoCarrinho();
        buscaPage.irParaCarrinho();
        buscaPage.alterarAQuantidade();
        buscaPage.remocaoDoItem();
    }

}
