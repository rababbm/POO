package com.example.tresenlinea;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Celda extends Rectangle {
    public Celda() {
        setWidth(500);
        setHeight(500);
        setFill(Color.WHITE);
        setStroke(Color.BLACK);

        setOnMouseClicked(e -> {
            if (getColor() == Color.WHITE) {
                setColor(Color.BLUE); // Cambia el color al hacer clic
            } else {
                setColor(Color.WHITE); // Cambia el color al hacer clic de nuevo
            }
        });
    }

    public Color getColor() {
        return (Color) getFill();
    }

    public void setColor(Color color) {
        setFill(color);
    }
}
