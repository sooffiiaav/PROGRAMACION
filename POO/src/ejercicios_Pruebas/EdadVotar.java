package ejercicios_Pruebas;

import javax.swing.JOptionPane;

public class EdadVotar {

	public static void main(String[] args) {
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Dime tu edad, para saber si puedes votar o no"));
		
		EdadVotaacion comprobante=new EdadVotaacion();
		comprobante.ComprobarEdad(edad);
		JOptionPane.showMessageDialog(null, "Usted "+comprobante.DimeMensaje()+" puede votar");
		
		
		

	}

}

class EdadVotaacion{
	
	private String Mensaje;
	public final int edadMinima=18;
		
		public void ComprobarEdad(int edad) {
			String mensaje;
			if(edad>=18) {
				mensaje="Si";
			}else {
				mensaje="No";
			}
			this.Mensaje=mensaje;
		}
		public String DimeMensaje() {
			return Mensaje;
		}
	
}