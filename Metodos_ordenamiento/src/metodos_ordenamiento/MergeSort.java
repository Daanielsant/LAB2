package metodos_ordenamiento;
/**
 *
 * @author Sofía Lugo, Nicolas Tuseddu, Daniel Vargas
 */
public class MergeSort {
    private double [] arreglo;

    public double[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }

    public void merge(double arreglo[], int izq, int med, int der) {
        //Se buscan los tamaños de los dos arregloas a dividir
        int n1 = med - izq + 1;
        int n2 = der - med;
        
        //se crean los subarreglos
        int arregloIzquierdo[] = new int[n1];
        int arregloDerecho[] = new int[n2];
        
        //Se copian los datos correspondientes a la parte derecha e izquierda del arreglo "original" en los dos subarreglos
        for (int i = 0; i < n1; i++) {
            arregloIzquierdo[i] = (int) arreglo[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            arregloDerecho[j] = (int) arreglo[med + j + 1];
        }
        //SE COMBINAN LOS DOS ARREGLOS TEMPORALES
        
        //Se inicializan los contadores
        int i = 0, j = 0;
        
        //Indice inicial de los subarreglos a mezclar
        int k = izq;
        
        while (i < n1 && j < n2) {
            //Se valida que el lado izquierdo sea menor o igual al derecho
            if (arregloIzquierdo[i] <= arregloDerecho[j]) {
                arreglo[k] = arregloIzquierdo[i];
                i++;
            } else {
                arreglo[k] = arregloDerecho[j];
                j++;
            }
            k++;
        }
        
        //Se copian los elemeentos restantes en izquierda
        while (i < n1) {
            arreglo[k] = arregloIzquierdo[i];
            i++;
            k++;
        }
        
        //Se copian los elemeentos restantes en derecha
        while (j < n2) {
            arreglo[k] = arregloDerecho[j];
            j++;
            k++;
        }
    }
    
    public void sort(double arreglo[], int extremoizquierda, int extremoderecha) {
        if (extremoizquierda < extremoderecha) {
            //Se busca el punto medio
            int puntomedio = (extremoizquierda + extremoderecha) / 2;
            
            //Se toma primero el lado izquierdo
            sort(arreglo, extremoizquierda, puntomedio);
            
            //Se toma el lado derecho
            sort(arreglo, puntomedio + 1, extremoderecha);
            
            //Se mezclan los arreglos organizados (Merge)
            merge(arreglo, extremoizquierda, puntomedio, extremoderecha);
        }
    }

    public String ImprimirArreglo(double [] arreglo, int tamaño) {
        String code = "";
        for (int k = 0; k < tamaño; k++) {
            code = code + "   " + arreglo[k];
        }
        return code;
    }
    
}
