
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vplexArraySplitterSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vplexArraySplitterSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}arrayBasedSplitterSettings">
 *       &lt;sequence>
 *         &lt;element name="credentials" type="{}vplexSplitterCredentials" minOccurs="0"/>
 *         &lt;element name="credentialsStatus" type="{}splitterCredentialsStatus" minOccurs="0"/>
 *         &lt;element name="sameArrayConfiguredDirectorsInformation" type="{}vplexDirectorInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vplexArraySplitterSettings", propOrder = {
    "credentials",
    "credentialsStatus",
    "sameArrayConfiguredDirectorsInformation"
})
public class VplexArraySplitterSettings
    extends ArrayBasedSplitterSettings
{

    protected VplexSplitterCredentials credentials;
    protected SplitterCredentialsStatus credentialsStatus;
    @XmlElement(nillable = true)
    protected List<VplexDirectorInformation> sameArrayConfiguredDirectorsInformation;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link VplexSplitterCredentials }
     *     
     */
    public VplexSplitterCredentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link VplexSplitterCredentials }
     *     
     */
    public void setCredentials(VplexSplitterCredentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the credentialsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterCredentialsStatus }
     *     
     */
    public SplitterCredentialsStatus getCredentialsStatus() {
        return credentialsStatus;
    }

    /**
     * Sets the value of the credentialsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterCredentialsStatus }
     *     
     */
    public void setCredentialsStatus(SplitterCredentialsStatus value) {
        this.credentialsStatus = value;
    }

    /**
     * Gets the value of the sameArrayConfiguredDirectorsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sameArrayConfiguredDirectorsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameArrayConfiguredDirectorsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VplexDirectorInformation }
     * 
     * 
     */
    public List<VplexDirectorInformation> getSameArrayConfiguredDirectorsInformation() {
        if (sameArrayConfiguredDirectorsInformation == null) {
            sameArrayConfiguredDirectorsInformation = new ArrayList<VplexDirectorInformation>();
        }
        return this.sameArrayConfiguredDirectorsInformation;
    }

}
