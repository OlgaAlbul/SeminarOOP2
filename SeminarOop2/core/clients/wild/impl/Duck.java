package SeminarOop2.clients.wild.impl;

import java.time.LocalDate;

import SeminarOop2.core.clients.Flyable;
import SeminarOop2.core.clients.Runnable;
import SeminarOop2.core.clients.owners.Owner;
import SeminarOop2.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 3 км/ч");
        return 3;
    }

}
