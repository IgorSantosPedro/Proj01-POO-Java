
public class Main {

    public static void main(String[] args) {
        Leitura dados = new Leitura();
        
        String arquivo = "ex4";
        
        String texto = dados.pegarLinhas("src/main/java/exercicios/"+arquivo);
        String textoTratado = dados.tratarTexto(texto);
        System.out.println(textoTratado);
    }
}
