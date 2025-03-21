package dev.berto.first_excersie;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Person people = new Person("Alberto", "Vicente", "53772310E",1996);
        people.displayInformation();
    }

}
