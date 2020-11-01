import java.util.List;
import java.util.ArrayList;
	
	
public class CriarGrafo {
	
	public static String[][] listar(String[] textoTratado) {
		int cont = textoTratado.length;
		String[][] lista = new String[cont][10]; /*Achar uma forma de tirar o null das demais colunas*/
		int conta = 0;
		
		for(int x = 0;x < cont; x++) {
			String temp = textoTratado[x];
			lista[x][0] = temp;
		}
		
		return lista;
	}
	
	public static String[][] proximo(String[][] lista){
		int cont = lista.length;
		
		for (int x = 0; x<cont; x++) {
			if (x + 1 < cont ) {
				lista[x][1] = lista[x + 1][0];
			}
			else {
				
			}
		}
		
		return lista;
	}
	
	public static String[][] repeti (String[][] prox){
		int cont = prox.length;
		int col = prox[0].length;
		int t = 1;
		
		
		for (int x = 0; x<cont; x++) {
			for (int j = x + 1; j<cont; j++) { //passar por todas as linhas da matriz
				if (prox[j][0].equals(prox[x][0])) {  //identificar repetições
					for (int i = 0; i <= col; i++) {  //passar pelas colunas dessa repetição
						if (prox[j][i] == null) {  //achar o primeiro valor null da linha
							prox[j][i] = prox[x][t];
							t++;
							if (prox[j][i] == prox[j][i-1]) {  // identificar se o valor apresentado é igual ao ultimo ja existente
								prox[i][j] = null;  //elimina o ultimo item colocado
							}
							else {
								prox[j][i] = null;  //elimina o ultimo item colocado
							}
							i = col;
						}
					}
					for(int p = 0; p < col; p++) {
						prox[x][p] = null;  //elimina a linha igual
					}
					t = 1;
				}
			}
		}
		
		for (int l = 0; l < prox.length; l++)  {  
            		for (int c = 0; c < prox[0].length; c++)     { 
                		if(prox[l][c] == null) {
                			prox[l][c] = "";
                		}
            		}  
          	}
		
		return prox;
	}
	
	public static String[][] nova(String[][] elimina){
		int cont = elimina.length;
		int col = elimina[0].length;
		int p = 0;
		int q = 0;
		String[][] novaMatriz = new String[1000][1000];
		
		for (int i = 0; i<cont; i++) {
			if (elimina[i][0] != "") {
				for (int j = 0; j<col; j++) {
					novaMatriz[p][q] = elimina[i][j];
					q++;
					
				}
				p++;
			}
		}
		
		for (int l = 0; l < novaMatriz.length; l++)  {  
            		for (int c = 0; c < novaMatriz[0].length; c++)     { 
                		if(novaMatriz[l][c] == null) {
                			novaMatriz[l][c] = "";
                		}
            		}  
          	}
		
		return novaMatriz;
	}
}
