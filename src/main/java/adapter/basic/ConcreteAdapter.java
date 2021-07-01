package adapter.basic;

public class ConcreteAdapter implements iAdapter{
    @Override
    public void metodo1() {
        System.out.println("INFO> ConcreteAdapter1> metodo1");
    }

    @Override
    public String metodo2() {
        System.out.println("INFO> ConcreteAdapter1> metodo1");
        return null;
    }

    @Override
    public int metodo3() {
        System.out.println("INFO> ConcreteAdapter1> metodo3");
        return 0;
    }
}
