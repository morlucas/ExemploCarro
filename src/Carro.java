
public class Carro {
	private String cor;
	private float potenciaMotor;
	private int aroRoda;
	private boolean temArCondicionado;
	private boolean estadoDeFunc;
	
	Carro(){
		cor = "Prata";
		potenciaMotor = 1.0f;
		aroRoda = 15;
		temArCondicionado = false;
		estadoDeFunc = false;
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
}
