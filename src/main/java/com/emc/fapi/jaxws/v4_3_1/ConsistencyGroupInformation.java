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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupInformation", propOrder={"groupUID", "name", "enabled", "productionCopiesUID", "groupCopiesInformation"})
/*     */ public class ConsistencyGroupInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   protected String name;
/*     */   protected boolean enabled;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> productionCopiesUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyInformation> groupCopiesInformation;
/*     */   
/*     */   public ConsistencyGroupInformation() {}
/*     */   
/*     */   public ConsistencyGroupInformation(ConsistencyGroupUID groupUID, String name, boolean enabled, List<ConsistencyGroupCopyUID> productionCopiesUID, List<ConsistencyGroupCopyInformation> groupCopiesInformation)
/*     */   {
/*  62 */     this.groupUID = groupUID;
/*  63 */     this.name = name;
/*  64 */     this.enabled = enabled;
/*  65 */     this.productionCopiesUID = productionCopiesUID;
/*  66 */     this.groupCopiesInformation = groupCopiesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroupUID()
/*     */   {
/*  78 */     return this.groupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupUID(ConsistencyGroupUID value)
/*     */   {
/*  90 */     this.groupUID = value;
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
/* 102 */     return this.name;
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
/* 114 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/* 122 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/* 130 */     this.enabled = value;
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
/*     */   public List<ConsistencyGroupCopyUID> getProductionCopiesUID()
/*     */   {
/* 156 */     if (this.productionCopiesUID == null) {
/* 157 */       this.productionCopiesUID = new ArrayList();
/*     */     }
/* 159 */     return this.productionCopiesUID;
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
/*     */   public List<ConsistencyGroupCopyInformation> getGroupCopiesInformation()
/*     */   {
/* 185 */     if (this.groupCopiesInformation == null) {
/* 186 */       this.groupCopiesInformation = new ArrayList();
/*     */     }
/* 188 */     return this.groupCopiesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 198 */     if (!(obj instanceof ConsistencyGroupInformation)) {
/* 199 */       return false;
/*     */     }
/* 201 */     ConsistencyGroupInformation otherObj = (ConsistencyGroupInformation)obj;
/*     */     
/* 203 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.enabled == otherObj.enabled) && (this.productionCopiesUID != null ? this.productionCopiesUID.equals(otherObj.productionCopiesUID) : this.productionCopiesUID == otherObj.productionCopiesUID) && (this.groupCopiesInformation != null ? this.groupCopiesInformation.equals(otherObj.groupCopiesInformation) : this.groupCopiesInformation == otherObj.groupCopiesInformation);
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
/*     */   public int hashCode()
/*     */   {
/* 216 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.productionCopiesUID != null ? this.productionCopiesUID.hashCode() : 0) ^ (this.groupCopiesInformation != null ? this.groupCopiesInformation.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 229 */     return "ConsistencyGroupInformation [groupUID=" + this.groupUID + ", " + "name=" + this.name + ", " + "enabled=" + this.enabled + ", " + "productionCopiesUID=" + this.productionCopiesUID + ", " + "groupCopiesInformation=" + this.groupCopiesInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */