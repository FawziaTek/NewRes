
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getContractDetailsForResiliationResponse complex type.
 * 
 * <p>Le fragment de sch?ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getContractDetailsForResiliationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://manager.ws.resiliation.billcom.com/}getListOrdersResiliationResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContractDetailsForResiliationResponse", propOrder = {
    "_return"
})
public class GetContractDetailsForResiliationResponse {

    @XmlElement(name = "return")
    protected GetListOrdersResiliationResponse _return;

    /**
     * Obtient la valeur de la propri?t? return.
     * 
     * @return
     *     possible object is
     *     {@link GetListOrdersResiliationResponse }
     *     
     */
    public GetListOrdersResiliationResponse getReturn() {
        return _return;
    }

    /**
     * D?finit la valeur de la propri?t? return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetListOrdersResiliationResponse }
     *     
     */
    public void setReturn(GetListOrdersResiliationResponse value) {
        this._return = value;
    }

}
