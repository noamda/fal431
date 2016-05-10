
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkInitStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkInitStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initCompletionPortion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="initIncomingThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="initOutgoingThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numberOfGrids" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkInitStatistics", propOrder = {
    "initCompletionPortion",
    "initIncomingThroughput",
    "initOutgoingThroughput",
    "numberOfGrids"
})
public class ConsistencyGroupLinkInitStatistics {

    protected double initCompletionPortion;
    protected long initIncomingThroughput;
    protected long initOutgoingThroughput;
    protected int numberOfGrids;

    /**
     * Gets the value of the initCompletionPortion property.
     * 
     */
    public double getInitCompletionPortion() {
        return initCompletionPortion;
    }

    /**
     * Sets the value of the initCompletionPortion property.
     * 
     */
    public void setInitCompletionPortion(double value) {
        this.initCompletionPortion = value;
    }

    /**
     * Gets the value of the initIncomingThroughput property.
     * 
     */
    public long getInitIncomingThroughput() {
        return initIncomingThroughput;
    }

    /**
     * Sets the value of the initIncomingThroughput property.
     * 
     */
    public void setInitIncomingThroughput(long value) {
        this.initIncomingThroughput = value;
    }

    /**
     * Gets the value of the initOutgoingThroughput property.
     * 
     */
    public long getInitOutgoingThroughput() {
        return initOutgoingThroughput;
    }

    /**
     * Sets the value of the initOutgoingThroughput property.
     * 
     */
    public void setInitOutgoingThroughput(long value) {
        this.initOutgoingThroughput = value;
    }

    /**
     * Gets the value of the numberOfGrids property.
     * 
     */
    public int getNumberOfGrids() {
        return numberOfGrids;
    }

    /**
     * Sets the value of the numberOfGrids property.
     * 
     */
    public void setNumberOfGrids(int value) {
        this.numberOfGrids = value;
    }

}
