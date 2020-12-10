package StepsDefinition;

import PageObjects.LinkPage;
import PageObjects.PlanoPage;
import Suport.Web;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;


public class Steps {
    public WebDriver navegador;

   /*@Before
    public void setUp() {
     navegador = Web.createChrome();
    }*/

    @Dado("que acesso a página da aplicação")
    public void acessar_url(){
        navegador = Web.createChrome();
    }

    @Quando("aciono o link {string} e seleciono o sublink {string}")
    public void informarUsername(String link, String sublink) throws InterruptedException {
        new LinkPage(navegador)
        .clicarLinkBarraDeMenu(link, sublink);
    }

    @E("informo a operadora {string}")
    public void informarOperadora(String operadora) throws InterruptedException {
        new PlanoPage(navegador)
        .acessaOperadora(operadora);
    }

    /*@E("seleciono o checkbox pacote de dados {string}")
    public void informarPacote(String pacote) throws InterruptedException {
        new PlanoPage(navegador)
                .informarPacoteDados(pacote);
    }*/

    @Então("tenho como retorno do sistema a quantidade de {string}")
    public void informarTamanhoEValorr(String quantidade) throws InterruptedException {
        new PlanoPage(navegador)
        .informarQuantidade(quantidade);
        navegador.quit();
    }

    @Então("valido que estou na página correta {string}")
    public void informarSubLink(String url){
        new LinkPage(navegador)
        .validacaoPaginaSucesso(url);
        navegador.quit();
    }

}












    /*@After
    public void tearDown(){
        navegador.quit();
    }*/



