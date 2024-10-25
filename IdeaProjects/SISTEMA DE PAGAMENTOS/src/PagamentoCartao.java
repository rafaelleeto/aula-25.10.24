public class PagamentoCartao extends Pagamento{
    String numeroCartao;

    public void realizarPagamento(double saque){
        valor=-saque;
        System.out.println("Pagamento realizado com cartão "+numeroCartao);

    }


}
