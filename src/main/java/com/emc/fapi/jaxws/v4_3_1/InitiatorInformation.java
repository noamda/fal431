package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = FiberChannelInitiatorInformation.class, name = "FiberChannelInitiatorInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ISCSIInitiatorInformation.class, name = "ISCSIInitiatorInformation")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitiatorInformation")
@XmlSeeAlso({ISCSIInitiatorInformation.class, FiberChannelInitiatorInformation.class})
public abstract class InitiatorInformation {
}


