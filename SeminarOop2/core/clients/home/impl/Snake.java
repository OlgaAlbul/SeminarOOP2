package core.clients.home.impl;

import java.time.LocalDate;

import core.clients.Runnable;
import core.clients.home.Pet;
import core.clients.owners.Owner;

public class Snake extends Pet implements Runnable{
    public Snake(){

    }

    public Snake(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner){
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run(){
        System.out.println(CLASS_NAME+" ползает со скоростью: 12 км/ч");
        return 12;
    }
}
