
public class Estudiante{

    private String nombre;
    private int edad;

    public Estudiante(){}

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String GetNombre(){
    
    return this.nombre;
    }

    public int GetEdad(){
    
    return this.edad;
    }

    public int EdadMaxima(Estudiante[] estudiante)
    {
        estudiante = Ordenar(estudiante);
        int edadmaxima = estudiante[estudiante.length-1].GetEdad();

    return  edadmaxima;
    }
    
    public int EdadMinima(Estudiante[] estudiante)
    {
        estudiante = Ordenar(estudiante);
        int edadminima = estudiante[0].GetEdad();

    return  edadminima;
    }

    public int EdadPromedio(Estudiante[] estudiante)
    {
        int edadpromedio;
        int sumatoria = 0;
        for(int i =0; i<estudiante.length; i++){
            sumatoria += estudiante[i].GetEdad();
        }
        edadpromedio = (sumatoria/estudiante.length);

    return edadpromedio;
    }

    public int TotalEstudiantes(Estudiante[] estudiante)
    {
        int Catidadestudiantes = 0;

        for(int i =0; i<estudiante.length; i++){
            Catidadestudiantes++;
        }

    return Catidadestudiantes;
    }

    private Estudiante[] Ordenar(Estudiante[] estudiante){
        Estudiante auxiliar = estudiante[0];
        for (int i=0; i<estudiante.length; i++)
        {
            for (int j=i+1; j<estudiante.length; j++)
            {
                if(estudiante[i].GetEdad() > estudiante[j].GetEdad())
                {
                auxiliar = estudiante[i];
                estudiante[i] = estudiante[j];
                estudiante[j] = auxiliar;
                }
            }
        }
            
            return estudiante;
    }
}