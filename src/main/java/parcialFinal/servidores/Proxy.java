package parcialFinal.servidores;




import java.util.LinkedHashMap;
import java.util.Map;

public class Proxy implements iClusterServer {
    private Server1 server1Users=new Server1("MakoApp","2.10","Java");
    private Server2 server2Users= new Server2("MakoApp","2.10","Java");
    private String ip;
    private String port;
    private int entry=0;

    private Map<String, Usuario> usuarioMapSave=new LinkedHashMap<>();

    private Map<Integer,String> usuarioLogin=new LinkedHashMap<>();
    private Map<String,Boolean> usuarioAccessMap= new LinkedHashMap<>();



    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Proxy(String ip, String port) {
        this.ip = ip;
        this.port = port;
        System.out.println("Inicializando proxy...");
        System.out.println("IP: "+ip);
        System.out.println("Puerto: "+port);
    }


    @Override
    public void registrar(Usuario usuario) {
        usuarioMapSave.put(usuario.getPassword(),usuario);
    }

    @Override
    public void login(String user, String password) {
        entry++;
        usuarioLogin.put(entry,user);
        if (usuarioMapSave.containsKey(password) && usuarioMapSave.get(password).getUser().equals(user)){
            System.out.println("***Su acceso ha sido correcto, "+usuarioMapSave.get(password).getUser());
            usuarioAccessMap.put(user,true);
            for (Map.Entry<Integer,String> mapEntry: usuarioLogin.entrySet()){
                if (mapEntry.getValue().equals(usuarioMapSave.get(password).getUser()) && !prime(mapEntry.getKey())){
                    System.out.println("Ingreso en posición de numero no primo, se lo llevará al servidor 2");
                    server2Users.login(user,password);
                } else if (mapEntry.getValue().equals(usuarioMapSave.get(password).getUser()) && prime(mapEntry.getKey())){
                    System.out.println("Ingreso en posición de numero primo, se lo llevará al servidor 1");
                    server1Users.login(user,password);
                }
            }
        } else {
            System.out.println("***Acceso denegado. Usuario o contraseña incorrectos");
            usuarioAccessMap.put(user,false);
        }
        System.out.println("-------------Logins guardados en el proxy-------------");
        for (Map.Entry<Integer,String>mapEntry: usuarioLogin.entrySet()){
            System.out.println("- "+mapEntry.getKey()+": "+mapEntry.getValue()+". Acceso correcto: "+usuarioAccessMap.get(mapEntry.getValue()));
        }
    }

    public boolean prime(int number){
        int divisors=0;
        for (int i=1;i<=number;i++){
            if (number==2 || number==3){
                return true;
            } else if (number==1){
                return false;
            } else {
                if (number > 1 && number % i == 0) {
                    divisors++;
                }
            }
        }
        if (divisors==2){
            return true;
        } else{
            return false;
        }



    }
}
