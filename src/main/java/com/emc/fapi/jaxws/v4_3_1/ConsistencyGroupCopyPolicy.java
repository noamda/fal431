package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ConsistencyGroupCopyPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyPolicy", propOrder = {"journalCompressionLevel", "requiredProtectionWindowInMicroSeconds", "automaticSnapshotConsolidationPolicy", "rto", "loggedAccessAllocationProportion", "journalSizeLimitInBytes", "hostsOS", "allowDistributionOfLargeSnapshots", "allowSymmetrixWithOneRPA", "fastForwardBound", "phoenixProtectionPolicy", "snapshotsPolicy"})
public class ConsistencyGroupCopyPolicy
        extends BaseValidatablePolicyTemplateType {
    @XmlElement(required = true, nillable = true)
    protected JournalCompressionLevel journalCompressionLevel;
    protected Long requiredProtectionWindowInMicroSeconds;
    @XmlElement(required = true, nillable = true)
    protected AutomaticSnapshotConsolidationPolicy automaticSnapshotConsolidationPolicy;
    protected Quantity rto;
    protected double loggedAccessAllocationProportion;
    protected long journalSizeLimitInBytes;
    protected HostOS hostsOS;
    protected boolean allowDistributionOfLargeSnapshots;
    protected boolean allowSymmetrixWithOneRPA;
    protected RecoverPointTimeStamp fastForwardBound;
    @XmlElement(nillable = true)
    protected PhoenixProtectionPolicy phoenixProtectionPolicy;
    @XmlElement(nillable = true)
    protected SnapshotsPolicy snapshotsPolicy;

    public ConsistencyGroupCopyPolicy() {
    }

    public ConsistencyGroupCopyPolicy(JournalCompressionLevel journalCompressionLevel, Long requiredProtectionWindowInMicroSeconds, AutomaticSnapshotConsolidationPolicy automaticSnapshotConsolidationPolicy, Quantity rto, double loggedAccessAllocationProportion, long journalSizeLimitInBytes, HostOS hostsOS, boolean allowDistributionOfLargeSnapshots, boolean allowSymmetrixWithOneRPA, RecoverPointTimeStamp fastForwardBound, PhoenixProtectionPolicy phoenixProtectionPolicy, SnapshotsPolicy snapshotsPolicy) {
        this.journalCompressionLevel = journalCompressionLevel;
        this.requiredProtectionWindowInMicroSeconds = requiredProtectionWindowInMicroSeconds;
        this.automaticSnapshotConsolidationPolicy = automaticSnapshotConsolidationPolicy;
        this.rto = rto;
        this.loggedAccessAllocationProportion = loggedAccessAllocationProportion;
        this.journalSizeLimitInBytes = journalSizeLimitInBytes;
        this.hostsOS = hostsOS;
        this.allowDistributionOfLargeSnapshots = allowDistributionOfLargeSnapshots;
        this.allowSymmetrixWithOneRPA = allowSymmetrixWithOneRPA;
        this.fastForwardBound = fastForwardBound;
        this.phoenixProtectionPolicy = phoenixProtectionPolicy;
        this.snapshotsPolicy = snapshotsPolicy;
    }


    public JournalCompressionLevel getJournalCompressionLevel() {
        return this.journalCompressionLevel;
    }


    public void setJournalCompressionLevel(JournalCompressionLevel value) {
        this.journalCompressionLevel = value;
    }


    public Long getRequiredProtectionWindowInMicroSeconds() {
        return this.requiredProtectionWindowInMicroSeconds;
    }


    public void setRequiredProtectionWindowInMicroSeconds(Long value) {
        this.requiredProtectionWindowInMicroSeconds = value;
    }


    public AutomaticSnapshotConsolidationPolicy getAutomaticSnapshotConsolidationPolicy() {
        return this.automaticSnapshotConsolidationPolicy;
    }


    public void setAutomaticSnapshotConsolidationPolicy(AutomaticSnapshotConsolidationPolicy value) {
        this.automaticSnapshotConsolidationPolicy = value;
    }


    public Quantity getRto() {
        return this.rto;
    }


    public void setRto(Quantity value) {
        this.rto = value;
    }


    public double getLoggedAccessAllocationProportion() {
        return this.loggedAccessAllocationProportion;
    }


    public void setLoggedAccessAllocationProportion(double value) {
        this.loggedAccessAllocationProportion = value;
    }


    public long getJournalSizeLimitInBytes() {
        return this.journalSizeLimitInBytes;
    }


    public void setJournalSizeLimitInBytes(long value) {
        this.journalSizeLimitInBytes = value;
    }


    public HostOS getHostsOS() {
        return this.hostsOS;
    }


    public void setHostsOS(HostOS value) {
        this.hostsOS = value;
    }


    public boolean isAllowDistributionOfLargeSnapshots() {
        return this.allowDistributionOfLargeSnapshots;
    }


    public void setAllowDistributionOfLargeSnapshots(boolean value) {
        this.allowDistributionOfLargeSnapshots = value;
    }


    public boolean isAllowSymmetrixWithOneRPA() {
        return this.allowSymmetrixWithOneRPA;
    }


    public void setAllowSymmetrixWithOneRPA(boolean value) {
        this.allowSymmetrixWithOneRPA = value;
    }


    public RecoverPointTimeStamp getFastForwardBound() {
        return this.fastForwardBound;
    }


    public void setFastForwardBound(RecoverPointTimeStamp value) {
        this.fastForwardBound = value;
    }


    public PhoenixProtectionPolicy getPhoenixProtectionPolicy() {
        return this.phoenixProtectionPolicy;
    }


    public void setPhoenixProtectionPolicy(PhoenixProtectionPolicy value) {
        this.phoenixProtectionPolicy = value;
    }


    public SnapshotsPolicy getSnapshotsPolicy() {
        return this.snapshotsPolicy;
    }


    public void setSnapshotsPolicy(SnapshotsPolicy value) {
        this.snapshotsPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyPolicy)) {
            return false;
        }
        ConsistencyGroupCopyPolicy otherObj = (ConsistencyGroupCopyPolicy) obj;

        return (super.equals(obj)) && (this.journalCompressionLevel != null ? this.journalCompressionLevel.equals(otherObj.journalCompressionLevel) : this.journalCompressionLevel == otherObj.journalCompressionLevel) && (this.requiredProtectionWindowInMicroSeconds != null ? this.requiredProtectionWindowInMicroSeconds.equals(otherObj.requiredProtectionWindowInMicroSeconds) : this.requiredProtectionWindowInMicroSeconds == otherObj.requiredProtectionWindowInMicroSeconds) && (this.automaticSnapshotConsolidationPolicy != null ? this.automaticSnapshotConsolidationPolicy.equals(otherObj.automaticSnapshotConsolidationPolicy) : this.automaticSnapshotConsolidationPolicy == otherObj.automaticSnapshotConsolidationPolicy) && (this.rto != null ? this.rto.equals(otherObj.rto) : this.rto == otherObj.rto) && (this.loggedAccessAllocationProportion == otherObj.loggedAccessAllocationProportion) && (this.journalSizeLimitInBytes == otherObj.journalSizeLimitInBytes) && (this.hostsOS != null ? this.hostsOS.equals(otherObj.hostsOS) : this.hostsOS == otherObj.hostsOS) && (this.allowDistributionOfLargeSnapshots == otherObj.allowDistributionOfLargeSnapshots) && (this.allowSymmetrixWithOneRPA == otherObj.allowSymmetrixWithOneRPA) && (this.fastForwardBound != null ? this.fastForwardBound.equals(otherObj.fastForwardBound) : this.fastForwardBound == otherObj.fastForwardBound) && (this.phoenixProtectionPolicy != null ? this.phoenixProtectionPolicy.equals(otherObj.phoenixProtectionPolicy) : this.phoenixProtectionPolicy == otherObj.phoenixProtectionPolicy) && (this.snapshotsPolicy != null ? this.snapshotsPolicy.equals(otherObj.snapshotsPolicy) : this.snapshotsPolicy == otherObj.snapshotsPolicy);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.journalCompressionLevel != null ? this.journalCompressionLevel.hashCode() : 0) ^ (this.requiredProtectionWindowInMicroSeconds != null ? this.requiredProtectionWindowInMicroSeconds.hashCode() : 0) ^ (this.automaticSnapshotConsolidationPolicy != null ? this.automaticSnapshotConsolidationPolicy.hashCode() : 0) ^ (this.rto != null ? this.rto.hashCode() : 0) ^ (int) this.loggedAccessAllocationProportion ^ (int) this.journalSizeLimitInBytes ^ (this.hostsOS != null ? this.hostsOS.hashCode() : 0) ^ (this.allowDistributionOfLargeSnapshots ? 1 : 0) ^ (this.allowSymmetrixWithOneRPA ? 1 : 0) ^ (this.fastForwardBound != null ? this.fastForwardBound.hashCode() : 0) ^ (this.phoenixProtectionPolicy != null ? this.phoenixProtectionPolicy.hashCode() : 0) ^ (this.snapshotsPolicy != null ? this.snapshotsPolicy.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyPolicy [super=" + super.toString() + ", " + "journalCompressionLevel=" + this.journalCompressionLevel + ", " + "requiredProtectionWindowInMicroSeconds=" + this.requiredProtectionWindowInMicroSeconds + ", " + "automaticSnapshotConsolidationPolicy=" + this.automaticSnapshotConsolidationPolicy + ", " + "rto=" + this.rto + ", " + "loggedAccessAllocationProportion=" + this.loggedAccessAllocationProportion + ", " + "journalSizeLimitInBytes=" + this.journalSizeLimitInBytes + ", " + "hostsOS=" + this.hostsOS + ", " + "allowDistributionOfLargeSnapshots=" + this.allowDistributionOfLargeSnapshots + ", " + "allowSymmetrixWithOneRPA=" + this.allowSymmetrixWithOneRPA + ", " + "fastForwardBound=" + this.fastForwardBound + ", " + "phoenixProtectionPolicy=" + this.phoenixProtectionPolicy + ", " + "snapshotsPolicy=" + this.snapshotsPolicy + "]";
    }
}


