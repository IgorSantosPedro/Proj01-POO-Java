import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {
        Leitura dados = new Leitura();
        CriarGrafo listaPalavra = new CriarGrafo();
        GerarCsv csv = new GerarCsv();
        
        String arquivo = "ex4";
        
        String texto = dados.pegarLinhas("src/main/java/exercicios/"+arquivo);
        String textoTratado = dados.tratarTexto(texto);
        String[] textoTratadoSplit = dados.separar(textoTratado);
        
        HashMap<String, HashSet<String>> hash = listaPalavra.list(textoTratadoSplit);
        
        
        String[] g = listaPalavra.transformarArray(hash);
        
        csv.GerarArquivoCsv(g, arquivo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        String[][] lista = CriarGrafo.listar(textoTratadoSplit);
        String[][] proximo = CriarGrafo.proximo(lista);
        String[][] elimina = CriarGrafo.repeti(proximo);
        String[][] novo = CriarGrafo.nova(elimina);
        
        for (int l = 0; l < novo.length; l++)  {  
            for (int c = 0; c < novo[0].length; c++){
            	if(novo[l][c] != "") {
            		System.out.print(novo[l][c] + " "); //imprime caracter a caracter
            	}
            }  
            System.out.println(" "); //muda de linha
          }
          
        
        System.out.println(Arrays.deepToString(lista)); 
       */

    }
}
