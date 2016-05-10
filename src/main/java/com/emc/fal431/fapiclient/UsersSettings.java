
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usersSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usersSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ldapSettings" minOccurs="0"/>
 *         &lt;element name="users" type="{}recoverPointUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usersRoles" type="{}userRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usersSettings", propOrder = {
    "ldapSettings",
    "users",
    "usersRoles"
})
public class UsersSettings {

    protected LdapSettings ldapSettings;
    @XmlElement(nillable = true)
    protected List<RecoverPointUser> users;
    @XmlElement(nillable = true)
    protected List<UserRole> usersRoles;

    /**
     * Gets the value of the ldapSettings property.
     * 
     * @return
     *     possible object is
     *     {@link LdapSettings }
     *     
     */
    public LdapSettings getLdapSettings() {
        return ldapSettings;
    }

    /**
     * Sets the value of the ldapSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapSettings }
     *     
     */
    public void setLdapSettings(LdapSettings value) {
        this.ldapSettings = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecoverPointUser }
     * 
     * 
     */
    public List<RecoverPointUser> getUsers() {
        if (users == null) {
            users = new ArrayList<RecoverPointUser>();
        }
        return this.users;
    }

    /**
     * Gets the value of the usersRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usersRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsersRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserRole }
     * 
     * 
     */
    public List<UserRole> getUsersRoles() {
        if (usersRoles == null) {
            usersRoles = new ArrayList<UserRole>();
        }
        return this.usersRoles;
    }

}
