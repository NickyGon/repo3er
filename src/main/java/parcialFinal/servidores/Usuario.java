package parcialFinal.servidores;

public class Usuario {
    private String user;
    private String password;
    private String id;

    public Usuario(String user, String password, String id) {
        this.user = user;
        this.password = password;
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void showInfo(){
        System.out.println("Username: "+user);
        System.out.println("Password: "+password);
        System.out.println("Email: "+ id);
    }
}
