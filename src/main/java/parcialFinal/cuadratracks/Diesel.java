package parcialFinal.cuadratracks;

public class Diesel implements iCuadratracks {
    private int limit=50;
    private int llenado;
    private int estadocombustible;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void llenarGasolina() {
        llenado= 0+(int) (Math.random() * ((100 - 0)+1));
        System.out.println("Llenando la gasolina del "+this.getClass().getSimpleName()+" en "+llenado);
    }

    @Override
    public void verEstadoCombustible() {
        estadocombustible=1+(int) (Math.random() * ((limit- 1)+1));
        System.out.println("Estado de combustible del "+this.getClass().getSimpleName()+": "+estadocombustible+"%");
    }
}
