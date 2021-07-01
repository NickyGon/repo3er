package proxy.basic;

public class Client {
    public static void main(String[]args){
        Proxy proxy= new Proxy();
        proxy.setAttribute1(60);
        proxy.request();
    }
}
