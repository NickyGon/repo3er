package adapter.basic;

public class Client {
    public static void main(String[]args){
        ConcreteObject adaptee= new ConcreteObject();

        ConcreteAdapter concreteAdapter= new ConcreteAdapter();
        ConcreteAdapter2 concreteAdapter2= new ConcreteAdapter2();
        ConcreteAdapter3 concreteAdapter3= new ConcreteAdapter3();
        ConcreteAdapterObject concreteAdapterObject= new ConcreteAdapterObject(adaptee);

        concreteAdapter.metodo1();
        concreteAdapter2.metodo1();
        concreteAdapter3.metodo1();
        concreteAdapterObject.metodo1();
        concreteAdapterObject.metodo2();
        concreteAdapterObject.metodo3();
    }
}
