
public class Main {
	public static void main(String[] args) {
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		Carro car3 = new Carro();
		Carro car4 = new Carro();
		Carro car5 = new Carro();
		
		//definido novos atributos
		car1.setCor("vermelho");
		car2.setCor("cinza");
		car3.setTemArCondicionado(true);
		car4.setAroRoda(17);
		car5.setPotenciaMotor(2.0f);
		
		//printando os atributos
		car1.mostrarAtributos();
		car2.mostrarAtributos();
		car3.mostrarAtributos();
		car4.mostrarAtributos();
		car5.mostrarAtributos();
		
	}
}
