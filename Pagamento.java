public class Pagamento 
{
 private String nomeDoPagador;
 private String cpf;
 private double valorASerPago;
 
 //Método construtor
 public Pagamento(String nome,String cp,double va)
 {
   nomeDoPagador=nome;
   cpf=cp;
   valorASerPago=va;
 }
 //metodos modificadores
 public void setNomeDoPagador(String nome)
 {
  nomeDoPagador=nome;
 }
 public void setCpf(String cp)
 {
  cpf=cp;
 }
 public void setValorASerPago(double va)
 {
   valorASerPago=va;
 }
 
 //Métodos de acesso
 
 public String getNomeDoPagador()
 {
  return nomeDoPagador;
 }
 public String getCpf()
 {
  return cpf;
 }
 public double getValorASerPago()
 {
   return valorASerPago;
 }
 
 public String getDados()
 {
  return "Nome do pagador: " +getNomeDoPagador()+"CPF: "+getCpf()+"\nValor a ser pago: "+getValorASerPago();
 }
 
 
 
}