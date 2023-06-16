package ar.edu.utn.frc.tup.lciii;
import lombok.Data;

@Data
public class Jugadores {
    int id;
    String nombre;
    int puntos;
    int partidosGanados;
    boolean comenzoPrimero;

    public Jugadores(){
        this.id=0;
        this.nombre="";
        this.puntos=0;
        this.comenzoPrimero=false;
    }
}
