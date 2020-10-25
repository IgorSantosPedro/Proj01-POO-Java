import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;


public class Ordena {
	
    static String recebe(String textoTratado) {
        int size = textoTratado.length();
        int cont;
        String passa = "";
        String completo = "";
        String[] ordem = textoTratado.split(" ");

        Arrays.sort(ordem);

        for (cont = 0; cont <= size; cont++) {
                System.out.println(ordem[cont]);
        }

        return ordem[0];
    }
    
    static String[] separar(String texto) {
        String palavrasTexto[] = texto.split(" ");
        return palavrasTexto;
    }
    
    static String[] removerPalavrasRepetidasNoArray(String[] array) {
        LinkedHashSet<String> hashArr = new LinkedHashSet<>(Arrays.asList(array));
        
        //create array from the LinkedHashSet
        String[] arrSemRep = hashArr.toArray(new String[hashArr.size()]);
        
        return arrSemRep;
    }
    
    static String[] ordenarOrdemAlfabeto(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    
    static void printArray(String[] a) {
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}