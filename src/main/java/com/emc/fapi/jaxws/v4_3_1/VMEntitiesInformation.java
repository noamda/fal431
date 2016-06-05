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
/*     */ @XmlType(name="VMEntitiesInformation", propOrder={"vmUID", "name", "disksSet"})
/*     */ public class VMEntitiesInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmUID vmUID;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VirtualDiskInformation> disksSet;
/*     */   
/*     */   public VMEntitiesInformation() {}
/*     */   
/*     */   public VMEntitiesInformation(VmUID vmUID, String name, List<VirtualDiskInformation> disksSet)
/*     */   {
/*  55 */     this.vmUID = vmUID;
/*  56 */     this.name = name;
/*  57 */     this.disksSet = disksSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUID()
/*     */   {
/*  69 */     return this.vmUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUID(VmUID value)
/*     */   {
/*  81 */     this.vmUID = value;
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
/*     */   public List<VirtualDiskInformation> getDisksSet()
/*     */   {
/* 131 */     if (this.disksSet == null) {
/* 132 */       this.disksSet = new ArrayList();
/*     */     }
/* 134 */     return this.disksSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 144 */     if (!(obj instanceof VMEntitiesInformation)) {
/* 145 */       return false;
/*     */     }
/* 147 */     VMEntitiesInformation otherObj = (VMEntitiesInformation)obj;
/*     */     
/* 149 */     return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.disksSet != null ? this.disksSet.equals(otherObj.disksSet) : this.disksSet == otherObj.disksSet);
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
/* 160 */     return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.disksSet != null ? this.disksSet.hashCode() : 0);
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
/* 171 */     return "VMEntitiesInformation [vmUID=" + this.vmUID + ", " + "name=" + this.name + ", " + "disksSet=" + this.disksSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VMEntitiesInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */