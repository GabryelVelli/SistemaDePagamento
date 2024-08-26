# Sistema De Pagamento em java

Este projeto é uma implementação de um sistema de pagamento em Java usando interfaces para diferentes métodos de pagamento. Ele permite que o usuário escolha entre pagar com Cartão de Crédito, Boleto Bancário ou PIX.

Funcionalidades
O usuário pode selecionar o método de pagamento desejado.
Cada método de pagamento requer informações específicas, como o número do cartão, código de barras do boleto ou chave Pix.
O sistema realiza o pagamento e exibe uma mensagem confirmando o valor e os detalhes da transação.

Tecnologias Utilizadas
Java: Linguagem de programação usada no desenvolvimento do sistema.
Interface: A interface Pagamento é implementada pelas classes CartaoCredito, BoletoBancario e Pix.
Scanner: Utilizado para coletar informações do usuário via entrada de dados no console.

Estrutura do Projeto
Pagamento: Interface com o método realizarpagamento(double valor) que deve ser implementado por cada forma de pagamento.
CartaoCredito: Classe que representa o pagamento via cartão de crédito.
BoletoBancario: Classe que representa o pagamento via boleto bancário.
Pix: Classe que representa o pagamento via PIX.
PagamentoTeste: Classe de teste que solicita ao usuário os dados de pagamento e chama o método realizarpagamento de acordo com a opção escolhida.
