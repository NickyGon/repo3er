package parcialFinal.Bridge;

public class Whatsapp implements iRedesSociales{
    @Override
    public void showData(iSistemasControl sistemasControl) {
        System.out.println("****Integrando a Whatsapp!****");
        sistemasControl.info();
    }
}
