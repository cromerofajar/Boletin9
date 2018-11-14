package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Sucesiones {
    public Sucesiones(){}
    public void serie(){
        int serie, fin, numeroA=2,numeroB1=-1,numeroB2=2, numeroC1=0,numeroC2=1;
        Scanner ler=new Scanner(System.in);
        System.out.println("Introduzca cantidad limite de visualizaciones");
        fin=ler.nextInt();
        System.out.println("Introduzca la serie a visualizar");
        serie=ler.nextInt();
        switch (serie){
            case 1: int contador;
                    for(contador=0; contador<fin; contador++){
                    System.out.print(numeroA +" + ");
                    numeroA=numeroA+2;
                    }
                    break;
            case 2: for(contador=1; contador<fin+1;contador++){
                    System.out.print(numeroB1+" +"+numeroB2+" ");
                    numeroB1=numeroB1-2;
                    numeroB2=numeroB2+2;
                    }
                    break;
            case 3: for(contador=0;contador<fin;contador++){
                    System.out.print(numeroC1+", "+numeroC2+", ");
                    numeroC1=numeroC1+numeroC2;
                    numeroC2=numeroC1+numeroC2;
                    }
                    break;
            default: System.out.println("No es una serie valida");
            }
    }
}
    
    

