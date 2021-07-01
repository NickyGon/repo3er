package parcialFinal.Bridge;

public class Estudiante {
    private int ci;
    private String nombre;
    private int id;

    public Estudiante(int ci, String nombre, int id) {
        this.ci = ci;
        this.nombre = nombre;
        this.id = id;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void info(){
        System.out.println(nombre+"("+ci+"). ID: "+id);
    }
}
