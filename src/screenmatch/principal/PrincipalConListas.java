package screenmatch.principal;

import screenmatch.modelos.Pelicula;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(10);
        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(7);
        Serie casaDragon = new Serie("La casa del dragón",2022);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula) {//algo no muy recomendado hacer solo para cuestion del curso
                Pelicula pelicula = (Pelicula) item; //Hacemos un casteo para cambiar el objeto iterado a Pelicula
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Jennifer Lawrence");
        listaArtistas.add("Eiza Gonzales");
        listaArtistas.add("Chris Evans");

        Collections.sort(listaArtistas);
        System.out.println("La lista de artistas ordenada: " + listaArtistas);

        Collections.sort(lista);
        System.out.println("Lista titutlos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por año: "+lista);

    }
}
