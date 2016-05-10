
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupVolumesState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupVolumesState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copiesVolumesState" type="{}consistencyGroupCopyVolumesState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *         &lt;element name="replicationSetsVolumesState" type="{}replicationSetVolumesState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupVolumesState", propOrder = {
    "copiesVolumesState",
    "groupUID",
    "replicationSetsVolumesState"
})
public class ConsistencyGroupVolumesState {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyVolumesState> copiesVolumesState;
    protected ConsistencyGroupUID groupUID;
    @XmlElement(nillable = true)
    protected List<ReplicationSetVolumesState> replicationSetsVolumesState;

    /**
     * Gets the value of the copiesVolumesState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiesVolumesState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiesVolumesState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyVolumesState }
     * 
     * 
     */
    public List<ConsistencyGroupCopyVolumesState> getCopiesVolumesState() {
        if (copiesVolumesState == null) {
            copiesVolumesState = new ArrayList<ConsistencyGroupCopyVolumesState>();
        }
        return this.copiesVolumesState;
    }

    /**
     * Gets the value of the groupUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public ConsistencyGroupUID getGroupUID() {
        return groupUID;
    }

    /**
     * Sets the value of the groupUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }

    /**
     * Gets the value of the replicationSetsVolumesState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replicationSetsVolumesState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplicationSetsVolumesState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationSetVolumesState }
     * 
     * 
     */
    public List<ReplicationSetVolumesState> getReplicationSetsVolumesState() {
        if (replicationSetsVolumesState == null) {
            replicationSetsVolumesState = new ArrayList<ReplicationSetVolumesState>();
        }
        return this.replicationSetsVolumesState;
    }

}
