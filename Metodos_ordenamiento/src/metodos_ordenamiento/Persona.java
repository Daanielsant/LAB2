package metodos_ordenamiento;

import java.util.Arrays;

/**
 *
 * @author Sofía Lugo, Nicolas Tuseddu, Daniel Vargas
 */
public class Persona {
String[] nombre;
    int[] edad;
    long[] cedula;
    int tamano;

    public Persona() {
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public long[] getCedula() {
        return cedula;
    }

    public void setCedula(long[] cedula) {
        this.cedula = cedula;
    }

    public String ImprimirArreglo(int tamaño) {
        String code="";
        for (int i = 0; i < tamaño; i++) {
            code= code + "\tPosición " + (i + 1) + "\t" + nombre[i] + "\t" + edad[i] + "\t" + cedula[i];
        }
        return code;
    }

    public String OrdenarArregloBurbujaEdad(String [] nombre, int [] edad, long [] cedula, int tamaño) {
        int i, j, aux;
        String code = "";
        for (i = 0; i < tamaño - 1; i++) {
            for (j = 0; j < tamaño - i - 1; j++) {
                if (edad[j + 1] < edad[j]) {
                    aux = (int) edad[j + 1];
                    edad[j + 1] = edad[j];
                    edad[j] = aux;
                }
            }
        }
        for (int k = 0; k < tamaño; k++) {
            code= code + "Posición " + (k + 1) + "\t" + Arrays.toString(nombre) + "\t" + Arrays.toString(edad) + "\t" + Arrays.toString(edad);
        }
        return code;
    }

    public String OrdenarArregloBurbujaCedula(String [] nombre, int [] edad, long [] cedula, int tamaño) {
        String mensaje;
        mensaje = "";
        int i, j, aux;
        for (i = 0; i < tamaño - 1; i++) {
            for (j = 0; j < tamaño - i - 1; j++) {
                if (cedula[j + 1] < cedula[j]) {
                    aux = (int) cedula[j + 1];
                    cedula[j + 1] = cedula[j];
                    cedula[j] = aux;
                }
            }
        }
        for (int k = 0; k < tamaño; k++) {
            mensaje= mensaje + "Posición " + (k + 1) + "\t" + Arrays.toString(nombre) + "\t" + Arrays.toString(edad) + "\t" + Arrays.toString(edad);
        }
        return mensaje;
        }
   
   

    public void OrdenarArregloMergeSortEdad(float tamaño) {

    }

    public void OrdenarArregloMergeSortCedula(float tamaño) {

    }
}
