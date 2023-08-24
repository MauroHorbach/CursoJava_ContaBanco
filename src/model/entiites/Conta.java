package model.entiites;

public class Conta{
    private Integer numero;
    private String detentor;
    private Double saldo;
    private double limiteSaque;
    
    public Conta(){
    }
    
    public Conta(Integer numero, String detentor, Double saldo, double limiteSaque) {
        this.numero = numero;
        this.detentor = detentor;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDetentor() {
        return detentor;
    }

    public void setDetentor(String detentor) {
        this.detentor = detentor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){
        if(quantia > saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        if(quantia > limiteSaque){
            throw new IllegalArgumentException("O valor solicitado excede o limite de saque");
        }
        saldo -= quantia;
    }

    @Override
    public String toString(){
        return "Extrato: \n"
        + "Conta: "
        + numero
        + "\nCorrentista: "
        + detentor
        + "\nLimite de saque: R$ "
        + String.format("%.2f", limiteSaque)
        + "\nSaldo atual: R$ "
        + String.format("%.2f", saldo);
    }
}