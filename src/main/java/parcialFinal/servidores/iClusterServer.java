package parcialFinal.servidores;

public interface iClusterServer {
    void registrar(Usuario usuario);
    void login(String user, String password);
}
