package com.emc.fal431.exceptions;

/**
 * Created by davidn1 on 05-Jun-16.
 */
public class Rp4vmEsxNotFoundException extends Throwable {
    public Rp4vmEsxNotFoundException(String msg) {
        super(msg);
    }

    public Rp4vmEsxNotFoundException(long clusterID, String ipAddress ,String esxClusterName) {
        this(esxClusterName + " not found in Cluster " + clusterID + " in system " + ipAddress);
    }
}
