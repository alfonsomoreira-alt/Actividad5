/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Collections;
import java.io.IOException;

public class Actividad5 {

    public static void main(String[] args) {
        final int cantidadAlumnos = 350000;

        // Crear las listas
        List<Alumno> listaArrayList = new ArrayList<>();
        List<Alumno> listaLinkedList = new LinkedList<>();
        List<Alumno> listaVector = new Vector<>();

        // Variables para medir tiempo
        long inicio, fin;

        // ----- INSERCIÓN -----
        inicio = System.currentTimeMillis();
        for (int i = 0; i < cantidadAlumnos; i++) {
            listaArrayList.add(GeneradorAlumnos.generarAlumno());
        }
        fin = System.currentTimeMillis();
        long tiempoInsertArray = fin - inicio;

        inicio = System.currentTimeMillis();
        for (int i = 0; i < cantidadAlumnos; i++) {
            listaLinkedList.add(GeneradorAlumnos.generarAlumno());
        }
        fin = System.currentTimeMillis();
        long tiempoInsertLinked = fin - inicio;

        inicio = System.currentTimeMillis();
        for (int i = 0; i < cantidadAlumnos; i++) {
            listaVector.add(GeneradorAlumnos.generarAlumno());
        }
        fin = System.currentTimeMillis();
        long tiempoInsertVector = fin - inicio;

        // ----- ORDENACIÓN -----
        inicio = System.currentTimeMillis();
        Collections.sort(listaArrayList);
        fin = System.currentTimeMillis();
        long tiempoOrdenArray = fin - inicio;

        inicio = System.currentTimeMillis();
        Collections.sort(listaLinkedList);
        fin = System.currentTimeMillis();
        long tiempoOrdenLinked = fin - inicio;

        inicio = System.currentTimeMillis();
        Collections.sort(listaVector);
        fin = System.currentTimeMillis();
        long tiempoOrdenVector = fin - inicio;

        // ----- EXPORTACIÓN -----
        try {
            inicio = System.currentTimeMillis();
            ExportadorCSV.exportarListaCSV(listaArrayList, "alumnos_arraylist.csv");
            fin = System.currentTimeMillis();
            long tiempoExportArray = fin - inicio;

            inicio = System.currentTimeMillis();
            ExportadorCSV.exportarListaCSV(listaLinkedList, "alumnos_linkedlist.csv");
            fin = System.currentTimeMillis();
            long tiempoExportLinked = fin - inicio;

            inicio = System.currentTimeMillis();
            ExportadorCSV.exportarListaCSV(listaVector, "alumnos_vector.csv");
            fin = System.currentTimeMillis();
            long tiempoExportVector = fin - inicio;

            // Mostrar tabla con los tiempos
            System.out.println("Operación\tArrayList (ms)\tLinkedList (ms)\tVector (ms)");
            System.out.println("Inserción\t" + tiempoInsertArray + "\t\t" + tiempoInsertLinked + "\t\t" + tiempoInsertVector);
            System.out.println("Ordenación\t" + tiempoOrdenArray + "\t\t" + tiempoOrdenLinked + "\t\t" + tiempoOrdenVector);
            System.out.println("Exportación\t" + tiempoExportArray + "\t\t" + tiempoExportLinked + "\t\t" + tiempoExportVector);

        } catch (IOException e) {
            System.err.println("Error al exportar CSV: " + e.getMessage());
        }
    }  // <-- cierre de main

} // <-- cierre de clase Actividad5
