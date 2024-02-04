 package ejercicios_Pruebas;

 import javax.swing.JOptionPane;

 public class Descuentos {
	 

 	public static void main(String[] args) {
		
		

		CalcularDescuento[] productos = new CalcularDescuento[2];
		for (int i = 0; i < productos.length; i++) {
			
			 productos[i] = new CalcularDescuento();
		productos[i].AñadirNombre(JOptionPane.showInputDialog("Dime el nombre de los productos"));
		double precioInicial=Double.parseDouble(JOptionPane.showInputDialog("Dime el precio de los productos"));
		int unidades=Integer.parseInt(JOptionPane.showInputDialog("Dime el numero de unidades que te llevas "));
		productos[i].AñadirProductoyCalcular(precioInicial, unidades);
	
		

	}
	CalcularDescuento.MostrarDescuento(productos);	
 	}
}
 class CalcularDescuento{
	
	private String nombre_producto;
	private final double descuento;
	private double precio_inicial;
	private double precio_final;
	
	private int numero;
	
	public CalcularDescuento() {
		
		this.descuento=0.10;
		
}
	public void AñadirProductoyCalcular(double precio1, int numero) {
		
		this.numero=numero;
		this.precio_inicial=precio1;
	}
	
	public void AñadirNombre(String nombre) {
		
		this.nombre_producto=nombre;
		
	}
	

	public String getNombre_producto() {
		return nombre_producto;
	}


	public double getPrecio_inicial() {
		return precio_inicial;
	}

	
	public double getPrecio_final() {
		return precio_final;
	}

	private void CalcularPrecioFinal(int unidades) {
		
	if(unidades==5) {
			
			precio_final= precio_inicial * (1 - descuento);
			
		}else {
			
			precio_final= precio_inicial;
			
		}
	}

	public static void MostrarDescuento(CalcularDescuento[] productos) {
	
	StringBuilder lista = new StringBuilder("PRODUCTOS :\n");
	for (int i = 0; i < productos.length; i++) {
	lista.append( "\n Nombre Producto : ").append(productos[i].getNombre_producto())
		.append("\n Precio inicial: ").append(productos[i].getPrecio_inicial())
		.append("\n Precio final: ").append(productos[i].getPrecio_final())
		.append("\n----------------------\n");
}

JOptionPane.showMessageDialog(null, lista.toString(), "Resumen:", JOptionPane.INFORMATION_MESSAGE);
}
}
