package metodos_ordenamiento;

/**
 *
 * @author Sofía Lugo, Nicolas Tuseddu, Daniel Vargas
 */
public class Caracteres {

    public String Reemplazo(String texto) {
        int mayorRepeticion = 0;
        char letraMasRepetida = ' ';
        String mensaje = "";
        char[] letras;
        letras = texto.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            char letraActual = letras[i];
            int contador = 0;
            for (int j = 0; j < letras.length; j++) {
                if (letras[j] == letraActual) {
                    contador++;
                }
            }
            if (mayorRepeticion < contador) {
                mayorRepeticion = contador;
                letraMasRepetida = letraActual;
            }
        }
        System.out.println(letraMasRepetida + ": Se repite " + mayorRepeticion);
        String code = "";
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u' || letras[i] == 'A' || letras[i] == 'E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U') {
                letras[i] = letraMasRepetida;
            }
        }
        for (int k = 0; k < letras.length; k++) {
            code = code + letras[k];
        }
        mensaje = letraMasRepetida + " se repite " + mayorRepeticion + "\t" + code;
        return mensaje;
    }
}
