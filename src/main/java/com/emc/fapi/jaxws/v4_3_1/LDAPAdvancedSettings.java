/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="LDAPAdvancedSettings", propOrder={"searchTimeLimitInSeconds"})
/*    */ public class LDAPAdvancedSettings
/*    */ {
/*    */   protected long searchTimeLimitInSeconds;
/*    */   
/*    */   public LDAPAdvancedSettings() {}
/*    */   
/*    */   public LDAPAdvancedSettings(long searchTimeLimitInSeconds)
/*    */   {
/* 44 */     this.searchTimeLimitInSeconds = searchTimeLimitInSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getSearchTimeLimitInSeconds()
/*    */   {
/* 52 */     return this.searchTimeLimitInSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setSearchTimeLimitInSeconds(long value)
/*    */   {
/* 60 */     this.searchTimeLimitInSeconds = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof LDAPAdvancedSettings)) {
/* 71 */       return false;
/*    */     }
/* 73 */     LDAPAdvancedSettings otherObj = (LDAPAdvancedSettings)obj;
/*    */     
/* 75 */     return this.searchTimeLimitInSeconds == otherObj.searchTimeLimitInSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.searchTimeLimitInSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "LDAPAdvancedSettings [searchTimeLimitInSeconds=" + this.searchTimeLimitInSeconds + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LDAPAdvancedSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */