package com.endava.training.dp.bridge;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public abstract class Shape {

    //Composition
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();

}
