package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Cifras {
    public Cifras(){}
    
    public void numeroContar(){
        int numero, positivo=0, negativo=0, cero=0;
        Scanner ler=new Scanner (System.in);
        for (int contador=0;contador<10;contador++){
            numero=ler.nextInt();
            if(numero>0){
                positivo++;
            }
                else if(numero<0){
                        negativo++;
                        }
                    else {
                        cero++;
                        }
                
                
            
        }
        System.out.println("Positivos= "+ positivo+"negativos= "+negativo+"cero= "+cero);
    }
}
