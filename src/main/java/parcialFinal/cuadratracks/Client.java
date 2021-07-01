package parcialFinal.cuadratracks;



public class Client {
    public static void main(String[]args){
        cuadraElectrico cuadraElectrico=new cuadraElectrico();

        Diesel cuadra= new Diesel();
        GasolinaEspecial XL= new GasolinaEspecial();
        Gasolina quadra2=new Gasolina();

        cuadra.llenarGasolina();
        cuadra.verEstadoCombustible();

        XL.llenarGasolina();
        XL.verEstadoCombustible();

        quadra2.llenarGasolina();
        quadra2.verEstadoCombustible();

        CuadraAdaptadoElectrico mini2=new CuadraAdaptadoElectrico(cuadraElectrico);
        mini2.llenarGasolina();
        mini2.verEstadoCombustible();

    }
}
