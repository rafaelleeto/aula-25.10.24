public class Pagamento {
    double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void realizarPagamento(){
        System.out.println("Pagamento realizado, você recebeu um troco dele"+valor);



    }



}
