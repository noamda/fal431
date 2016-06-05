/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ISCSIPath")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ISCSIPath", propOrder={"remoteIqn", "remoteIpInformation", "remotePort", "localIqn", "localIpInformation"})
/*     */ public class ISCSIPath
/*     */   extends Path
/*     */ {
/*     */   protected String remoteIqn;
/*     */   protected IPInformation remoteIpInformation;
/*     */   protected Integer remotePort;
/*     */   protected String localIqn;
/*     */   protected IPInformation localIpInformation;
/*     */   
/*     */   public ISCSIPath() {}
/*     */   
/*     */   public ISCSIPath(String remoteIqn, IPInformation remoteIpInformation, Integer remotePort, String localIqn, IPInformation localIpInformation)
/*     */   {
/*  66 */     this.remoteIqn = remoteIqn;
/*  67 */     this.remoteIpInformation = remoteIpInformation;
/*  68 */     this.remotePort = remotePort;
/*  69 */     this.localIqn = localIqn;
/*  70 */     this.localIpInformation = localIpInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRemoteIqn()
/*     */   {
/*  82 */     return this.remoteIqn;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRemoteIqn(String value)
/*     */   {
/*  94 */     this.remoteIqn = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPInformation getRemoteIpInformation()
/*     */   {
/* 106 */     return this.remoteIpInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRemoteIpInformation(IPInformation value)
/*     */   {
/* 118 */     this.remoteIpInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getRemotePort()
/*     */   {
/* 130 */     return this.remotePort;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRemotePort(Integer value)
/*     */   {
/* 142 */     this.remotePort = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocalIqn()
/*     */   {
/* 154 */     return this.localIqn;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocalIqn(String value)
/*     */   {
/* 166 */     this.localIqn = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPInformation getLocalIpInformation()
/*     */   {
/* 178 */     return this.localIpInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocalIpInformation(IPInformation value)
/*     */   {
/* 190 */     this.localIpInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 200 */     if (!(obj instanceof ISCSIPath)) {
/* 201 */       return false;
/*     */     }
/* 203 */     ISCSIPath otherObj = (ISCSIPath)obj;
/*     */     
/* 205 */     return (super.equals(obj)) && (this.remoteIqn != null ? this.remoteIqn.equals(otherObj.remoteIqn) : this.remoteIqn == otherObj.remoteIqn) && (this.remoteIpInformation != null ? this.remoteIpInformation.equals(otherObj.remoteIpInformation) : this.remoteIpInformation == otherObj.remoteIpInformation) && (this.remotePort != null ? this.remotePort.equals(otherObj.remotePort) : this.remotePort == otherObj.remotePort) && (this.localIqn != null ? this.localIqn.equals(otherObj.localIqn) : this.localIqn == otherObj.localIqn) && (this.localIpInformation != null ? this.localIpInformation.equals(otherObj.localIpInformation) : this.localIpInformation == otherObj.localIpInformation);
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
/*     */   public int hashCode()
/*     */   {
/* 219 */     return super.hashCode() ^ (this.remoteIqn != null ? this.remoteIqn.hashCode() : 0) ^ (this.remoteIpInformation != null ? this.remoteIpInformation.hashCode() : 0) ^ (this.remotePort != null ? this.remotePort.hashCode() : 0) ^ (this.localIqn != null ? this.localIqn.hashCode() : 0) ^ (this.localIpInformation != null ? this.localIpInformation.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 233 */     return "ISCSIPath [super=" + super.toString() + ", " + "remoteIqn=" + this.remoteIqn + ", " + "remoteIpInformation=" + this.remoteIpInformation + ", " + "remotePort=" + this.remotePort + ", " + "localIqn=" + this.localIqn + ", " + "localIpInformation=" + this.localIpInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ISCSIPath.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */