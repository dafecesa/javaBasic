
package adivina;

import java.util.Scanner;

/**
 *
 * @author dalton
 */
public class Adivina {
    static void juego(){
          Scanner teclado = new Scanner(System.in);
     boolean juegoActivo = true;
        System.out.println("Hola cual es tu nombre?");
        String nombreJugador = teclado.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar \n",nombreJugador);
        
        while(juegoActivo){
            int min=0, max=100, intentos=0;
            int numeroJuego = obtenerAletorio(1, 100);
            
            System.out.printf("%s, He escogido un numero entre %d y %d , adivinalo\n"
                    ,nombreJugador,min,max);
            int numeroJugador;
            
            do{
                System.out.println("Escoge un numero");
                numeroJugador   =   teclado.nextInt();
                if (numeroJuego<numeroJugador) {
                    System.out.println("Muy Alto, adivina otra vez");
                    
                } else if(numeroJuego>numeroJugador) {
                    System.out.println("Muy Bajo, adivina otra vez");
                } 
                intentos ++;
            }while(numeroJuego != numeroJugador);
               System.out.printf("Has ganado, intentos %d\n",intentos);
            
            juegoActivo=false;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        juego();
    }
    
    private static int obtenerAletorio(int min, int max){
        
        return min + (int) (Math.random() * ((max-min)+1));
    }
    
  
}
