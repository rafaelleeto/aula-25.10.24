public class Main {
    public static void main(String[] args){

        ContaBancaria contaBancaria= new ContaBancaria();
        contaBancaria.saldo=1000;
        contaBancaria.depositar(500);
        contaBancaria.sacar(300);
        System.out.println(contaBancaria.getSaldo());

        ContaCorrente contaCorrente= new ContaCorrente();
        contaCorrente.taxaOperacao=10;
        contaCorrente.sacar(20);
        System.out.println(contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca=new ContaPoupanca();
        contaPoupanca.jurosMensais=0.05;
        contaPoupanca.sacar(90);
        contaPoupanca.depositar(300);
        contaPoupanca.aplicarJuros();
        System.out.println(contaPoupanca.getSaldo());


    }
}