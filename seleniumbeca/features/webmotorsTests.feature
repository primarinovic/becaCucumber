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
