package services;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import exceptions.ValidacoesEx2;


public class ConversaoService extends ValidacoesEx2{
    
        
    private BigDecimal calc;
	Scanner sc = new Scanner(System.in);
	
	public void Programa() {
		
		do{
			
			System.out.println("Qual moeda deseja converter? ");
			System.out.println("DólarA");
			System.out.println("DólarC");
			System.out.println("Euro");
			System.out.println("Libra");
			setMoeda(sc.next());
			validarMoeda();
			
			System.out.println("Digite o valor ");
			setValor(sc.nextBigDecimal());	

			validarValor();

			BigDecimal valor = getValor();
		
			if (getMoeda().equalsIgnoreCase("DólarA")) {
				calc=valor.multiply(getValorDolarA());
			}
			if(getMoeda().equalsIgnoreCase("DólarC")) {
				calc=valor.multiply(getValorDolarC());
			}
			if(getMoeda().equalsIgnoreCase("Euro")) {
				calc=valor.multiply(getValorEuro());
			} 
			if(getMoeda().equalsIgnoreCase("Libra")){
				calc=valor.multiply(getValorLibra());
			}
			
			System.out.println("Valor colocado " +getValor().toString().replace(".", ","));
			System.out.println("Valor convertido em R$ -> " + calc.setScale(2,RoundingMode.HALF_UP).toString().replace(".", ","));
	        System.out.println("Deseja converter novamente?(S/N) ");
	        setOpcao(sc.next());
	        
			if (getOpcao().equalsIgnoreCase("s")) {
				getRodando();
			}
			if(getOpcao().equalsIgnoreCase("n")){
				System.out.println("Programa Encerrado! ");
				setRodando(false);
				getRodando();
			}
			
		}while (getRodando());
		
	}

}
