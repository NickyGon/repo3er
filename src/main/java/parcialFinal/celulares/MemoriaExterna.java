package parcialFinal.celulares;

public class MemoriaExterna extends Decorando {
    private int memoria;
    public MemoriaExterna(iCelular celular, int memoria) {
        super(celular);
        this.memoria=memoria;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Aumentando Memoria externa de "+memoria+"GB!");
        super.setAlmac(super.getAlmac()+memoria);
        super.setPrecio((int) (super.getPrecio()+(memoria*0.5)));
        super.mostrarInfo();
    }
}
