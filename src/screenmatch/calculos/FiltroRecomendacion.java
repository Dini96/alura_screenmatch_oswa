package screenmatch.calculos;
import screenmatch.calculos.Clasificacion;

public class FiltroRecomendacion {
    public void filtro(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Es recomendado por otros usuarios");
        }else if(clasificacion.getClasificacion() >= 2){
            System.out.println("popular por el momento");
        }else{
            System.out.println("Colocalo en tu lista para verlo después");
        }
    }
}
