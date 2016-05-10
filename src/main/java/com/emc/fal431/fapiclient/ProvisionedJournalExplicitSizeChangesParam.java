
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provisionedJournalExplicitSizeChangesParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisionedJournalExplicitSizeChangesParam">
 *   &lt;complexContent>
 *     &lt;extension base="{}provisionedJournalChangesParam">
 *       &lt;sequence>
 *         &lt;element name="explicitJournalSizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisionedJournalExplicitSizeChangesParam", propOrder = {
    "explicitJournalSizeInBytes"
})
public class ProvisionedJournalExplicitSizeChangesParam
    extends ProvisionedJournalChangesParam
{

    protected long explicitJournalSizeInBytes;

    /**
     * Gets the value of the explicitJournalSizeInBytes property.
     * 
     */
    public long getExplicitJournalSizeInBytes() {
        return explicitJournalSizeInBytes;
    }

    /**
     * Sets the value of the explicitJournalSizeInBytes property.
     * 
     */
    public void setExplicitJournalSizeInBytes(long value) {
        this.explicitJournalSizeInBytes = value;
    }

}
