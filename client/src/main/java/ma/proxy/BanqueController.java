
package ma.proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueController", targetNamespace = "http://ws.ma/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueController {


    /**
     * 
     * @return
     *     returns java.util.List<ma.proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws.ma/", className = "ma.proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws.ma/", className = "ma.proxy.ListComptesResponse")
    @Action(input = "http://ws.ma/BanqueController/listComptesRequest", output = "http://ws.ma/BanqueController/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns ma.proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompteByCode", targetNamespace = "http://ws.ma/", className = "ma.proxy.GetCompteByCode")
    @ResponseWrapper(localName = "getCompteByCodeResponse", targetNamespace = "http://ws.ma/", className = "ma.proxy.GetCompteByCodeResponse")
    @Action(input = "http://ws.ma/BanqueController/getCompteByCodeRequest", output = "http://ws.ma/BanqueController/getCompteByCodeResponse")
    public Compte getCompteByCode(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToDh", targetNamespace = "http://ws.ma/", className = "ma.proxy.ConversionEuroToDh")
    @ResponseWrapper(localName = "conversionEuroToDhResponse", targetNamespace = "http://ws.ma/", className = "ma.proxy.ConversionEuroToDhResponse")
    @Action(input = "http://ws.ma/BanqueController/conversionEuroToDhRequest", output = "http://ws.ma/BanqueController/conversionEuroToDhResponse")
    public double conversionEuroToDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
