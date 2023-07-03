package services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

import exceptions.ValidacoesEx1;

public class AlimentosService extends ValidacoesEx1{

public void iniciaMenu() {
	 Scanner sc = new Scanner(System.in);
	 
	 HashMap<String, BigDecimal> lista = new HashMap<>(); 
	 String opcao="";

      while (getRodando()) {

		     System.out.println("Digite o tipo de alimento que você quer comprar: ");
		     System.out.println("VERDURA,"+ "LEGUMES, GRÃOS e OUTROS.");
		     setTipoAlimento(sc.next());
		     validaTipoAlimento();
		     System.out.println("Digite a quantidade do alimento ");
		     setQtd(sc.nextBigDecimal());
		     validarQtd();

			 validarAlimentoNulo();
			 System.out.println("Digite o peso ");
			 setPeso(sc.nextBigDecimal());
			 lista.put(getNomeAlimento(), getPeso());
			
		     
		     System.out.println("Deseja continuar?(S/N)");
		     opcao=sc.next();
		     		     
		    if (opcao.equalsIgnoreCase("S")) {
				getRodando();
			}
		    if (opcao.equalsIgnoreCase("N")) {
				System.out.println("Lista: ");
				lista.forEach((alimento,peso)->System.out.println("Nome " + alimento+ " " + peso + " KG " ));
				System.exit(0);
			}
		     
		     
      }
   }
}

