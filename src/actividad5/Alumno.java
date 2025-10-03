/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa un alumno con nombre, apellido, matrícula y fecha de nacimiento.
 */
public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private String apellido;
    private String matricula;
    private LocalDate fechaNacimiento;

    public Alumno(String nombre, String apellido, String matricula, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public int compareTo(Alumno otro) {
        // Ordenar por nombre, luego por apellido si el nombre es igual
        int comp = this.nombre.compareToIgnoreCase(otro.nombre);
        if (comp == 0) {
            comp = this.apellido.compareToIgnoreCase(otro.apellido);
        }
        return comp;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return nombre + " " + apellido + "," + matricula + "," + fechaNacimiento.format(formatter);
    }
}
