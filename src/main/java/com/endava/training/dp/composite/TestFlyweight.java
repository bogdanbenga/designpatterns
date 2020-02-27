package com.endava.training.dp.composite;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class TestFlyweight {

    public static void main(String... args){
        Integer i1 = new Integer(7);
        Integer i2 = new Integer(7);
        System.out.println(i1 == i2);

        i1 = 2345;
        i2 = 2345;
        System.out.println(i1 == i2);
    }
}
