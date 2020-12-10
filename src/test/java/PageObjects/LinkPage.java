package PageObjects;

import Enums.LinksEnum;
import Enums.SubLinksEnum;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LinkPage extends BasePage {

    public LinkPage(WebDriver navegador) {
        super(navegador);
    }

    public PlanoPage clicarLinkBarraDeMenu(String linkMenu, String subLinkMenu) throws InterruptedException {

        if (linkMenu.toUpperCase().contains(LinksEnum.PLANOSDECELULAR.getDescricao())) {
            WebElement c = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]"));
            Actions actions = new Actions(navegador);
            actions.moveToElement(c).perform();

            if (subLinkMenu.toUpperCase().contains(SubLinksEnum.CLARO.getDescricao())) {
                WebElement d = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul"));
                d.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul/li[1]")).click();
            } else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OI.getDescricao())) {
                WebElement d = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul"));
                d.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul/li[2]")).click();
            } else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.VIVO.getDescricao())) {
                WebElement d = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul"));
                d.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul/li[3]")).click();
            } else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.TIM.getDescricao())) {
                WebElement d = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul"));
                d.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/ul/li[4]")).click();
            }
        }

        else if (linkMenu.toUpperCase().contains(LinksEnum.INTERNETBANDALARGA.getDescricao())) {
            WebElement e = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]"));
            Actions actions = new Actions(navegador);
            actions.moveToElement(e).perform();

            if (subLinkMenu.toUpperCase().contains(SubLinksEnum.CONSULTESUACOBERTURA.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/ul"));
                    f.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/ul/li[1]")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.TESTEDEVELOCIDADE.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/ul/li[2]")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.PLANOSDEBANDALARGA.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/ul/li[3]")).click();
            }
        }

        else if (linkMenu.toUpperCase().contains(LinksEnum.OPERADORAS.getDescricao())) {
            WebElement e = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]"));
            Actions actions = new Actions(navegador);
            actions.moveToElement(e).perform();

            if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASCLARO.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[1]")).click();
            }
           else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASOI.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[2]")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASVIVO.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[3]")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASTIM.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[4]")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASSKY.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[5]")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASCLARONET.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[6]/a")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASPREDIALNET.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[7]")).click();
            }
        }

        else if (linkMenu.toUpperCase().contains(LinksEnum.MONTESEUCOMBO.getDescricao())) {
            WebElement e = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[4]"));
            Actions actions = new Actions(navegador);
            actions.moveToElement(e).perform();

            if (subLinkMenu.toUpperCase().contains(SubLinksEnum.OPERADORASCLARONET.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[6]")).click();
            }
            else if (subLinkMenu.toUpperCase().contains(SubLinksEnum.COMBOSKY.getDescricao())) {
                WebElement f = navegador.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul"));
                f.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]/ul/li[5]")).click();
            }

        }
        return new PlanoPage(navegador);
    }


    public LinkPage validacaoPaginaSucesso(String url){
        String TituloPage = navegador.getCurrentUrl();
        Assert.assertEquals(url,TituloPage);
        System.out.println("URL esperada: " + url);
        System.out.println("URL retornada: " + TituloPage);
        return this;
    }

}
