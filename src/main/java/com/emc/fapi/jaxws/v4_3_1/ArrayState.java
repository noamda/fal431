/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VCArrayState.class, name="VCArrayState")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayState", propOrder={"arrayUID", "connectivityInfo", "capabilities", "rpSupportedCapabilities", "arrayLimitations", "resourcePoolState", "version"})
/*     */ @XmlSeeAlso({VCArrayState.class})
/*     */ public class ArrayState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   protected ArrayConnectivityInfo connectivityInfo;
/*     */   protected ArrayCapabilities capabilities;
/*     */   protected RpSupportedArrayCapabilities rpSupportedCapabilities;
/*     */   @XmlElement(nillable=true)
/*     */   protected MonitoredParametersStatus arrayLimitations;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayResourcePoolState> resourcePoolState;
/*     */   protected String version;
/*     */   
/*     */   public ArrayState() {}
/*     */   
/*     */   public ArrayState(ArrayUID arrayUID, ArrayConnectivityInfo connectivityInfo, ArrayCapabilities capabilities, RpSupportedArrayCapabilities rpSupportedCapabilities, MonitoredParametersStatus arrayLimitations, List<ArrayResourcePoolState> resourcePoolState, String version)
/*     */   {
/*  83 */     this.arrayUID = arrayUID;
/*  84 */     this.connectivityInfo = connectivityInfo;
/*  85 */     this.capabilities = capabilities;
/*  86 */     this.rpSupportedCapabilities = rpSupportedCapabilities;
/*  87 */     this.arrayLimitations = arrayLimitations;
/*  88 */     this.resourcePoolState = resourcePoolState;
/*  89 */     this.version = version;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayUID getArrayUID()
/*     */   {
/* 101 */     return this.arrayUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUID(ArrayUID value)
/*     */   {
/* 113 */     this.arrayUID = value;
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
/* 125 */     return this.connectivityInfo;
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
/* 137 */     this.connectivityInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayCapabilities getCapabilities()
/*     */   {
/* 149 */     return this.capabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCapabilities(ArrayCapabilities value)
/*     */   {
/* 161 */     this.capabilities = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpSupportedArrayCapabilities getRpSupportedCapabilities()
/*     */   {
/* 173 */     return this.rpSupportedCapabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpSupportedCapabilities(RpSupportedArrayCapabilities value)
/*     */   {
/* 185 */     this.rpSupportedCapabilities = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitoredParametersStatus getArrayLimitations()
/*     */   {
/* 197 */     return this.arrayLimitations;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayLimitations(MonitoredParametersStatus value)
/*     */   {
/* 209 */     this.arrayLimitations = value;
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
/*     */   public List<ArrayResourcePoolState> getResourcePoolState()
/*     */   {
/* 235 */     if (this.resourcePoolState == null) {
/* 236 */       this.resourcePoolState = new ArrayList();
/*     */     }
/* 238 */     return this.resourcePoolState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVersion()
/*     */   {
/* 250 */     return this.version;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVersion(String value)
/*     */   {
/* 262 */     this.version = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 272 */     if (!(obj instanceof ArrayState)) {
/* 273 */       return false;
/*     */     }
/* 275 */     ArrayState otherObj = (ArrayState)obj;
/*     */     
/* 277 */     return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.connectivityInfo != null ? this.connectivityInfo.equals(otherObj.connectivityInfo) : this.connectivityInfo == otherObj.connectivityInfo) && (this.capabilities != null ? this.capabilities.equals(otherObj.capabilities) : this.capabilities == otherObj.capabilities) && (this.rpSupportedCapabilities != null ? this.rpSupportedCapabilities.equals(otherObj.rpSupportedCapabilities) : this.rpSupportedCapabilities == otherObj.rpSupportedCapabilities) && (this.arrayLimitations != null ? this.arrayLimitations.equals(otherObj.arrayLimitations) : this.arrayLimitations == otherObj.arrayLimitations) && (this.resourcePoolState != null ? this.resourcePoolState.equals(otherObj.resourcePoolState) : this.resourcePoolState == otherObj.resourcePoolState) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version);
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
/*     */   public int hashCode()
/*     */   {
/* 292 */     return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.connectivityInfo != null ? this.connectivityInfo.hashCode() : 0) ^ (this.capabilities != null ? this.capabilities.hashCode() : 0) ^ (this.rpSupportedCapabilities != null ? this.rpSupportedCapabilities.hashCode() : 0) ^ (this.arrayLimitations != null ? this.arrayLimitations.hashCode() : 0) ^ (this.resourcePoolState != null ? this.resourcePoolState.hashCode() : 0) ^ (this.version != null ? this.version.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 307 */     return "ArrayState [arrayUID=" + this.arrayUID + ", " + "connectivityInfo=" + this.connectivityInfo + ", " + "capabilities=" + this.capabilities + ", " + "rpSupportedCapabilities=" + this.rpSupportedCapabilities + ", " + "arrayLimitations=" + this.arrayLimitations + ", " + "resourcePoolState=" + this.resourcePoolState + ", " + "version=" + this.version + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */