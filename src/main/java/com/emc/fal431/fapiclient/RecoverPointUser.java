
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recoverPointUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recoverPointUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groups" type="{}consistencyGroupUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="logsFilter" type="{}userEventLogsFilter" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{}recoverPointUserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recoverPointUser", propOrder = {
    "groups",
    "logsFilter",
    "name",
    "password",
    "roleName",
    "userType"
})
public class RecoverPointUser {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groups;
    protected UserEventLogsFilter logsFilter;
    protected String name;
    protected byte[] password;
    protected String roleName;
    protected RecoverPointUserType userType;

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

    /**
     * Gets the value of the logsFilter property.
     * 
     * @return
     *     possible object is
     *     {@link UserEventLogsFilter }
     *     
     */
    public UserEventLogsFilter getLogsFilter() {
        return logsFilter;
    }

    /**
     * Sets the value of the logsFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserEventLogsFilter }
     *     
     */
    public void setLogsFilter(UserEventLogsFilter value) {
        this.logsFilter = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPassword(byte[] value) {
        this.password = ((byte[]) value);
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointUserType }
     *     
     */
    public RecoverPointUserType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointUserType }
     *     
     */
    public void setUserType(RecoverPointUserType value) {
        this.userType = value;
    }

}
