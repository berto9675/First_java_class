package dev.berto.first_excersie;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tu nombre: ");
        String primerNombre = scanner.nextLine();

        System.out.println("Ingrese tu apellido: ");
        String primerApellido = scanner.nextLine();

        System.out.println("Ingrese tu número de edad: ");
        String numeroDocumento = scanner.nextLine();

        int fechaCumpleaños;
        while (true) {
            System.out.println("¿Cuál es tu año de nacimiento? ");
            fechaCumpleaños = scanner.nextInt();
            if (fechaCumpleaños > 1900 && fechaCumpleaños < 2022) {
                break;
            }
            System.out.println("Por favor, ingrese un año válido.");
        }

        Persona persona = new Persona(primerNombre, primerApellido, numeroDocumento, fechaCumpleaños);
        System.out.println(persona);

        scanner.close();
    }
}
