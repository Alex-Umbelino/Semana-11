public class Boleto extends Pagamento 
{ 
 private String numeroDoBoleto;
 private int dia;
 private int mes;
 private int ano;
 
 public Boleto(String numero,int dia,int mes,int ano,String nome,String cp,double va)
 {
  super(nome,cp,va);
  numeroDoBoleto=numero;
  this.dia=dia;
  this.mes=mes;
  this.ano=ano;
 }
 
 public void setNumeroDoBoleto(String numero)
 {
   numeroDoBoleto=numero;
 }
 public void setDia(int d)
 {
  dia=d;
 }
 public void setMes(int m)
 {
  mes=m;
 }
 public void setAno(int a)
 {
  ano=a;
 }
 
 public String getNumeroDoBoleto()
 {
  return numeroDoBoleto;
 }
 
public int getDia()
{
 return dia;
}
public int getMes()
{
 return mes;
}
public int getAno()
{
 return ano;
}





} 