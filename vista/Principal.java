package vista;


import vista.Veterinaria;

public class Principal {

	
	
		public static void main(String[] args) {
			Veterinaria veterinaria= new Veterinaria();
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("mish", "gato", "Siames", 5, "fiebre");
			veterinaria.inscribirAnimal("pepito","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			veterinaria.inscribirAnimal("pepe","perro","labrador",3,"Descompostura");
			
			
			//Genero los medicos
			veterinaria.inscribirMedico("Jorge");	
			veterinaria.inscribirMedico("Jorge");
			veterinaria.inscribirMedico("Jorge");
			veterinaria.inscribirMedico("Jorge");
			veterinaria.inscribirMedico("Jorge");
			veterinaria.inscribirMedico("Laura");
			
			//Atiendo a los animalitos
			
			veterinaria.atenderAnimales();
			
		}
	

}
