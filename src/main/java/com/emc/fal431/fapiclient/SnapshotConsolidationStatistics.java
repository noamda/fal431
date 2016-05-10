
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snapshotConsolidationStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snapshotConsolidationStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="percentageOfSavedSpace" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="savedSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snapshotConsolidationStatistics", propOrder = {
    "percentageOfSavedSpace",
    "savedSpace"
})
public class SnapshotConsolidationStatistics {

    protected double percentageOfSavedSpace;
    protected long savedSpace;

    /**
     * Gets the value of the percentageOfSavedSpace property.
     * 
     */
    public double getPercentageOfSavedSpace() {
        return percentageOfSavedSpace;
    }

    /**
     * Sets the value of the percentageOfSavedSpace property.
     * 
     */
    public void setPercentageOfSavedSpace(double value) {
        this.percentageOfSavedSpace = value;
    }

    /**
     * Gets the value of the savedSpace property.
     * 
     */
    public long getSavedSpace() {
        return savedSpace;
    }

    /**
     * Sets the value of the savedSpace property.
     * 
     */
    public void setSavedSpace(long value) {
        this.savedSpace = value;
    }

}
