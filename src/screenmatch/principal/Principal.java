package screenmatch.principal;

import screenmatch.calculos.CalculadoraDeTiempo;
import screenmatch.calculos.FiltroRecomendacion;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Pelicula;
import screenmatch.modelos.Serie;

import java.util.ArrayList;


public class  Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragón",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalDeVisualizaciones(50);

        filtroRecomendacion.filtro(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setNombre("El señor de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("Tamaño de la lista es: "+ listaDePeliculas.size());
        System.out.println("La primera pelicula es : " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);




    }
}