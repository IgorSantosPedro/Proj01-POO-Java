
public class Main {

    public static void main(String[] args) {
        Leitura dados = new Leitura();
        Ordena ordena = new Ordena();
        CriarGrafo listaPalavra = new CriarGrafo();
        
        String arquivo = "ex3";
        
        String texto = dados.pegarLinhas("exercicios/"+arquivo);
        String textoTratado = dados.tratarTexto(texto);
        
        String[] textoTratadoSplit = ordena.separar(textoTratado);
        
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
        
        String[] arr = ordena.removerPalavrasRepetidasNoArray(textoTratadoSplit);
        
        /*
        falta identificar as palavras nó e suas palavras seguintes e ordenar
        */
        
        String[] arr1 = ordena.ordenarOrdemAlfabeto(arr);
        
        
    }

	private static String toString(String x) {
		// TODO Auto-generated method stub
		return null;
	}
}
