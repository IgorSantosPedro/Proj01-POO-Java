import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class CriarGrafo {
	

    public static HashMap<String, HashSet<String>> list(String[] texto) {
        HashMap<String, HashSet<String>> lista = new HashMap<>();
        //quando ta verificando uma palavra que é chave já cadastrada e
        //muda pra uma palavra que não é, o hashSet não reseta (q nem o 4 pra 5)
        
        // criar um hashMap cm uma chave e hashSet vazio
        for(int i=0; i<texto.length-1; i++) {
            HashSet<String> vazio = new HashSet<>();            
            System.out.println(vazio);
            
            for(String key : lista.keySet()) {  // procurar por todas as chaves cadastradas
                
                if(texto[i].equals(key)) {  // se a palavra sendo verificada é uma chave
                    lista.get(key).add(texto[++i]);  // adiciona no hashMap
                } else {
                    vazio.add(texto[i+1]);  // adiciona no hashSet
                }
                

                
                System.out.println(i+" - "+texto[i]+", "+vazio);
            }
            
            lista.put(texto[i], vazio);
        }
        
        System.out.println("\n"+lista);
 
        return lista;
    }

    public static String[] transformarArray(HashMap<String, HashSet<String>> list) {;
        String separador = ", ";
        String[] array = new String[list.size()];
        int x=0;
        
        for (String i : list.keySet()) {
            array[x] = i+", "+list.get(i);
            x++;
        }
        
        for(int i=0; i<array.length; i++) {
            array[i] = array[i]
                    .replace("[", "")
                    .replace("]", "");
        }
        
        Arrays.sort(array);
        
        return array;
    }

}
