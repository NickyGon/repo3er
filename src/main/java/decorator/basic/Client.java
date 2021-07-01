package decorator.basic;

public class Client {
    public static void main(String[]args){
        Component torta= new ConcreteComponent();

        torta=new DecoratorConcrete(torta);
        torta= new DecoratorConcrete2(torta);

        torta.operation();
    }
}
