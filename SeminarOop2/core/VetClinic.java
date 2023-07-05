package core;

import java.util.ArrayList;
import java.util.List;

import core.clients.Animal;
import core.clients.Flyable;
import core.clients.Soundable;
import core.clients.Swimable;

public class VetClinic {

    public static void soundableAnimals(List<Animal> list){
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Soundable) {
                newList.add(list.get(i)); 
            } 
        }
        System.out.println(newList);
    }
    public static void runnableAnimals(List<Animal> list){
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Runnable) {
                newList.add(list.get(i)); 
            } 
        }
        System.out.println(newList);
    }
    public static void flyableAnimals(List<Animal> list){
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Flyable) {
                newList.add(list.get(i)); 
            } 
        }
        System.out.println(newList);
    }
    public static void swimableAnimals(List<Animal> list){
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Swimable) {
                newList.add(list.get(i)); 
            } 
        }
        System.out.println(newList);
    }
}
