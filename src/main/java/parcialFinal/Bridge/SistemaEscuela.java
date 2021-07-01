package parcialFinal.Bridge;


public class SistemaEscuela implements iSistemasControl{
    private String nombre;
    private int capacidad;
    private Estudiante[] estudiantes;
    private String requisitos;


    public SistemaEscuela(String nombre, int capacidad, Estudiante[] estudiantes, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiantes = estudiantes;
        this.requisitos = requisitos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    @Override
    public void integrar(iRedesSociales redSocial) {
        redSocial.showData(this);
    }

    @Override
    public void info() {
        System.out.println("---------------");
        System.out.println("Escuela "+nombre);
        System.out.println("Capacidad de alumnos total: "+capacidad);
        System.out.println("Requisitos de entrada: "+requisitos);
        System.out.println("Alumnos inscritos: ");
        for (Estudiante estudiante: estudiantes){
            System.out.print("-");
            estudiante.info();
        }
        System.out.println("---------------");
    }
}
