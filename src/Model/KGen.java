package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class KGen {

    protected String rutaFichero;
    protected String dato;

    public KGen(String rutaFichero) {
        this.rutaFichero = rutaFichero;
        this.dato = leerFicheroFasta(rutaFichero);
    }

    private String leerFicheroFasta(String rutaFichero) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String line;
            line = br.readLine();
            while (line != null) {
                if (!line.startsWith(">")) {
                    sb.append(line.trim());
                }

                //falta aquí algo
                line = br.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public Map<String,Integer> getKgenMap(int size) {
        Map<String, Integer> mapaKGen = new HashMap<>();
        for (int i = 0; i <= dato.length() - size; i++) {
            String kmer = dato.substring(i, i + size);
            mapaKGen.put(kmer, mapaKGen.getOrDefault(kmer, 0) + 1);
        }
        return mapaKGen;
    }


}
