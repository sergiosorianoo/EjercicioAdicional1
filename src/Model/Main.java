package Model;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KGen kgen = null;

        while (true) {
            System.out.println(" ");
            System.out.println("--- MENU ---");
            System.out.println("1. Abrir fichero FASTA");
            System.out.println("2. Calcular y mostrar mapa de palabras de tamaño...");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            System.out.println(" ");

            switch (option) {
                case 1:
                    System.out.print("Introduce el nombre del fichero FASTA: ");
                    String rutaFichero = scanner.nextLine();
                    kgen = new KGen(rutaFichero);
                    System.out.println("Fichero FASTA abierto y leído correctamente.");
                    break;
                case 2:
                    if (kgen == null) {
                        System.out.println("Primero debes abrir un fichero FASTA.");
                    } else {
                        System.out.print("Introduce el tamaño de la palabra: ");
                        int size = scanner.nextInt();
                        Map<String, Integer> kgenMap = kgen.getKgenMap(size);
                        System.out.println("Mapa de palabras de tamaño " + size + ":");
                        for (Map.Entry<String, Integer> entry : kgenMap.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}