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
/*     */ @XmlType(name="ArrayManagementProviderState", propOrder={"ampUID", "arraysState", "connectivityInfo"})
/*     */ public class ArrayManagementProviderState
/*     */ {
/*     */   protected ArrayManagementProviderUID ampUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayState> arraysState;
/*     */   protected ArrayConnectivityInfo connectivityInfo;
/*     */   
/*     */   public ArrayManagementProviderState() {}
/*     */   
/*     */   public ArrayManagementProviderState(ArrayManagementProviderUID ampUID, List<ArrayState> arraysState, ArrayConnectivityInfo connectivityInfo)
/*     */   {
/*  54 */     this.ampUID = ampUID;
/*  55 */     this.arraysState = arraysState;
/*  56 */     this.connectivityInfo = connectivityInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayManagementProviderUID getAmpUID()
/*     */   {
/*  68 */     return this.ampUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAmpUID(ArrayManagementProviderUID value)
/*     */   {
/*  80 */     this.ampUID = value;
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
/*     */   public List<ArrayState> getArraysState()
/*     */   {
/* 106 */     if (this.arraysState == null) {
/* 107 */       this.arraysState = new ArrayList();
/*     */     }
/* 109 */     return this.arraysState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayConnectivityInfo getConnectivityInfo()
/*     */   {
/* 121 */     return this.connectivityInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectivityInfo(ArrayConnectivityInfo value)
/*     */   {
/* 133 */     this.connectivityInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 143 */     if (!(obj instanceof ArrayManagementProviderState)) {
/* 144 */       return false;
/*     */     }
/* 146 */     ArrayManagementProviderState otherObj = (ArrayManagementProviderState)obj;
/*     */     
/* 148 */     return (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.arraysState != null ? this.arraysState.equals(otherObj.arraysState) : this.arraysState == otherObj.arraysState) && (this.connectivityInfo != null ? this.connectivityInfo.equals(otherObj.connectivityInfo) : this.connectivityInfo == otherObj.connectivityInfo);
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
/* 159 */     return (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.arraysState != null ? this.arraysState.hashCode() : 0) ^ (this.connectivityInfo != null ? this.connectivityInfo.hashCode() : 0);
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
/* 170 */     return "ArrayManagementProviderState [ampUID=" + this.ampUID + ", " + "arraysState=" + this.arraysState + ", " + "connectivityInfo=" + this.connectivityInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayManagementProviderState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */