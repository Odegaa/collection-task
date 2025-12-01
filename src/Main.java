import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonDAO firstPerson = new PersonDAO();
        firstPerson.setId(1);
        firstPerson.setUsername("Odegaa");

        PersonDAO secondPerson = new PersonDAO();
        secondPerson.setId(2);
        secondPerson.setUsername("Ruslan");

        PersonDAO thirdPerson = new PersonDAO();
        thirdPerson.setId(3);
        thirdPerson.setUsername("Vlad");

        PersonDAO fourthPerson = new PersonDAO();
        fourthPerson.setId(4);
        fourthPerson.setUsername("Amigo");

        PersonService personService = new PersonService();
        personService.setItems(firstPerson);
        personService.setItems(secondPerson);
        personService.setItems(thirdPerson);
        personService.setItems(fourthPerson);

        System.out.println(personService.getEvenDigitItems());
    }

}