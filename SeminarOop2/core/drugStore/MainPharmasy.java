package core.drugStore;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import core.personal.Doctor;
import core.drugStore.Component;

public class MainPharmasy {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy(1);
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 g", 1000);

        pharmacy1.addComponent(comp1).addComponent(comp2);

//        Интерфейс Serializable - отвечает за сериализацию объектов. Превращает объект в массив байтов, который потом
//        можно собрать обратно при помощи десериализатора.

        List<Marker> markers = new ArrayList<>();
        Doctor doc1 = new Doctor(234, "Петрович", "THERAPIST", "8(495)429-43-23");
//        markers.add().add();

//        while (((Iterator<Component>) pharmacy1).hasNext()){
//            System.out.println(pharmacy1.next());
//        }
        System.out.println(pharmacy1);

//        DogPharmacy dogPharmacy = new DogPharmacy();
//        System.out.println(dogPharmacy.hashCode());
        for (Component elem : pharmacy1) {
            System.out.println(elem);
        }

        Pharmacy pharmacy2 = new Pharmacy(2);
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy(3);
        Component comp5 = new Component("Penicillin", "10 mg", 12);
        Component comp6 = new Component("Spirit", "100 g", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);


        Pharmacy pharmacy5 = new Pharmacy(5);
        Component comp7 = new Component("Aspirin", "10 mg", 12);
        Component comp8 = new Component("Ibuprophen", "100 g", 100);
        pharmacy5.addComponent(comp7).addComponent(comp8);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);
        
        

        System.out.println(nomenclature);
        System.out.println("============================================================================");
        Collections.sort(nomenclature);
        System.out.println(nomenclature);
        System.out.println("============================================================================");
        nomenclature.add(pharmacy5);
        System.out.println(nomenclature);
        System.out.println("============================================================================");
        Collections.sort(nomenclature);
        System.out.println(nomenclature);
        
        HashSet<Pharmacy> result = new HashSet<>();
        System.out.println("Сет result в момент объявления: , размер result.size()=" + result.size() + ": ");

        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy2);
        System.out.println("Сет result после добавления элементов, размер result.size()=" + result.size());



    }
}
