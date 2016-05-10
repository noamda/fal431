
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clariionSplitterSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clariionSplitterSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}arrayBasedSplitterSettings">
 *       &lt;sequence>
 *         &lt;element name="credentials" type="{}clariionSplitterCredentials" minOccurs="0"/>
 *         &lt;element name="credentialsStatus" type="{}splitterCredentialsStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clariionSplitterSettings", propOrder = {
    "credentials",
    "credentialsStatus"
})
public class ClariionSplitterSettings
    extends ArrayBasedSplitterSettings
{

    protected ClariionSplitterCredentials credentials;
    protected SplitterCredentialsStatus credentialsStatus;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link ClariionSplitterCredentials }
     *     
     */
    public ClariionSplitterCredentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClariionSplitterCredentials }
     *     
     */
    public void setCredentials(ClariionSplitterCredentials value) {
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

}
