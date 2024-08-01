public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public ContaTerminal(int numero, double saldo, String nomeCliente, String agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal:" +
                "\n |Número= " + numero +
                "\n |Agência= " + agencia +
                "\n |Nome do Cliente= " + nomeCliente+
                "\n |Saldo= " + saldo ;
    }
}
