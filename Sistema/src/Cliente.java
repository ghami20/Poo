import javax.swing.JOptionPane;

public class Cliente extends Persona{
	
	private int id_cliente; 
	private String contraseña;
	
	
	
	
	public Cliente(int id_cliente, String contraseña) {
		super();
		this.id_cliente = id_cliente;
		this.contraseña = contraseña;
		JOptionPane.showMessageDialog(null, "ingreso un cliente nuevo " + super.getNombre() );
		
	}


	public int getId_cliente() {
		return id_cliente;
	}
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", contraseña=" + contraseña + "]";
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
	public void acceder(){
		
		JOptionPane.showInputDialog("Ingrese clave cliente", contraseña);
			
		if(contraseña.equals("asdasd")) {
				
			JOptionPane.showMessageDialog(null, "contraseña exitosa");
		}else {
			if(contraseña!=null) {
				JOptionPane.showMessageDialog(null, "Ingreso exitosamente");
			}else {
				JOptionPane.showMessageDialog(null, "contraseña vacia");
			}
			
		}
	}


}
