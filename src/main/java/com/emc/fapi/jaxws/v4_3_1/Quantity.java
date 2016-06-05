/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="Quantity", propOrder={"value", "type"})
/*     */ public class Quantity
/*     */ {
/*     */   protected long value;
/*     */   @XmlElement(required=true)
/*     */   protected QuantityType type;
/*     */   
/*     */   public Quantity() {}
/*     */   
/*     */   public Quantity(long value, QuantityType type)
/*     */   {
/*  49 */     this.value = value;
/*  50 */     this.type = type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getValue()
/*     */   {
/*  58 */     return this.value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setValue(long value)
/*     */   {
/*  66 */     this.value = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public QuantityType getType()
/*     */   {
/*  78 */     return this.type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setType(QuantityType value)
/*     */   {
/*  90 */     this.type = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof Quantity)) {
/* 101 */       return false;
/*     */     }
/* 103 */     Quantity otherObj = (Quantity)obj;
/*     */     
/* 105 */     return (this.value == otherObj.value) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (int)this.value ^ (this.type != null ? this.type.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "Quantity [value=" + this.value + ", " + "type=" + this.type + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Quantity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */