import java.util.Arrays;
import java.util.Collections;
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
	

}
