package parcialFinal.servidores;

public class Client {
    public static void main(String[]args){
        Proxy proxy= new Proxy("192.168.0.0","H");
        Usuario usuario= new Usuario("NickyGon","pittie","4a");
        Usuario usuario1= new Usuario("Nicky","po1234","4b");
        Usuario usuario2= new Usuario("Nicky2","po12345","4c");

        proxy.registrar(usuario);
        proxy.registrar(usuario1);
        proxy.registrar(usuario2);
        proxy.login("NickyGon","pittie");
        proxy.login("Nic","po12345");
        proxy.login("Nick","po12345");
        proxy.login("Nicky","po1234");
        proxy.login("Nicky2","po12345");

    }
}
