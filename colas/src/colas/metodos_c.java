package colas;
import javax.swing.JOptionPane;




public class metodos_c {


		private nodo_c pico=null;
		
		
		public nodo_c getPico() {
			return pico;
		}
		public void setPico(nodo_c pico) {
			this.pico = pico;
		}
		public boolean isEmpty()
		{
			boolean respuesta=false;
			if(pico==null)
			{
				respuesta=true;
			}
			return respuesta;
		}
		public int contar()
		{
			int respuesta=0;
			nodo_c temporal=this.pico;
			while(temporal!=null)
			{
				respuesta++;
				temporal=temporal.getSiguiente();		
				}
			return respuesta;
		}
		public void insertar(datos_c valor)
		{
			nodo_c nuevo=new nodo_c();
			nuevo.setValores(valor);
			nuevo.setSiguiente(null);
			pico=nuevo;
		}
		public boolean enqueue(datos_c valor, int top)//insertar
		{
			boolean respuesta=false;
			if(top<3)
			{
				if(isEmpty())
				{
					insertar(valor);
				}else if(top==1){
					nodo_c nuevo1=new nodo_c();
					nuevo1.setValores(valor);
					pico.setSiguiente(nuevo1);
					nuevo1.setSiguiente(null);
					
					respuesta=true;
				}
				else {
					
					nodo_c nuevo=new nodo_c();
					nuevo.setValores(valor);
					nuevo.setSiguiente(null);
					
					nodo_c temp=this.pico;
					while(temp.getSiguiente()!=null)
					{
						temp=temp.getSiguiente();			
						
					}
					temp.setSiguiente(nuevo);
					respuesta=true;
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "La cantidad de valores a superado el tope asignado");
				
				nodo_c nuevo=new nodo_c();
				nuevo.setValores(valor);
				nuevo.setSiguiente(null);
				
				nodo_c temp=this.pico;
				while(temp.getSiguiente()!=null)
				{
					temp=temp.getSiguiente();			
					
				}
				temp.setSiguiente(nuevo);
				respuesta=true;
			}
			
			
		
			return respuesta;
		}
		public boolean dequeue()//eliminar
		{
			boolean respuesta=true;
			this.setPico(this.pico.getSiguiente());
			respuesta=true;
			return respuesta;
		}
		public StringBuilder imprimir()
		{
			StringBuilder cadena=new StringBuilder();
			cadena.append("pico");
			cadena.append("\n");
			cadena.append("    ||");
			cadena.append("\n");
			cadena.append("    v");
			cadena.append("\n");
			
			nodo_c temp=pico;
			while(temp!=null)
			{
				cadena.append(temp.getValores().getNombre());
				cadena.append("\n");
				cadena.append("     ||");
				cadena.append("\n");
				cadena.append("     v");
				cadena.append("\n");
				temp=temp.getSiguiente();			
			}
			cadena.append(" NULL");
			return cadena;
		}
		
		public StringBuilder peek()
		{
			StringBuilder cadena=new StringBuilder();
			if(pico!=null) {
				nodo_c first=pico;
				cadena.append(first.getValores().getNombre());
				
				
			}
			return cadena;
		}
	
}
