package metodos_ordenamiento;
/**
 *
 * @author Sofía Lugo, Nicolas Tuseddu, Daniel Vargas
 */
public class Ordenamientos1 {

    public String Seleccion(float tamaño) {
        String mensaje = " ";
        int x = (int) tamaño;
        double arreglo[] = new double[x];

        for (int i = 0; i < x; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis();
        int i, j, menor, pos, tmp;
        for (i = 0; i < arreglo.length - 1; i++) {
            menor = (int) arreglo[i];
            pos = i;
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < menor) {
                    menor = (int) arreglo[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = (int) arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = tmp;
            }
        }
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        String code = "";
        for (int k = 0; k < arreglo.length; k++) {
            code = code + "   " + arreglo[k];
        }
        mensaje = "Tiempo: " + tiempo + "ms\tArreglo:" + code;
        return mensaje;
    }

    public String Insercion(float tamaño) {
        String mensaje = " ";
        int x = (int) tamaño;
        double arreglo[] = new double[x];

        for (int i = 0; i < x; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis();
        int p, j, aux;
        for (p = 1; p < arreglo.length; p++) {
            aux = (int) arreglo[p];
            j = p - 1;
            while ((j >= 0) && (aux < arreglo[j])) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        String code = "";
        for (int k = 0; k < arreglo.length; k++) {
            code = code + "   " + arreglo[k];
        }
        mensaje = "Tiempo: " + tiempo + "ms\tArreglo:" + code;
        return mensaje;
    }

    public String Burbuja(float tamaño) {
        String mensaje = " ";
        int x = (int) tamaño;
        double arreglo[] = new double[x];
        for (int i = 0; i < x; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis();
        int i, j, aux;
        for (i = 0; i < arreglo.length - 1; i++) {
            for (j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j + 1] < arreglo[j]) {
                    aux = (int) arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        
        String code = "";
        for (int k = 0; k < arreglo.length; k++) {
            code = code + "   " + arreglo[k];
        }
        mensaje = "Tiempo: " + tiempo + "ms\tArreglo:" + code;
        return mensaje;
    }
}
