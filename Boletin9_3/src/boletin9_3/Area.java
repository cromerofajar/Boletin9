package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Area {
    
    public Area(){}
    
    public void calcularArea(){
        float base, altura;
        Scanner ler=new Scanner(System.in);
        System.out.println("Introduzca base");
        base=ler.nextFloat();
        System.out.println("Introduzca altura");
        altura=ler.nextFloat();
        while (base<=0){
            System.out.println("Base no valida introduzca una positiva");
            base=ler.nextFloat();
        }
        while (altura<=0){
            System.out.println("Altura no valida introduzca una positiva");
            altura=ler.nextFloat();
        }
        System.out.println("El area del rectangulo es= "+(base*altura));
        
    }
    
}
