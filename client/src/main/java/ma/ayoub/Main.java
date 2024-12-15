package ma.ayoub;

import ma.proxy.BanqueController;
import ma.proxy.BanqueWS;
import ma.proxy.Compte;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        BanqueController proxy = new BanqueWS().getBanqueControllerPort();
        System.out.println(proxy.conversionEuroToDh(5000));
        Compte cp = proxy.getCompteByCode(4);
        System.out.println("----------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCration());
        System.out.println(cp.getCode());
        System.out.println("-----------------------");
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach(c->{
            System.out.println("----------------------");
            System.out.println(c.getSolde());
            System.out.println(c.getDateCration());
            System.out.println(c.getCode());
            System.out.println("-----------------------");
        });

    }
}