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
/*     */ @XmlType(name="DatastoreConfiguration", propOrder={"datastoreUID", "name", "capacity", "freeSpace", "relevantEsxsUuids"})
/*     */ public class DatastoreConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected DatastoreUID datastoreUID;
/*     */   protected String name;
/*     */   protected long capacity;
/*     */   protected long freeSpace;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EsxUID> relevantEsxsUuids;
/*     */   
/*     */   public DatastoreConfiguration() {}
/*     */   
/*     */   public DatastoreConfiguration(DatastoreUID datastoreUID, String name, long capacity, long freeSpace, List<EsxUID> relevantEsxsUuids)
/*     */   {
/*  61 */     this.datastoreUID = datastoreUID;
/*  62 */     this.name = name;
/*  63 */     this.capacity = capacity;
/*  64 */     this.freeSpace = freeSpace;
/*  65 */     this.relevantEsxsUuids = relevantEsxsUuids;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DatastoreUID getDatastoreUID()
/*     */   {
/*  77 */     return this.datastoreUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDatastoreUID(DatastoreUID value)
/*     */   {
/*  89 */     this.datastoreUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 101 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 113 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getCapacity()
/*     */   {
/* 121 */     return this.capacity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCapacity(long value)
/*     */   {
/* 129 */     this.capacity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getFreeSpace()
/*     */   {
/* 137 */     return this.freeSpace;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFreeSpace(long value)
/*     */   {
/* 145 */     this.freeSpace = value;
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
/*     */   public List<EsxUID> getRelevantEsxsUuids()
/*     */   {
/* 171 */     if (this.relevantEsxsUuids == null) {
/* 172 */       this.relevantEsxsUuids = new ArrayList();
/*     */     }
/* 174 */     return this.relevantEsxsUuids;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 184 */     if (!(obj instanceof DatastoreConfiguration)) {
/* 185 */       return false;
/*     */     }
/* 187 */     DatastoreConfiguration otherObj = (DatastoreConfiguration)obj;
/*     */     
/* 189 */     return (this.datastoreUID != null ? this.datastoreUID.equals(otherObj.datastoreUID) : this.datastoreUID == otherObj.datastoreUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.capacity == otherObj.capacity) && (this.freeSpace == otherObj.freeSpace) && (this.relevantEsxsUuids != null ? this.relevantEsxsUuids.equals(otherObj.relevantEsxsUuids) : this.relevantEsxsUuids == otherObj.relevantEsxsUuids);
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
/* 202 */     return (this.datastoreUID != null ? this.datastoreUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (int)this.capacity ^ (int)this.freeSpace ^ (this.relevantEsxsUuids != null ? this.relevantEsxsUuids.hashCode() : 0);
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
/* 215 */     return "DatastoreConfiguration [datastoreUID=" + this.datastoreUID + ", " + "name=" + this.name + ", " + "capacity=" + this.capacity + ", " + "freeSpace=" + this.freeSpace + ", " + "relevantEsxsUuids=" + this.relevantEsxsUuids + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DatastoreConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */