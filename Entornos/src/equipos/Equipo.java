package equipos;
import java.util.ArrayList;
public class Equipo {
	
	    private String nombre;
	    private ArrayList<Jugador> jugadores;

	    public Equipo(String nombre) {
	        this.nombre = nombre;
	        this.jugadores = new ArrayList<>();
	    }
	    public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public ArrayList<Jugador> getJugadores() {
			return jugadores;
		}

		public void setJugadores(ArrayList<Jugador> jugadores) {
			this.jugadores = jugadores;
		}
	    
	    /**
	     * Agrega un jugador al equipo.
	     * @param jugador El jugador a agregar.
	     */
	    
	    public void agregarJugador(Jugador jugador) {
	        jugadores.add(jugador);
	        System.out.println("Jugador agregado al equipo: " + jugador.getNombre()+" "+jugador.getDorsal()+" "+jugador.getPosicion());
	    }
	    
	    
	    /**
	     * Elimina un jugador del equipo por su nombre.
	     * @param nombreJugador El nombre del jugador a eliminar.
	     */
	    	    public void eliminarJugador(String nombreJugador) {
	        for (int i = 0; i < jugadores.size(); i++) {
	            Jugador jugador = jugadores.get(i);
	            if (jugador.getNombre().equals(nombreJugador)) {
	                jugadores.remove(i);
	                System.out.println("Jugador eliminado del equipo: " + nombreJugador);
	                return;
	            }
	        }
	        System.out.println("No se encontró ningún jugador con ese nombre en el equipo.");
	    }

		
}
