/*
 * John Smith
 * CITC 1311 - Puretskiy
 * Form class for Tetris game. contains constructors for blocks, getter method for block names, and method to change forms.
 */

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {

    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    public String name;
    public int form = 1;

    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }

    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;

        //set colors for blocks
        switch (name) {
            case "j":
                color = Color.SLATEGRAY;
                break;
            case "l":
                color = Color.DARKGOLDENROD;
                break;
            case "o":
                color = Color.AQUAMARINE;
                break;
            case "s":
                color = Color.CRIMSON;
                break;
            case "t":
                color = Color.DEEPPINK;
                break;
            case "z":
                color = Color.FORESTGREEN;
                break;
            case "i":
                color = Color.PURPLE;
                break;

        }

        this.a.setFill(color);
        this.b.setFill(color);
        this.c.setFill(color);
        this.d.setFill(color);
    }

    public String getName() {
        return name;
    }

    public void changeForm() {
        if (form != 4) {
            form++;
        } else {
            form = 1;
        }
    }

}
