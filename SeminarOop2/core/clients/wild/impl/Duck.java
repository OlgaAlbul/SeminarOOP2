package core.clients.wild.impl;

import java.time.LocalDate;

import core.clients.Flyable;
import core.clients.Runnable;
import core.clients.Soundable;
import core.clients.Swimable;
import core.clients.owners.Owner;
import core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable, Swimable, Soundable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " ходит со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public int swim(){
        System.out.println(CLASS_NAME + " плавает со скоростью: 3,6 км/ч");
        return 4;
    }

    @Override
    public int volume(){
        System.out.println(CLASS_NAME + " крякает с громкостью: 30 дБ");
        return 30;
    }
}


