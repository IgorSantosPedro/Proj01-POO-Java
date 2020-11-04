import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.List;

public class Leitura {

    static String pegarLinhas(String file) {
        String texto = "";
        try {
            List<String> allLines = Files.readAllLines(Paths.get(file));
            for (String line : allLines) {
                // Pular linhas vazias
                if(!"".equals(line) && !" ".equals(line)) {
                    texto += line + " ";
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texto;
    }
    
    static String tratarTexto(String texto) {
        String textoTratado = Normalizer
                            .normalize(texto, Normalizer.Form.NFD)
                            .replaceAll("[^\\p{ASCII}]", "")
                            .replaceAll("[\\?!@#$%&*,.;\"-]", "")
                            .toLowerCase()
                            .trim();
        textoTratado = textoTratado.replace("  ", " ");
        return textoTratado;
    }
    
    static String[] separar(String texto) {
        String palavrasTexto[] = texto.split(" ");
        return palavrasTexto;
    }
}


