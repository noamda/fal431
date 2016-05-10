
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyJournal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopyJournal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grossJournalSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="journalVolumes" type="{}journalVolumeSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopyJournal", propOrder = {
    "grossJournalSize",
    "journalVolumes"
})
public class ConsistencyGroupCopyJournal {

    protected long grossJournalSize;
    @XmlElement(nillable = true)
    protected List<JournalVolumeSettings> journalVolumes;

    /**
     * Gets the value of the grossJournalSize property.
     * 
     */
    public long getGrossJournalSize() {
        return grossJournalSize;
    }

    /**
     * Sets the value of the grossJournalSize property.
     * 
     */
    public void setGrossJournalSize(long value) {
        this.grossJournalSize = value;
    }

    /**
     * Gets the value of the journalVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalVolumeSettings }
     * 
     * 
     */
    public List<JournalVolumeSettings> getJournalVolumes() {
        if (journalVolumes == null) {
            journalVolumes = new ArrayList<JournalVolumeSettings>();
        }
        return this.journalVolumes;
    }

}
