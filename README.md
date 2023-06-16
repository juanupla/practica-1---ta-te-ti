[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eSayIMqZ)
<p align="center">
  <img src="./docs/_images/img.png" alt="TA TE TI"/>
</p>

# Parcial 1 - "TA TE TI"

Se pide construir una aplicación de consolas en Java que permita a 
dos personas jugar el clásico juego del TA TE TI. 
La aplicación debe cumplir con los siguientes requisitos:

1. La aplicación debe iniciar con un mensaje de bienvenida y pedir los nombres de los dos jugadores. 
2. La aplicación debe mostrar una cuadrícula de 3x3 en la consola para que los jugadores puedan jugar. 
3. Cada jugador debe seleccionar una casilla en su turno, y la aplicación debe asegurarse de que la casilla no esté ya ocupada por otro jugador. 
4. Después de cada movimiento, la aplicación debe verificar si alguno de los jugadores ha ganado el juego. 
5. Si el juego termina en empate, la aplicación debe mostrar un mensaje indicando que el juego ha terminado en empate. 
6. Si alguno de los jugadores gana, la aplicación debe mostrar un mensaje indicando qué jugador ha ganado y pedir si se quiere jugar otra partida. 
7. La aplicación debe llevar un registro de cuantas partidas ganó cada jugador durante una misma ejecución de la aplicación y su puntaje. 
8. Si la partida termina en empate, el jugador que inició la partida gana 1 punto y el otro 2. Si la partida termina con un ganador, el jugador que gana recibe 3 puntos y el perdedor 1, si el ganador fue el jugador que NO inició la partida, recibe un punto extra por ganar sin empezar la partida. 
9. Si los jugadores deciden jugar otra partida, la aplicación debe reiniciar el juego y permitir que los jugadores jueguen de nuevo. 
10. Los jugadores deben intercambiar turnos entre partidas, es decir que en la nueva partida empezará jugando el jugador que NO comenzó la partida anterior. 
11. Si los jugadores deciden no volver a jugar, debe mostrar qué jugador ganó más puntos.

La aplicación debe estar construida utilizando Java y debe utilizar un 
enfoque modular. La lógica del juego debe estar separada de la lógica de 
presentación. Se deben escribir Test que validen la solución implementada 
(Al menos se deben desarrollar los Test de un método público y uno privado, 
contemplando sus límites).
