package ar.edu.utn.frc.tup.lciii;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tablero {

    int [][] tablero;


    public Tablero(){
        this.tablero = new int[3][3];

    }

    public String vistaTablero(){
        List<String> rows = new ArrayList<>();
        String fin = "";
        for (int i = 0; i<tablero.length;i++){
            String cadena = "";
            for (int j = 0;j<tablero.length;j++){
                int result = tablero[i][j];
                cadena = cadena + "  " + result;
            }
            rows.add(cadena);
        }
        fin += rows.get(2).toString() +"\n" + rows.get(1).toString() +"\n" + rows.get(0).toString() +"\n";
        return fin;
    }

    public boolean siguienteJuego(Jugadores jugador, int fila, int columna){
            boolean aux = true;
            if(fila > 3 || fila<1){
                aux = false;
            }else {
                if(jugador.getId() == 1){
                    if (tablero[fila-1][columna-1] == 2) {

                        aux = false;

                    } else if (tablero[fila-1][columna-1] == 1) {

                        aux = false;

                    }
                    else {
                        tablero[fila-1][columna-1] = 1;
                    }
                } else if (jugador.getId() == 2) {
                    if (tablero[fila-1][columna-1] == 2) {

                        aux = false;

                    } else if (tablero[fila-1][columna-1] == 1) {

                        aux = false;

                    }
                    else {
                        tablero[fila-1][columna-1] = 2;
                    }
                }

            }
            return aux;
    }

    public boolean estadoDePartida(Jugadores jugador){
       int idJugador = jugador.getId();
       if(validar(idJugador)){
           return true;
       }
       else return false;

    }
    private boolean validar(int nro){
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        for (int i = 0; i < tablero.length;i++){
            if(tablero[i][0] == nro && tablero[i][1] == nro && tablero[i][2] == nro){//rows
                flag1 = true;
            }
            if(tablero[0][i] == nro && tablero[1][i] == nro && tablero[2][i] == nro){//columns
                flag2 = true;
            }
            if(tablero[0][0] == nro &&tablero[1][1] == nro && tablero[2][2] == nro){ //verifica 1 diagonal
                flag3 = true;
            }
            if(tablero[2][i]==nro && tablero[1][i]==nro && tablero[0][i]==nro){//la otra
                flag4=true;
            }
        }
        if(flag1 || flag2 || flag3 || flag4){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esEmpate(){
        boolean aux = false;
        int ocpuados = 0;
        for (int i = 0; i<tablero.length;i++){
            for (int j = 0;j<tablero.length;j++){
                int result = tablero[i][j];
                if (result != 0){
                    ocpuados++;
                }
            }
        }
        if(ocpuados>8){
            aux = true;
        }
        return aux;
    }

    public void limpiarTablero(){
        for (int i = 0; i < tablero.length;i++){
            for (int j = 0;j<tablero.length;j++){
                tablero[i][j] = 0;
            }
        }
    }

}
