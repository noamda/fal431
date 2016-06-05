package com.emc.fal431.exceptions;

/**
 * Created by davidn1 on 05-Jun-16.
 */
public class Rp4vmClusterNotFoundException extends Throwable {
    public Rp4vmClusterNotFoundException(String msg) {
        super(msg);
    }

    public Rp4vmClusterNotFoundException(long clusterID, String ipAddress) {
        this("Cluster " + clusterID + " not found in system " + ipAddress);
    }
}
