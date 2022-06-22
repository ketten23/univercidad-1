/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univerciodad.pkg1;

/**
 *
 * @author Juwer
 */
public class profesor extends persona{
    
    private String materia;
    private String cargo;

    public profesor() {
    }

    public profesor(String materia, String cargo) {
        this.materia = materia;
        this.cargo = cargo;
    }

    public profesor(String materia, String cargo, String nombre, int edad) {
        super(nombre, edad);
        this.materia = materia;
        this.cargo = cargo;
    }

   

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
