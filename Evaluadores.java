import java.util.ArrayList;
/**
 * Write a description of class Evaluadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evaluadores
{
    // Un ArrayList que almacena los proyectos
    private ArrayList<Propuestas> proyecto ;
    //Indica el nombre del evaluador
    private String nombreEvaluador;
    /**
     * Constructor for objects of class Evaluadores
     */
    public Evaluadores(String nombreEvaluador)
    {
       proyecto = new ArrayList<Propuestas>();
       this.nombreEvaluador = nombreEvaluador;
    }

    /**
     * Metodo que añade propuestas
     */
    public void añadirPropuesta(Propuestas propuesta )
    {
        
        proyecto.add(propuesta);
    }
    
    
    /**
     * Metodo que muestra por pantalla las propuestas añadidas
     */
    public void mostrarPropuestasAsignadas()
    {
        for(Propuestas propu : proyecto)
        {
            System.out.println("Propuesta de " + propu.getName());
        }
    }
}
