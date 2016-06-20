package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applyBalanceLoadRecommendation", propOrder = {"recommendation"})
public class ApplyBalanceLoadRecommendation {
    @XmlElement(nillable = true)
    protected BalanceLoadRecommendation recommendation;

    public ApplyBalanceLoadRecommendation() {
    }

    public ApplyBalanceLoadRecommendation(BalanceLoadRecommendation recommendation) {
        this.recommendation = recommendation;
    }


    public BalanceLoadRecommendation getRecommendation() {
        return this.recommendation;
    }


    public void setRecommendation(BalanceLoadRecommendation value) {
        this.recommendation = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ApplyBalanceLoadRecommendation)) {
            return false;
        }
        ApplyBalanceLoadRecommendation otherObj = (ApplyBalanceLoadRecommendation) obj;

        return this.recommendation == otherObj.recommendation ? true : this.recommendation != null ? this.recommendation.equals(otherObj.recommendation) : false;
    }


    public int hashCode() {
        return this.recommendation != null ? this.recommendation.hashCode() : 0;
    }


    public String toString() {
        return "ApplyBalanceLoadRecommendation [recommendation=" + this.recommendation + "]";
    }
}


