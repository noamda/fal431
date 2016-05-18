package com.emc.fal431.exceptions;

/**
 * Created by davidn1 on 15-May-16.
 */
public class Rp4vmClientUnAuthorizedException extends Rp4vmClientException {

    public Rp4vmClientUnAuthorizedException(String msg) {
        super(msg);
    }

    public Rp4vmClientUnAuthorizedException(Exception e) {
        super(e);
    }

    public Rp4vmClientUnAuthorizedException() {
        super("Unauthorized");
    }
}
