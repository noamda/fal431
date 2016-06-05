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
/*     */ @XmlType(name="VnxServer", propOrder={"vnxUID", "username", "authenticationType", "certificateConfigured", "endPoints"})
/*     */ public class VnxServer
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VnxUID vnxUID;
/*     */   protected String username;
/*     */   @XmlElement(nillable=true)
/*     */   protected AuthenticationType authenticationType;
/*     */   protected boolean certificateConfigured;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VnxEndPoint> endPoints;
/*     */   
/*     */   public VnxServer() {}
/*     */   
/*     */   public VnxServer(VnxUID vnxUID, String username, AuthenticationType authenticationType, boolean certificateConfigured, List<VnxEndPoint> endPoints)
/*     */   {
/*  62 */     this.vnxUID = vnxUID;
/*  63 */     this.username = username;
/*  64 */     this.authenticationType = authenticationType;
/*  65 */     this.certificateConfigured = certificateConfigured;
/*  66 */     this.endPoints = endPoints;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VnxUID getVnxUID()
/*     */   {
/*  78 */     return this.vnxUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVnxUID(VnxUID value)
/*     */   {
/*  90 */     this.vnxUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUsername()
/*     */   {
/* 102 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(String value)
/*     */   {
/* 114 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AuthenticationType getAuthenticationType()
/*     */   {
/* 126 */     return this.authenticationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAuthenticationType(AuthenticationType value)
/*     */   {
/* 138 */     this.authenticationType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isCertificateConfigured()
/*     */   {
/* 146 */     return this.certificateConfigured;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCertificateConfigured(boolean value)
/*     */   {
/* 154 */     this.certificateConfigured = value;
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
/*     */   public List<VnxEndPoint> getEndPoints()
/*     */   {
/* 180 */     if (this.endPoints == null) {
/* 181 */       this.endPoints = new ArrayList();
/*     */     }
/* 183 */     return this.endPoints;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 193 */     if (!(obj instanceof VnxServer)) {
/* 194 */       return false;
/*     */     }
/* 196 */     VnxServer otherObj = (VnxServer)obj;
/*     */     
/* 198 */     return (this.vnxUID != null ? this.vnxUID.equals(otherObj.vnxUID) : this.vnxUID == otherObj.vnxUID) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType) && (this.certificateConfigured == otherObj.certificateConfigured) && (this.endPoints != null ? this.endPoints.equals(otherObj.endPoints) : this.endPoints == otherObj.endPoints);
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
/* 211 */     return (this.vnxUID != null ? this.vnxUID.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0) ^ (this.certificateConfigured ? 1 : 0) ^ (this.endPoints != null ? this.endPoints.hashCode() : 0);
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
/* 224 */     return "VnxServer [vnxUID=" + this.vnxUID + ", " + "username=" + this.username + ", " + "authenticationType=" + this.authenticationType + ", " + "certificateConfigured=" + this.certificateConfigured + ", " + "endPoints=" + this.endPoints + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VnxServer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */