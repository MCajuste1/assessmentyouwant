package JavaAssessment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat( "Max" );
        Dog dog = new Dog("Will");

        Animal[] animals = {dog, cat};

        for (Animal beasts:animals) {
            System.out.println(beasts);
        }



        ArrayList<String> pets = new ArrayList<>( );

        pets.add( dog.greet() );
        pets.add( cat.greet() );



    }





    }
