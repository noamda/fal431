package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ImageAccessQueryParameters")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAccessQueryParameters", propOrder = {"params"})
public class ImageAccessQueryParameters
        extends ImageAccessGeneralParameters {
    @XmlElement(required = true)
    protected ImageAccessParameters params;

    public ImageAccessQueryParameters() {
    }

    public ImageAccessQueryParameters(ImageAccessParameters params) {
        this.params = params;
    }


    public ImageAccessParameters getParams() {
        return this.params;
    }


    public void setParams(ImageAccessParameters value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ImageAccessQueryParameters)) {
            return false;
        }
        ImageAccessQueryParameters otherObj = (ImageAccessQueryParameters) obj;

        return (super.equals(obj)) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.params != null ? this.params.hashCode() : 0);
    }


    public String toString() {
        return "ImageAccessQueryParameters [super=" + super.toString() + ", " + "params=" + this.params + "]";
    }
}


