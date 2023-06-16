package ar.edu.utn.frc.tup.lciii;

import java.util.List;
import java.util.Scanner;

/**
 * Hello to Practica Parcial 1 - TA TE TI
 *------------------La aplicación debe iniciar con un mensaje de bienvenida y pedir los nombres de los dos jugadores.
 * -----------------La aplicación debe mostrar una cuadrícula de 3x3 en la consola para que los jugadores puedan jugar.
 * -----------------Cada jugador debe seleccionar una casilla en su turno, y la aplicación debe asegurarse de que la casilla no esté ya ocupada por otro jugador.
 * -----------------Después de cada movimiento, la aplicación debe verificar si alguno de los jugadores ha ganado el juego.
 * -----------------Si el juego termina en empate, la aplicación debe mostrar un mensaje indicando que el juego ha terminado en empate.
 * -----------------Si alguno de los jugadores gana, la aplicación debe mostrar un mensaje indicando qué jugador ha ganado y pedir si se quiere jugar otra partida.
 * -La aplicación debe llevar un registro de cuantas partidas ganó cada jugador durante una misma ejecución de la aplicación y su puntaje.
 * -Si la partida termina en empate, el jugador que inició la partida gana 1 punto y el otro 2. Si la partida termina con un ganador, el jugador que gana recibe
 * -3 puntos y el perdedor 1, si el ganador fue el jugador que NO inició la partida, recibe un punto extra por ganar sin empezar la partida.
 * Si los jugadores deciden jugar otra partida, la aplicación debe reiniciar el juego y permitir que los jugadores jueguen de nuevo.
 * Los jugadores deben intercambiar turnos entre partidas, es decir que en la nueva partida empezará jugando el jugador que NO comenzó la partida anterior.
 * Si los jugadores deciden no volver a jugar, debe mostrar qué jugador ganó más puntos.
 * La aplicación debe estar construida utilizando Java y debe utilizar un enfoque modular. La lógica del juego debe estar separada de la lógica de presentación.
 * Se deben escribir Test que validen la solución implementada (Al menos se deben desarrollar los Test de un método público y uno privado, contemplando sus límites).
 */
public class App 
{

    /**
     * This is the main program
     * 
     */
    public static void main( String[] args ) {
        Tablero tablero = new Tablero();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, Practica Parcial 1 - TA TE TI.");
        /*System.out.println("Ingrese el nombre del jugador 1");
        Jugadores jugador1 = new Jugadores();
        jugador1.setNombre(scan.nextLine());
        jugador1.setId(1);
        System.out.println("Ingrese el nombre del jugador 2");
        Jugadores jugador2 = new Jugadores();
        jugador2.setNombre(scan.nextLine());
        jugador2.setId(2);*/


        System.out.println("Tablero: ");

        System.out.println(tablero.vistaTablero());

        Juego juego = new Juego();
        juego.partida();
    }
}
