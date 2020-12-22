# language: pt

Funcionalidade: Testar página de usuário do Webmotors

  Um cliente deseja fazer login no site e verificar se está na página Minha Garagem

  @evidencia
  Cenario: Validar se o usuário faz login
    Dado que eu navego até a página de login do Webmotors
    Quando eu preencho os meus dados
    E clico no botão entrar
    Entao eu estou logado

  @evidencia
  Cenario: Validar se abre a tela de login com conta do Google
    Dado que eu navego até a página de login do Webmotors
    Quando eu clico em Entrar com Google
    Entao uma nova janela para login abre

  @evidencia
  Cenario: Validar se o usuário faz login com dados inválidos
    Dado que eu navego até a página de login do Webmotors
    Quando eu preencho com dados inválidos
    E clico no botão entrar
    Entao o login não é realizado

  @evidencia
  Cenario: Validar alteração de gênero do usuário
    Dado que eu faço login na página Webmotors
    Quando navego até Editar Perfil
    E altero Sexo Masculino para Feminino
    E clico em Salvar Alterações
    Então a página recarrega com o dado atualizado

  @evidencia
    Cenario: Validar alteração de telefone principal do usuário
    Dado que eu faço login na página Webmotors
    Quando navego até Editar Perfil
    E altero o Telefone Principal
    E clico em Salvar Alterações
    Entao a página recarrega com o telefone atualizado

  @evidencia
  Cenario: Validar Meus Anúncios
    Dado que eu faço login na página Webmotors
    Quando navego até Meus Anúncios
    Entao verifico que os elementos da página são exibidos corretamente

  @evidencia
  Cenario: Validar elementos da página Tabela Fipe
    Dado que eu navego até a página da Tabela Fipe
    E verifico que está tudo certo na navbar
    E verifico que está tudo certo nos campos da página
    E verifico que está tudo certo na lista de perguntas

  @evidencia
  Cenario: Validar pesquisar
    Dado que eu navego até a página Home do Webmotors
    Quando escrever produto na caixa de pesquisa
    E clico na sugestão
    Entao encontro os resultados correspondentes

  @evidencia
  Cenario: Validar elementos da página Home
    Dado que eu navego até a página Home do Webmotors
    E verifico que está tudo certo com o menu
    E verifico que está tudo certo com o menu de Busca
    E verifico que está tudo certo com as demais categorias

  @evidencia
  Cenario: Validar elementos de Categoria da página Home
    Dado que eu navego até a página Home do Webmotors
    E verifico os itens em Categorias

  @evidencia
  Cenario: Validar elementos do campo Mais Buscados na página Home
    Dado que eu navego até a página Home do Webmotors
    E verifico os itens em Carros Mais Buscados