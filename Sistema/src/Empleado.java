import javax.swing.JOptionPane;

public class Empleado extends Persona{
	
	private String contrase�a;

	public Empleado() {
		System.out.println("soy un empleado");
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Empleado [contrase�a=" + contrase�a + "]";
	}
	
	@Override 
	public void acceder() {
		JOptionPane.showMessageDialog(null, "Ingreso correctamente");
	}
	
	
}
