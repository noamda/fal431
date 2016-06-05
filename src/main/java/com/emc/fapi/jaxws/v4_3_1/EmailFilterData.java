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
/*     */ @XmlType(name="EmailFilterData", propOrder={"targetAddressesList", "sendEventFilterID", "alertType"})
/*     */ public class EmailFilterData
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected List<String> targetAddressesList;
/*     */   @XmlElement(required=true)
/*     */   protected SystemEventLogsFilterUID sendEventFilterID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected AlertType alertType;
/*     */   
/*     */   public EmailFilterData() {}
/*     */   
/*     */   public EmailFilterData(List<String> targetAddressesList, SystemEventLogsFilterUID sendEventFilterID, AlertType alertType)
/*     */   {
/*  56 */     this.targetAddressesList = targetAddressesList;
/*  57 */     this.sendEventFilterID = sendEventFilterID;
/*  58 */     this.alertType = alertType;
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
/*     */   public List<String> getTargetAddressesList()
/*     */   {
/*  84 */     if (this.targetAddressesList == null) {
/*  85 */       this.targetAddressesList = new ArrayList();
/*     */     }
/*  87 */     return this.targetAddressesList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemEventLogsFilterUID getSendEventFilterID()
/*     */   {
/*  99 */     return this.sendEventFilterID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSendEventFilterID(SystemEventLogsFilterUID value)
/*     */   {
/* 111 */     this.sendEventFilterID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AlertType getAlertType()
/*     */   {
/* 123 */     return this.alertType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAlertType(AlertType value)
/*     */   {
/* 135 */     this.alertType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 145 */     if (!(obj instanceof EmailFilterData)) {
/* 146 */       return false;
/*     */     }
/* 148 */     EmailFilterData otherObj = (EmailFilterData)obj;
/*     */     
/* 150 */     return (this.targetAddressesList != null ? this.targetAddressesList.equals(otherObj.targetAddressesList) : this.targetAddressesList == otherObj.targetAddressesList) && (this.sendEventFilterID != null ? this.sendEventFilterID.equals(otherObj.sendEventFilterID) : this.sendEventFilterID == otherObj.sendEventFilterID) && (this.alertType != null ? this.alertType.equals(otherObj.alertType) : this.alertType == otherObj.alertType);
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
/* 161 */     return (this.targetAddressesList != null ? this.targetAddressesList.hashCode() : 0) ^ (this.sendEventFilterID != null ? this.sendEventFilterID.hashCode() : 0) ^ (this.alertType != null ? this.alertType.hashCode() : 0);
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
/* 172 */     return "EmailFilterData [targetAddressesList=" + this.targetAddressesList + ", " + "sendEventFilterID=" + this.sendEventFilterID + ", " + "alertType=" + this.alertType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EmailFilterData.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */