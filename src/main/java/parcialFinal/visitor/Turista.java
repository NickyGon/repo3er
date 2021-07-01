package parcialFinal.visitor;

public class Turista implements iVisitor{
    private String nombre;
    private int dinero;
    private int ci;

    public Turista(String nombre, int dinero, int ci) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.ci = ci;
    }



    @Override
    public void viajar(LaPaz laPaz) {
        System.out.println("Viajando a La Paz con tu");
    }

    @Override
    public void viajar(Cochabamba cochabamba) {

    }

    @Override
    public void viajar(SantaCruz santaCruz) {

    }
}
