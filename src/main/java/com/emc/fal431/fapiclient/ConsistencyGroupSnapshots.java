
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupSnapshots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupSnapshots">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copiesSnapshots" type="{}consistencyGroupCopySnapshots" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupSnapshots", propOrder = {
    "copiesSnapshots",
    "groupUID"
})
public class ConsistencyGroupSnapshots {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopySnapshots> copiesSnapshots;
    protected ConsistencyGroupUID groupUID;

    /**
     * Gets the value of the copiesSnapshots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiesSnapshots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiesSnapshots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopySnapshots }
     * 
     * 
     */
    public List<ConsistencyGroupCopySnapshots> getCopiesSnapshots() {
        if (copiesSnapshots == null) {
            copiesSnapshots = new ArrayList<ConsistencyGroupCopySnapshots>();
        }
        return this.copiesSnapshots;
    }

    /**
     * Gets the value of the groupUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public ConsistencyGroupUID getGroupUID() {
        return groupUID;
    }

    /**
     * Sets the value of the groupUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }

}
