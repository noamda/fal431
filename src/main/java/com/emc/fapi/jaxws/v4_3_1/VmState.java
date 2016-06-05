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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmState", propOrder={"vmUID", "name", "vmToolsInstalled", "virtualDisksState"})
/*     */ public class VmState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmUID vmUID;
/*     */   protected String name;
/*     */   protected boolean vmToolsInstalled;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VirtualDiskState> virtualDisksState;
/*     */   
/*     */   public VmState() {}
/*     */   
/*     */   public VmState(VmUID vmUID, String name, boolean vmToolsInstalled, List<VirtualDiskState> virtualDisksState)
/*     */   {
/*  58 */     this.vmUID = vmUID;
/*  59 */     this.name = name;
/*  60 */     this.vmToolsInstalled = vmToolsInstalled;
/*  61 */     this.virtualDisksState = virtualDisksState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUID()
/*     */   {
/*  73 */     return this.vmUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUID(VmUID value)
/*     */   {
/*  85 */     this.vmUID = value;
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
/*  97 */     return this.name;
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
/* 109 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isVmToolsInstalled()
/*     */   {
/* 117 */     return this.vmToolsInstalled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmToolsInstalled(boolean value)
/*     */   {
/* 125 */     this.vmToolsInstalled = value;
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
/*     */   public List<VirtualDiskState> getVirtualDisksState()
/*     */   {
/* 151 */     if (this.virtualDisksState == null) {
/* 152 */       this.virtualDisksState = new ArrayList();
/*     */     }
/* 154 */     return this.virtualDisksState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 164 */     if (!(obj instanceof VmState)) {
/* 165 */       return false;
/*     */     }
/* 167 */     VmState otherObj = (VmState)obj;
/*     */     
/* 169 */     return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.vmToolsInstalled == otherObj.vmToolsInstalled) && (this.virtualDisksState != null ? this.virtualDisksState.equals(otherObj.virtualDisksState) : this.virtualDisksState == otherObj.virtualDisksState);
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
/* 181 */     return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.vmToolsInstalled ? 1 : 0) ^ (this.virtualDisksState != null ? this.virtualDisksState.hashCode() : 0);
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
/* 193 */     return "VmState [vmUID=" + this.vmUID + ", " + "name=" + this.name + ", " + "vmToolsInstalled=" + this.vmToolsInstalled + ", " + "virtualDisksState=" + this.virtualDisksState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */