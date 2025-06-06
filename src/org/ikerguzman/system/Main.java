package org.ikerguzman.system;
import org.ikerguzman.controlers.ProfesorController;
import org.ikerguzman.models.Profesor;
import org.ikerguzman.views.ProfesorView;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProfesorView profesorViews = new ProfesorView();
        profesorViews.menuProfesor();      
    }
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
        /*/Profesor profesor = new Profesor();
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
        System.out.println(profesor2);/*/
        
        ProfesorController pc = new ProfesorController();
        Scanner leer = new Scanner(System.in);
        Profesor pf;
        
        /*/pc.agregarProfesor();
        pc.agregarProfesor();
        pc.listarProfesores();
            System.out.println("Ingresar el id del profesor a buscar");
            String id = leer.nextLine();
        pc.buscarProfesor(id);
           pf = pc.buscarProfesor(id);
           System.out.println(pf);
    }   /*/
    
}
