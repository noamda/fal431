
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imageAccessParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imageAccessParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageType" type="{}searchImageType" minOccurs="0"/>
 *         &lt;element name="maximumSearchRange" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mode" type="{}imageAccessMode" minOccurs="0"/>
 *         &lt;element name="searchExactText" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="searchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imageAccessParameters", propOrder = {
    "imageType",
    "maximumSearchRange",
    "mode",
    "searchExactText",
    "searchText",
    "timeStamp"
})
public class ImageAccessParameters {

    protected SearchImageType imageType;
    protected Long maximumSearchRange;
    protected ImageAccessMode mode;
    protected boolean searchExactText;
    protected String searchText;
    protected RecoverPointTimeStamp timeStamp;

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchImageType }
     *     
     */
    public SearchImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchImageType }
     *     
     */
    public void setImageType(SearchImageType value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the maximumSearchRange property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumSearchRange() {
        return maximumSearchRange;
    }

    /**
     * Sets the value of the maximumSearchRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumSearchRange(Long value) {
        this.maximumSearchRange = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ImageAccessMode }
     *     
     */
    public ImageAccessMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAccessMode }
     *     
     */
    public void setMode(ImageAccessMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the searchExactText property.
     * 
     */
    public boolean isSearchExactText() {
        return searchExactText;
    }

    /**
     * Sets the value of the searchExactText property.
     * 
     */
    public void setSearchExactText(boolean value) {
        this.searchExactText = value;
    }

    /**
     * Gets the value of the searchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Sets the value of the searchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setTimeStamp(RecoverPointTimeStamp value) {
        this.timeStamp = value;
    }

}
