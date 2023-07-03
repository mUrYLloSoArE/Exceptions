package exceptions;

import java.util.Scanner;

import model.Alimentos;

public class ValidacoesEx1 extends Alimentos{
	Scanner sc = new Scanner(System.in);
	
	public void validaTipoAlimento(){
		try {
 
		     if(!getTipoAlimento().equalsIgnoreCase("VERDURA") &&
		    	!getTipoAlimento().equalsIgnoreCase("LEGUMES") &&
		    	!getTipoAlimento().equalsIgnoreCase("GRÃOS") &&
		    	!getTipoAlimento().equalsIgnoreCase("OUTROS") 
		    		 ) {
		    	  throw new IllegalArgumentException();
		      }
		     
	      }catch (IllegalArgumentException e) {
		System.out.println("ALIMENTO INVÁLIDO! ");
		System.exit(0);
	    } 
		
	}
	
	
	public void validarQtd(){



		if(        getTipoAlimento().equalsIgnoreCase("VERDURA") ||
				   getTipoAlimento().equalsIgnoreCase("GRÃOS")
										 ) {
									try {
										if (!getQtd().toString().contains(".")) {
									    	  throw new NumberFormatException();  
										}
									} catch (NumberFormatException e) {
										System.out.println("Não é válido números inteiros, só números com vírgula ");
										System.exit(0);
									}
								}
		
		
		if(     getTipoAlimento().equalsIgnoreCase("LEGUMES") ||
				getTipoAlimento().equalsIgnoreCase("OUTROS")
												 ) {
											try {
												if (getQtd().toString().contains(".")) {
											    	  throw new NumberFormatException();  
												}
											} catch (NumberFormatException e) {
												System.out.println("Não é válido números com virgula, só números inteiros ");
												System.exit(0);
											}
		}


	};

	public void validarAlimentoNulo(){
		System.out.println("Digite o nome do alimento ");
		setNomeAlimento(sc.nextLine());
		try {
			if (getNomeAlimento().isEmpty()) {
				throw new UnsupportedOperationException();
			}
			
		} catch (UnsupportedOperationException e) {
			System.out.println("Não é possivel inserir nome vazio ");
			System.exit(0);
		}
		
	};
	

}
