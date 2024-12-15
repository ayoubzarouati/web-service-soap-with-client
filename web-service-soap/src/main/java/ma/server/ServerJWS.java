package ma.server;

import jakarta.xml.ws.Endpoint;
import ma.ws.BanqueController;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:2001/";
        Endpoint.publish(url, new BanqueController());
        System.out.println("Web service déployé sur "+url);
    }
}
