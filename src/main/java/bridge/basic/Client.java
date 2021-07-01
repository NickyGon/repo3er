package bridge.basic;

public class Client {
    public static void main(String[]args){


        ConcreteAbstraction concreteAbstraction= new ConcreteAbstraction(new ConcreteImplementorA());
        concreteAbstraction.metodo1();
        concreteAbstraction.metodo2();


    }
}
