package br.com.abc.Exercicios.SistemadePagamento.teste;

import br.com.abc.Exercicios.SistemadePagamento.classe.BoletoBancario;
import br.com.abc.Exercicios.SistemadePagamento.classe.CartaoCredito;
import br.com.abc.Exercicios.SistemadePagamento.classe.Pagamento;
import br.com.abc.Exercicios.SistemadePagamento.classe.Pix;

import java.util.Scanner;

public class PagamentoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o metodo de pagamento: ");
        System.out.println("1- Cartão De Credito");
        System.out.println("2- Boleto Bancario");
        System.out.println("3- PIX ");
        System.out.println("Digite a opção desejada: ");
        int opcao;
        opcao = scanner.nextInt();
        System.out.println("Digite o valor do pagamento: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        Pagamento pagamento = null;
        switch (opcao){
            case 1:
                System.out.println("Nome Titular: ");
                String titular = scanner.nextLine();
                System.out.println("Numero cartão de credito: ");
                String numerocartao = scanner.nextLine();
                System.out.println("Data Validade: ");
                String datavalidade = scanner.nextLine();
                System.out.println("Codigo de segurança: ");
                int codseg = scanner.nextInt();
                pagamento = new CartaoCredito(titular,numerocartao,datavalidade,codseg);
            break;
            case 2:
                System.out.println("Codigo de Barras: ");
                String codbarras = scanner.nextLine();
                scanner.next();
                System.out.println("Data de vencimento: ");
                String datavencimento = scanner.nextLine();
                scanner.next();
                System.out.println("Nome do Beneficiario: ");
                String nomebeneficiario = scanner.nextLine();
                scanner.next();
                pagamento = new BoletoBancario(codbarras,datavencimento,nomebeneficiario);
            break;
            case 3:
                System.out.println("Chave Pix: ");
                String chavepix = scanner.nextLine();
                System.out.println("Nome do destinatario: ");
                String nomedestino = scanner.nextLine();
                System.out.println("Banco: ");
                String banco = scanner.nextLine();
                pagamento = new Pix(chavepix,nomedestino,banco);
            break;
            default:
                System.out.println("Opção indisponivel");
            break;
        }
        pagamento.realizarpagamento(valor);
    }
}
