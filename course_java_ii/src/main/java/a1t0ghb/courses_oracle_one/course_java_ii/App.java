/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_ii;

//  IMPORTS: external classes and interfaces.
import a1t0ghb.courses_oracle_one.course_java_ii.computations.CalculadoraDeTiempo;
import a1t0ghb.courses_oracle_one.course_java_ii.computations.FiltroRecomendacion;
import a1t0ghb.courses_oracle_one.course_java_ii.models.Episodio;
import a1t0ghb.courses_oracle_one.course_java_ii.models.Pelicula;
import a1t0ghb.courses_oracle_one.course_java_ii.models.Serie;

/**
 *
 * @author a1t0ghb
 */
public class App {

    public static void main(String[] args) {

        //  Initialization of a 1st INSTANCE of a class 'Pelicula'.
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        //  Validate in console.
        miPelicula.muestraFichaTecnica();

        //  Validation of proper capture of movie ratings.
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        // System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        // //  Initialization of another INSTANCE of a class 'Pelicula'.
        // Pelicula otraPelicula = new Pelicula();
        // otraPelicula.nombre = "Matrix";
        // otraPelicula.fechaDeLanzamiento = 1998;
        // otraPelicula.duracionEnMinutos = 180;
        // //  Validate in console.
        // otraPelicula.muestraFichaTecnica();

        //  Initialization of an INSTANCE of a class 'Serie'.
        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");                 //  Inherited from class 'Titulo'.
        casaDragon.setFechaDeLanzamiento(2022);                     //  Inherited from class 'Titulo'.
        casaDragon.setTemporadas(1);                                //  From own class 'Serie'.
        casaDragon.setMinutosPorEpisodio(50);                       //  From own class 'Serie'.
        casaDragon.setEpisodiosPorTemporada(10);                    //  From own class 'Serie'.
        //  Validate in console.
        casaDragon.muestraFichaTecnica();                           //  Inherited from class 'Titulo'.
        System.out.println(casaDragon.getDuracionEnMinutos());      //  Initally inherited from class 'Titulo', but later custom OVERRIDED in own class 'Serie'.

        //  Initialization of an INSTANCE of a class 'CalculadoraDeTiempo', which can be seen as a class with computations for classes 'Titulo' and its 'childs'.
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);                            //  A 'Pelicula'; child of class 'Titulo'.
        calculadora.incluye(casaDragon);                            //  A 'Serie'; child of class 'Titulo'.
        System.out.println("Tiempo necesario para ver tus títulos: " + calculadora.getTiempoTotal() + " minutos.");

        //  Initialization of an INSTANCE of a class 'Episodio'.
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La Casa Tragaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        //  Initialization of an INSTANCE of class 'FiltroRecomendacion', to implement based on previous INSTANCES created.
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        //  Get recommendation from intrinsic interface implemented in 'Pelicula' class.
        filtroRecomendacion.filtra(miPelicula);
        //  Get recommendation from intrinsic interface implemented in 'Episodio' class.
        filtroRecomendacion.filtra(episodio);

    }

}
//  EOF.