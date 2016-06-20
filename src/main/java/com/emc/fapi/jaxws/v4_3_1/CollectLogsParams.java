package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsParams", propOrder = {"timeFrame", "ftpInformation", "includeCoreFiles", "ignoreConnectivityErrors", "rpas", "splitters", "splittersWithoutCredentials", "clariionCredentials", "vplexCredentials", "uniteLogsToOneTar"})
public class CollectLogsParams {
    @XmlElement(nillable = true)
    protected TimeFrame timeFrame;
    @XmlElement(nillable = true)
    protected FTPInformation ftpInformation;
    protected boolean includeCoreFiles;
    protected boolean ignoreConnectivityErrors;
    @XmlElement(nillable = true)
    protected List<RpaUID> rpas;
    @XmlElement(nillable = true)
    protected List<CollectLogsSplitterParam> splitters;
    @XmlElement(nillable = true)
    protected List<SplitterUID> splittersWithoutCredentials;
    @XmlElement(nillable = true)
    protected List<ClariionSplitter> clariionCredentials;
    @XmlElement(nillable = true)
    protected List<VplexSplitter> vplexCredentials;
    protected boolean uniteLogsToOneTar;

    public CollectLogsParams() {
    }

    public CollectLogsParams(TimeFrame timeFrame, FTPInformation ftpInformation, boolean includeCoreFiles, boolean ignoreConnectivityErrors, List<RpaUID> rpas, List<CollectLogsSplitterParam> splitters, List<SplitterUID> splittersWithoutCredentials, List<ClariionSplitter> clariionCredentials, List<VplexSplitter> vplexCredentials, boolean uniteLogsToOneTar) {
        this.timeFrame = timeFrame;
        this.ftpInformation = ftpInformation;
        this.includeCoreFiles = includeCoreFiles;
        this.ignoreConnectivityErrors = ignoreConnectivityErrors;
        this.rpas = rpas;
        this.splitters = splitters;
        this.splittersWithoutCredentials = splittersWithoutCredentials;
        this.clariionCredentials = clariionCredentials;
        this.vplexCredentials = vplexCredentials;
        this.uniteLogsToOneTar = uniteLogsToOneTar;
    }


    public TimeFrame getTimeFrame() {
        return this.timeFrame;
    }


    public void setTimeFrame(TimeFrame value) {
        this.timeFrame = value;
    }


    public FTPInformation getFtpInformation() {
        return this.ftpInformation;
    }


    public void setFtpInformation(FTPInformation value) {
        this.ftpInformation = value;
    }


    public boolean isIncludeCoreFiles() {
        return this.includeCoreFiles;
    }


    public void setIncludeCoreFiles(boolean value) {
        this.includeCoreFiles = value;
    }


    public boolean isIgnoreConnectivityErrors() {
        return this.ignoreConnectivityErrors;
    }


    public void setIgnoreConnectivityErrors(boolean value) {
        this.ignoreConnectivityErrors = value;
    }


    public List<RpaUID> getRpas() {
        if (this.rpas == null) {
            this.rpas = new ArrayList();
        }
        return this.rpas;
    }


    public List<CollectLogsSplitterParam> getSplitters() {
        if (this.splitters == null) {
            this.splitters = new ArrayList();
        }
        return this.splitters;
    }


    public List<SplitterUID> getSplittersWithoutCredentials() {
        if (this.splittersWithoutCredentials == null) {
            this.splittersWithoutCredentials = new ArrayList();
        }
        return this.splittersWithoutCredentials;
    }


    public List<ClariionSplitter> getClariionCredentials() {
        if (this.clariionCredentials == null) {
            this.clariionCredentials = new ArrayList();
        }
        return this.clariionCredentials;
    }


    public List<VplexSplitter> getVplexCredentials() {
        if (this.vplexCredentials == null) {
            this.vplexCredentials = new ArrayList();
        }
        return this.vplexCredentials;
    }


    public boolean isUniteLogsToOneTar() {
        return this.uniteLogsToOneTar;
    }


    public void setUniteLogsToOneTar(boolean value) {
        this.uniteLogsToOneTar = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsParams)) {
            return false;
        }
        CollectLogsParams otherObj = (CollectLogsParams) obj;

        return (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.ftpInformation != null ? this.ftpInformation.equals(otherObj.ftpInformation) : this.ftpInformation == otherObj.ftpInformation) && (this.includeCoreFiles == otherObj.includeCoreFiles) && (this.ignoreConnectivityErrors == otherObj.ignoreConnectivityErrors) && (this.rpas != null ? this.rpas.equals(otherObj.rpas) : this.rpas == otherObj.rpas) && (this.splitters != null ? this.splitters.equals(otherObj.splitters) : this.splitters == otherObj.splitters) && (this.splittersWithoutCredentials != null ? this.splittersWithoutCredentials.equals(otherObj.splittersWithoutCredentials) : this.splittersWithoutCredentials == otherObj.splittersWithoutCredentials) && (this.clariionCredentials != null ? this.clariionCredentials.equals(otherObj.clariionCredentials) : this.clariionCredentials == otherObj.clariionCredentials) && (this.vplexCredentials != null ? this.vplexCredentials.equals(otherObj.vplexCredentials) : this.vplexCredentials == otherObj.vplexCredentials) && (this.uniteLogsToOneTar == otherObj.uniteLogsToOneTar);
    }


    public int hashCode() {
        return (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.ftpInformation != null ? this.ftpInformation.hashCode() : 0) ^ (this.includeCoreFiles ? 1 : 0) ^ (this.ignoreConnectivityErrors ? 1 : 0) ^ (this.rpas != null ? this.rpas.hashCode() : 0) ^ (this.splitters != null ? this.splitters.hashCode() : 0) ^ (this.splittersWithoutCredentials != null ? this.splittersWithoutCredentials.hashCode() : 0) ^ (this.clariionCredentials != null ? this.clariionCredentials.hashCode() : 0) ^ (this.vplexCredentials != null ? this.vplexCredentials.hashCode() : 0) ^ (this.uniteLogsToOneTar ? 1 : 0);
    }


    public String toString() {
        return "CollectLogsParams [timeFrame=" + this.timeFrame + ", " + "ftpInformation=" + this.ftpInformation + ", " + "includeCoreFiles=" + this.includeCoreFiles + ", " + "ignoreConnectivityErrors=" + this.ignoreConnectivityErrors + ", " + "rpas=" + this.rpas + ", " + "splitters=" + this.splitters + ", " + "splittersWithoutCredentials=" + this.splittersWithoutCredentials + ", " + "clariionCredentials=" + this.clariionCredentials + ", " + "vplexCredentials=" + this.vplexCredentials + ", " + "uniteLogsToOneTar=" + this.uniteLogsToOneTar + "]";
    }
}


