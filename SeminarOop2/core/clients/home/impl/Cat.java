package core.clients.home.impl;

import core.clients.Runnable;
import core.clients.Soundable;
import core.clients.home.Pet;
import core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Soundable, Runnable {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int volume(){
        System.out.println(CLASS_NAME + " мяукает с громкостью: 65 дБ");
        return 65;
    } 
    
    @Override
    public int run() {
        System.out.println(CLASS_NAME + " ходит со скоростью: 13 км/ч");
        return 3;
    }
}
