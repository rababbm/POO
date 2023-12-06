package com.example.tresenlinea;

public class JuegoTresEnRaya {
    private char[] tablero;
    private char jugadorActual;

    public JuegoTresEnRaya() {
        tablero = new char[9];
        reiniciarJuego();
    }

    public void reiniciarJuego() {
        // Inicializar el tablero y el jugador actual
        for (int i = 0; i < 9; i++) {
            tablero[i] = ' ';
        }
        jugadorActual = 'X';
    }

    public boolean hacerMovimiento(int indice) {
        // Comprobar si la casilla está vacía
        if (tablero[indice] == ' ') {
            // Realizar el movimiento
            tablero[indice] = jugadorActual;
            // Cambiar al siguiente jugador
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            return true; // Movimiento válido
        } else {
            return false; // Movimiento inválido (casilla ocupada)
        }
    }

    public char determinarGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            int rowStart = i * 3;
            if (tablero[rowStart] == tablero[rowStart + 1] && tablero[rowStart + 1] == tablero[rowStart + 2] && tablero[rowStart] != ' ') {
                return tablero[rowStart];
            }
        }

        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i] == tablero[i + 3] && tablero[i + 3] == tablero[i + 6] && tablero[i] != ' ') {
                return tablero[i];
            }
        }

        // Verificar diagonales
        if (tablero[0] == tablero[4] && tablero[4] == tablero[8] && tablero[0] != ' ') {
            return tablero[0];
        }
        if (tablero[2] == tablero[4] && tablero[4] == tablero[6] && tablero[2] != ' ') {
            return tablero[2];
        }

        // Si no hay ganador y el tablero está lleno, es un empate
        if (tableroLleno()) {
            return 'D'; // Empate
        }

        // Si no hay ganador aún, devuelve 'N' (ninguno)
        return 'N';
    }

    private boolean tableroLleno() {
        // Verificar si todas las casillas están ocupadas
        for (int i = 0; i < 9; i++) {
            if (tablero[i] == ' ') {
                return false; // Todavía hay casillas vacías
            }
        }
        return true; // Tablero lleno
    }

}
