package com.example.omardahmen.pacman_pixel;

/**
 * Created by Omar Dahmen on 24/11/2016.
 */

// Sketch.java
import processing.core.PApplet;

public class Sketch extends PApplet {
    public void settings() {
        size(600, 600);
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
