package br.com.abc.Exercicios.SistemadePagamento.classe;

public class CartaoCredito implements Pagamento{

    private String titular;
    private String numerocartao;
    private String datavalidade;
    private int codseg;

    //construtor

    public CartaoCredito() {
    }

    public CartaoCredito(String titular, String numerocartao, String datavalidade, int codseg) {
        this.titular = titular;
        this.numerocartao = numerocartao;
        this.datavalidade = datavalidade;
        this.codseg = codseg;
    }

    @Override
    public void realizarpagamento(double valor) {
        System.out.println("Valor pago no cartao de credito: R$ " + valor);
        System.out.println("Nome: " + titular);
        System.out.println("Cartao de credito: " + numerocartao);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        this.datavalidade = datavalidade;
    }

    public int getCodseg() {
        return codseg;
    }

    public void setCodseg(int codseg) {
        this.codseg = codseg;
    }
}
