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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DatacenterEntitiesInformation", propOrder={"dcUID", "vmEntitiesInformation"})
/*     */ public class DatacenterEntitiesInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected DatacenterUID dcUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VMEntitiesInformation> vmEntitiesInformation;
/*     */   
/*     */   public DatacenterEntitiesInformation() {}
/*     */   
/*     */   public DatacenterEntitiesInformation(DatacenterUID dcUID, List<VMEntitiesInformation> vmEntitiesInformation)
/*     */   {
/*  52 */     this.dcUID = dcUID;
/*  53 */     this.vmEntitiesInformation = vmEntitiesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DatacenterUID getDcUID()
/*     */   {
/*  65 */     return this.dcUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDcUID(DatacenterUID value)
/*     */   {
/*  77 */     this.dcUID = value;
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
/*     */   public List<VMEntitiesInformation> getVmEntitiesInformation()
/*     */   {
/* 103 */     if (this.vmEntitiesInformation == null) {
/* 104 */       this.vmEntitiesInformation = new ArrayList();
/*     */     }
/* 106 */     return this.vmEntitiesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof DatacenterEntitiesInformation)) {
/* 117 */       return false;
/*     */     }
/* 119 */     DatacenterEntitiesInformation otherObj = (DatacenterEntitiesInformation)obj;
/*     */     
/* 121 */     return (this.dcUID != null ? this.dcUID.equals(otherObj.dcUID) : this.dcUID == otherObj.dcUID) && (this.vmEntitiesInformation != null ? this.vmEntitiesInformation.equals(otherObj.vmEntitiesInformation) : this.vmEntitiesInformation == otherObj.vmEntitiesInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.dcUID != null ? this.dcUID.hashCode() : 0) ^ (this.vmEntitiesInformation != null ? this.vmEntitiesInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "DatacenterEntitiesInformation [dcUID=" + this.dcUID + ", " + "vmEntitiesInformation=" + this.vmEntitiesInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DatacenterEntitiesInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */