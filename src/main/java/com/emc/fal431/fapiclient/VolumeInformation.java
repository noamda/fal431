
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasLicense" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naaUid" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onArrayWithRepository" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rawUid" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorSpecificInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumeID" type="{}deviceUID" minOccurs="0"/>
 *         &lt;element name="volumeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}volumeStorageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeInformation", propOrder = {
    "hasLicense",
    "modelName",
    "naaUid",
    "onArrayWithRepository",
    "productName",
    "rawUid",
    "serialNumber",
    "sizeInBytes",
    "vendorName",
    "vendorSpecificInformation",
    "volumeID",
    "volumeName",
    "volumeStorageType"
})
@XmlSeeAlso({
    VplexVolumeInformation.class,
    SymmetrixVolumeInformation.class,
    ClariionVolumeInformation.class
})
public class VolumeInformation {

    protected Boolean hasLicense;
    protected String modelName;
    @XmlElement(nillable = true)
    protected List<Byte> naaUid;
    protected Boolean onArrayWithRepository;
    protected String productName;
    @XmlElement(nillable = true)
    protected List<Byte> rawUid;
    protected String serialNumber;
    protected Long sizeInBytes;
    protected String vendorName;
    protected String vendorSpecificInformation;
    protected DeviceUID volumeID;
    protected String volumeName;
    protected VolumeStorageType volumeStorageType;

    /**
     * Gets the value of the hasLicense property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLicense() {
        return hasLicense;
    }

    /**
     * Sets the value of the hasLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLicense(Boolean value) {
        this.hasLicense = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the naaUid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naaUid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaaUid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * 
     * 
     */
    public List<Byte> getNaaUid() {
        if (naaUid == null) {
            naaUid = new ArrayList<Byte>();
        }
        return this.naaUid;
    }

    /**
     * Gets the value of the onArrayWithRepository property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnArrayWithRepository() {
        return onArrayWithRepository;
    }

    /**
     * Sets the value of the onArrayWithRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnArrayWithRepository(Boolean value) {
        this.onArrayWithRepository = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the rawUid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rawUid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRawUid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * 
     * 
     */
    public List<Byte> getRawUid() {
        if (rawUid == null) {
            rawUid = new ArrayList<Byte>();
        }
        return this.rawUid;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the sizeInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * Sets the value of the sizeInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSizeInBytes(Long value) {
        this.sizeInBytes = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorSpecificInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorSpecificInformation() {
        return vendorSpecificInformation;
    }

    /**
     * Sets the value of the vendorSpecificInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorSpecificInformation(String value) {
        this.vendorSpecificInformation = value;
    }

    /**
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUID }
     *     
     */
    public DeviceUID getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUID }
     *     
     */
    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }

    /**
     * Gets the value of the volumeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * Sets the value of the volumeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeName(String value) {
        this.volumeName = value;
    }

    /**
     * Gets the value of the volumeStorageType property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeStorageType }
     *     
     */
    public VolumeStorageType getVolumeStorageType() {
        return volumeStorageType;
    }

    /**
     * Sets the value of the volumeStorageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeStorageType }
     *     
     */
    public void setVolumeStorageType(VolumeStorageType value) {
        this.volumeStorageType = value;
    }

}
