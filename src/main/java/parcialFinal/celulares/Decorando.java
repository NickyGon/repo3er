package parcialFinal.celulares;

public class Decorando implements iCelular{
    private iCelular celular;

    public Decorando(iCelular celular) {
        this.celular = celular;
    }

    public iCelular getCelular() {
        return celular;
    }

    public void setCelular(iCelular celular) {
        this.celular = celular;
    }



    @Override
    public void mostrarInfo() {
        this.celular.mostrarInfo();
    }

    @Override
    public int getPrecio() {
        return celular.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        celular.setPrecio(precio);
    }

    @Override
    public int getAlmac() {
        return celular.getAlmac();
    }

    @Override
    public void setAlmac(int almac) {
        celular.setAlmac(almac);
    }
}
