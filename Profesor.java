import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor
{
    //Un ArrayList que almacena a los evaluadores
    private ArrayList<Evaluadores> evalua;
    //Un ArrayList que almacena las propuestas
    private ArrayList<Propuestas> proyecto;
    
    

    /**
     * Constructor for objects of class Profesor
     */
    public Profesor()
    {
       evalua = new ArrayList<Evaluadores>();
       proyecto = new ArrayList<Propuestas>();
    }

    /**
     *Metodo que registra evaluadores
     *
     */
    public void registrarEvaluador(Evaluadores nombre)
    {
        evalua.add(nombre);
        
    }
    /**
     * Metodo que registra propuestas
     */
    public void registrarPropuestas(Propuestas nombre)
    {
        proyecto.add(nombre);
    }
    
    /**
     * Metodo que reparte propuestas a los evaluadores
     */
    public void repartir()
    {
       
       Iterator<Propuestas> it = proyecto.iterator();
       while(it.hasNext())
       {
            Propuestas propu = it.next();
            evalua.registrarPropuestas(propu);
            
            
       }
            
        
    }
}
