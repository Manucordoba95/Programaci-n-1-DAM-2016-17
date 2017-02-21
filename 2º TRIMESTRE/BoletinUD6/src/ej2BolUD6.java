
 //Programa: Ejercicio 2 boletín estructuras de datos
 //Autor:ManuelJCórdobaT
 


public class ej2BolUD6 {
    //Módulos:
    
    public static void menu(){
    //Entorno:
    
    //Algoritmo:
        System.out.println("1. Visualizar.");
        System.out.println("2. Insertar elemento al principio.");
        System.out.println("3. Borrar elemento al principio.");
        System.out.println("4. Insertar elemento al final.");
        System.out.println("5. Borrar elemento al final.");
        System.out.println("6. Insertar un elemento en una posición.");
        System.out.println("7. Borrar elemento en una posición.");
        System.out.println("8. Salir.");
                              
    }//Fin Procedimiento
    
    public static boolean estaLlena(int []v){
    //Entorno:
        boolean llena;
        byte i;
    //Algoritmo:
        llena = true;
        for(i = 0; i<=v.length;i++){
            if(v[i]==0){
                llena = false;
            }//Fin Si
        }//Fin Para
    
        return llena;
    }//Fin Función
            
    public static void desplazaIzq(int []v){
    //Entorno:
    byte i;
    
    //Algoritmo:
        if(v[0]==0){    
            for(i=0; i<v.length-1;i++){
                v[i]=v[i+1];
            }//Fin Para
            v[i+1]=0;
        }else{
            System.out.println("Imposible movez el vector a la izquierda.");
        }
        
    }//Fin Procedimiento
    
    public static void desplazaDer(int []v){
    //Entorno:
        byte i;
    
    //Algoritmo:
        if(v[v.length-1]==0){
            for(i = 1; i<v.length-1;i++){
                v[i]=v[i-1];
            }//Fin Para
            v[v.length-i] = 0;
    }
        
    }//Fin Procedimiento
    
    public static void visualizaVector(int []v){
    //Entorno:
        byte i;
    //Algoritmo:
        for (i = 0; i<=v.length-1;i++){
            if(v[i]==0){
                System.out.println("-");
            }else{
                System.out.println(v[i]+"|");
            }//FinSi
        }//Fin Para
        
    }//Fin Procedimiento
    
    public static void insertarPrincipio(int []v, int num){
    
    //Entorno:
    
    
    //Algoritmo:
    }//Fin Procedimiento
    
    public static void insertaFinal(int []v, int num){
    //Entorno:
    
    //Algoritmo:
        
        
    }//Fin Procedimiento
    
    public static void borrarPrincipio(int []v){
    
    //Entorno:
    
    //Algoritmo
    
    }//Fin Procedimiento

    public static void borrarFinal(){
    //Entorno:

    //Algoritmo:
        
    }//Fin Procedimiento
    
    public static void insertarPosicion(int []v, int num, byte pos){
        
    //Entorno:
    
    //Algoritmo:
    }//Fin Procedimiento
    
    public static void borrarPosicion (int []v, int num, byte pos){
    //Entorno:
    
    
    //Algoritmo:
    
    
    }//Fin Procedimiento
    
    public static void main(String[] args) {
    //Entorno:
        short opc,i;
        int []vector={0,1,2,3,4,5,0};
        
    //Algoritmo:
        desplazaDer(vector);
        menu();
        do{
            opc = (byte)Leer.datoShort();
        }while(opc <1 || opc >8);
        switch(opc){
            case 1: 
                visualizaVector(vector);
                break;
            case 2: 
            
                break;
            case 3: 
            
                break;
            case 4: 
            
                break;
            case 5: 
            
                break;
            case 6: 
            
                break;
            case 7: 
            
                break;
            case 8: 
                System.out.println("AL NICHO.");
                break;
            
             
            
            
        }//Fin SegúnSea
           
    }//Fin Programa

}
