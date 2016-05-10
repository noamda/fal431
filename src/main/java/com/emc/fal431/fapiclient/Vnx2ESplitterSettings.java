
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vnx2ESplitterSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vnx2ESplitterSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}aggregatedSplitterSettings">
 *       &lt;sequence>
 *         &lt;element name="autoRegisterRPAsInitiators" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "vnx2ESplitterSettings", propOrder = {
    "autoRegisterRPAsInitiators",
    "credentials",
    "credentialsStatus"
})
public class Vnx2ESplitterSettings
    extends AggregatedSplitterSettings
{

    protected boolean autoRegisterRPAsInitiators;
    protected ClariionSplitterCredentials credentials;
    protected SplitterCredentialsStatus credentialsStatus;

    /**
     * Gets the value of the autoRegisterRPAsInitiators property.
     * 
     */
    public boolean isAutoRegisterRPAsInitiators() {
        return autoRegisterRPAsInitiators;
    }

    /**
     * Sets the value of the autoRegisterRPAsInitiators property.
     * 
     */
    public void setAutoRegisterRPAsInitiators(boolean value) {
        this.autoRegisterRPAsInitiators = value;
    }

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
