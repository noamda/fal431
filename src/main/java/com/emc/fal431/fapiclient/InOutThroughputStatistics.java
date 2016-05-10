
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inOutThroughputStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inOutThroughputStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionsOutThroughput" type="{}connectionOutThroughput" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inOutThroughputStatistics", propOrder = {
    "connectionsOutThroughput",
    "inThroughput"
})
public class InOutThroughputStatistics {

    @XmlElement(nillable = true)
    protected List<ConnectionOutThroughput> connectionsOutThroughput;
    protected long inThroughput;

    /**
     * Gets the value of the connectionsOutThroughput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionsOutThroughput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionsOutThroughput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionOutThroughput }
     * 
     * 
     */
    public List<ConnectionOutThroughput> getConnectionsOutThroughput() {
        if (connectionsOutThroughput == null) {
            connectionsOutThroughput = new ArrayList<ConnectionOutThroughput>();
        }
        return this.connectionsOutThroughput;
    }

    /**
     * Gets the value of the inThroughput property.
     * 
     */
    public long getInThroughput() {
        return inThroughput;
    }

    /**
     * Sets the value of the inThroughput property.
     * 
     */
    public void setInThroughput(long value) {
        this.inThroughput = value;
    }

}
