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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VirtualCenterEntitiesInformation", propOrder={"virtualCenterUID", "name", "dcEntitiesInformation"})
/*     */ public class VirtualCenterEntitiesInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VirtualCenterUID virtualCenterUID;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DatacenterEntitiesInformation> dcEntitiesInformation;
/*     */   
/*     */   public VirtualCenterEntitiesInformation() {}
/*     */   
/*     */   public VirtualCenterEntitiesInformation(VirtualCenterUID virtualCenterUID, String name, List<DatacenterEntitiesInformation> dcEntitiesInformation)
/*     */   {
/*  55 */     this.virtualCenterUID = virtualCenterUID;
/*  56 */     this.name = name;
/*  57 */     this.dcEntitiesInformation = dcEntitiesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVirtualCenterUID()
/*     */   {
/*  69 */     return this.virtualCenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualCenterUID(VirtualCenterUID value)
/*     */   {
/*  81 */     this.virtualCenterUID = value;
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
/*  93 */     return this.name;
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
/* 105 */     this.name = value;
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
/*     */   public List<DatacenterEntitiesInformation> getDcEntitiesInformation()
/*     */   {
/* 131 */     if (this.dcEntitiesInformation == null) {
/* 132 */       this.dcEntitiesInformation = new ArrayList();
/*     */     }
/* 134 */     return this.dcEntitiesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 144 */     if (!(obj instanceof VirtualCenterEntitiesInformation)) {
/* 145 */       return false;
/*     */     }
/* 147 */     VirtualCenterEntitiesInformation otherObj = (VirtualCenterEntitiesInformation)obj;
/*     */     
/* 149 */     return (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.dcEntitiesInformation != null ? this.dcEntitiesInformation.equals(otherObj.dcEntitiesInformation) : this.dcEntitiesInformation == otherObj.dcEntitiesInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 160 */     return (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.dcEntitiesInformation != null ? this.dcEntitiesInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 171 */     return "VirtualCenterEntitiesInformation [virtualCenterUID=" + this.virtualCenterUID + ", " + "name=" + this.name + ", " + "dcEntitiesInformation=" + this.dcEntitiesInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualCenterEntitiesInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */