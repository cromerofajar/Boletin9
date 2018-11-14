package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Tabla {
    
    public Tabla(){}
    
    public void multiplos(){
    double numero, contador, multiplo,fin=10, resultado;
    Scanner ler =new Scanner(System.in);
        System.out.println("Introduzca numero para visualizar su tabla:");
    numero=ler.nextDouble();
    while(numero>0||numero<0){
                System.out.println("\nTabla de "+numero+" = ");
    
    for(contador=0;contador<=fin;contador++){
        multiplo=contador;
        resultado=numero*contador;
        System.out.println(numero+" * "+multiplo+" = "+ resultado);

    }
        System.out.println("\nIntroduzca siguiente numero para visualizar su tabla:");
    numero=ler.nextDouble();
    }
    }
    
}
