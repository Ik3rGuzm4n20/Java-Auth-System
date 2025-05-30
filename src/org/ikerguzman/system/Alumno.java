package org.ikerguzman.system;
import org.ikerguzman.models.Persona;

public class Alumno extends Persona {
    //Persona persona1 = new Persona();
    /*/protected String saludo(){
    return "HOLA DESDE ALUMNO";
    }/*/
    //Atributos para alumno:
    private String carnet;
    private String grado;
    private String seccion;
    
    //Constructores:

    public Alumno() {
    }    
    //Constructor

    public Alumno(String carnet, String grado, String seccion, String nombres, String apellidos, Integer edad) {
        super(nombres, apellidos, edad);
        this.carnet = carnet;
        this.grado = grado;
        this.seccion = seccion;
    }
    
    //Encapsulamiento:
    public String getCarnet() {
        return carnet;
    }

    public String getGrado() {
        return grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "carnet=" + carnet + ", grado=" + 
                grado + ", seccion=" + seccion + '}';
    }
}

/*/git brinch
git switch developer
git merge ft/alumno
git status
para ver reporte de repositorio: git reflog
Historial del repositorio: git reflog
git push
git pull
git remote -v -> para ver a que repositorio mandar el codigo: git pull origin developer
/*/