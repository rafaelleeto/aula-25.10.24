public class PagamentoBoleto extends Pagamento{
    String codigoBarras;

    public void realizarPagamento(double saque){
        System.out.println("Pagamento realizado com boleto: "+codigoBarras);
        valor=-saque;


    }

}
