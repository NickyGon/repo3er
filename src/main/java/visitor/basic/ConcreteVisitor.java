package visitor.basic;

public class ConcreteVisitor implements iVisit{


    @Override
    public void visit(ConcreteElement concreteElement) {
        System.out.println("***Algoritmo***");
        System.out.println("para el ConcreteElement1");
    }

    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        System.out.println("***Algoritmo***");
        System.out.println("para el ConcreteElement2");
    }

    @Override
    public void visit(ConcreteElement3 concreteElement3) {
        System.out.println("***Algoritmo***");
        System.out.println("para el ConcreteElement3");
    }
}
