package parcialFinal.celulares;

public class Carcasa extends Decorando {
    private int precio;
    public Carcasa(iCelular celular, int precio) {
        super(celular);
        this.precio=precio;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Aumentando carcasa de "+precio+"Bs!");
        super.setPrecio(super.getPrecio()+precio);
        super.mostrarInfo();
    }
}
