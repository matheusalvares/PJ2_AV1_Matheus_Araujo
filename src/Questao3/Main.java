package Questao3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		final int tam = 10;
		Lista l = new Lista();
		Random r = new Random();	
		int[] lista = new int[tam];
		int i;
		
		for(i=0;i<tam;i++){
			lista[i] = r.nextInt(10);			
		}
		for(i=0;i<tam;i++){
			System.out.print(lista[i] + " ");
		}
		System.out.println("");
		
		if(l.progressaoAritmetica(lista, 2) == true){
			System.out.println("É uma P.A.");
		}
		else{
			System.out.println("Não é uma P.A.");
		}
	}
}
