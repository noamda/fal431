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
/*     */ @XmlType(name="DatastoreClusterConfiguration", propOrder={"datastoreClusterUID", "name", "capacity", "freeSpace", "childDatastoresConfiguration"})
/*     */ public class DatastoreClusterConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected DatastoreClusterUID datastoreClusterUID;
/*     */   protected String name;
/*     */   protected long capacity;
/*     */   protected long freeSpace;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DatastoreConfiguration> childDatastoresConfiguration;
/*     */   
/*     */   public DatastoreClusterConfiguration() {}
/*     */   
/*     */   public DatastoreClusterConfiguration(DatastoreClusterUID datastoreClusterUID, String name, long capacity, long freeSpace, List<DatastoreConfiguration> childDatastoresConfiguration)
/*     */   {
/*  61 */     this.datastoreClusterUID = datastoreClusterUID;
/*  62 */     this.name = name;
/*  63 */     this.capacity = capacity;
/*  64 */     this.freeSpace = freeSpace;
/*  65 */     this.childDatastoresConfiguration = childDatastoresConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DatastoreClusterUID getDatastoreClusterUID()
/*     */   {
/*  77 */     return this.datastoreClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDatastoreClusterUID(DatastoreClusterUID value)
/*     */   {
/*  89 */     this.datastoreClusterUID = value;
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
/*     */   public List<DatastoreConfiguration> getChildDatastoresConfiguration()
/*     */   {
/* 171 */     if (this.childDatastoresConfiguration == null) {
/* 172 */       this.childDatastoresConfiguration = new ArrayList();
/*     */     }
/* 174 */     return this.childDatastoresConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 184 */     if (!(obj instanceof DatastoreClusterConfiguration)) {
/* 185 */       return false;
/*     */     }
/* 187 */     DatastoreClusterConfiguration otherObj = (DatastoreClusterConfiguration)obj;
/*     */     
/* 189 */     return (this.datastoreClusterUID != null ? this.datastoreClusterUID.equals(otherObj.datastoreClusterUID) : this.datastoreClusterUID == otherObj.datastoreClusterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.capacity == otherObj.capacity) && (this.freeSpace == otherObj.freeSpace) && (this.childDatastoresConfiguration != null ? this.childDatastoresConfiguration.equals(otherObj.childDatastoresConfiguration) : this.childDatastoresConfiguration == otherObj.childDatastoresConfiguration);
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
/* 202 */     return (this.datastoreClusterUID != null ? this.datastoreClusterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (int)this.capacity ^ (int)this.freeSpace ^ (this.childDatastoresConfiguration != null ? this.childDatastoresConfiguration.hashCode() : 0);
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
/* 215 */     return "DatastoreClusterConfiguration [datastoreClusterUID=" + this.datastoreClusterUID + ", " + "name=" + this.name + ", " + "capacity=" + this.capacity + ", " + "freeSpace=" + this.freeSpace + ", " + "childDatastoresConfiguration=" + this.childDatastoresConfiguration + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DatastoreClusterConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */