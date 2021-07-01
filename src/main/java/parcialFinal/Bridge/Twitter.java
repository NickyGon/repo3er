package parcialFinal.Bridge;

public class Twitter implements iRedesSociales{
    @Override
    public void showData(iSistemasControl sistemasControl) {
        System.out.println("Integrando a Twitter! ");
        sistemasControl.info();
    }
}
