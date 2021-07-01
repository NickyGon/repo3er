package parcialFinal.Bridge;

public class Client {
    public static void main(String[]args){
        iRedesSociales facebook= new Facebook();
        Estudiante[] estudiantes= new Estudiante[5];
        estudiantes[0]=new Estudiante(122,"Nicole",12);
        estudiantes[1]=new Estudiante(123,"Paulo",13);
        estudiantes[2]=new Estudiante(124,"Genia",14);
        estudiantes[3]=new Estudiante(125,"Nicolas",15);
        estudiantes[4]=new Estudiante(126,"Eynar",16);
        iSistemasControl sistemasCol=new SistemaColegio("Santa Maria",1200,estudiantes,"Calificaciones de mas de 70 en anterior colegio");
        sistemasCol.integrar(facebook);
    }
}
