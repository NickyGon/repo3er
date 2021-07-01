package visitor.basic;

public class Client {
    public static void main(String[]args){
        ConcreteElement concreteElement=new ConcreteElement();
        ConcreteElement2 concreteElement2=new ConcreteElement2();
        ConcreteElement3 concreteElement3=new ConcreteElement3();

        ConcreteVisitor concreteVisitor= new ConcreteVisitor();

        System.out.println("--------------");
        concreteElement.accept(concreteVisitor);
        System.out.println("--------------");
        concreteElement2.accept(concreteVisitor);
        System.out.println("--------------");
        concreteElement3.accept(concreteVisitor);
    }
}
