
//Programa:
//Autor:ManuelJCórdobaT
public class ACB2Ej2 {

    public static void menu() {
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

    public static void main(String[] args) {
        //Entorno:
        byte opc,pos;
        int num;
        CB2Ej2 tabla;
        //Algoritmo: 

        tabla = new CB2Ej2();
        do {
            menu();
            opc = (byte) Leer.datoShort();

        
        switch (opc) {
            case 1:
                tabla.visualizar();
                break;
            case 2:
                if(tabla.estaLlena()){
                    System.out.println("Tabla llena, borre algún elemento.");
                }else{
                   System.out.println("Introduzca número para insertar al principio de la tabla: "); 
                   num = Leer.datoInt();
                   tabla.insertarPrincipio(num);
                }//Fin Si
                break;
            case 3:

                break;
            case 4:
                if(tabla.estaLlena()){
                    System.out.println("Tabla llena, borre algún elemento.");
                }else{
                    System.out.println("Introduzca número para insertar al final de la tabla: ");
                    num = Leer.datoInt();
                    tabla.insertarFinal(num);
                }//Fin Si
                break;
            case 5:

                break;
            case 6:
                if(tabla.estaLlena()){
                    System.out.println("Imposible introducir más elementos.");   
                }else{
                    
                    System.out.println("Introduzca un número a introducir: ");
                    num = Leer.datoInt();
                    do{
                        System.out.println("Introduzca una posición:[0,9] ");
                        pos =(byte) Leer.datoShort();
                    }while(pos <0  || pos >9 );
                    tabla.insertar(num, pos);
                }//Fin Si
                break;
            case 7:
                do{
                    System.out.println("Introduzca una posición para borrar: [0,9]");
                    pos = (byte)Leer.datoShort();
                }while(pos <0 || pos >9);
                tabla.borrar(pos);
                break;
            case 8:

                break;

        }//Fin SegúnSea
           
        } while (opc < 1 || opc > 8 ||opc != 8);
    }//Fin Programa

}
