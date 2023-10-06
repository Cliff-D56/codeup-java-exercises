import java.util.Arrays;
import oop_pkg.Person;

public class ArraysExercises {
    public static Person[] addPerson(Person [] people,Person person){
        Person[] people2 = Arrays.copyOf(people,4);
        people2[3]= person;
        return people2;
    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));//Array is an object which means its a reference point. Need to use Array.toString(numbers) to turn it into a string and allow output.

        Person clifford = new Person("Clifford");
        Person Necee = new Person("Necee");
        Person Roland = new Person("Roland");
        Person[] people = new Person [3];//NEW ARRAY

        people[0]=clifford;
        people[1]=Necee;
        people[2]=Roland;

        for (Person person: people) {
            System.out.println(person.getName());
        }
        people = addPerson(people,new Person("Anna"));
        for (Person person: people) {
            System.out.println(person.getName());
        }
    }
}
