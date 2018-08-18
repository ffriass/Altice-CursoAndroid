
public class Main{

    public static void main(String[] args){

        Estudiante[] estudiantes ={
        new Estudiante("Juan",24),
        new Estudiante("Erika",20),
        new Estudiante("Emilio",23),
        new Estudiante("Karina",21),
        new Estudiante("Eduardo",24),
        new Estudiante("Tomas",25)
        };

        Estudiante objEstudiante = new Estudiante();

        System.out.println("\n Edad Maxima        : "+objEstudiante.EdadMaxima(estudiantes)+ 
                         "\n Edad Minima        : "+ objEstudiante.EdadMinima(estudiantes)+
                         "\n Edad Promedio      : " + objEstudiante.EdadPromedio(estudiantes)+
                         "\n Total Estudiantes  : "+objEstudiante.TotalEstudiantes(estudiantes)); 

    }
}