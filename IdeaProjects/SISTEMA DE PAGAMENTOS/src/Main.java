public class Main {
    public static void main(String[] args) {
        Pagamento pagamento=new Pagamento();
        pagamento.setValor(50);



        PagamentoCartao pagamentoCartao=new PagamentoCartao();
        pagamentoCartao.numeroCartao="123123123123213";
        pagamentoCartao.realizarPagamento(20);


        PagamentoBoleto pagamentoBoleto=new PagamentoBoleto();
        pagamentoBoleto.codigoBarras="abcdfg";
        pagamentoBoleto.realizarPagamento(30);
        pagamentoBoleto.realizarPagamento();




    }
}