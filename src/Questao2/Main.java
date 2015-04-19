package Questao2;

public class Main {

	public static void main(String[] args) {
		String[] nomes = new String[5];
		int i;
		
		nomes[0] = ("Matheus Araujo Alvares");
		nomes[1] = ("Felipe Alvares");
		nomes[2] = ("Cayo Aguiar do Nascimento");
		nomes[3] = ("Antonio Henrique");
		nomes[4] = ("Matheuz Ferreira");
		
		for(i=0;i<nomes.length;i++){
			System.out.println(nomes[i]);
		}
		System.out.println("");
		ListaNomes.recebeLista(nomes, 2);
	}

}
