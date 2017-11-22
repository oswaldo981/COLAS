package colas;
public class datos_c {

		String nombre;
		String modalidad;
		String id;
		String precio;
		String capacidad;
		datos_c siguiente;
		datos_c valores;
		public datos_c getValores() {
			return valores;
		}
		public void setValores(datos_c valores) {
			this.valores = valores;
		}
		public datos_c getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(datos_c siguiente) {
			this.siguiente = siguiente;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getModalidad() {
			return modalidad;
		}
		public void setModalidad(String modalidad) {
			this.modalidad = modalidad;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPrecio() {
			return precio;
		}
		public void setPrecio(String precio) {
			this.precio = precio;
		}
		public String getCapacidad() {
			return capacidad;
		}
		public void setCapacidad(String capacidad) {
			this.capacidad = capacidad;
		}
		

	

}
