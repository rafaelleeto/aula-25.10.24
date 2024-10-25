public class ContaPoupanca extends ContaBancaria{
    double jurosMensais;

    public void sacar(double valor){
        saldo=saldo-valor;
    }
    public void aplicarJuros(){
        saldo=saldo*jurosMensais+saldo;

    }
}
