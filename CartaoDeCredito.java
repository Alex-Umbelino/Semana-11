public class CartaoDeCredito extends Pagamento
{
  private String numeroDoCartao;
  
 public CartaoDeCredito(String numero,String nome,String cp,double va)
 {
   super(nome,cp,va);
   numeroDoCartao=numero;
 }
 
 
 
 public void setNumeroDoCartao(String numero)
 {
  numeroDoCartao=numero;
 }
 public String getNumeroDoCartao()
 {
  return numeroDoCartao;
 }
 
 
 
 
 
}