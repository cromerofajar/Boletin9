package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Empleado {
    public Empleado(){}
    
    public void trabajador(){
    int soldo, superior=0, trabaj=0;
    float porcentaje=0,trabajmenor=0;
        System.out.println("Introduzca soldo do empleado");
        Scanner ler= new Scanner (System.in);
        soldo=ler.nextInt();
        while (soldo<0){
            System.out.println("Introduzca soldo positovo");
            soldo=ler.nextInt();
            
        }
    while (soldo<0 || soldo>0){
        trabaj++;
        if (soldo>=1000 && soldo<=1500){
            superior++;
            porcentaje=(trabajmenor*100)/trabaj;
        }
        else if (soldo>1500){
            porcentaje=(trabajmenor*100)/trabaj;
        }
        else {
            trabajmenor++;
            porcentaje=(trabajmenor*100)/trabaj;
        }
        soldo=ler.nextInt();
    }
        System.out.println("Los trabajadores que cobran entre 1000 y 1500 son= "+superior+"\nEl porcentaje de los que cobran menos de 1000= "+porcentaje+"%");
    
    }
}
