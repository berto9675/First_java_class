package dev.berto.first_excersie;

public class Persona {
    public String primerNombre;
    public String primerApellido;
    public String numeroDocumento;
    public int fechaCumpleaños; 

    public Persona(String primerNombre, String primerApellido, String numeroDocumento, int fechaCumpleaños) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.numeroDocumento = numeroDocumento;
        this.fechaCumpleaños = fechaCumpleaños;
    }

    @Override
    public String toString() {
        return "Hola, " +
                "soy " + primerNombre + " " + primerApellido +
                ", mi edad es " + numeroDocumento +
                " y nací en el año " + fechaCumpleaños + ".";
            }

    public String getprimerNombre() {
        return primerNombre;
    }

    public String getprimerApellido() {
        return primerApellido;
    }

    public String getnumeroDocumento() {
        return numeroDocumento;
    }

    public int fechaCumpleaños() {
        return fechaCumpleaños;
    }
    public void primerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void primerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setnumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void fechaCumpleaños(int fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
    }

}
