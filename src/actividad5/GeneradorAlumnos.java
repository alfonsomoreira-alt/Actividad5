/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad5;

import java.time.LocalDate;
import java.util.Random;

/**
 * Genera objetos Alumno con datos aleatorios.
 */
public class GeneradorAlumnos {
    // Arrays de nombres y apellidos en español
    private static final String[] nombre = {"Ana", "João", "Carlos", "Maria", "Pedro", "Juliana", "Lucas", "Fernanda"};
    private static final String[] apellido = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};
    
    private static final Random aleatorio = new Random();

    /**
     * Genera un alumno con nombre, apellido, matrícula y fecha de nacimiento aleatorios.
     * @return 
     */
    public static Alumno generarAlumno() {
        String nom = nombre[aleatorio.nextInt(nombre.length)];
        String ape = apellido[aleatorio.nextInt(apellido.length)];
        String matricula = String.format("%05d", aleatorio.nextInt(100000));
        LocalDate fechaNacimiento = generarFechaAleatoria();
        return new Alumno(nom, ape, matricula, fechaNacimiento);
    }

    private static LocalDate generarFechaAleatoria() {
        int anio = aleatorio.nextInt(10) + 1995;
        int mes = aleatorio.nextInt(12) + 1;
        int dia = aleatorio.nextInt(28) + 1;
        return LocalDate.of(anio, mes, dia);
    }
}
