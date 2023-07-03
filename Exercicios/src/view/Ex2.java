package view;

import services.ConversaoService;

public class Ex2 {

	public static void main(String[] args) {
	   
       ConversaoService service = new ConversaoService();
       
       System.out.println("Bem vindo ao conversor de moedas ");
	   System.out.println("O programa converte qualquer moeda em R$ ");
	   System.out.println();
	   service.Programa();
	
	}
	
}
