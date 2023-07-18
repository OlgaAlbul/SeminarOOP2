
import core.clients.Animal;
import core.clients.Soundable;
import core.clients.home.impl.Cat;
import core.clients.home.impl.Snake;
import core.clients.owners.Owner;
import core.VetClinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import core.clients.wild.impl.Duck;
import core.clients.wild.impl.WildCat;
import core.personal.Doctor;
import core.personal.Nurse;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        Cat homeCat =
                new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        core.clients.wild.impl.WildCat wildCat =
                new WildCat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        //homeCat.hunt();
        //wildCat.hunt();
        Doctor doctor1 = new Doctor(001, "Петров", "Иван", "Иваныч");
        doctor1.ExamineAnimal(homeCat);
        doctor1.PurposeTreatment(wildCat);
        Nurse nurse1 = new Nurse(001, "Сусленкова", "Яна", "Викторовна");
        nurse1.TakingTests(homeCat);
        nurse1.PerformingPurposes(wildCat);
        Duck duck1 = new Duck(002, 2, LocalDate.of(2023, 7, 16), null);
        Snake snake1 = new Snake(003, "Pusy", 0, LocalDate.of(2023, 5, 23),new Owner("Jaime Lannister"));

        homeCat.volume();
        duck1.fly();
        duck1.run();
        duck1.swim();
        duck1.volume();
        snake1.run();
        List<Animal> list1 = new ArrayList<>();
        list1.add(homeCat);
        list1.add(wildCat);
        list1.add(duck1);
        list1.add(snake1);
        
        VetClinic.soundableAnimals(list1);
        VetClinic.flyableAnimals(list1);
        VetClinic.runnableAnimals(list1);
        VetClinic.swimableAnimals(list1);
        
         


    }
}
