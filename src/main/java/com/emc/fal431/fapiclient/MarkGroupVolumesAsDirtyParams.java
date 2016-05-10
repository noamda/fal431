
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markGroupVolumesAsDirtyParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markGroupVolumesAsDirtyParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replicationSets" type="{}replicationSetUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markGroupVolumesAsDirtyParams", propOrder = {
    "replicationSets"
})
public class MarkGroupVolumesAsDirtyParams {

    @XmlElement(nillable = true)
    protected List<ReplicationSetUID> replicationSets;

    /**
     * Gets the value of the replicationSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replicationSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplicationSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationSetUID }
     * 
     * 
     */
    public List<ReplicationSetUID> getReplicationSets() {
        if (replicationSets == null) {
            replicationSets = new ArrayList<ReplicationSetUID>();
        }
        return this.replicationSets;
    }

}
