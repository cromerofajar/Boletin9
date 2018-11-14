
package boletin9_2;


/**
 *
 * @author cromerofajar
 */
public class Calculos {
    public Calculos(){}
    public void operaciones(){
        double contador, suma=0,fin=90,multi=1;

        for (contador=10;contador<fin;contador++){
            suma=suma+contador;
            }
        for (contador=10;contador<fin;contador++){
            multi=multi*contador;
        }
                    System.out.println("Suma= "+suma+"\nMultiplicacion= "+multi);
    }
}

    

