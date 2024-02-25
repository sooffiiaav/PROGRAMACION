package Sobrecarga;

import javax.swing.JOptionPane;

public class Producto {

	public static void main(String[] args) {
		
		
	Producto cajaFresas = new Producto("Caja Fresas", 3.50, 50, "Fruterias Toledo");
				
	JOptionPane.showMessageDialog(null, "\nNombre: " + cajaFresas.getNombre() + "\nPrecio: " + cajaFresas.getPrecio()
						+ "\nCantidad: " + cajaFresas.getCantidad() + "\nMarca: " + cajaFresas.getMarca());
			

			
		}
		private String nombre;
		private double precio;
		private int cantidad;
		private String marca;
		private double descuento;

		public Producto(String nombre, double precio, int cantidad, String marca) {
			//primero constructor//
			this.nombre = nombre;
			this.precio = precio;
			this.cantidad = cantidad;
			this.marca = marca;

		}

		public Producto(String nombre, double precio, int cantidad) {
			//segundo constructor//
			this.nombre = nombre;
			this.precio = precio;
			this.cantidad = cantidad;

		}

		public Producto(String nombre, double precio, int cantidad, double descuento) {
			//tercer constructor//
			this.nombre = nombre;
			this.precio = precio;
			this.cantidad = cantidad;
			this.descuento = descuento;
		}

		public String getNombre() {//getter//
			return nombre;
		}

		public void setNombre(String nombre) {//setter//
			this.nombre = nombre;
		}

		public double getPrecio() {//getter//
			return precio;
		}

		public void setPrecio(double precio) {//setter//
			this.precio = precio;
		}

		public int getCantidad() {//getter//
			return cantidad;
		}

		public void setCantidad(int cantidad) {//setter//
			this.cantidad = cantidad;
		}

		public String getMarca() {//getter//
			return marca;
		}

		public void setMarca(String marca) {//setter//
			this.marca = marca;
		}

		public double getDescuento() {//getter//
			return descuento;
		}

		public void setDescuento(double descuento) {//setter//
			this.descuento = descuento;
		}


	}


