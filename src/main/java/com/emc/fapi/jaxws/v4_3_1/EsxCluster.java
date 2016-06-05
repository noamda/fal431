/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlType(name="EsxCluster", propOrder={"esxClusterUID", "name", "virtualCenterUID"})
/*     */ public class EsxCluster
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected EsxClusterUID esxClusterUID;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected VirtualCenterUID virtualCenterUID;
/*     */   
/*     */   public EsxCluster() {}
/*     */   
/*     */   public EsxCluster(EsxClusterUID esxClusterUID, String name, VirtualCenterUID virtualCenterUID)
/*     */   {
/*  53 */     this.esxClusterUID = esxClusterUID;
/*  54 */     this.name = name;
/*  55 */     this.virtualCenterUID = virtualCenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxClusterUID getEsxClusterUID()
/*     */   {
/*  67 */     return this.esxClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEsxClusterUID(EsxClusterUID value)
/*     */   {
/*  79 */     this.esxClusterUID = value;
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
/*  91 */     return this.name;
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
/* 103 */     this.name = value;
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
/* 115 */     return this.virtualCenterUID;
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
/* 127 */     this.virtualCenterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 137 */     if (!(obj instanceof EsxCluster)) {
/* 138 */       return false;
/*     */     }
/* 140 */     EsxCluster otherObj = (EsxCluster)obj;
/*     */     
/* 142 */     return (this.esxClusterUID != null ? this.esxClusterUID.equals(otherObj.esxClusterUID) : this.esxClusterUID == otherObj.esxClusterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID);
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
/* 153 */     return (this.esxClusterUID != null ? this.esxClusterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0);
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
/* 164 */     return "EsxCluster [esxClusterUID=" + this.esxClusterUID + ", " + "name=" + this.name + ", " + "virtualCenterUID=" + this.virtualCenterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EsxCluster.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */