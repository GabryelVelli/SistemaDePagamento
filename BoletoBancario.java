package br.com.abc.Exercicios.SistemadePagamento.classe;

public class BoletoBancario implements Pagamento {
    private String codbarras;
    private String datavencimento;
    private String nomebeneficiario;

    //construtor

    public BoletoBancario() {
    }

    public BoletoBancario(String codbarras, String datavencimento, String nomebeneficiario) {
        this.codbarras = codbarras;
        this.datavencimento = datavencimento;
        this.nomebeneficiario = nomebeneficiario;
    }

    @Override
    public void realizarpagamento(double valor) {
        System.out.println("Valor pago no boleto bancario: R$ " + valor);
        System.out.println("Codigo de barras: " + codbarras);
        System.out.println("Vencimento: " + datavencimento);
    }
    //get e set
    public String getCodbarras() {
        return codbarras;
    }

    public void setCodbarras(String codbarras) {
        this.codbarras = codbarras;
    }

    public String getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(String datavencimento) {
        this.datavencimento = datavencimento;
    }

    public String getNomebeneficiario() {
        return nomebeneficiario;
    }

    public void setNomebeneficiario(String nomebeneficiario) {
        this.nomebeneficiario = nomebeneficiario;
    }
}
