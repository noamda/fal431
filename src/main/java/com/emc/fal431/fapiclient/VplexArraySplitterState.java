
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vplexArraySplitterState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vplexArraySplitterState">
 *   &lt;complexContent>
 *     &lt;extension base="{}splitterState">
 *       &lt;sequence>
 *         &lt;element name="directorsState" type="{}splitterState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vplexArraySplitterState", propOrder = {
    "directorsState"
})
public class VplexArraySplitterState
    extends SplitterState
{

    @XmlElement(nillable = true)
    protected List<SplitterState> directorsState;

    /**
     * Gets the value of the directorsState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directorsState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectorsState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterState }
     * 
     * 
     */
    public List<SplitterState> getDirectorsState() {
        if (directorsState == null) {
            directorsState = new ArrayList<SplitterState>();
        }
        return this.directorsState;
    }

}
