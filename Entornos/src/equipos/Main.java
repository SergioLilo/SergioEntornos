package equipos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner teclado = new Scanner(System.in);
	      ArrayList<Equipo> equipos = new ArrayList<>();
	  

	        System.out.print("¿Cuántos equipos vas a crear? ");
	        int numEquipos = teclado.nextInt();
	        teclado.nextLine(); 
	        
	        añadirEquipos(numEquipos,equipos);
	       
	       
	       
	               }
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
        	 System.out.println("escribe el nombre del jugador al que quieres eliminar");
        	 String nomb=teclado.nextLine();
        	 equipos.get(opcEquipo).eliminarJugador(nomb);
         }
         if (opc==3) {
        	 for (int i = 0; i < equipos.get(opcEquipo).getJugadores().size(); i++) {
        		 equipos.get(opcEquipo).getJugadores().get(i).mostrarInfo();
			}
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
}
	
