public class Ejercicio {
    /*
     * Metodo recursivo para calcular el maximo valor de un vector
     *
     * vector = {2, 9, 6, 7, 6, 3, 4, 3}*/


    public static int maximoVector(int[] vector, int indice,int maximo){

        if (indice == vector.length - 1){//caso base
            if (vector[indice] > maximo){
                maximo = vector[indice];
            }
        }else {//llamada a la recursividad

            if (vector[indice] > maximo){
                maximo = vector[indice];
            }


            maximo = maximoVector(vector,indice + 1, maximo);

        }




        return maximo;
    }

    /*
     * METODO AUXILIAR QUE LLAMA AL  METODO RECURSIVO
     *
     *  */


    public static int maximoVector(int[] vector){
        return maximoVector(vector,0,0);
    }
}
