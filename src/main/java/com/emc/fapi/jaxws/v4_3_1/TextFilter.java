package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextFilter", propOrder = {"allRelevant", "texts"})
public class TextFilter {
    protected boolean allRelevant;
    @XmlElement(nillable = true)
    protected List<String> texts;

    public TextFilter() {
    }

    public TextFilter(boolean allRelevant, List<String> texts) {
        this.allRelevant = allRelevant;
        this.texts = texts;
    }


    public boolean isAllRelevant() {
        return this.allRelevant;
    }


    public void setAllRelevant(boolean value) {
        this.allRelevant = value;
    }


    public List<String> getTexts() {
        if (this.texts == null) {
            this.texts = new ArrayList();
        }
        return this.texts;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TextFilter)) {
            return false;
        }
        TextFilter otherObj = (TextFilter) obj;

        return (this.allRelevant == otherObj.allRelevant) && (this.texts != null ? this.texts.equals(otherObj.texts) : this.texts == otherObj.texts);
    }


    public int hashCode() {
        return (this.allRelevant ? 1 : 0) ^ (this.texts != null ? this.texts.hashCode() : 0);
    }


    public String toString() {
        return "TextFilter [allRelevant=" + this.allRelevant + ", " + "texts=" + this.texts + "]";
    }
}


