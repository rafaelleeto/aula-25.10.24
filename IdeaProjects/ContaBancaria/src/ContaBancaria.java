public class ContaBancaria {
    double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor){
        saldo=saldo+valor;

    }

    void sacar(double valor){
        saldo=saldo-valor;

    }

}

