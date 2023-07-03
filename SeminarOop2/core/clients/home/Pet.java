package SeminarOop2.core.clients.home;

import SeminarOop2.core.clients.Animal;
import SeminarOop2.interfaces.core.clients.Animals;
import SeminarOop2.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}