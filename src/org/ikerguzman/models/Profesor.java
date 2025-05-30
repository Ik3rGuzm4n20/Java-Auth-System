package org.ikerguzman.models;

//herencia de clase persona y abstracción, al ser una clase abtracta
public class Profesor extends Persona{
    /*/Persona persona1 = new Persona();
    public void prueba(){
        persona1.edad = 21;
    }/*/
    //Atributos de Encapsulamiento
    private String email;
    private String id;
    private String phone;
    
    //constructor vacio
    public Profesor(){}
    
    //contructor lleno
    public Profesor(String nombres, String apellidos, Integer edad, 
            String email, String id, String phone){
        super(nombres, apellidos, edad);
        this.email = email;
        this.id = id;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "email=" + email + ", id=" + id + ", phone=" + phone + '}';
    }
}
