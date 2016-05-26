package com.emc.fal431;

import org.junit.Test;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by davidn1 on 15-May-16.
 */
public class TestCreateConsistencyGroup {
    private Rp4vmClient client = new Rp4vmClient(Configuration.ipAddress,Configuration.user,Configuration.password);

    public TestCreateConsistencyGroup() throws KeyManagementException, NoSuchAlgorithmException {
    }

    @Test
    public void createCg(){
        // Get list of cluster
        // Pick production cluster
        // Get list of VMs

        // Pick Vm to protect

        // Get all params

        //Protect

    }
}
