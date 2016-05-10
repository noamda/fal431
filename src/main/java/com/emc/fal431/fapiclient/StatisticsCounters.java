
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statisticsCounters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statisticsCounters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataCounter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeCounter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionCounter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statisticsCounters", propOrder = {
    "dataCounter",
    "timeCounter",
    "transactionCounter"
})
public class StatisticsCounters {

    protected long dataCounter;
    protected long timeCounter;
    protected long transactionCounter;

    /**
     * Gets the value of the dataCounter property.
     * 
     */
    public long getDataCounter() {
        return dataCounter;
    }

    /**
     * Sets the value of the dataCounter property.
     * 
     */
    public void setDataCounter(long value) {
        this.dataCounter = value;
    }

    /**
     * Gets the value of the timeCounter property.
     * 
     */
    public long getTimeCounter() {
        return timeCounter;
    }

    /**
     * Sets the value of the timeCounter property.
     * 
     */
    public void setTimeCounter(long value) {
        this.timeCounter = value;
    }

    /**
     * Gets the value of the transactionCounter property.
     * 
     */
    public long getTransactionCounter() {
        return transactionCounter;
    }

    /**
     * Sets the value of the transactionCounter property.
     * 
     */
    public void setTransactionCounter(long value) {
        this.transactionCounter = value;
    }

}
