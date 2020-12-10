$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:acessoAosSubLinks.feature");
formatter.feature({
  "name": "TESTE",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "Validar acesso aos sublinks da opção PLANOS DE CELULAR",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "que acesso a página da aplicação",
  "keyword": "Dado "
});
formatter.step({
  "name": "aciono o link \"\u003clink\u003e\" e seleciono o sublink \"\u003csublink\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "valido que estou na página correta \"\u003curl\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "link",
        "sublink",
        "url"
      ]
    },
    {
      "cells": [
        "Planos de celular",
        "Claro",
        "https://www.celulardireto.com.br/planos-celular/claro/"
      ]
    },
    {
      "cells": [
        "Planos de celular",
        "oi",
        "https://www.celulardireto.com.br/planos-celular/oi/"
      ]
    },
    {
      "cells": [
        "planos de Celular",
        "ViVo",
        "https://www.celulardireto.com.br/planos-celular/vivo/"
      ]
    },
    {
      "cells": [
        "PlAnOs De CelUlAR",
        "TIm",
        "https://www.celulardireto.com.br/planos-celular/tim/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar acesso aos sublinks da opção PLANOS DE CELULAR",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "que acesso a página da aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessar_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o link \"Planos de celular\" e seleciono o sublink \"Claro\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.informarUsername(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que estou na página correta \"https://www.celulardireto.com.br/planos-celular/claro/\"",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.informarSubLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar acesso aos sublinks da opção PLANOS DE CELULAR",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "que acesso a página da aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessar_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o link \"Planos de celular\" e seleciono o sublink \"oi\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.informarUsername(String,String)"
});
