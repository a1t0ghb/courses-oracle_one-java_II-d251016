/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a1t0ghb.courses_oracle_one.course_java_ii.computations;

/**
 *
 * @author a1t0ghb
 */
public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion) {
        
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy bien evaluado en el momento.");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en el momento.");
        } else {
            System.out.println("No tan recomendado.");
        }
        
    }

}
//  EOF.