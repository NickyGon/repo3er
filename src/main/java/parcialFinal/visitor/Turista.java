package parcialFinal.visitor;

import java.util.Random;

public class Turista implements iVisitor{
    private String nombre;
    private int dinero;
    private int ci;

    public Turista(String nombre, int dinero, int ci) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.ci = ci;
    }



    public void info(){
        System.out.println("-------------------------");
        System.out.println(nombre+"("+ci+")");
        System.out.println("Dinero en cuenta: "+dinero);
    }
    Random rand = new Random();
    @Override
    public void viajar(LaPaz laPaz) {
        info();
        System.out.println("Viajando a La Paz...");
        int gastado=Math.abs(rand.nextInt(dinero));
        System.out.println("Gastando en La Paz Bs "+gastado);
        dinero=dinero-gastado;
        laPaz.setDineroTurismo(gastado);
        laPaz.info();
    }

    @Override
    public void viajar(Cochabamba cochabamba) {
        info();
        System.out.println("Viajando a Cochabamba...");
        int gastado= (int) (cochabamba.getnHabitantes()*0.1);
        System.out.println("Gastando en Cochabamba Bs "+gastado);
        dinero=dinero-gastado;
        cochabamba.setDineroTurismo(gastado);
        cochabamba.info();
    }

    @Override
    public void viajar(SantaCruz santaCruz) {
        info();
        System.out.println("Viajando a Santa Cruz...");
        int gastado= (int) (santaCruz.getNumeroProv()*0.5);
        System.out.println("Gastando en Santa Cruz Bs "+gastado);
        dinero=dinero-gastado;
        santaCruz.setDineroTurismo(gastado);
        santaCruz.info();
    }
}
