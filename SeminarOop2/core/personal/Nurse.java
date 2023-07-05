package core.personal;

import core.clients.Animal;

public class Nurse {
    private int idNumber;
    private String lastName;
    private String firstName;
    private String patronymic;

    public Nurse(int idNumber, String lastName, String firstName, String patronymic){
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public void PerformingPurposes(Animal o){
        System.out.printf("%s %s completed purposes for %s \n", this.lastName, this.firstName, (o.getName()));
    }

    public void TakingTests(Animal o){
        System.out.printf("%s %s took the tests of %s \n", this.lastName, this.firstName, (o.getName()));
    }

    @Override
    public String toString() {
        return "id Number" + idNumber + "Last name" + lastName + "First name" + firstName + "Patronymic" + patronymic+"\n";
    }
}
