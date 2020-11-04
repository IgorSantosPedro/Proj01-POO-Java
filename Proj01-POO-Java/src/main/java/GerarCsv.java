import java.io.FileWriter;
import java.io.IOException;


public class GerarCsv {
    
    public void GerarArquivoCsv(String[] texto, String arqNome) throws IOException {
        
        FileWriter csvWriter = new FileWriter("src/main/java/CSV/"+arqNome+".csv");

        for (String rowData : texto) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();
        
        System.out.println("Arquivo criado");
    }
    
}
