
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for symmetrixSplitterState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="symmetrixSplitterState">
 *   &lt;complexContent>
 *     &lt;extension base="{}splitterState">
 *       &lt;sequence>
 *         &lt;element name="srdfVolumes" type="{}deviceUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "symmetrixSplitterState", propOrder = {
    "srdfVolumes"
})
public class SymmetrixSplitterState
    extends SplitterState
{

    @XmlElement(nillable = true)
    protected List<DeviceUID> srdfVolumes;

    /**
     * Gets the value of the srdfVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srdfVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrdfVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceUID }
     * 
     * 
     */
    public List<DeviceUID> getSrdfVolumes() {
        if (srdfVolumes == null) {
            srdfVolumes = new ArrayList<DeviceUID>();
        }
        return this.srdfVolumes;
    }

}
