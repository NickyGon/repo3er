package parcialFinal.servidores;

public class Server2 implements iClusterServer {
    private String appName;
    private String appVersion;
    private String appLanguage;


    public Server2() {
    }

    public Server2(String appName, String appVersion, String appLanguage) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appLanguage = appLanguage;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppLanguage() {
        return appLanguage;
    }

    public void setAppLanguage(String appLanguage) {
        this.appLanguage = appLanguage;
    }


    @Override
    public void registrar(Usuario usuario) {
        System.out.println("Usuario registrado: ");
        usuario.showInfo();
    }

    @Override
    public void login(String user, String password) {
        System.out.println("Bienvenido, "+user);
        System.out.println("Acceso al Server 2 concedido");
        System.out.println("Conectado a la app: "+appName+" "+appVersion+" ("+appLanguage+" )" );
    }
}
