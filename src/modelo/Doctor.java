package modelo;

import modelo.Revision;
import modelo.Animal;

public class Doctor {
	private String nombre;
	private int animalesAtendidos=0;
	
	//Constructor con contrato
	public Doctor(String nombre) {
		super();
		this.nombre=nombre;
		
	}
	


	//Constructor sin contrato
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void atenderAnimal(Animal animal, String resultado, String[] causas, String[] medicamentos ){
		if(this.animalesAtendidos<=5){
			animal.setRevision(new Revision(resultado,causas,medicamentos));
			this.animalesAtendidos++;
			System.out.println("\n\nEl animal de nombre: "+animal.getNombre()+
					" ,fue atendido por el medico: " +this.nombre+
					"\n Su revision es: \n"+animal.mostrarRevision());
		}else System.out.println("Este medico no puede atender mas animales");
	}


	
	

	
}
