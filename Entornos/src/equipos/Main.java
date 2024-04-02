package equipos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * @since 1.0
		 * @autor SergioLilo
		 * @version 1.1
		 */
		
		  Scanner teclado = new Scanner(System.in);
	      ArrayList<Equipo> equipos = new ArrayList<>();
	  

	        System.out.print("¿Cuántos equipos vas a crear? ");
	        int numEquipos = teclado.nextInt();
	        teclado.nextLine(); 
	        añadirEquipos(numEquipos,equipos);
	       
	       
	       
	               }
	 /**
     * Método que permite al usuario añadir equipos.
     * @param numEquipos Número de equipos que se van a crear.
     * @param equipos Lista de equipos donde se almacenarán los equipos creados.
     */
	public static void añadirEquipos(int numEquipos,ArrayList<Equipo> equipos){
		  Scanner teclado = new Scanner(System.in);
		 for (int i = 0; i < numEquipos; i++) {
	            System.out.print("Nombre del equipo " + (i + 1) + ": ");
	            String nombreEquipo = teclado.nextLine();
	            Equipo equipo = new Equipo(nombreEquipo);
	            equipos.add(equipo);
	}
		 elegirEquipo(equipos);

}
	  /**
     * Método que permite al usuario elegir un equipo.
     * @param equipos Lista de equipos disponibles para elegir.
     */
	public static  void elegirEquipo(ArrayList<Equipo> equipos) {
		 Scanner teclado = new Scanner(System.in);
		 int opcionEquipo=999;
	            System.out.println("\n=== Menú de Equipos ===");
	            System.out.println("Elige un equipo:");
	            for (int i = 0; i < equipos.size(); i++) {
	                System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
	            }
	            

	            opcionEquipo = teclado.nextInt()-1;
	            teclado.nextLine(); 
	            menuEquipo(opcionEquipo,equipos);
	            
		 }
	
	 /**
     * Método que muestra el menú de acciones disponibles para un equipo seleccionado.
     * @param opcEquipo Índice del equipo seleccionado en la lista de equipos.
     * @param equipos Lista de equipos disponibles.
     */
	public static void menuEquipo(int opcEquipo,ArrayList<Equipo> equipos) {
		
		
		boolean salir=true;
		while (salir){
		Scanner teclado = new Scanner(System.in);
		 System.out.println("1. Añadir jugador");
         System.out.println("2. Eliminar jugador");
         System.out.println("3. Ver informacion de los jugadores");
         System.out.println("4. Salir");
         System.out.println("0. Cambiar de equipo");
         int opc = teclado.nextInt();
         teclado.nextLine();
         if (opc == 0) {
        	 elegirEquipo(equipos);
         }
         if(opc==1) {
        	 
        	añadir(equipos,opcEquipo);
         }
         if (opc==2) {
        	 eliminar(equipos,opcEquipo);
         }
         if (opc==3) {
        	info(equipos,opcEquipo);
         }
         if (opc==4) {
        	 salir=false;
         }
	}
}
	public static void añadir(ArrayList<Equipo> equipos,int opcEquipo) {
		Scanner teclado = new Scanner(System.in);
	 	 System.out.println("Introduzca en nombre");
    	 String nombre=teclado.nextLine();
    	 System.out.println("Introduzca el dorsal");
    	 int dorsal=teclado.nextInt();
    	 
    	 equipos.get(opcEquipo).agregarJugador(new Jugador(nombre,dorsal));
    	
		
	}
	public static void info(ArrayList<Equipo> equipos,int opcEquipo) {
		 for (int i = 0; i < equipos.get(opcEquipo).getJugadores().size(); i++) {
    		 equipos.get(opcEquipo).getJugadores().get(i).mostrarInfo();
		}
	}
	public static void eliminar(ArrayList<Equipo> equipos,int opcEquipo) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("escribe el nombre del jugador al que quieres eliminar");
   	 String nomb=teclado.nextLine();
   	 equipos.get(opcEquipo).eliminarJugador(nomb);
	}
}
	
