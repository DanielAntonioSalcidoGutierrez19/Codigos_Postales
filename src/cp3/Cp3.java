
package cp3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Cp3 {

    static int palabrastotales;    
     static int lineastotales;
    public static void main(String[] args) {
        File archivo = new File("/Users/salci/Downloads/codigos_postales_hmo");
      // Crear un mapa para almacenar la frecuencia de cada código postal
        Map<String, Integer> codigoPostalFrequencyMap = new HashMap<>();

        // Leer el archivo de texto
        try (BufferedReader br = new BufferedReader(new FileReader("archivo"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String codigoPostal = line.trim();
                
                // Actualizar la frecuencia del código postal
                codigoPostalFrequencyMap.put(codigoPostal, codigoPostalFrequencyMap.getOrDefault(codigoPostal, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir el resultado
        System.out.println("Código Postal\tFrecuencia");
        for (Map.Entry<String, Integer> entry : codigoPostalFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }  
        
        
        
        
        
        
      
   
   
   
   
   }
}
