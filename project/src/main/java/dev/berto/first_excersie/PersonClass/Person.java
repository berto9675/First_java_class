package dev.berto.first_excersie.PersonClass;

public class Person {
    public String name;
    public String lastName;
    public String documentNumber;
    public int YearOfBirth; 

    public Person(String name, String lastName, String documentNumber, int YearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.YearOfBirth = YearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public Integer getYearOfBirth() {
        return YearOfBirth;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setBirthYear(int YearOfBirth) {  
        this.YearOfBirth = YearOfBirth;
    }

    public void displayInformation() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Número de Documento: " + documentNumber);
        System.out.println("Año de Nacimiento: " + YearOfBirth);  
    }

}
