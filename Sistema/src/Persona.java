import javax.swing.JOptionPane;

public class Persona {
	
	private String DNI;
	private String nombre;
	

	public Persona() {
		System.out.println("Me creé soy una persona");
		this.nombre = "carlos"; 
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + "]";
	}
	
	public void acceder(){
		
		JOptionPane.showInputDialog("Ingrese clave", DNI);
	}
}

