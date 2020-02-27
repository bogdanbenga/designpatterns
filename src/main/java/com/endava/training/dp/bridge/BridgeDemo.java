package com.endava.training.dp.bridge;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class BridgeDemo {

    public static void main(String[] args) {

        Shape triangle = new Triangle(new Red());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new Green());
        pentagon.applyColor();

    }
}
