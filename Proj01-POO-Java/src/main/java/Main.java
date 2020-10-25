public class Main {

    public static void main(String[] args) {
    	//faz leitura
        Leitura dados = new Leitura();
        
        String arquivo = "ex3";
        
        String texto = dados.pegarLinhas("src/main/java/exercicios/"+arquivo);
        String textoTratado = dados.tratarTexto(texto);
        
        
        //orndena o texto
        Ordena ordem = new Ordena();
        String ordenado = ordem.recebe(textoTratado);
        
        
        System.out.println(ordenado);
    }
}
