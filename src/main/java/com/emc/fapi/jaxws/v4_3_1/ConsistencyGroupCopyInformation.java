/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyInformation", propOrder={"groupCopyUID", "name", "role", "vmsInformation"})
/*     */ public class ConsistencyGroupCopyInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ConsistencyGroupCopyUID groupCopyUID;
/*     */   protected String name;
/*     */   protected ConsistencyGroupCopyRole role;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmInformation> vmsInformation;
/*     */   
/*     */   public ConsistencyGroupCopyInformation() {}
/*     */   
/*     */   public ConsistencyGroupCopyInformation(ConsistencyGroupCopyUID groupCopyUID, String name, ConsistencyGroupCopyRole role, List<VmInformation> vmsInformation)
/*     */   {
/*  58 */     this.groupCopyUID = groupCopyUID;
/*  59 */     this.name = name;
/*  60 */     this.role = role;
/*  61 */     this.vmsInformation = vmsInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopyUID()
/*     */   {
/*  73 */     return this.groupCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  85 */     this.groupCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/*  97 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 109 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyRole getRole()
/*     */   {
/* 121 */     return this.role;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRole(ConsistencyGroupCopyRole value)
/*     */   {
/* 133 */     this.role = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<VmInformation> getVmsInformation()
/*     */   {
/* 159 */     if (this.vmsInformation == null) {
/* 160 */       this.vmsInformation = new ArrayList();
/*     */     }
/* 162 */     return this.vmsInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 172 */     if (!(obj instanceof ConsistencyGroupCopyInformation)) {
/* 173 */       return false;
/*     */     }
/* 175 */     ConsistencyGroupCopyInformation otherObj = (ConsistencyGroupCopyInformation)obj;
/*     */     
/* 177 */     return (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.role != null ? this.role.equals(otherObj.role) : this.role == otherObj.role) && (this.vmsInformation != null ? this.vmsInformation.equals(otherObj.vmsInformation) : this.vmsInformation == otherObj.vmsInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 189 */     return (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.role != null ? this.role.hashCode() : 0) ^ (this.vmsInformation != null ? this.vmsInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 201 */     return "ConsistencyGroupCopyInformation [groupCopyUID=" + this.groupCopyUID + ", " + "name=" + this.name + ", " + "role=" + this.role + ", " + "vmsInformation=" + this.vmsInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */