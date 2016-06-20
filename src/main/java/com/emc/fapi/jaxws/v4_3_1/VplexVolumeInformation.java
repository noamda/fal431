package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VplexVolumeInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VplexVolumeInformation", propOrder = {"locality", "winner", "vplexConsistencyGroupName", "recoverPointClusterName", "rpEnabled", "isMetroCandidate"})
public class VplexVolumeInformation
        extends VolumeInformation {
    protected VplexVolumeLocality locality;
    protected boolean winner;
    protected String vplexConsistencyGroupName;
    protected String recoverPointClusterName;
    protected boolean rpEnabled;
    protected Boolean isMetroCandidate;

    public VplexVolumeInformation() {
    }

    public VplexVolumeInformation(VplexVolumeLocality locality, boolean winner, String vplexConsistencyGroupName, String recoverPointClusterName, boolean rpEnabled, Boolean isMetroCandidate) {
        this.locality = locality;
        this.winner = winner;
        this.vplexConsistencyGroupName = vplexConsistencyGroupName;
        this.recoverPointClusterName = recoverPointClusterName;
        this.rpEnabled = rpEnabled;
        this.isMetroCandidate = isMetroCandidate;
    }


    public VplexVolumeLocality getLocality() {
        return this.locality;
    }


    public void setLocality(VplexVolumeLocality value) {
        this.locality = value;
    }


    public boolean isWinner() {
        return this.winner;
    }


    public void setWinner(boolean value) {
        this.winner = value;
    }


    public String getVplexConsistencyGroupName() {
        return this.vplexConsistencyGroupName;
    }


    public void setVplexConsistencyGroupName(String value) {
        this.vplexConsistencyGroupName = value;
    }


    public String getRecoverPointClusterName() {
        return this.recoverPointClusterName;
    }


    public void setRecoverPointClusterName(String value) {
        this.recoverPointClusterName = value;
    }


    public boolean isRpEnabled() {
        return this.rpEnabled;
    }


    public void setRpEnabled(boolean value) {
        this.rpEnabled = value;
    }


    public Boolean isIsMetroCandidate() {
        return this.isMetroCandidate;
    }


    public void setIsMetroCandidate(Boolean value) {
        this.isMetroCandidate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VplexVolumeInformation)) {
            return false;
        }
        VplexVolumeInformation otherObj = (VplexVolumeInformation) obj;

        return (super.equals(obj)) && (this.locality != null ? this.locality.equals(otherObj.locality) : this.locality == otherObj.locality) && (this.winner == otherObj.winner) && (this.vplexConsistencyGroupName != null ? this.vplexConsistencyGroupName.equals(otherObj.vplexConsistencyGroupName) : this.vplexConsistencyGroupName == otherObj.vplexConsistencyGroupName) && (this.recoverPointClusterName != null ? this.recoverPointClusterName.equals(otherObj.recoverPointClusterName) : this.recoverPointClusterName == otherObj.recoverPointClusterName) && (this.rpEnabled == otherObj.rpEnabled) && (this.isMetroCandidate != null ? this.isMetroCandidate.equals(otherObj.isMetroCandidate) : this.isMetroCandidate == otherObj.isMetroCandidate);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.locality != null ? this.locality.hashCode() : 0) ^ (this.winner ? 1 : 0) ^ (this.vplexConsistencyGroupName != null ? this.vplexConsistencyGroupName.hashCode() : 0) ^ (this.recoverPointClusterName != null ? this.recoverPointClusterName.hashCode() : 0) ^ (this.rpEnabled ? 1 : 0) ^ (this.isMetroCandidate != null ? this.isMetroCandidate.hashCode() : 0);
    }


    public String toString() {
        return "VplexVolumeInformation [super=" + super.toString() + ", " + "locality=" + this.locality + ", " + "winner=" + this.winner + ", " + "vplexConsistencyGroupName=" + this.vplexConsistencyGroupName + ", " + "recoverPointClusterName=" + this.recoverPointClusterName + ", " + "rpEnabled=" + this.rpEnabled + ", " + "isMetroCandidate=" + this.isMetroCandidate + "]";
    }
}


