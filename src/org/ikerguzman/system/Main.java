package org.ikerguzman.system;
import org.ikerguzman.models.Profesor;

public class Main {

    public static void main(String[] args) {
        /*/Persona persona1 = new Persona();
        Alumno alumno1 = new Alumno();
        
        alumno1.setNombres("Alberto");
        //alumno1.setApellidos = "Morales";
        persona1.setApellidos("Guzman");
        
        //persona1.nombres = "Iker";
        //persona2.apellidos = "Guzman";
        
        System.out.println(alumno1.getNombres());
        System.out.println(persona1.getApellidos());/*/
        
        //Crear un objeto del uso del constructor vacio
        Profesor profesor = new Profesor();
        //Crear un objeto del uso del contructor lleno
        Profesor profesor2 = new Profesor("Alberto","Ortega",21,
        "iaguzman2004hp@gmail.com","6590-22-15183","57839598");
        
        profesor.setNombres("Iker");
        profesor.setApellidos("Guzman");
        profesor.setEdad(21);
        profesor.setEmail("iaguzman2004hp@gmail.com");
        profesor.setId("6590-22-15183");
        profesor.setPhone("57839598");
        
        System.out.println(profesor);
        System.out.println(profesor2);
    }
    
    
}
