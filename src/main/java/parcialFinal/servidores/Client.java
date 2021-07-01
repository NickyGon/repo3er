package parcialFinal.servidores;

public class Client {
    public static void main(String[]args){
        Proxy proxy= new Proxy("192.168.0.1","67");
        Usuario usuario= new Usuario("Nicole","pit","4a");
        Usuario usuario1= new Usuario("Umi","rott","4b");
        Usuario usuario2= new Usuario("Dino","umami","4c");

        proxy.registrar(usuario);
        proxy.registrar(usuario1);
        proxy.registrar(usuario2);
        proxy.login("Nicole","dit");
        proxy.login("Umi","po12345");
        proxy.login("Umi","rott");
        proxy.login("Nicole","pit");
        proxy.login("Dino","po1234");
        proxy.login("Dino","umami");

    }
}
