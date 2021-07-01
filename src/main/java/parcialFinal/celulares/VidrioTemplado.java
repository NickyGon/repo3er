package parcialFinal.celulares;

public class VidrioTemplado extends Decorando {
    private int precio=30;
    public VidrioTemplado(iCelular celular) {
        super(celular);
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Aumentando vidrio templado de "+precio+"Bs!");
        super.setPrecio(super.getPrecio()+precio);
        super.mostrarInfo();
    }
}
