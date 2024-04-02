package equipos;

import java.util.Scanner;

public class Jugador {
	
	private String nombre;
    private int dorsal;
    private String posicion;

  

    /**
     * Constructor de la clase Jugador.
     * @param nombre El nombre del jugador.
     * @param dorsal El dorsal del jugador.
     */
    
	public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion=elegirPosicion();
    }
    
	  public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public int getDorsal() {
			return dorsal;
		}


		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}


		public String getPosicion() {
			return posicion;
		}


		public void setPosicion(String posicion) {
			this.posicion = posicion;
		}
		
		 /**
	     * Permite al usuario elegir la posición del jugador.
		 * @return 
	     */
    public String elegirPosicion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige la posición del jugador:");
        System.out.println("1. Delantero");
        System.out.println("2. Centrocampista");
        System.out.println("3. Portero");
        
        
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                return "Delantero";
              
            case 2:
                return "Centrocampista";
               
            case 3:
               return "Portero";
               
        }
        return "";
    }
    /**
     * Muestra informacion del jugador
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Posición: " + posicion);
    }
}
