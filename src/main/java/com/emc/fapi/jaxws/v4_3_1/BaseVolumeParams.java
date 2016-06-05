package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VolumeSelectionParam.class, name="VolumeSelectionParam"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VolumeCreationParams.class, name="VolumeCreationParams")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BaseVolumeParams")
@XmlSeeAlso({VolumeSelectionParam.class, VolumeCreationParams.class})
public abstract class BaseVolumeParams {}


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BaseVolumeParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */