package vista;


import modelo.Animal;
import modelo.Doctor;

public class Veterinaria {

	private Animal[] listaAnimales= new Animal[20];
	private int animalesInscriptos=0;
	private Doctor[] listaMedicos= new Doctor[5];
	private int cantidadMedicos=0;
	
	
	
	public void inscribirAnimal(String nombre, String tipo, String raza, int edad,String causa){
		if(animalesInscriptos<20){
			this.listaAnimales[this.animalesInscriptos]= new Animal(nombre,tipo,raza,edad,causa);
			this.animalesInscriptos++;
		}else System.out.println("No puede inscribir mas animales");
	}
	
	public void inscribirMedico(String nombre){
		if(cantidadMedicos<5){
			this.listaMedicos[this.cantidadMedicos]= new Doctor(nombre);
			this.cantidadMedicos++;
		}else System.out.println("No puede inscribir mas medicos");
	}
	
	public void main(String[] args) {
		
		//Genero los animales
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("mish", "gato", "Siames", 5, "fiebre");
		this.inscribirAnimal("pepito","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		this.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
		
		
		//Genero los medicos
		this.inscribirMedico("Jorge");	
		this.inscribirMedico("Jorge");
		this.inscribirMedico("Jorge");
		this.inscribirMedico("Jorge");
		this.inscribirMedico("Jorge");
		this.inscribirMedico("Laura");
		
		//Atiendo animales
		
		
		
	listaMedicos[0].atenderAnimal(listaAnimales[0], "Infeccion",new String[]{"alimentacion","nada"},new String[]{"ibuprofeno","eritro"});
	listaMedicos[2].atenderAnimal(listaAnimales[1], "Infeccion urinaria", new String[]{"Fallo hepatico"}, new String[]{"ninguno"});
	
	
	}
	
	
}
