package com.emc.fal431.exceptions;

import java.io.IOException;

/**
 * Created by davidn1 on 15-May-16.
 */
public class Rp4vmClientException extends Throwable {
    public Rp4vmClientException(String msg) {
        super(msg);
    }

    public Rp4vmClientException(Exception e) {
        super(e);
    }
}
