package parcialFinal.cuadratracks;

public class CuadraAdaptadoElectrico implements iCuadratracks {
    private cuadraElectrico cuadraElectrico;

    public CuadraAdaptadoElectrico(cuadraElectrico cuadraElectrico) {
        this.cuadraElectrico = cuadraElectrico;
        System.out.println("Adaptando al auto electrico a la familia");
    }

    @Override
    public void llenarGasolina() {
        System.out.println("Adaptando la carga");
        this.cuadraElectrico.cargar();
    }

    @Override
    public void verEstadoCombustible() {
        this.cuadraElectrico.setLimit(50);
        System.out.println("Adaptando la revision");
        this.cuadraElectrico.estadoDeElectricidad();
        this.cuadraElectrico.setLimit(10);
    }
}
