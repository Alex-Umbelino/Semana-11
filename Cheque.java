public class Cheque extends Pagamento 
{
 private String numeroDoCheque;
 
 public Cheque(String numeroCheque,String nome,String cp,double va)
 {
  super(nome,cp,va);
  numeroDoCheque=numeroCheque;
 }
 
 public void setNumeroDoCheque(String numeroCheque) 
 {
    numeroDoCheque=numeroCheque;
 }
 public String getNumeroDoCheque()
 {
  return numeroDoCheque;
 }
 



}