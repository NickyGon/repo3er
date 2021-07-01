package parcialFinal.visitor;

public class Client {
    public static void main(String[]args){
        LaPaz laPaz= new LaPaz(20,23000,"frio",0);
        SantaCruz santaCruz= new SantaCruz(15,56000,"templado",0);
        Cochabamba cochabamba= new Cochabamba(26,100000,"Caliente",0);
        iVisitor visitor= new Turista("Nicole",1000,1116792);
        visitor.viajar(laPaz);
        visitor.viajar(santaCruz);
        visitor.viajar(cochabamba);
    }
}
