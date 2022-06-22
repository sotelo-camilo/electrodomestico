package logica;

public class Electrodomestico {

	String nombre;
	String marca;
	double consumo;
	
	public Electrodomestico (String a, String b, double c) {
	
		nombre = a;
		marca = b;
		consumo = c;
		}
	public Electrodomestico() {
		}
	public String getNombre() {
		return nombre;
	}
    public String getMarca() {
    	return marca;
    }
    public double getConsumo() {
    	return consumo;
    }
    public void setNombre(String a) {
    	nombre = a;
    }
    public void setMarca(String b) {
    	marca = b;
    }
    public void setConsumo(double c) {
    	consumo = c;
    }
    
    public String toString() {
    	return "nombre: " + nombre + "marca: " + marca + "consumo; " + consumo;
    }
    
    
}
