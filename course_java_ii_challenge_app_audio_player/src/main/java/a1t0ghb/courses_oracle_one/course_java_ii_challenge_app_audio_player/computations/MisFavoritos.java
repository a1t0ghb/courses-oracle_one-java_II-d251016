/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_ii_challenge_app_audio_player.computations;

//  IMPORTS: EXTERNAL classes and interfaces.
import a1t0ghb.courses_oracle_one.course_java_ii_challenge_app_audio_player.models.Audio;

/**
 *
 * @author a1t0ghb
 */
public class MisFavoritos {

    //  REGULAR METHODS.

    //  Prints a message to user, based on clasification of an `Audio` INSTANCE (or it's 'child's classes; e.g. 'Cancion', or 'Podcast').
    public void adicione(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento.");
        } else {
            System.out.println(audio.getTitulo() + " no es tan popular.");
        }
    }

}
//  EOF.