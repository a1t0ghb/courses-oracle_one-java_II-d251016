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
public class Cancion extends Audio {

    //  ATTRIBUTES DECLARATION.
    private String album;
    private String cantante;
    private String genero;
    
    //  ATTRIBUTE'S 'GETTERS'.
    public String getAlbum() {
        return album;
    }
    public String getCantante() {
        return cantante;
    }
    public String getGenero() {
        return genero;
    }

    //  ATTRIBUTE'S 'SETTERS': public, by default.
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //  INHERITED METHODS TO OVERRIDE: custom definitions for CURRENT class.
    @Override
    public int getClasificacion() {
        // return super.getClasificacion();                //  Default: calls super class (i.e. keyword 'super') method.
        if (super.getTotalDeMeGusta() > 5000) {
            return 8;
        } else {
            return 4;
        }
    }

    //  METHODS FROM 'IMPLEMENTS'.

    //  REGULAR METHODS.

}
//  EOF.