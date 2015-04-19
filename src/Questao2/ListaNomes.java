package Questao2;

public class ListaNomes {
	
	 public static void recebeLista(String[] nomes, int limite){
		 
		 int i;
		 String[] nome = new String[nomes.length];
		 
		 for(i=0;i<nomes.length;i++){
			 String[] s = nomes[i].split(" ");
			 if((s.length > limite) || s[0].toUpperCase().endsWith("Z")){
				 nome[i] = nomes[i];
			 }
		 }
		 for(i=0;i<5;i++){
			 if(nome[i] != null){
			 System.out.println(nome[i]);
			 }
		 }
	 }
}

