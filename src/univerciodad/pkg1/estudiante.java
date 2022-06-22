/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univerciodad.pkg1;

/**
 *
 * @author Juwer
 */
public class estudiante  extends persona{
    
    private String carrera;
    private int legajo;

    public estudiante() {
    }

    public estudiante(String carrera, int legajo) {
        this.carrera = carrera;
        this.legajo = legajo;
    }

    public estudiante(String carrera, int legajo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.legajo = legajo;
    }

    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
