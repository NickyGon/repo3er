package parcialFinal.cuadratracks;

public class cuadraElectrico implements iCuadratracksElec {
    private int limit=10;
    private int carga;
    private int estadobateria;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void cargar() {
        carga=0+(int) (Math.random() * ((20 - 0)+1));
        System.out.println("Cargando la bateria del "+this.getClass().getSimpleName()+" en "+carga);
    }

    @Override
    public void estadoDeElectricidad() {
        estadobateria=1+(int) (Math.random() * ((limit- 1)+1));
        System.out.println("Estado de la bateria del "+this.getClass().getSimpleName()+": "+estadobateria+"%");
    }
}
