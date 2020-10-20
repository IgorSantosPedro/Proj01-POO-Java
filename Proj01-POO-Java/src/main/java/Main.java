import com.sun.xml.internal.ws.util.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Leitura dados = new Leitura();
        
        String arquivo = "ex2";
        
        String texto = dados.pegarLinhas("src/main/java/exercicios/"+arquivo);
        String textoTratado = dados.tratarTexto(texto);
        System.out.println(textoTratado);
    }
}
