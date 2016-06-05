package com.emc.fal431;

import com.emc.fal431.exceptions.Rp4vmClientException;
import com.emc.fal431.exceptions.Rp4vmClusterNotFoundException;
import org.junit.Test;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidn1 on 05-Jun-16.
 */
public class TestGetVcenterId {
    private Rp4vmClient client = new Rp4vmClient(Configuration.ipAddress, Configuration.user, Configuration.password);

    public TestGetVcenterId() throws KeyManagementException, NoSuchAlgorithmException {
    }

    @Test
    public void TestGetVcenterId()  {
        long clusterId = 5639176933751451868l;
        try {
            String vcenterUuid = client.getVcenterUuid(clusterId);
            String expectedUuid = "DECF29E0-8992-4DAB-949C-CE32A443235F";
            assertEquals (vcenterUuid,expectedUuid);
        } catch (Rp4vmClientException e) {
            e.printStackTrace();
        } catch (Rp4vmClusterNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test(expected = Rp4vmClusterNotFoundException.class)
    public void TestGetVcenterIdFailure() throws Rp4vmClusterNotFoundException {
        long clusterId = 539176933751451868l;
        try {
            String vcenterUuid = client.getVcenterUuid(clusterId);
            String expectedUuid = "DECF29E0-8992-4DAB-949C-CE32A443235F";
            assertEquals (vcenterUuid,expectedUuid);
        } catch (Rp4vmClientException e) {
            e.printStackTrace();
        }

    }
}
