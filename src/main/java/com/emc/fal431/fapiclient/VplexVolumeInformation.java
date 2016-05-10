
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vplexVolumeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vplexVolumeInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{}volumeInformation">
 *       &lt;sequence>
 *         &lt;element name="locality" type="{}vplexVolumeLocality" minOccurs="0"/>
 *         &lt;element name="recoverPointClusterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vplexConsistencyGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="winner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vplexVolumeInformation", propOrder = {
    "locality",
    "recoverPointClusterName",
    "rpEnabled",
    "vplexConsistencyGroupName",
    "winner"
})
public class VplexVolumeInformation
    extends VolumeInformation
{

    protected VplexVolumeLocality locality;
    protected String recoverPointClusterName;
    protected boolean rpEnabled;
    protected String vplexConsistencyGroupName;
    protected boolean winner;

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link VplexVolumeLocality }
     *     
     */
    public VplexVolumeLocality getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link VplexVolumeLocality }
     *     
     */
    public void setLocality(VplexVolumeLocality value) {
        this.locality = value;
    }

    /**
     * Gets the value of the recoverPointClusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoverPointClusterName() {
        return recoverPointClusterName;
    }

    /**
     * Sets the value of the recoverPointClusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoverPointClusterName(String value) {
        this.recoverPointClusterName = value;
    }

    /**
     * Gets the value of the rpEnabled property.
     * 
     */
    public boolean isRpEnabled() {
        return rpEnabled;
    }

    /**
     * Sets the value of the rpEnabled property.
     * 
     */
    public void setRpEnabled(boolean value) {
        this.rpEnabled = value;
    }

    /**
     * Gets the value of the vplexConsistencyGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVplexConsistencyGroupName() {
        return vplexConsistencyGroupName;
    }

    /**
     * Sets the value of the vplexConsistencyGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVplexConsistencyGroupName(String value) {
        this.vplexConsistencyGroupName = value;
    }

    /**
     * Gets the value of the winner property.
     * 
     */
    public boolean isWinner() {
        return winner;
    }

    /**
     * Sets the value of the winner property.
     * 
     */
    public void setWinner(boolean value) {
        this.winner = value;
    }

}
