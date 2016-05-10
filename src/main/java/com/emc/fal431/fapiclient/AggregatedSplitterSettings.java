
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aggregatedSplitterSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aggregatedSplitterSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}splitterSettings">
 *       &lt;sequence>
 *         &lt;element name="singleSplittersInfo" type="{}splitterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aggregatedSplitterSettings", propOrder = {
    "singleSplittersInfo"
})
@XmlSeeAlso({
    Vnx2ESplitterSettings.class
})
public class AggregatedSplitterSettings
    extends SplitterSettings
{

    @XmlElement(nillable = true)
    protected List<SplitterInfo> singleSplittersInfo;

    /**
     * Gets the value of the singleSplittersInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleSplittersInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleSplittersInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterInfo }
     * 
     * 
     */
    public List<SplitterInfo> getSingleSplittersInfo() {
        if (singleSplittersInfo == null) {
            singleSplittersInfo = new ArrayList<SplitterInfo>();
        }
        return this.singleSplittersInfo;
    }

}
