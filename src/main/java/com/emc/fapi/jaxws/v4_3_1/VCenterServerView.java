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
/*     */ @XmlType(name="VCenterServerView", propOrder={"connectionStatus", "esxsView", "vcServerUID"})
/*     */ public class VCenterServerView
/*     */ {
/*     */   protected VCenterServerConnectionStatus connectionStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ESXView> esxsView;
/*     */   protected VCenterServerUID vcServerUID;
/*     */   
/*     */   public VCenterServerView() {}
/*     */   
/*     */   public VCenterServerView(VCenterServerConnectionStatus connectionStatus, List<ESXView> esxsView, VCenterServerUID vcServerUID)
/*     */   {
/*  54 */     this.connectionStatus = connectionStatus;
/*  55 */     this.esxsView = esxsView;
/*  56 */     this.vcServerUID = vcServerUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerConnectionStatus getConnectionStatus()
/*     */   {
/*  68 */     return this.connectionStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectionStatus(VCenterServerConnectionStatus value)
/*     */   {
/*  80 */     this.connectionStatus = value;
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
/*     */   public List<ESXView> getEsxsView()
/*     */   {
/* 106 */     if (this.esxsView == null) {
/* 107 */       this.esxsView = new ArrayList();
/*     */     }
/* 109 */     return this.esxsView;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerUID getVcServerUID()
/*     */   {
/* 121 */     return this.vcServerUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcServerUID(VCenterServerUID value)
/*     */   {
/* 133 */     this.vcServerUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 143 */     if (!(obj instanceof VCenterServerView)) {
/* 144 */       return false;
/*     */     }
/* 146 */     VCenterServerView otherObj = (VCenterServerView)obj;
/*     */     
/* 148 */     return (this.connectionStatus != null ? this.connectionStatus.equals(otherObj.connectionStatus) : this.connectionStatus == otherObj.connectionStatus) && (this.esxsView != null ? this.esxsView.equals(otherObj.esxsView) : this.esxsView == otherObj.esxsView) && (this.vcServerUID != null ? this.vcServerUID.equals(otherObj.vcServerUID) : this.vcServerUID == otherObj.vcServerUID);
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
/* 159 */     return (this.connectionStatus != null ? this.connectionStatus.hashCode() : 0) ^ (this.esxsView != null ? this.esxsView.hashCode() : 0) ^ (this.vcServerUID != null ? this.vcServerUID.hashCode() : 0);
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
/* 170 */     return "VCenterServerView [connectionStatus=" + this.connectionStatus + ", " + "esxsView=" + this.esxsView + ", " + "vcServerUID=" + this.vcServerUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServerView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */