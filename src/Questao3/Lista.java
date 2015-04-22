package Questao3;

public class Lista {
	
	public boolean progressaoAritmetica(int[] lista, int razao){
		int i = 0, f = 1, j = 2;
		
		if((lista[f] - lista[i]) == razao && (lista[j] - lista[f]) == razao){
			return true;
		}
		else{
			return false;
		}
	}
}


