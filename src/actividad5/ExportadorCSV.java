/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Clase para exportar listas de alumnos a archivos CSV.
 */
public class ExportadorCSV {

    /**
     * Exporta una lista de alumnos a un archivo CSV.
     * 
     * @param alumnos Lista de alumnos a exportar
     * @param nombreArchivo Nombre del archivo CSV de salida
     * @throws IOException Si hay un error de escritura
     */
    public static void exportarListaCSV(List<Alumno> alumnos, String nombreArchivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Escribir encabezado
            writer.write("Nombre,Apellido,Matricula,FechaNacimiento");
            writer.newLine();

            // Escribir cada alumno
            for (Alumno a : alumnos) {
                // Construir línea CSV con formato: Nombre,Apellido,Matricula,FechaNacimiento
                String linea = String.format("%s,%s,%s,%s",
                        a.getNombre(),
                        a.getApellido(),
                        a.getMatricula(),
                        a.getFechaNacimiento().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                );
                writer.write(linea);
                writer.newLine();
            }
        }
    }
}
