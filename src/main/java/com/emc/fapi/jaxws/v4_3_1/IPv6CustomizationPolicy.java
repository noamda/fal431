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
/*     */ @JsonTypeName("IPv6CustomizationPolicy")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="IPv6CustomizationPolicy", propOrder={"ipV6SubnetPrefixLength"})
/*     */ public class IPv6CustomizationPolicy
/*     */   extends IPCustomizationPolicy
/*     */ {
/*     */   protected int ipV6SubnetPrefixLength;
/*     */   
/*     */   public IPv6CustomizationPolicy() {}
/*     */   
/*     */   public IPv6CustomizationPolicy(int ipV6SubnetPrefixLength)
/*     */   {
/*  54 */     this.ipV6SubnetPrefixLength = ipV6SubnetPrefixLength;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getIpV6SubnetPrefixLength()
/*     */   {
/*  62 */     return this.ipV6SubnetPrefixLength;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIpV6SubnetPrefixLength(int value)
/*     */   {
/*  70 */     this.ipV6SubnetPrefixLength = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof IPv6CustomizationPolicy)) {
/*  81 */       return false;
/*     */     }
/*  83 */     IPv6CustomizationPolicy otherObj = (IPv6CustomizationPolicy)obj;
/*     */     
/*  85 */     return (super.equals(obj)) && (this.ipV6SubnetPrefixLength == otherObj.ipV6SubnetPrefixLength);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  95 */     return super.hashCode() ^ this.ipV6SubnetPrefixLength;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 105 */     return "IPv6CustomizationPolicy [super=" + super.toString() + ", " + "ipV6SubnetPrefixLength=" + this.ipV6SubnetPrefixLength + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\IPv6CustomizationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */