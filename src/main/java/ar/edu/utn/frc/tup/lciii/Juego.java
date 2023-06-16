package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

public class Juego {

    Scanner scan = new Scanner(System.in);
    Tablero tablero;

    Jugadores jugador1;

    Jugadores jugador2;


    public Juego(){//Jugadores jugador1, Jugadores jugador2, Tablero tablero){
        this.jugador1 = new Jugadores();
        this.jugador2 = new Jugadores();
        this.tablero = new Tablero();
    }
    public void setJugador1(Jugadores jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(Jugadores jugador2) {
        this.jugador2 = jugador2;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Jugadores getJugador1() {
        return jugador1;
    }

    public Jugadores getJugador2() {
        return jugador2;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void partida(){
        System.out.println("Ingrese el nombre del jugador 1");
        jugador1.setNombre(scan.nextLine());
        System.out.println("Ingrese el nombre del jugador 2");
        jugador2.setNombre(scan.nextLine());
        jugador1.setId(1);
        jugador2.setId(2);


        boolean finPartida = false;
        int contador = 1;
        do {
            System.out.println("Siguiente juego: ");
            if(contador %2==1){
                boolean mov = false;
                do{
                    System.out.println(jugador1.getNombre() +" selecciona una fila y una columna");
                    int fila = scan.nextInt();
                    int columna = scan.nextInt();
                    mov = tablero.siguienteJuego(jugador1,fila,columna);
                    if(mov == false){
                        System.out.println("Esta posicion ya esta ocupada, intenta con otra");
                    }
                }
                while (!mov);
            } else if (contador %2 == 0) {
                boolean mov = false;
                do{
                    System.out.println(jugador2.getNombre() +" selecciona una fila y una columna");
                    int fila = scan.nextInt();
                    int columna = scan.nextInt();
                    mov = tablero.siguienteJuego(jugador2,fila,columna);
                    if(mov == false){
                        System.out.println("Esta posicion ya esta ocupada, intenta con otra");
                    }

                }
                while (!mov);

            }

            System.out.println(tablero.vistaTablero());
            //scan.nextLine();
            contador++;

            //validacion de si el juego continua
            if (tablero.estadoDePartida(jugador1)){

                System.out.println(jugador1.getNombre() + " ha ganado la partida!");

                jugador1.setPartidosGanados(jugador1.getPartidosGanados()+1); //partidas q gana el jugador 1

                int empiezaPrimero = contador -1; //quien empieza primero
                if (empiezaPrimero %2 == 1){
                    jugador1.setComenzoPrimero(true);
                    jugador2.setComenzoPrimero(false);
                }

                //el jugador que gana recibe
                // * -3 puntos y el perdedor 1, si el ganador fue el jugador que NO inició la partida, recibe un punto extra por ganar sin empezar la partida.

                jugador1.setPuntos(jugador1.getPuntos()+3);
                jugador2.setPuntos(jugador2.getPuntos()+1);

                if(!jugador1.comenzoPrimero){
                    jugador1.setPuntos(jugador1.getPuntos()+1);
                }
                //---------------------------------------------------------------------

                System.out.println("desean jugar otra partida? yes/no");
                scan.nextLine();
                String codnicion = scan.nextLine();
                codnicion.toLowerCase();
                if(codnicion.equals("no")){
                    finPartida = true;
                    if(jugador1.getPuntos() > jugador2.getPuntos()){
                        System.out.println("el ganador con más puntaje es: " + jugador1.getNombre() + " con un total de: " + jugador1.getPuntos());
                    } else if (jugador1.getPuntos() < jugador2.getPuntos()) {
                        System.out.println("el ganador con más puntaje es: " + jugador2.getNombre() + " con un total de: " + jugador2.getPuntos());
                    }
                } else if (codnicion.equals("yes")) {
                    tablero.limpiarTablero();
                }

            } else if (tablero.estadoDePartida(jugador2)) {

                System.out.println(jugador2.getNombre() + " ha ganado la partida!");

                jugador2.setPartidosGanados(jugador2.getPartidosGanados()+1); //partidas q gana el jugador 2

                int empiezaPrimero = contador -1;//quien empieza primero
                if (empiezaPrimero %2 == 0){
                    jugador2.setComenzoPrimero(true);
                    jugador1.setComenzoPrimero(false);
                }

                //el jugador que gana recibe
                // * -3 puntos y el perdedor 1, si el ganador fue el jugador que NO inició la partida, recibe un punto extra por ganar sin empezar la partida.

                jugador2.setPuntos(jugador2.getPuntos()+3);
                jugador1.setPuntos(jugador1.getPuntos()+1);

                if(!jugador2.comenzoPrimero){
                    jugador2.setPuntos(jugador2.getPuntos()+1);
                }
                //---------------------------------------------------------------------

                System.out.println("desean jugar otra partida? yes/no");
                String codnicion = scan.nextLine();
                codnicion.toLowerCase();
                if(codnicion.equals("no")){
                    finPartida = true;
                    if(jugador1.getPuntos() > jugador2.getPuntos()){
                        System.out.println("el ganador con más puntaje es: " + jugador1.getNombre() + " con un total de: " + jugador1.getPuntos());
                    } else if (jugador1.getPuntos() < jugador2.getPuntos()) {
                        System.out.println("el ganador con más puntaje es: " + jugador2.getNombre() + " con un total de: " + jugador2.getPuntos());
                    }

                } else if (codnicion.equals("yes")) {
                    tablero.limpiarTablero();


                }
            } else if (tablero.esEmpate()) {
                System.out.println("La partida ha terminado en empate");

                int empiezaPrimero = contador -1; //quien empieza primero
                if (empiezaPrimero %2 == 0){
                    jugador2.setComenzoPrimero(true);
                    jugador1.setComenzoPrimero(false);
                } else if (empiezaPrimero %2 == 1) {
                    jugador1.setComenzoPrimero(true);
                    jugador2.setComenzoPrimero(false);
                }

                //puntos de empate: si jugador1 sale primero recibe 1 punto y el otro 2

                if(jugador1.comenzoPrimero){
                    jugador1.setPuntos(jugador1.getPuntos()+1);
                    jugador2.setPuntos(jugador2.getPuntos()+2);
                } else if (jugador2.comenzoPrimero) {
                    jugador1.setPuntos(jugador1.getPuntos()+2);
                    jugador2.setPuntos(jugador2.getPuntos()+1);
                }
                //------------------------------------------------------------------
                System.out.println("desean jugar otra partida? yes/no");
                String codnicion = scan.nextLine();
                codnicion.toLowerCase();
                if(codnicion.equals("no")){
                    finPartida = true;
                    //* Si los jugadores deciden no volver a jugar, debe mostrar qué jugador ganó más puntos.
                    if(jugador1.getPuntos() > jugador2.getPuntos()){
                        System.out.println("el ganador con más puntaje es: " + jugador1.getNombre() + " con un total de: " + jugador1.getPuntos());
                    } else if (jugador1.getPuntos() < jugador2.getPuntos()) {
                        System.out.println("el ganador con más puntaje es: " + jugador2.getNombre() + " con un total de: " + jugador2.getPuntos());
                    }
                } else if (codnicion.equals("yes")) {
                    tablero.limpiarTablero();
                }
            }
        }
        while (scan.hasNextLine() && !finPartida);
    }
}
