
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalSystemConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalSystemConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clustersConfigurations" type="{}clusterConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mtusInformation" type="{}mtuInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalSystemConfiguration", propOrder = {
    "accountId",
    "clustersConfigurations",
    "mtusInformation"
})
public class GlobalSystemConfiguration {

    protected String accountId;
    @XmlElement(nillable = true)
    protected List<ClusterConfiguration> clustersConfigurations;
    @XmlElement(nillable = true)
    protected List<MtuInformation> mtusInformation;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the clustersConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterConfiguration }
     * 
     * 
     */
    public List<ClusterConfiguration> getClustersConfigurations() {
        if (clustersConfigurations == null) {
            clustersConfigurations = new ArrayList<ClusterConfiguration>();
        }
        return this.clustersConfigurations;
    }

    /**
     * Gets the value of the mtusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MtuInformation }
     * 
     * 
     */
    public List<MtuInformation> getMtusInformation() {
        if (mtusInformation == null) {
            mtusInformation = new ArrayList<MtuInformation>();
        }
        return this.mtusInformation;
    }

}
