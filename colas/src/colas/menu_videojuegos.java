package colas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu_videojuegos {

	private JFrame frmVideoJuegos;
	private JTextField nombre;
	private JTextField capacidad;
	private JTextField modalidad;
	private JTextField id;
	private JTextField precio;
	
	private metodos_c cola=new metodos_c();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_videojuegos window = new menu_videojuegos();
					window.frmVideoJuegos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu_videojuegos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVideoJuegos = new JFrame();
		frmVideoJuegos.setTitle("Video Juegos");
		frmVideoJuegos.setBounds(100, 100, 503, 414);
		frmVideoJuegos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVideoJuegos.getContentPane().setLayout(null);
		
		nombre = new JTextField();
		nombre.setBounds(163, 93, 170, 20);
		frmVideoJuegos.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		capacidad = new JTextField();
		capacidad.setColumns(10);
		capacidad.setBounds(163, 186, 170, 20);
		frmVideoJuegos.getContentPane().add(capacidad);
		
		modalidad = new JTextField();
		modalidad.setColumns(10);
		modalidad.setBounds(163, 124, 170, 20);
		frmVideoJuegos.getContentPane().add(modalidad);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(163, 217, 170, 20);
		frmVideoJuegos.getContentPane().add(id);
		
		precio = new JTextField();
		precio.setColumns(10);
		precio.setBounds(163, 155, 170, 20);
		frmVideoJuegos.getContentPane().add(precio);
		
		JButton imp = new JButton("Imprimir");
		imp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, cola.imprimir());
			}
		});
		imp.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		imp.setBounds(262, 307, 97, 23);
		frmVideoJuegos.getContentPane().add(imp);
		
		JButton dequeue = new JButton("Dequeue");
		dequeue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					if(cola.dequeue())
					{
						JOptionPane.showMessageDialog(null, "Datos Eliminados");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "NO existen datos a eliminar");
					}
					}
					catch(NullPointerException e)
					{
						JOptionPane.showMessageDialog(null, "NO existen datos para eliminar");
					}
				}
				
								
			
		});
		dequeue.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		dequeue.setBounds(163, 307, 89, 23);
		frmVideoJuegos.getContentPane().add(dequeue);
		
		JButton enqueue = new JButton("Enqueue");
		enqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				datos_c valor = new datos_c();
				valor.setNombre(nombre.getText());
				valor.setModalidad(modalidad.getText());
				valor.setPrecio(precio.getText());
				valor.setId(id.getText());
				valor.setCapacidad(capacidad.getText());
				
				
				cola.enqueue(valor,cola.contar());
				JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
				nombre.setText(null);
				modalidad.setText(null);
				capacidad.setText(null);
				precio.setText(null);
				id.setText(null);
			}
		});
		enqueue.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		enqueue.setBounds(50, 307, 89, 23);
		frmVideoJuegos.getContentPane().add(enqueue);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNombre.setBounds(32, 96, 80, 14);
		frmVideoJuegos.getContentPane().add(lblNombre);
		
		JLabel lblModalidad = new JLabel("Modalidad:");
		lblModalidad.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblModalidad.setBounds(32, 127, 107, 14);
		frmVideoJuegos.getContentPane().add(lblModalidad);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblPrecio.setBounds(32, 158, 46, 14);
		frmVideoJuegos.getContentPane().add(lblPrecio);
		
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCapacidad.setBounds(32, 189, 80, 14);
		frmVideoJuegos.getContentPane().add(lblCapacidad);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblId.setBounds(32, 220, 46, 14);
		frmVideoJuegos.getContentPane().add(lblId);
		
		JButton pico = new JButton("Peek");
		pico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, cola.peek());
			}
		});
		pico.setBounds(377, 309, 89, 23);
		frmVideoJuegos.getContentPane().add(pico);
	}
}
