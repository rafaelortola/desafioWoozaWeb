# language: pt
Funcionalidade: TESTE

  @smoketest
  Esquema do Cenário: Validar acesso aos sublinks da opção PLANOS DE CELULAR
    Dado que acesso a página da aplicação
    Quando aciono o link "<link>" e seleciono o sublink "<sublink>"
    Então valido que estou na página correta "<url>"
    Exemplos:
      |link             |sublink|url                                                    |
      |Planos de celular|Claro  |https://www.celulardireto.com.br/planos-celular/claro/ |
      |Planos de celular|oi     | https://www.celulardireto.com.br/planos-celular/oi/   |
      |planos de Celular|ViVo   | https://www.celulardireto.com.br/planos-celular/vivo/ |
      |PlAnOs De CelUlAR|TIm    | https://www.celulardireto.com.br/planos-celular/tim/  |


  @smoketest
  Esquema do Cenário: Validar acesso aos sublinks da opção INTERNET BANDA LARGA
    Dado que acesso a página da aplicação
    Quando aciono o link "<link>" e seleciono o sublink "<sublink>"
    Então valido que estou na página correta "<url>"
    Exemplos:
      |link                |sublink              |url                                                    |
      |Internet Banda Larga|ConsultE Sua Cobertura   |https://www.celulardireto.com.br/internet-banda-larga/ |
      |Internet Banda Larga|Teste de Velocidade  |https://www.celulardireto.com.br/teste-de-velocidade/  |
      |Internet Banda Larga|Planos de Banda Larga|https://www.celulardireto.com.br/internet-banda-larga/ |


  @smoketest
  Esquema do Cenário: Validar acesso aos sublinks da opção OPERADORAS
    Dado que acesso a página da aplicação
    Quando aciono o link "<link>" e seleciono o sublink "<sublink>"
    Então valido que estou na página correta "<url>"
    Exemplos:
      |link        |sublink    |url                                          |
      |Operadoras  |CLaro      |https://www.celulardireto.com.br/claro/      |
      |Operadoras  |Oi         |https://www.celulardireto.com.br/oi/         |
      |Operadoras  |Vivo       |https://www.celulardireto.com.br/vivo/       |
      |Operadoras  |Tim        |https://www.celulardireto.com.br/tim/        |
      |Operadoras  |Sky        |https://www.celulardireto.com.br/sky/        |
      |Operadoras  |NET        |https://www.celulardireto.com.br/claro-net/  |
      |Operadoras  |Predial    |https://www.celulardireto.com.br/predialnet/ |

