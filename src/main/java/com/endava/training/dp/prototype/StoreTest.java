package com.endava.training.dp.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class StoreTest {

    public static void main(String... args) throws CloneNotSupportedException {

        List<ColorBox> colorBoxesOnShelf = new ArrayList<ColorBox>();

        //Create initial objects
        ColorBox blue1000ml = new ColorBox(1000, "Blue");
        ColorBox red400ml = new ColorBox(400, "Red");

        //add 30 boxes of blue color at 1000 ml
        for (int i = 0; i < 30; i++) {
            colorBoxesOnShelf.add((ColorBox) blue1000ml.clone());
        }

        System.out.println("Added 30 boxes of blue color at 1000 ml");

        //add 80 boxes of red color at 400 ml
        for (int i = 0; i < 80; i++) {
            colorBoxesOnShelf.add((ColorBox) red400ml.clone());
        }

        System.out.println("Added 80 boxes of red color at 400 ml");
    }

}
