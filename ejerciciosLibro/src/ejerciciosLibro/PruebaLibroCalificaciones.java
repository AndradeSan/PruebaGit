package ejerciciosLibro;

import java.util.Scanner;
import javax.swing.JOptionPane; 
public class PruebaLibroCalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		LibroCalificaciones x = new LibroCalificaciones();
		x.mostrarMensaje();
		
		LibroCalificaciones other = new LibroCalificaciones();
		other.mostarOtromsn();
		
		LibroCalificaciones demo = new LibroCalificaciones();
		
		
		// pide al usuario que escriba su nombre
		  String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
		 
		  // crea el mensaje
		  String mensaje = String.format( "Bienvenido, %s, a la programacion en Java!", nombre );
		   
		  // muestra el mensaje para dar la bienvenida al usuario por su nombre 
		   JOptionPane.showMessageDialog( null, mensaje );

		
		
		
		
		JOptionPane.showMessageDialog(null, "Bienvenido\na\nJava");
		
		JOptionPane.showMessageDialog(null, "Hola Mundo");
		
		System.out.println("Ingrese el Nombre del Curso: ");
		String z = input.nextLine();
		System.out.println();
		
		demo.mostrarMensaje1(z);
		
		input.close();
		
		
	
		
	
		
	}

}
