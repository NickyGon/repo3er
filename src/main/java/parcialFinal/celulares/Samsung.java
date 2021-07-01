package parcialFinal.celulares;

public class Samsung implements iCelular {
    private int ram;
    private int almacenamiento;
    private int cpu;
    private int precio;
    private String modelo;

    public Samsung(int ram, int almacenamiento, int cpu, int precio, String modelo) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precio = precio;
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("------------");
        System.out.println("Precio del celular "+modelo+": "+precio);
        System.out.println("Almacenamiento: "+almacenamiento);
        System.out.println("RAM: "+ram);
        System.out.println("CPU: "+cpu);
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio=precio;
    }

    @Override
    public int getAlmac() {
        return almacenamiento;
    }

    @Override
    public void setAlmac(int almacenamiento) {
        this.almacenamiento=almacenamiento;
    }
}
