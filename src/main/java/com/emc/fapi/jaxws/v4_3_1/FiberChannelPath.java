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
/*     */ @JsonTypeName("FiberChannelPath")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FiberChannelPath", propOrder={"remotePortWWN", "localPortWWN", "localNodeWWN"})
/*     */ public class FiberChannelPath
/*     */   extends Path
/*     */ {
/*     */   protected String remotePortWWN;
/*     */   protected String localPortWWN;
/*     */   protected String localNodeWWN;
/*     */   
/*     */   public FiberChannelPath() {}
/*     */   
/*     */   public FiberChannelPath(String remotePortWWN, String localPortWWN, String localNodeWWN)
/*     */   {
/*  60 */     this.remotePortWWN = remotePortWWN;
/*  61 */     this.localPortWWN = localPortWWN;
/*  62 */     this.localNodeWWN = localNodeWWN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRemotePortWWN()
/*     */   {
/*  74 */     return this.remotePortWWN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRemotePortWWN(String value)
/*     */   {
/*  86 */     this.remotePortWWN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocalPortWWN()
/*     */   {
/*  98 */     return this.localPortWWN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocalPortWWN(String value)
/*     */   {
/* 110 */     this.localPortWWN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocalNodeWWN()
/*     */   {
/* 122 */     return this.localNodeWWN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocalNodeWWN(String value)
/*     */   {
/* 134 */     this.localNodeWWN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 144 */     if (!(obj instanceof FiberChannelPath)) {
/* 145 */       return false;
/*     */     }
/* 147 */     FiberChannelPath otherObj = (FiberChannelPath)obj;
/*     */     
/* 149 */     return (super.equals(obj)) && (this.remotePortWWN != null ? this.remotePortWWN.equals(otherObj.remotePortWWN) : this.remotePortWWN == otherObj.remotePortWWN) && (this.localPortWWN != null ? this.localPortWWN.equals(otherObj.localPortWWN) : this.localPortWWN == otherObj.localPortWWN) && (this.localNodeWWN != null ? this.localNodeWWN.equals(otherObj.localNodeWWN) : this.localNodeWWN == otherObj.localNodeWWN);
/*     */   }
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
/* 161 */     return super.hashCode() ^ (this.remotePortWWN != null ? this.remotePortWWN.hashCode() : 0) ^ (this.localPortWWN != null ? this.localPortWWN.hashCode() : 0) ^ (this.localNodeWWN != null ? this.localNodeWWN.hashCode() : 0);
/*     */   }
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
/* 173 */     return "FiberChannelPath [super=" + super.toString() + ", " + "remotePortWWN=" + this.remotePortWWN + ", " + "localPortWWN=" + this.localPortWWN + ", " + "localNodeWWN=" + this.localNodeWWN + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FiberChannelPath.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */