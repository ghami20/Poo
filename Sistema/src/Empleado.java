import javax.swing.JOptionPane;

public class Empleado extends Persona{
	
	private String contraseña;

	public Empleado() {
		System.out.println("soy un empleado");
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Empleado [contraseña=" + contraseña + "]";
	}
	
	@Override 
	public void acceder() {
		JOptionPane.showMessageDialog(null, "Ingreso correctamente");
	}
	
	
}
