
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBookmarkParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBookmarkParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookmarkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consistencyType" type="{}snapshotConsistencyType" minOccurs="0"/>
 *         &lt;element name="consolidationPolicy" type="{}bookmarkConsolidationPolicy" minOccurs="0"/>
 *         &lt;element name="groups" type="{}consistencyGroupUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBookmarkParams", propOrder = {
    "bookmarkName",
    "consistencyType",
    "consolidationPolicy",
    "groups"
})
public class CreateBookmarkParams {

    protected String bookmarkName;
    protected SnapshotConsistencyType consistencyType;
    protected BookmarkConsolidationPolicy consolidationPolicy;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groups;

    /**
     * Gets the value of the bookmarkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookmarkName() {
        return bookmarkName;
    }

    /**
     * Sets the value of the bookmarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookmarkName(String value) {
        this.bookmarkName = value;
    }

    /**
     * Gets the value of the consistencyType property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotConsistencyType }
     *     
     */
    public SnapshotConsistencyType getConsistencyType() {
        return consistencyType;
    }

    /**
     * Sets the value of the consistencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotConsistencyType }
     *     
     */
    public void setConsistencyType(SnapshotConsistencyType value) {
        this.consistencyType = value;
    }

    /**
     * Gets the value of the consolidationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BookmarkConsolidationPolicy }
     *     
     */
    public BookmarkConsolidationPolicy getConsolidationPolicy() {
        return consolidationPolicy;
    }

    /**
     * Sets the value of the consolidationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookmarkConsolidationPolicy }
     *     
     */
    public void setConsolidationPolicy(BookmarkConsolidationPolicy value) {
        this.consolidationPolicy = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupUID }
     * 
     * 
     */
    public List<ConsistencyGroupUID> getGroups() {
        if (groups == null) {
            groups = new ArrayList<ConsistencyGroupUID>();
        }
        return this.groups;
    }

}
