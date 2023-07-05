package core.personal;

import core.clients.Animal;

public class Doctor {
    private int idNumber;
    private String lastName;
    private String firstName;
    private String patronymic;

    public Doctor(int idNumber, String lastName, String firstName, String patronymic){
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Doctor() {
    }

    public void ExamineAnimal(Animal o){

        System.out.printf("%s %s examined the animal %s \n", this.lastName, this.firstName, (o.getName()));
    }

    public void PurposeTreatment(Animal o){
        System.out.printf("%s %s purpose the treatment to animal %s \n", this.lastName, this.firstName, (o.getName()));
    }


    public void Operating(Animal o){
        System.out.printf("%s %s operated on the animal %s \n", this.lastName, this.firstName, (o.getName()));
    }

    @Override
    public String toString() {
        return "id Number" + idNumber + "Last name" + lastName + "First name" + firstName + "Patronymic" + patronymic+"\n";
    }
}
