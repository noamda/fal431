
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkUID" type="{}consistencyGroupLinkUID" minOccurs="0"/>
 *         &lt;element name="sourceCopyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetCopyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkInfo", propOrder = {
    "groupName",
    "linkUID",
    "sourceCopyName",
    "targetCopyName"
})
public class ConsistencyGroupLinkInfo {

    protected String groupName;
    protected ConsistencyGroupLinkUID linkUID;
    protected String sourceCopyName;
    protected String targetCopyName;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the linkUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public ConsistencyGroupLinkUID getLinkUID() {
        return linkUID;
    }

    /**
     * Sets the value of the linkUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public void setLinkUID(ConsistencyGroupLinkUID value) {
        this.linkUID = value;
    }

    /**
     * Gets the value of the sourceCopyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCopyName() {
        return sourceCopyName;
    }

    /**
     * Sets the value of the sourceCopyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCopyName(String value) {
        this.sourceCopyName = value;
    }

    /**
     * Gets the value of the targetCopyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCopyName() {
        return targetCopyName;
    }

    /**
     * Sets the value of the targetCopyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCopyName(String value) {
        this.targetCopyName = value;
    }

}
