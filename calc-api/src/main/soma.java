public abstract class soma 
{
    private double N1;
    private double N2;

     public void soma ( double N1, double N2)
     {
         double resultado;
         resultado = N1 + N2;
         return resultado;
     }
     public double getN1()
     {
         return N1;
     }
     public void setN1(double N1)
     {
         this.N1 = N1;
     }
      public double getN2()
     {
         return N2;
     }
     public void setN2(double N2)
     {
         this.N2 = N2;
     }   
}