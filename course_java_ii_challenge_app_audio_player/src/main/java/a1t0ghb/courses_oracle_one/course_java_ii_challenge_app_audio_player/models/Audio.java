/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_ii_challenge_app_audio_player.models;

//  IMPORTS: EXTERNAL classes and interfaces.

/**
 *
 * @author a1t0ghb
 */
public class Audio {

    //  ATTRIBUTES DECLARATION.
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    //  ATTRIBUTE'S 'GETTERS'.
    public String getTitulo() {
        return titulo;
    }
    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }
    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }
    public int getClasificacion() {
        return clasificacion;
    }

    //  ATTRIBUTE'S 'SETTERS': public, by default.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //  Private setter.
    private void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }
    //  Private setter.
    private void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }
    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    //  INHERITED METHODS TO OVERRIDE: custom definitions for CURRENT class.

    //  METHODS FROM 'IMPLEMENTS'.

    //  REGULAR METHODS.

    //  Increments 'totalDeReproducciones' by 1.
    public void reproduce() {
        // //  NOT RECOMMENDED: specially for 'parent' classes, use direct access / call to attributes.
        // totalDeReproducciones++;
        //  RECOMMENDED: use base 'getters' and 'setters' of attributes, so they are context / class AWARE.
        setTotalDeReproducciones(getTotalDeReproducciones() + 1);
    }

    //  Increments 'meGusta' by 1.
    public void meGusta() {
        // //  NOT RECOMMENDED: specially for 'parent' classes, use direct access / call to attributes.
        // totalDeMeGusta++;
        //  RECOMMENDED: use base 'getters' and 'setters' of attributes, so they are context / class AWARE.
        setTotalDeMeGusta(getTotalDeMeGusta() + 1);
    }

}
//  EOF.