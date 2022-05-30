package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaPage {

    WebDriver driver;

    String digitarItem= "//input[@id='search_query_top']";

    String clicarBusca= "//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]";

    String selecionarProduto= "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]";

    String adicionarAoCarrinho= "//span[contains(text(),'Add to cart')]";

    String irParaCarrinho= "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]";

    String alterarAQuantidade= "//*[@id='cart_quantity_up_4_16_0_0']/span/i";

    String remocaoDoItem= "//*[@id='4_16_0_0']/i";

    public BuscaPage(WebDriver driverDoTeste) {
        this.driver = driverDoTeste;
    }

    public void digitarItem(){
        driver.findElement(By.xpath(digitarItem)).sendKeys("dress");
    }
    public void clicarBusca(){
        driver.findElement(By.xpath(clicarBusca)).click();
    }
    public void selecionarProduto(){
        driver.findElement(By.xpath(selecionarProduto)).click();
    }
    public void adicionarAoCarrinho(){
        driver.findElement(By.xpath(adicionarAoCarrinho)).click();
    }
    public void irParaCarrinho() throws InterruptedException {
        driver.findElement(By.xpath(irParaCarrinho)).click();
        Thread.sleep( 5000);
    }
    public void alterarAQuantidade() throws InterruptedException {
        driver.findElement(By.xpath(alterarAQuantidade)).click();
        Thread.sleep( 5000);
    }
    public void remocaoDoItem(){
        driver.findElement(By.xpath(remocaoDoItem)).click();
    }
}
