/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_ii_challenge_app_audio_player;

//  IMPORTS: external classes and interfaces.
import a1t0ghb.courses_oracle_one.course_java_ii_challenge_app_audio_player.computations.MisFavoritos;
import a1t0ghb.courses_oracle_one.course_java_ii_challenge_app_audio_player.models.Cancion;
import a1t0ghb.courses_oracle_one.course_java_ii_challenge_app_audio_player.models.Podcast;

/**
 *
 * @author a1t0ghb
 */
public class App {

    public static void main(String[] args) {
        
        //  INITIALIZATION OF INSTANCES.

        //  Instance: 'Cancion'.
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");                 //  Inherited from 'Audio'.
        miCancion.setCantante("KISS");                  //  Class OWN method.

        //  Assigns 100 'me gusta' to 'miCancion'.
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();                        //  Inherited from 'Audio'.
        }
        //  Assigns 2000 plays to 'miCancion'.
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();                      //  Inherited from 'Audio'.
        }

        //  Instance: 'Podcast'.
        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Cafe.Tech");               //  Inherited from 'Audio'.
        miPodcast.setPresentador("Gabriela Aguiar");    //  Class OWN method.

        //  Assigns 100 'me gusta' to 'miPodcast'.
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();                        //  Inherited from 'Audio'.
        }
        //  Assigns 8000 plays to 'miPodcast'.
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();                      //  Inherited from 'Audio'.
        }

        //  Validates values of newly created instance 'miCancion'.
        System.out.println("Total reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total me gusta: " + miCancion.getTotalDeMeGusta());

        //  Instance: 'MisFavoritos'.
        MisFavoritos miFavoritos = new MisFavoritos();

        //  Validates values of newly created instance 'misFavoritos'.
        miFavoritos.adicione(miCancion);                //  Method receives an `Audio` INSTANCE (or it's 'child's classes; e.g. 'Cancion', or 'Podcast').
        miFavoritos.adicione(miPodcast);                //  Method receives an `Audio` INSTANCE (or it's 'child's classes; e.g. 'Cancion', or 'Podcast').

    }
}
//  EOF.