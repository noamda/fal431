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
public class TestGetClusterInfo {
    private Rp4vmClient client = new Rp4vmClient(Configuration.ipAddress, Configuration.user, Configuration.password);

    public TestGetClusterInfo() throws KeyManagementException, NoSuchAlgorithmException {
    }

    @Test
    public void testGetClusterInfo() {
        try {
            long clusterId = client.getClusterUID("devA1-rp-CLS01");
            long expectedId = 7389224974694197563l;
            assertEquals(expectedId, clusterId);
        } catch (Rp4vmClientException e) {
            e.printStackTrace();
        } catch (Rp4vmClusterNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Rp4vmClusterNotFoundException.class)
    public void testGetClusterInfoFailure() throws Rp4vmClusterNotFoundException {
        try {
            long clusterId = client.getClusterUID("mmmmm");
            long expectedId = 7389224974694197563l;
            assertEquals(expectedId, clusterId);
        } catch (Rp4vmClientException e) {
            e.printStackTrace();
        }
    }
}
