package ejercicio2;

public class TrianguloRect extends FiguraRecta{
   public TrianguloRect(int alto, int ancho){
       this.alto = alto;
       this.ancho = ancho;
   } 
   
   @Override 
   public double calcularArea(){
       return (ancho * alto) / 2.0;   
    }
 @Override 
 public double calcularPerimetro(){
     double hipotenusa = Math.sqrt(ancho * ancho * alto * alto);
     return ancho + alto + hipotenusa;
 }
 
 @Override 
 public String imprimeFigura(){
     return super.imprimeFigura() + "\n" + String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",
             alto, ancho, calcularArea(), calcularPerimetro());
 }
}
