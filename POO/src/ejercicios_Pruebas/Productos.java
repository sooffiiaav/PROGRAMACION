package ejercicios_Pruebas;



import javax.swing.JOptionPane;


public class Productos {

	public static void main(String[] args) {

		

		Productos1[] productos = new Productos1[2];
		for (int i = 0; i < 2; i++) {
			
			String nombre_Producto = JOptionPane.showInputDialog("Dime el nombre de 1 producto");
			double precio_Producto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto: "));
			
			productos [i]=new Productos1(nombre_Producto,precio_Producto);
		}
		
		Productos1.mostrarLista(productos);

		



	}

	
}
class Productos1 {

	private final double impuesto = 0.15;
	private String nombre_Producto;
	private double precio_Producto;
	private double precio_final;

	public Productos1(String nombre, double precio) {

		nombre_Producto = nombre;
		precio_Producto = precio;
		precio_final= precio_Producto * (1 +impuesto);
	}

	public void setNombre_Producto(String nombre) {
		this.nombre_Producto = nombre;

	}

	public String getNombre_Producto() {

		return nombre_Producto;
	}

	public void setPrecio_Producto(double precio_Producto) {
		this.precio_Producto = precio_Producto;
	}

	public double getPrecio_Producto() {
		return precio_Producto;
	}

	public void setPrecio_final(double precio_final) {
		double aumento=precio_final* impuesto;
		this.precio_final = aumento;
	}

	public double getPrecio_final() {
		return precio_final;
	}

	public static void mostrarLista(Productos1[] productos) {

		StringBuilder Lista = new StringBuilder("PRODUCTOS :\n");
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				Lista.append((i + 1) + "\n Nombre : ").append(productos[i].getNombre_Producto()).append("\n Precio producto: ").append(productos[i].getPrecio_Producto()).append("\n Precio final: ").append(productos[i].getPrecio_final()).append("\n----------------------\n");
			}
}
		JOptionPane.showMessageDialog(null, Lista.toString(), "Resumen:", JOptionPane.INFORMATION_MESSAGE);
	}
}
