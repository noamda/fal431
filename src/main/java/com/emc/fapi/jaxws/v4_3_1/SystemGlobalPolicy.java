package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemGlobalPolicy", propOrder = {"advancedActionRegulationEnabled", "numberOfCommunicationStreams", "shouldCollectLongTermStatistics"})
public class SystemGlobalPolicy {
    protected boolean advancedActionRegulationEnabled;
    protected int numberOfCommunicationStreams;
    protected boolean shouldCollectLongTermStatistics;

    public SystemGlobalPolicy() {
    }

    public SystemGlobalPolicy(boolean advancedActionRegulationEnabled, int numberOfCommunicationStreams, boolean shouldCollectLongTermStatistics) {
        this.advancedActionRegulationEnabled = advancedActionRegulationEnabled;
        this.numberOfCommunicationStreams = numberOfCommunicationStreams;
        this.shouldCollectLongTermStatistics = shouldCollectLongTermStatistics;
    }


    public boolean isAdvancedActionRegulationEnabled() {
        return this.advancedActionRegulationEnabled;
    }


    public void setAdvancedActionRegulationEnabled(boolean value) {
        this.advancedActionRegulationEnabled = value;
    }


    public int getNumberOfCommunicationStreams() {
        return this.numberOfCommunicationStreams;
    }


    public void setNumberOfCommunicationStreams(int value) {
        this.numberOfCommunicationStreams = value;
    }


    public boolean isShouldCollectLongTermStatistics() {
        return this.shouldCollectLongTermStatistics;
    }


    public void setShouldCollectLongTermStatistics(boolean value) {
        this.shouldCollectLongTermStatistics = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemGlobalPolicy)) {
            return false;
        }
        SystemGlobalPolicy otherObj = (SystemGlobalPolicy) obj;

        return (this.advancedActionRegulationEnabled == otherObj.advancedActionRegulationEnabled) && (this.numberOfCommunicationStreams == otherObj.numberOfCommunicationStreams) && (this.shouldCollectLongTermStatistics == otherObj.shouldCollectLongTermStatistics);
    }


    public int hashCode() {
        return (this.advancedActionRegulationEnabled ? 1 : 0) ^ this.numberOfCommunicationStreams ^ (this.shouldCollectLongTermStatistics ? 1 : 0);
    }


    public String toString() {
        return "SystemGlobalPolicy [advancedActionRegulationEnabled=" + this.advancedActionRegulationEnabled + ", " + "numberOfCommunicationStreams=" + this.numberOfCommunicationStreams + ", " + "shouldCollectLongTermStatistics=" + this.shouldCollectLongTermStatistics + "]";
    }
}


