//Programa: Ejercicio nº1 boletín unidad 6
//Autor: ManuelJCordobaT
public class ej1BolUD6 {

   
    public static void main(String[] args) {
        //Entorno:
        int [] numeros;
        byte i;
        int acumPar;
        int acumImpar;
        
        //Algoritmo:
        numeros = new int [10];
        for (i = 0; i<=numeros.length-1;i++){
            do{
                System.out.println("Introduzca un número: ");
                numeros[i] = Leer.datoInt();
            }while(numeros[i]<0);
        }//Fin Para
        acumImpar = 0;
        acumPar = 0;
        for(i = 0; i<=numeros.length-1; i++){
            if(numeros[i]%2 == 0){
                acumPar=acumPar+numeros[i];
            }else{
                acumImpar = acumImpar+numeros[i];
            }//Fin Si
            
        }//Fin Para
        System.out.println("La suma de los números pares es: "+acumPar);
        System.out.println("La suma de los números impares es: "+acumImpar);
    }//Fin Programa
}
//Se sabe que el índice 0 de este programa se sumará al de los impares.