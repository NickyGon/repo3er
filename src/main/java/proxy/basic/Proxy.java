package proxy.basic;

public class Proxy implements iSubject{

    private int attribute1;

    private RealSubject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public RealSubject getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        if (attribute1>50){
            System.out.println("Utilizando objeto real");
            this.realSubject.request();
        } else {
            System.out.println("Valor no permitido para utilizar el objeto real: "+attribute1);
        }
    }
}
