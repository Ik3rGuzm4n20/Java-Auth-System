package org.ikerguzman.models;

public abstract class Persona {
    private String nombres; // public string es accesible desde cualquier parte del programa
    private String apellidos; // es accesible solamente dentra de la misma clase
    private Integer edad; // es accesible desde subclases y dentro del mismo package
    
    //Constructores
    // Siempre por buenas practicas el vacio y el completo
    public Persona(){}
    
    /*/public Persona(String nombres){
        this.nombres = nombres;
    }
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;   
    }/*/
    
    //completo
    public Persona(String nombres, String apellidos, Integer edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;        
    }
    
    //getters y setters
    // Set
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    //get
    public String getApellidos(){
        return apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setEdad(Integer edad) {
        if (edad >= 0){
                this.edad = edad;   
        }
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
}
