package com.endava.training.dp.factory;

public class ComputerFactory {

    public static Computer getComputer(PCType type, String ram, String hdd, String cpu) {
        if (PCType.PC == type) {
            return new PC(ram, hdd, cpu);
        }
        else if (PCType.SERVER == type) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }

    public static enum PCType {
        PC,
        SERVER
    }
}
