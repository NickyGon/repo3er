package parcialFinal.Bridge;


import java.util.Arrays;
import java.util.stream.Stream;

public class Client {
    public static void main(String[]args){
        iRedesSociales facebook= new Facebook();
        iRedesSociales twitter= new Twitter();
        iRedesSociales whatsapp= new Whatsapp();
        Estudiante[] estudiantes= new Estudiante[5];
        estudiantes[0]=new Estudiante(122,"Nicole",12);
        estudiantes[1]=new Estudiante(123,"Paulo",13);
        estudiantes[2]=new Estudiante(124,"Genia",14);
        estudiantes[3]=new Estudiante(125,"Nicolas",15);
        estudiantes[4]=new Estudiante(126,"Eynar",16);

        Estudiante[] estudiantes1= new Estudiante[5];
        estudiantes1[0]=new Estudiante(122,"Nero",512);
        estudiantes1[1]=new Estudiante(123,"Pipo",513);
        estudiantes1[2]=new Estudiante(124,"Gordon",514);
        estudiantes1[3]=new Estudiante(125,"Sin",515);
        estudiantes1[4]=new Estudiante(126,"Eduardo",516);

        Estudiante[] estudiantes2=new Estudiante[5];
        estudiantes2[0]=new Estudiante(122,"Nero",5412);
        estudiantes2[1]=new Estudiante(123,"Paulo",5413);
        estudiantes2[2]=new Estudiante(124,"Gordon",5414);
        estudiantes2[3]=new Estudiante(125,"Sin",5415);
        estudiantes2[4]=new Estudiante(126,"Eduardo",5146);
        iSistemasControl sistemasCol=new SistemaColegio("Santa Maria",1200,estudiantes,"Calificaciones de mas de 70 en anterior colegio");
        sistemasCol.integrar(facebook);
        iSistemasControl sistemasEsc=new SistemaEscuela("San Simon",1300,estudiantes1,"Ninguno");
        sistemasEsc.integrar(twitter);
        iSistemasControl sistemasUni= new SistemaUniversidad("UPB",150000,estudiantes2,"Tener notas mayores a 90 en colegio");
        sistemasUni.integrar(whatsapp);
    }
}
