package test;

import java.util.List;

/**
 * Created by davidn1 on 04-May-16.
 */
public class JsonPojo {
    private String name;
    private String url;
    private List<JsonInner> fields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<JsonInner> getFields() {
        return fields;
    }

    public void setFields(List<JsonInner> fields) {
        this.fields = fields;
    }
}
