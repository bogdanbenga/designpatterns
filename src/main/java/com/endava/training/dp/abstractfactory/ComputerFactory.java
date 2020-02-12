package com.endava.training.dp.abstractfactory;

import com.endava.training.dp.abstractfactory.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}