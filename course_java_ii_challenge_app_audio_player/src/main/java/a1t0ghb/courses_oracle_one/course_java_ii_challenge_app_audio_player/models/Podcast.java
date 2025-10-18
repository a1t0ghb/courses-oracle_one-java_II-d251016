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
public class Podcast extends Audio {

    //  ATTRIBUTES DECLARATION.
    private String presentador;
    private String descripcion;
    
    //  ATTRIBUTE'S 'GETTERS'.
    public String getPresentador() {
        return presentador;
    }
    public String getDescripcion() {
        return descripcion;
    }

    //  ATTRIBUTE'S 'SETTERS': public, by default.
    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //  INHERITED METHODS TO OVERRIDE: custom definitions for CURRENT class.
    @Override
    public int getClasificacion() {
        // return super.getClasificacion();                //  Default: calls super class (i.e. keyword 'super') method.
        if (super.getTotalDeReproducciones() > 2000) {
            return 9;
        } else {
            return 2;
        }
    }

    //  METHODS FROM 'IMPLEMENTS'.

    //  REGULAR METHODS.

}
//  EOF.