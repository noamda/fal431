package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyJournal", propOrder = {"grossJournalSize", "journalVolumes"})
public class ConsistencyGroupCopyJournal {
    protected long grossJournalSize;
    @XmlElement(nillable = true)
    protected List<JournalVolumeSettings> journalVolumes;

    public ConsistencyGroupCopyJournal() {
    }

    public ConsistencyGroupCopyJournal(long grossJournalSize, List<JournalVolumeSettings> journalVolumes) {
        this.grossJournalSize = grossJournalSize;
        this.journalVolumes = journalVolumes;
    }


    public long getGrossJournalSize() {
        return this.grossJournalSize;
    }


    public void setGrossJournalSize(long value) {
        this.grossJournalSize = value;
    }


    public List<JournalVolumeSettings> getJournalVolumes() {
        if (this.journalVolumes == null) {
            this.journalVolumes = new ArrayList();
        }
        return this.journalVolumes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyJournal)) {
            return false;
        }
        ConsistencyGroupCopyJournal otherObj = (ConsistencyGroupCopyJournal) obj;

        return (this.grossJournalSize == otherObj.grossJournalSize) && (this.journalVolumes != null ? this.journalVolumes.equals(otherObj.journalVolumes) : this.journalVolumes == otherObj.journalVolumes);
    }


    public int hashCode() {
        return (int) this.grossJournalSize ^ (this.journalVolumes != null ? this.journalVolumes.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyJournal [grossJournalSize=" + this.grossJournalSize + ", " + "journalVolumes=" + this.journalVolumes + "]";
    }
}


