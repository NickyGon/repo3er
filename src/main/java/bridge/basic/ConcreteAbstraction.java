package bridge.basic;

public class ConcreteAbstraction implements iAbstraction{

    private iImplementor implementor= new ConcreteImplementorA();


    public ConcreteAbstraction(iImplementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void metodo1() {
        System.out.println("ConcreteAbstraction> metodo1");
        implementor.operation1();
        implementor.operation2();
        implementor.operation3();
    }

    @Override
    public void metodo2() {
        System.out.println("ConcreteAbstraction> metodo2");
        implementor.operation2();
    }
}
