
public class Carro {
	private String cor;
	private float potenciaMotor;
	private int aroRoda;
	private boolean temArCondicionado;
	private boolean estadoDeFunc;
	static int totalDeCarros = 0;
	
	Carro(){
		cor = "Prata";
		potenciaMotor = 1.0f;
		aroRoda = 15;
		temArCondicionado = false;
		estadoDeFunc = false;
		totalDeCarros++;
	}
	
	String getCor(){
		return cor;
	}
	
	void setCor(String cor){
		this.cor = cor;
	}
	
	float getPotenciaMotor(){
		return potenciaMotor;
	}
	
	void setPotenciaMotor(float potenciaMotor){
		this.potenciaMotor = potenciaMotor;
	}
	
	int getAroRoda(){
		return aroRoda;
	}
	
	void setAroRoda(int aroRoda){
		this.aroRoda = aroRoda;
	}
	
	boolean getTemArCondicionado(){
		return temArCondicionado;
	}
	
	void setTemArCondicionado(boolean temArCondicionado){
		this.temArCondicionado = temArCondicionado;
	}
	
	void verificarEstado(){
		if(estadoDeFunc){
			System.out.println("Esta ligado.");
		}else{
			System.out.println("Está desligado.");
		}
	}
	
	void ligar(){
		estadoDeFunc = true;
		System.out.println("O carro ligou.");
	}
	
	void desligar(){
		estadoDeFunc = false;
		System.out.println("O carro desligou.");
	}

	void getTotalDeCarros(){
		System.out.println("O número total de carros é igual a " + totalDeCarros);
	}

	void mostrarAtributos(){
		System.out.println("Atributos deste carro:");
		System.out.println(this.cor);
		System.out.println(this.potenciaMotor);
		System.out.println(this.aroRoda);
		System.out.println(this.temArCondicionado);
		System.out.println(this.estadoDeFunc);
	}








}
