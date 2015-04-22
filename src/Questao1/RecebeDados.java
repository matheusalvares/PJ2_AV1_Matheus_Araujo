package Questao1;

import java.util.Scanner;
import java.util.ArrayList;

public class RecebeDados {
	
	static ArrayList <Integer> numeros = new ArrayList <Integer>();
		
	public static void recebeNumeros(){
		int i =0;
		final int tam = 10;
		Scanner s = new Scanner(System.in);
		while(i<tam){
			System.out.print("Insira um numero: ");
			numeros.add(i, s.nextInt());
			i++;
		}
		System.out.println(numeros);
	}
	
	public static void inverte(){
		int i;
		
		System.out.print("Os números pares são: ");
		for(i=numeros.size()-1; i>-1;i--){
			if((numeros.get(i) % 2) == 0){
				System.out.print(numeros.get(i) + " ");
			}
		}
	}	
}
