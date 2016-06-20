package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsResult", propOrder = {"ftpResult", "linksToLogs", "logsFileName", "rpaResults", "splitterResults"})
public class CollectLogsResult {
    protected CollectLogsResultValue ftpResult;
    @XmlElement(nillable = true)
    protected List<CollectLogsLinkToLogsValue> linksToLogs;
    protected String logsFileName;
    @XmlElement(nillable = true)
    protected List<CollectLogsRPAResultValue> rpaResults;
    @XmlElement(nillable = true)
    protected List<CollectLogsSplitterResultValue> splitterResults;

    public CollectLogsResult() {
    }

    public CollectLogsResult(CollectLogsResultValue ftpResult, List<CollectLogsLinkToLogsValue> linksToLogs, String logsFileName, List<CollectLogsRPAResultValue> rpaResults, List<CollectLogsSplitterResultValue> splitterResults) {
        this.ftpResult = ftpResult;
        this.linksToLogs = linksToLogs;
        this.logsFileName = logsFileName;
        this.rpaResults = rpaResults;
        this.splitterResults = splitterResults;
    }


    public CollectLogsResultValue getFtpResult() {
        return this.ftpResult;
    }


    public void setFtpResult(CollectLogsResultValue value) {
        this.ftpResult = value;
    }


    public List<CollectLogsLinkToLogsValue> getLinksToLogs() {
        if (this.linksToLogs == null) {
            this.linksToLogs = new ArrayList();
        }
        return this.linksToLogs;
    }


    public String getLogsFileName() {
        return this.logsFileName;
    }


    public void setLogsFileName(String value) {
        this.logsFileName = value;
    }


    public List<CollectLogsRPAResultValue> getRpaResults() {
        if (this.rpaResults == null) {
            this.rpaResults = new ArrayList();
        }
        return this.rpaResults;
    }


    public List<CollectLogsSplitterResultValue> getSplitterResults() {
        if (this.splitterResults == null) {
            this.splitterResults = new ArrayList();
        }
        return this.splitterResults;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsResult)) {
            return false;
        }
        CollectLogsResult otherObj = (CollectLogsResult) obj;

        return (this.ftpResult != null ? this.ftpResult.equals(otherObj.ftpResult) : this.ftpResult == otherObj.ftpResult) && (this.linksToLogs != null ? this.linksToLogs.equals(otherObj.linksToLogs) : this.linksToLogs == otherObj.linksToLogs) && (this.logsFileName != null ? this.logsFileName.equals(otherObj.logsFileName) : this.logsFileName == otherObj.logsFileName) && (this.rpaResults != null ? this.rpaResults.equals(otherObj.rpaResults) : this.rpaResults == otherObj.rpaResults) && (this.splitterResults != null ? this.splitterResults.equals(otherObj.splitterResults) : this.splitterResults == otherObj.splitterResults);
    }


    public int hashCode() {
        return (this.ftpResult != null ? this.ftpResult.hashCode() : 0) ^ (this.linksToLogs != null ? this.linksToLogs.hashCode() : 0) ^ (this.logsFileName != null ? this.logsFileName.hashCode() : 0) ^ (this.rpaResults != null ? this.rpaResults.hashCode() : 0) ^ (this.splitterResults != null ? this.splitterResults.hashCode() : 0);
    }


    public String toString() {
        return "CollectLogsResult [ftpResult=" + this.ftpResult + ", " + "linksToLogs=" + this.linksToLogs + ", " + "logsFileName=" + this.logsFileName + ", " + "rpaResults=" + this.rpaResults + ", " + "splitterResults=" + this.splitterResults + "]";
    }
}


