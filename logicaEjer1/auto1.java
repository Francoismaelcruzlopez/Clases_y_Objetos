package logicaEjer1;

public class auto1 {
	//atributos
	private String Marca;  
	private int Potencia;
	private double Precio, VelMax;
	
	public auto1() {
		
	}

	public auto1(String a, int b, double c, double d) {
		Marca=a;
		Potencia=b;
		Precio=c;
		VelMax=d;
	}
	public String getMarca() {
		return Marca;
	}
	public int getPotencia() {
		return Potencia;
	}
	public double getPrecio() {
		return Precio;
	}
	public double getVelMax() {
		return VelMax;
	}
	public void setMarca(String a) {
		Marca=a;
	}
	public void setPotencia(int a) {
		Potencia=a;
	}
	public void setPrecio(double a) {
		Precio=a;
	}
	public void setVelMax(double a) {
		VelMax=a;
	}
	@Override
	public String toString() {
		return ("La marca es: "+Marca+" ,su potencia es: "+Potencia+" , el precio es: "+Precio+" y su velocidad maxima es: "+VelMax);
	}
}
