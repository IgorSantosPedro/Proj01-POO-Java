
public class Main {

    public static void main(String[] args) {
        Leitura dados = new Leitura();
        Ordena ordena = new Ordena();
        
        String arquivo = "ex3";
        
        String texto = dados.pegarLinhas("src/main/java/exercicios/"+arquivo);
        String textoTratado = dados.tratarTexto(texto);
        
        String[] textoTratadoSplit = ordena.separar(textoTratado);
        String[] arr = ordena.removerPalavrasRepetidasNoArray(textoTratadoSplit);
        
        /*
        falta identificar as palavras nó e suas palavras seguintes e ordenar
        */
        
        String[] arr1 = ordena.ordenarOrdemAlfabeto(arr);
        ordena.printArray(arr1);
    }
}
