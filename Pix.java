package br.com.abc.Exercicios.SistemadePagamento.classe;

public class Pix implements Pagamento{
    private String chavepix;
    private String nomedestino;
    private String banco;

    //construtor

    public Pix() {
    }

    public Pix(String chavepix, String nomedestino, String banco) {
        this.chavepix = chavepix;
        this.nomedestino = nomedestino;
        this.banco = banco;
    }

    //metodo
    @Override
    public void realizarpagamento(double valor) {
        System.out.println("Pix enviado para " + nomedestino + " no valor de: R$ " + valor);
        System.out.println("Chave pix: " + chavepix);
        System.out.println("Banco: " + banco);
    }

    //get e set
    public String getChavepix() {
        return chavepix;
    }

    public void setChavepix(String chavepix) {
        this.chavepix = chavepix;
    }

    public String getNomedestino() {
        return nomedestino;
    }

    public void setNomedestino(String nomedestino) {
        this.nomedestino = nomedestino;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
