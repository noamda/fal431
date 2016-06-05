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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="NicCustomizationPolicy", propOrder={"adapterId", "dnsDomain", "dnsServers", "primaryWINS", "netBios", "secondaryWINS", "ipV4Policy", "ipV6Policy"})
/*     */ public class NicCustomizationPolicy
/*     */ {
/*     */   protected int adapterId;
/*     */   protected String dnsDomain;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> dnsServers;
/*     */   protected String primaryWINS;
/*     */   @XmlElement(required=true)
/*     */   protected NetBiosMode netBios;
/*     */   protected String secondaryWINS;
/*     */   protected IPv4CustomizationPolicy ipV4Policy;
/*     */   protected IPv6CustomizationPolicy ipV6Policy;
/*     */   
/*     */   public NicCustomizationPolicy() {}
/*     */   
/*     */   public NicCustomizationPolicy(int adapterId, String dnsDomain, List<String> dnsServers, String primaryWINS, NetBiosMode netBios, String secondaryWINS, IPv4CustomizationPolicy ipV4Policy, IPv6CustomizationPolicy ipV6Policy)
/*     */   {
/*  70 */     this.adapterId = adapterId;
/*  71 */     this.dnsDomain = dnsDomain;
/*  72 */     this.dnsServers = dnsServers;
/*  73 */     this.primaryWINS = primaryWINS;
/*  74 */     this.netBios = netBios;
/*  75 */     this.secondaryWINS = secondaryWINS;
/*  76 */     this.ipV4Policy = ipV4Policy;
/*  77 */     this.ipV6Policy = ipV6Policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getAdapterId()
/*     */   {
/*  85 */     return this.adapterId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAdapterId(int value)
/*     */   {
/*  93 */     this.adapterId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDnsDomain()
/*     */   {
/* 105 */     return this.dnsDomain;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDnsDomain(String value)
/*     */   {
/* 117 */     this.dnsDomain = value;
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
/*     */   public List<String> getDnsServers()
/*     */   {
/* 143 */     if (this.dnsServers == null) {
/* 144 */       this.dnsServers = new ArrayList();
/*     */     }
/* 146 */     return this.dnsServers;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getPrimaryWINS()
/*     */   {
/* 158 */     return this.primaryWINS;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPrimaryWINS(String value)
/*     */   {
/* 170 */     this.primaryWINS = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public NetBiosMode getNetBios()
/*     */   {
/* 182 */     return this.netBios;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNetBios(NetBiosMode value)
/*     */   {
/* 194 */     this.netBios = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSecondaryWINS()
/*     */   {
/* 206 */     return this.secondaryWINS;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecondaryWINS(String value)
/*     */   {
/* 218 */     this.secondaryWINS = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPv4CustomizationPolicy getIpV4Policy()
/*     */   {
/* 230 */     return this.ipV4Policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIpV4Policy(IPv4CustomizationPolicy value)
/*     */   {
/* 242 */     this.ipV4Policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPv6CustomizationPolicy getIpV6Policy()
/*     */   {
/* 254 */     return this.ipV6Policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIpV6Policy(IPv6CustomizationPolicy value)
/*     */   {
/* 266 */     this.ipV6Policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 276 */     if (!(obj instanceof NicCustomizationPolicy)) {
/* 277 */       return false;
/*     */     }
/* 279 */     NicCustomizationPolicy otherObj = (NicCustomizationPolicy)obj;
/*     */     
/* 281 */     return (this.adapterId == otherObj.adapterId) && (this.dnsDomain != null ? this.dnsDomain.equals(otherObj.dnsDomain) : this.dnsDomain == otherObj.dnsDomain) && (this.dnsServers != null ? this.dnsServers.equals(otherObj.dnsServers) : this.dnsServers == otherObj.dnsServers) && (this.primaryWINS != null ? this.primaryWINS.equals(otherObj.primaryWINS) : this.primaryWINS == otherObj.primaryWINS) && (this.netBios != null ? this.netBios.equals(otherObj.netBios) : this.netBios == otherObj.netBios) && (this.secondaryWINS != null ? this.secondaryWINS.equals(otherObj.secondaryWINS) : this.secondaryWINS == otherObj.secondaryWINS) && (this.ipV4Policy != null ? this.ipV4Policy.equals(otherObj.ipV4Policy) : this.ipV4Policy == otherObj.ipV4Policy) && (this.ipV6Policy != null ? this.ipV6Policy.equals(otherObj.ipV6Policy) : this.ipV6Policy == otherObj.ipV6Policy);
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
/*     */   public int hashCode()
/*     */   {
/* 297 */     return this.adapterId ^ (this.dnsDomain != null ? this.dnsDomain.hashCode() : 0) ^ (this.dnsServers != null ? this.dnsServers.hashCode() : 0) ^ (this.primaryWINS != null ? this.primaryWINS.hashCode() : 0) ^ (this.netBios != null ? this.netBios.hashCode() : 0) ^ (this.secondaryWINS != null ? this.secondaryWINS.hashCode() : 0) ^ (this.ipV4Policy != null ? this.ipV4Policy.hashCode() : 0) ^ (this.ipV6Policy != null ? this.ipV6Policy.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 313 */     return "NicCustomizationPolicy [adapterId=" + this.adapterId + ", " + "dnsDomain=" + this.dnsDomain + ", " + "dnsServers=" + this.dnsServers + ", " + "primaryWINS=" + this.primaryWINS + ", " + "netBios=" + this.netBios + ", " + "secondaryWINS=" + this.secondaryWINS + ", " + "ipV4Policy=" + this.ipV4Policy + ", " + "ipV6Policy=" + this.ipV6Policy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\NicCustomizationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */