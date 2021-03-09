package metodos_ordenamiento;
/**
 *
 * @author Sofía Lugo, Nicolas Tuseddu, Daniel Vargas
 */
public class CalculosMat {

    public String RealizarCalculos(float tamaño) {
        String mensaje = "";

        int sumatoria = 0;
        float media = 0;
        double varianza = 0.0;
        double desviacion = 0.0;

        int x = (int) tamaño;
        int array[] = new int[x];

        for (int i = 0; i < x; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < x; i++) {
            sumatoria = sumatoria + array[i];
        }

        media = sumatoria / x; //media aritmetica 

        //se hace la suma de las diferencias respecto a la media
        for (int i = 0; i < x; i++) {
            double rango;
            rango = Math.pow(array[i] - media, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / x;//suma de diferencias sobre "n"
        //teniendo ya la varinza sólo debemos sacarle raiz cuadrada 
        //tendremos la desviación estandar
        desviacion = Math.sqrt(varianza);

        String code = "";
        for (int i = 0; i < x; i++) {
            code = code + "   " + Integer.toString(array[i]);

        }
        mensaje = "  Media = " + media + "  Varianza = " + varianza + "  Desviacion estandar = " + desviacion + "\tAleatorios " + code;
        return mensaje;

    }

}
