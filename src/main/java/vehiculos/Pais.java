package vehiculos;
import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private int vehiculosCreados;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private static ArrayList <Pais> paises;
	
	public Pais (String nombre) {
		
		this.nombre = nombre;
		
		if (paises == null) {
			
			paises = new ArrayList<Pais>();
		}
		
		paises.add(this);
	}
	
public String getNombre () {return(this.nombre);}
	
	public void setNombre (String nombre) {this.nombre = nombre;}
	
	
	public int getVehiculosCreados () {
		
		return (this.vehiculosCreados);
	}
	
	public void agregarVehiculo (Vehiculo auto) {
		
		this.vehiculos.add(auto);
		
		this.vehiculosCreados++;
	}
	
	public static Pais paisMasVendedor () {
		
		Pais pais;
		
		for (Pais i : paises) {
			
			int k = 0;
			
			for (Pais j: paises) {
				
				if (j.vehiculos.size() > i.vehiculos.size() && i != j) {
					
					k = 1;
					break;
				}
			}
			
			if (k == 0) {
				pais = i;
				
				return (pais);
			}	
		}
		
		pais = null;
		return (pais);
	}
	

}
