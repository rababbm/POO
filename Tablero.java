package com.example.tresenlinea;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Tablero extends GridPane {
    public Tablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Celda celda = new Celda();
                this.add(celda, j, i);
            }
        }
        this.setAlignment(Pos.CENTER);
    }
}
