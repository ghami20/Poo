import javax.swing.JOptionPane;

public class Cliente extends Persona{
	
	private int id_cliente; 
	private String contrase�a;
	
	
	
	
	public Cliente(int id_cliente, String contrase�a) {
		super();
		this.id_cliente = id_cliente;
		this.contrase�a = contrase�a;
		JOptionPane.showMessageDialog(null, "ingreso un cliente nuevo " + super.getNombre() );
		
	}


	public int getId_cliente() {
		return id_cliente;
	}
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", contrase�a=" + contrase�a + "]";
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	@Override
	public void acceder(){
		
		JOptionPane.showInputDialog("Ingrese clave cliente", contrase�a);
			
		if(contrase�a.equals("asdasd")) {
				
			JOptionPane.showMessageDialog(null, "contrase�a exitosa");
		}else {
			if(contrase�a!=null) {
				JOptionPane.showMessageDialog(null, "Ingreso exitosamente");
			}else {
				JOptionPane.showMessageDialog(null, "contrase�a vacia");
			}
			
		}
	}


}
