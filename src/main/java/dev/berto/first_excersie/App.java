package dev.berto.first_excersie;

import dev.berto.first_excersie.PersonClass.Person;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Person people = new Person("Alberto", "Vicente", "53772310E",1996);
        people.displayInformation();
    }

}
