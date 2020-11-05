import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {
        Leitura dados = new Leitura();
        CriarGrafo listaPalavra = new CriarGrafo();
        GerarCsv csv = new GerarCsv();
        
        String arquivo = "ex4.txt";
        
        String texto = dados.pegarLinhas("src/main/java/exercicios/"+arquivo);
        String textoTratado = dados.tratarTexto(texto);
        String[] textoTratadoSplit = dados.separar(textoTratado);
        
        HashMap<String, HashSet<String>> hash = listaPalavra.list(textoTratadoSplit);
        
        
        String[] g = listaPalavra.transformarArray(hash);
        
        csv.GerarArquivoCsv(g, arquivo);
        
    }
}
