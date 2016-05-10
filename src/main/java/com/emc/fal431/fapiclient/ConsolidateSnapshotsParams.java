
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consolidateSnapshotsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consolidateSnapshotsParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="end" type="{}snapshot" minOccurs="0"/>
 *         &lt;element name="start" type="{}snapshot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consolidateSnapshotsParams", propOrder = {
    "end",
    "start"
})
public class ConsolidateSnapshotsParams {

    protected Snapshot end;
    protected Snapshot start;

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setEnd(Snapshot value) {
        this.end = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setStart(Snapshot value) {
        this.start = value;
    }

}
