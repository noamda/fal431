
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopyPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowDistributionOfLargeSnapshots" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowSymmetrixWithOneRPA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}automaticSnapshotConsolidationPolicy" minOccurs="0"/>
 *         &lt;element name="fastForwardBound" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="hostsOS" type="{}hostOS" minOccurs="0"/>
 *         &lt;element ref="{}journalCompressionLevel" minOccurs="0"/>
 *         &lt;element name="journalSizeLimitInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loggedAccessAllocationProportion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element ref="{}phoenixProtectionPolicy" minOccurs="0"/>
 *         &lt;element name="RTO" type="{}quantity" minOccurs="0"/>
 *         &lt;element name="requiredProtectionWindowInMicroSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopyPolicy", propOrder = {
    "allowDistributionOfLargeSnapshots",
    "allowSymmetrixWithOneRPA",
    "automaticSnapshotConsolidationPolicy",
    "fastForwardBound",
    "hostsOS",
    "journalCompressionLevel",
    "journalSizeLimitInBytes",
    "loggedAccessAllocationProportion",
    "phoenixProtectionPolicy",
    "rto",
    "requiredProtectionWindowInMicroSeconds"
})
public class ConsistencyGroupCopyPolicy {

    protected boolean allowDistributionOfLargeSnapshots;
    protected boolean allowSymmetrixWithOneRPA;
    protected AutomaticSnapshotConsolidationPolicy automaticSnapshotConsolidationPolicy;
    protected RecoverPointTimeStamp fastForwardBound;
    protected HostOS hostsOS;
    protected JournalCompressionLevel journalCompressionLevel;
    protected long journalSizeLimitInBytes;
    protected double loggedAccessAllocationProportion;
    protected PhoenixProtectionPolicy phoenixProtectionPolicy;
    @XmlElement(name = "RTO")
    protected Quantity rto;
    protected Long requiredProtectionWindowInMicroSeconds;

    /**
     * Gets the value of the allowDistributionOfLargeSnapshots property.
     * 
     */
    public boolean isAllowDistributionOfLargeSnapshots() {
        return allowDistributionOfLargeSnapshots;
    }

    /**
     * Sets the value of the allowDistributionOfLargeSnapshots property.
     * 
     */
    public void setAllowDistributionOfLargeSnapshots(boolean value) {
        this.allowDistributionOfLargeSnapshots = value;
    }

    /**
     * Gets the value of the allowSymmetrixWithOneRPA property.
     * 
     */
    public boolean isAllowSymmetrixWithOneRPA() {
        return allowSymmetrixWithOneRPA;
    }

    /**
     * Sets the value of the allowSymmetrixWithOneRPA property.
     * 
     */
    public void setAllowSymmetrixWithOneRPA(boolean value) {
        this.allowSymmetrixWithOneRPA = value;
    }

    /**
     * Gets the value of the automaticSnapshotConsolidationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticSnapshotConsolidationPolicy }
     *     
     */
    public AutomaticSnapshotConsolidationPolicy getAutomaticSnapshotConsolidationPolicy() {
        return automaticSnapshotConsolidationPolicy;
    }

    /**
     * Sets the value of the automaticSnapshotConsolidationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticSnapshotConsolidationPolicy }
     *     
     */
    public void setAutomaticSnapshotConsolidationPolicy(AutomaticSnapshotConsolidationPolicy value) {
        this.automaticSnapshotConsolidationPolicy = value;
    }

    /**
     * Gets the value of the fastForwardBound property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getFastForwardBound() {
        return fastForwardBound;
    }

    /**
     * Sets the value of the fastForwardBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setFastForwardBound(RecoverPointTimeStamp value) {
        this.fastForwardBound = value;
    }

    /**
     * Gets the value of the hostsOS property.
     * 
     * @return
     *     possible object is
     *     {@link HostOS }
     *     
     */
    public HostOS getHostsOS() {
        return hostsOS;
    }

    /**
     * Sets the value of the hostsOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostOS }
     *     
     */
    public void setHostsOS(HostOS value) {
        this.hostsOS = value;
    }

    /**
     * Gets the value of the journalCompressionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JournalCompressionLevel }
     *     
     */
    public JournalCompressionLevel getJournalCompressionLevel() {
        return journalCompressionLevel;
    }

    /**
     * Sets the value of the journalCompressionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalCompressionLevel }
     *     
     */
    public void setJournalCompressionLevel(JournalCompressionLevel value) {
        this.journalCompressionLevel = value;
    }

    /**
     * Gets the value of the journalSizeLimitInBytes property.
     * 
     */
    public long getJournalSizeLimitInBytes() {
        return journalSizeLimitInBytes;
    }

    /**
     * Sets the value of the journalSizeLimitInBytes property.
     * 
     */
    public void setJournalSizeLimitInBytes(long value) {
        this.journalSizeLimitInBytes = value;
    }

    /**
     * Gets the value of the loggedAccessAllocationProportion property.
     * 
     */
    public double getLoggedAccessAllocationProportion() {
        return loggedAccessAllocationProportion;
    }

    /**
     * Sets the value of the loggedAccessAllocationProportion property.
     * 
     */
    public void setLoggedAccessAllocationProportion(double value) {
        this.loggedAccessAllocationProportion = value;
    }

    /**
     * Gets the value of the phoenixProtectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PhoenixProtectionPolicy }
     *     
     */
    public PhoenixProtectionPolicy getPhoenixProtectionPolicy() {
        return phoenixProtectionPolicy;
    }

    /**
     * Sets the value of the phoenixProtectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoenixProtectionPolicy }
     *     
     */
    public void setPhoenixProtectionPolicy(PhoenixProtectionPolicy value) {
        this.phoenixProtectionPolicy = value;
    }

    /**
     * Gets the value of the rto property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getRTO() {
        return rto;
    }

    /**
     * Sets the value of the rto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setRTO(Quantity value) {
        this.rto = value;
    }

    /**
     * Gets the value of the requiredProtectionWindowInMicroSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequiredProtectionWindowInMicroSeconds() {
        return requiredProtectionWindowInMicroSeconds;
    }

    /**
     * Sets the value of the requiredProtectionWindowInMicroSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequiredProtectionWindowInMicroSeconds(Long value) {
        this.requiredProtectionWindowInMicroSeconds = value;
    }

}
