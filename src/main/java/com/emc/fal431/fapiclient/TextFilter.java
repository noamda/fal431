
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allRelevant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="texts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textFilter", propOrder = {
    "allRelevant",
    "texts"
})
public class TextFilter {

    protected boolean allRelevant;
    @XmlElement(nillable = true)
    protected List<String> texts;

    /**
     * Gets the value of the allRelevant property.
     * 
     */
    public boolean isAllRelevant() {
        return allRelevant;
    }

    /**
     * Sets the value of the allRelevant property.
     * 
     */
    public void setAllRelevant(boolean value) {
        this.allRelevant = value;
    }

    /**
     * Gets the value of the texts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTexts() {
        if (texts == null) {
            texts = new ArrayList<String>();
        }
        return this.texts;
    }

}
