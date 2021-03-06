package CLASSES;

public class banco {

    //ATRIBUTOS DA CLASSE
    private int numero;
    private String cpf;
    private double saldo;
    private boolean ativa;

    //CONSTRUTOR
    public banco(int numero, String cpf) {

        this.numero = numero;
        this.cpf = cpf;
    }

    //CONSTRUTOR - SOBRECARGA

    public banco(int numero) {

        this.numero = numero;
    }

    public banco(int numero, String cpf, boolean ativa) {

        this.numero = numero;
        this.cpf = cpf;
        this.ativa = ativa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    //METODOS
    public void credito(double valor) {
        this.saldo = this.saldo + valor;

    }

    public void debito(double valor)
    {
        if (this.saldo>=valor)
        {
            this.saldo = this.saldo - valor;
        }

    }

}