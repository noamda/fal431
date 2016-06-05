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
/*     */ @XmlType(name="SymmetrixGateKeepersRPAInfo", propOrder={"rpaUID", "gateKeeperPaths"})
/*     */ public class SymmetrixGateKeepersRPAInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SymmetrixDevicePath> gateKeeperPaths;
/*     */   
/*     */   public SymmetrixGateKeepersRPAInfo() {}
/*     */   
/*     */   public SymmetrixGateKeepersRPAInfo(RpaUID rpaUID, List<SymmetrixDevicePath> gateKeeperPaths)
/*     */   {
/*  52 */     this.rpaUID = rpaUID;
/*  53 */     this.gateKeeperPaths = gateKeeperPaths;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  65 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/*  77 */     this.rpaUID = value;
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
/*     */   public List<SymmetrixDevicePath> getGateKeeperPaths()
/*     */   {
/* 103 */     if (this.gateKeeperPaths == null) {
/* 104 */       this.gateKeeperPaths = new ArrayList();
/*     */     }
/* 106 */     return this.gateKeeperPaths;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof SymmetrixGateKeepersRPAInfo)) {
/* 117 */       return false;
/*     */     }
/* 119 */     SymmetrixGateKeepersRPAInfo otherObj = (SymmetrixGateKeepersRPAInfo)obj;
/*     */     
/* 121 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.gateKeeperPaths != null ? this.gateKeeperPaths.equals(otherObj.gateKeeperPaths) : this.gateKeeperPaths == otherObj.gateKeeperPaths);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.gateKeeperPaths != null ? this.gateKeeperPaths.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "SymmetrixGateKeepersRPAInfo [rpaUID=" + this.rpaUID + ", " + "gateKeeperPaths=" + this.gateKeeperPaths + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixGateKeepersRPAInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */