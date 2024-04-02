package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int vehiculosCreados;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private static ArrayList<Fabricante> fabricante;
	
	public Fabricante (String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		if (fabricante == null) {
			
			fabricante = new ArrayList<Fabricante> ();
			
		}
		
		fabricante.add(this);
		
	}
	
    public String getNombre () {return(this.nombre);}
	
	public void setNombre (String nombre) {this.nombre = nombre;}
	
	
	public Pais getPais () {return(this.pais);}
	
	public void setPais (Pais pais) {this.pais = pais;}
	
	
	public int getVehiculosCreados () {
		
		return (this.vehiculosCreados);
	}
	
	
	public void agregarVehiculo (Vehiculo auto) {
		
		this.vehiculosCreados++;
		
		this.vehiculos.add(auto);
		
		this.pais.agregarVehiculo(auto);
	}
	
	
	public static Fabricante fabricaMayorVentas () {
		
		Fabricante fabrica;
		
		for (Fabricante i : fabricante) {
			
			int k = 0;
			
			for (Fabricante j: fabricante) {
				
				if (j.vehiculos.size() > i.vehiculos.size() && i != j) {
					
					k = 1;
					break;
				}
			
			}
			
			if (k == 0) {
				fabrica = i;
				
				return (fabrica);
			}
			
		}
		
		fabrica = null;
		return (fabrica);
	}
	

}
	
	
