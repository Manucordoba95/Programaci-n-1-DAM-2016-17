//Programa: 
//Autor:ManuelJCórdobaT
public class ej6BolUD6 {
     public static int bsecuencial(char[] vector, char caracter){
    //Entorno:
        int posicion;
        int indice;
    //ALgoritmo:
        indice = 0;
        while(indice < vector.length-1 && vector[indice] != caracter){
            indice++;
        }//FinMientras
        if(vector[indice]==caracter){
            posicion = vector[indice];
        }else{
            posicion = vector[indice]-1;
        }//FinSI
        return posicion;
     }//Fin Función
    
    // \u0000 caracter fin de cadena --> es el caracter que hay dentro del array, al crear un array de chars se recarga con este caracter
    //El '.' es el 46 en codigo ascii
    public static void main(String[] args) {
        //Entorno:
        char[] vectorc;
        short i;
        char caracter;
        short ini;
        short fin;

        //Algoritmo:
        System.out.println('\u0000');
        vectorc = new char[256];
        i = 0;
        System.out.println("Introduzca un caracter: [.]para salir");
        caracter = Leer.datoChar();

        while (caracter != '.' || i == 256) {
            vectorc[i] = caracter;
            System.out.println("Introduzca un caracter: [.]para salir");
            caracter = Leer.datoChar();
            i++;
            
        }//Fin Mientras
        
        
        for (i = 0; i <= vectorc.length - 1; i++) {
            System.out.print((char) vectorc[i] + " ");
        
        }//Fin Para
    }//Fin Programa
}
