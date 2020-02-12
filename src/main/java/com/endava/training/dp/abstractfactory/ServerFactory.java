package com.endava.training.dp.abstractfactory;

import com.endava.training.dp.abstractfactory.ComputerAbstractFactory;
import com.endava.training.dp.abstractfactory.model.Computer;
import com.endava.training.dp.abstractfactory.model.Server;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }

}
