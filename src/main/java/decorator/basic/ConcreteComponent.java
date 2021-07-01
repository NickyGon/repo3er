package decorator.basic;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        //logica
        System.out.println("ConcreteComponent> operation");
    }
}
