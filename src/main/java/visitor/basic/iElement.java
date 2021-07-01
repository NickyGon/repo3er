package visitor.basic;

public interface iElement {
    String metodo1();
    int metodo2();
    void metodo3();

    //accept

    void accept(iVisit visitante);
}
