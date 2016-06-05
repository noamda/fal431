/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlType(name="addVmsToCG", propOrder={"vms", "cgUID"})
/*     */ public class AddVmsToCG
/*     */ {
/*     */   protected List<VMReplicationSetParam> vms;
/*     */   protected ConsistencyGroupUID cgUID;
/*     */   
/*     */   public AddVmsToCG() {}
/*     */   
/*     */   public AddVmsToCG(List<VMReplicationSetParam> vms, ConsistencyGroupUID cgUID)
/*     */   {
/*  49 */     this.vms = vms;
/*  50 */     this.cgUID = cgUID;
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
/*     */   public List<VMReplicationSetParam> getVms()
/*     */   {
/*  76 */     if (this.vms == null) {
/*  77 */       this.vms = new ArrayList();
/*     */     }
/*  79 */     return this.vms;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getCgUID()
/*     */   {
/*  91 */     return this.cgUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCgUID(ConsistencyGroupUID value)
/*     */   {
/* 103 */     this.cgUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof AddVmsToCG)) {
/* 114 */       return false;
/*     */     }
/* 116 */     AddVmsToCG otherObj = (AddVmsToCG)obj;
/*     */     
/* 118 */     return (this.vms != null ? this.vms.equals(otherObj.vms) : this.vms == otherObj.vms) && (this.cgUID != null ? this.cgUID.equals(otherObj.cgUID) : this.cgUID == otherObj.cgUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.vms != null ? this.vms.hashCode() : 0) ^ (this.cgUID != null ? this.cgUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "AddVmsToCG [vms=" + this.vms + ", " + "cgUID=" + this.cgUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddVmsToCG.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */