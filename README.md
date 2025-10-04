# Actividad 5 - Comparación de Listas en Java

## Enunciado
Construir un programa en Java que compare diferentes implementaciones de listas de alumnos utilizando:
- `ArrayList`
- `LinkedList`
- `Vector`

Cada alumno tiene:
- Nombre
- Apellido
- Matrícula (5 dígitos aleatorios)
- Fecha de nacimiento (generada aleatoriamente)

Se deben crear 350.000 alumnos y realizar las siguientes operaciones para cada tipo de lista:
- Inserción de alumnos
- Ordenación por nombre y apellido
- Exportación a archivos CSV
- Medición del tiempo de ejecución

## Integrantes
- **Alfonso Moreira**
- **Nicolás Pivani**

## Curso y Profesor
- Curso: **TADS**
- Profesor: **Rafael Amorim**

## Configuración del entorno
- Sistema operativo: *WINDOWS 11 Pro, 64 bits*
- IDE: *NetBeans IDE 23*
- Versión de Java: *23.0.1; Java HotSpot(TM) 64-Bit Server VM 23.0.1+11-39*
- RAM: *16GB*
- Processador AMD Ryzen 7 5700G 3.80GHZ

## Resultados

### Tiempos de ejecución para 350.000 alumnos

| Operación   | ArrayList (ms) | LinkedList (ms) | Vector (ms) |
|-------------|----------------|-----------------|-------------|
| Inserción   | 163            | 141             | 85          |
| Ordenación  | 108            | 148             | 80          |
| Exportación | 359            | 234             | 176         |

### Observaciones
- `Vector` fue el más rápido en todas las operaciones.  
- `LinkedList` tuvo un buen rendimiento general, pero más lenta al ordenar.  
- `ArrayList` tuvo tiempos aceptables pero más lentos al exportar los datos.

Los resultados pueden variar según el hardware y el sistema operativo utilizados.

