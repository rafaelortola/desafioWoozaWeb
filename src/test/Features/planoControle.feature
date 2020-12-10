# language: pt
Funcionalidade: TESTE

  @smoketest
  Esquema do Cenário: Validar quantidade de planos por operadora
    Dado que acesso a página da aplicação
    Quando aciono o link "<link>" e seleciono o sublink "<sublink>"
    E informo a operadora "<operadora>"
    #E seleciono o checkbox pacote de dados "<pacote>"
    Então tenho como retorno do sistema a quantidade de "<quantidade>"
    Exemplos:
     |link             |sublink|operadora|quantidade|
     |Planos de Celular|Claro  |Claro    |10        |
     |Planos de Celular|Oi     |Oi       |2         |
     |Planos de Celular|Tim    |Tim      |11        |
     |Planos de Celular|Vivo   |Vivo     |7         |


