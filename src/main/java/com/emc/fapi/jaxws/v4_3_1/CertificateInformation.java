package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateInformation", propOrder = {"issuerDN", "md5", "pemCertificate", "sha1", "subjectDN", "validNotAfter", "validNotBefore"})
public class CertificateInformation {
    protected String issuerDN;
    protected String md5;
    protected String pemCertificate;
    protected String sha1;
    protected String subjectDN;
    protected String validNotAfter;
    protected String validNotBefore;

    public CertificateInformation() {
    }

    public CertificateInformation(String issuerDN, String md5, String pemCertificate, String sha1, String subjectDN, String validNotAfter, String validNotBefore) {
        this.issuerDN = issuerDN;
        this.md5 = md5;
        this.pemCertificate = pemCertificate;
        this.sha1 = sha1;
        this.subjectDN = subjectDN;
        this.validNotAfter = validNotAfter;
        this.validNotBefore = validNotBefore;
    }


    public String getIssuerDN() {
        return this.issuerDN;
    }


    public void setIssuerDN(String value) {
        this.issuerDN = value;
    }


    public String getMd5() {
        return this.md5;
    }


    public void setMd5(String value) {
        this.md5 = value;
    }


    public String getPemCertificate() {
        return this.pemCertificate;
    }


    public void setPemCertificate(String value) {
        this.pemCertificate = value;
    }


    public String getSha1() {
        return this.sha1;
    }


    public void setSha1(String value) {
        this.sha1 = value;
    }


    public String getSubjectDN() {
        return this.subjectDN;
    }


    public void setSubjectDN(String value) {
        this.subjectDN = value;
    }


    public String getValidNotAfter() {
        return this.validNotAfter;
    }


    public void setValidNotAfter(String value) {
        this.validNotAfter = value;
    }


    public String getValidNotBefore() {
        return this.validNotBefore;
    }


    public void setValidNotBefore(String value) {
        this.validNotBefore = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CertificateInformation)) {
            return false;
        }
        CertificateInformation otherObj = (CertificateInformation) obj;

        return (this.issuerDN != null ? this.issuerDN.equals(otherObj.issuerDN) : this.issuerDN == otherObj.issuerDN) && (this.md5 != null ? this.md5.equals(otherObj.md5) : this.md5 == otherObj.md5) && (this.pemCertificate != null ? this.pemCertificate.equals(otherObj.pemCertificate) : this.pemCertificate == otherObj.pemCertificate) && (this.sha1 != null ? this.sha1.equals(otherObj.sha1) : this.sha1 == otherObj.sha1) && (this.subjectDN != null ? this.subjectDN.equals(otherObj.subjectDN) : this.subjectDN == otherObj.subjectDN) && (this.validNotAfter != null ? this.validNotAfter.equals(otherObj.validNotAfter) : this.validNotAfter == otherObj.validNotAfter) && (this.validNotBefore != null ? this.validNotBefore.equals(otherObj.validNotBefore) : this.validNotBefore == otherObj.validNotBefore);
    }


    public int hashCode() {
        return (this.issuerDN != null ? this.issuerDN.hashCode() : 0) ^ (this.md5 != null ? this.md5.hashCode() : 0) ^ (this.pemCertificate != null ? this.pemCertificate.hashCode() : 0) ^ (this.sha1 != null ? this.sha1.hashCode() : 0) ^ (this.subjectDN != null ? this.subjectDN.hashCode() : 0) ^ (this.validNotAfter != null ? this.validNotAfter.hashCode() : 0) ^ (this.validNotBefore != null ? this.validNotBefore.hashCode() : 0);
    }


    public String toString() {
        return "CertificateInformation [issuerDN=" + this.issuerDN + ", " + "md5=" + this.md5 + ", " + "pemCertificate=" + this.pemCertificate + ", " + "sha1=" + this.sha1 + ", " + "subjectDN=" + this.subjectDN + ", " + "validNotAfter=" + this.validNotAfter + ", " + "validNotBefore=" + this.validNotBefore + "]";
    }
}


