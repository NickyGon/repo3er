package parcialFinal.Bridge;

public class Facebook implements iRedesSociales{
    @Override
    public void showData(iSistemasControl sistemasControl) {
        System.out.println("*****Integrando a Facebook!******");
        sistemasControl.info();
    }
}
