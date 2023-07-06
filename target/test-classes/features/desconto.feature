# language: pt

Funcionalidade: Receber o cupom de desconto da Qazando
  Eu como usuário da Qazando
  quero receber um cupom de desconto
  para comprar um curso com valor reduzido

  Cenário: Visualizar código de desconto
    Dado que estou no site da Qazando
    Quando eu preencho meu e-mail
    E clico em ganhar cupom
    Então eu vejo o código de desconto