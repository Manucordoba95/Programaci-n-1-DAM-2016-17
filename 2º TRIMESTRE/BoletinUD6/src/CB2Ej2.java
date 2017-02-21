
//Autor: ManuelJCórdobaT
//Programa: Clase ejercicio 2 boletín estructuras de datos.
public class CB2Ej2 {
    
    //Atributos:
    private int [] tabla;
    private int nelementos;
    
    //Constructores:
    
    public CB2Ej2(){
       this.tabla = new int [10];
       
    }//Fin Constructor por defecto
    //Métodos:
    private void desplazaDer(int desde, int hasta){
        //Entorno:
        byte i;
        
        //Algoritmo:
        for(i=(byte)hasta;i>desde;i--){
            this.tabla[i]=this.tabla[i-1];
        
        }//Fin Para    
    }//Fin Procedimiento
    
    private void desplazaIzq(int desde, int hasta){
        //Entorno:
        byte i;
        //Algoritmo:
        for(i = (byte) desde; i< hasta;i++){
            this.tabla[i]=this.tabla[i+1];
        }//Fin Para
        
    }//Fin Procedimiento
    
    public boolean estaLlena(){
        //Entorno:
        boolean estaLlena;
        
        //Algoritmo:
        estaLlena = false;
        if(this.nelementos==10){
            estaLlena = true;
        }//Fin Si
        return estaLlena;
    }//Fin Función
    
    public void insertar(int x, byte pos){
        //Entorno:
        
        
        //Algoritmo:
        if(pos>=this.nelementos){
            this.tabla[this.nelementos]=x;
        }else{
            desplazaDer(pos, this.nelementos);
            this.tabla[pos]=x;
        }//Fin Si
        this.nelementos++;
    }//Fin Procedimiento
            
    public void insertarPrincipio(int x){
        //Entorno:
                
        //Algoritmo:
        insertar(x, (byte)0);
        this.nelementos++;
    }//Fin Procedimiento
    
    public void insertarFinal(int x){
        //Entorno:
        
        //Algoritmo:
        insertar(x, (byte)this.nelementos);
        this.nelementos++;
    }//Fin Procedimiento
    
    public void visualizar(){
        //Entorno:
        byte i;
        //Algoritmo:
        for(i = 0; i <= this.tabla.length-1;i++){
            if(this.tabla[i]==0){
                System.out.print("-");
            }else{                  
                System.out.print(tabla[i]+"|"); 
            }//Fin Si
            
        }//Fin Para
        System.out.println("");
        
    }// Fin Procedimiento
    
    public void borrar(byte pos){
        //Entorno:
        
        //Algoritmo:
        if(this.tabla[pos]==0){
            System.out.println("Posición vacia.");
        }else{
            this.tabla[pos]=0;
            System.out.println("Posición"+pos+" borrada.");
        }//Fin Si
        this.nelementos--;
        
    }//Fin Procedimiento
}

