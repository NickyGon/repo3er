package parcialFinal.visitor;

public class LaPaz implements iDepartment{
    private String nombre;
    private int numeroProv;
    private int nHabitantes;
    private String clima;
    private int dineroTurismo;

    public LaPaz( int numeroProv, int nHabitantes, String clima, int dineroTurismo) {
        this.nombre = "La Paz";
        this.numeroProv = numeroProv;
        this.nHabitantes = nHabitantes;
        this.clima = clima;
        this.dineroTurismo = dineroTurismo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroProv() {
        return numeroProv;
    }

    public void setNumeroProv(int numeroProv) {
        this.numeroProv = numeroProv;
    }

    public int getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getDineroTurismo() {
        return dineroTurismo;
    }

    public void setDineroTurismo(int dineroTurismo) {
        this.dineroTurismo = dineroTurismo;
    }

    @Override
    public void viajar(iVisitor visitante) {
        visitante.viajar(this);
    }
}
