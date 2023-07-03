package exceptions;
import java.util.Scanner;
import model.Moedas;

public class ValidacoesEx2 extends Moedas{
	Scanner sc = new Scanner(System.in);
	
	public void validarMoeda() {
		try {
			
			if (!getMoeda().equalsIgnoreCase("DólarA") &&
				!getMoeda().equalsIgnoreCase("DólarC") &&
				!getMoeda().equalsIgnoreCase("Euro")   &&
				!getMoeda().equalsIgnoreCase("Libra")
	            ) {
				throw new IllegalArgumentException();
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println("Tipo de moeda inválida!");
			System.exit(0);
		}
		
	}

	public void validarValor() {	
		try {
			while (getValor().toString().contains("-")) {
				System.out.println("Não foi possível inserir valores negativos, tente de novo!");
				setValor(sc.nextBigDecimal());
			}
			if (!getValor().toString().contains(".")) {
				throw new NumberFormatException();
			}	
			
		} catch (NumberFormatException e) {
			System.out.println("Números inteiros invalidos, tem que ser com casas decimais! ");
			System.exit(0);
		}	
		
	}	
}
