//Autor:ManuelJCordobaT
//Programa: programa que lea notas 50 alumnos en 10 asignaturas y que diga la media por asignatura.
public class CincuentaAlumnos10AsigMediaAsig {

    public static void main(String[] args) {
        //Entorno:
        byte contAsi;
        byte contAlu;
        float [] vectAcumNot;
        float nota;
        byte i;
        
        
        //Algoritmo
        vectAcumNot = new float[5];
        contAsi = 1;
        
        for(i = 0; i <= vectAcumNot.length-1;i++){
            
            while(contAsi <=10){
                System.out.println("Introduzca nota del alumno " +i+ " en la asignatura: "+contAsi+"º: ");
                nota = Leer.datoFloat();
                vectAcumNot[i] = vectAcumNot[i]+nota;
                contAsi++;
            }//Fin Mientras
            
        }//Fin Para
        
    }//Fin Programa
}
