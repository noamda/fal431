package com.emc.fal431;

import com.emc.fal431.exceptions.Rp4vmClientException;
import com.emc.fal431.exceptions.Rp4vmClusterNotFoundException;
import com.emc.fal431.exceptions.Rp4vmEsxNotFoundException;
import org.junit.Test;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidn1 on 06-Jun-16.
 */
public class TestGetEsxId {
    private Rp4vmClient client = new Rp4vmClient(Configuration.ipAddress, Configuration.user, Configuration.password);

    public TestGetEsxId() throws KeyManagementException, NoSuchAlgorithmException {
    }

    @Test
    public void testGetEsxId()  {
        try {
            long clusterId = 5639176933751451868l;
            String esxName = "bdg-deva3esx01.dmbubdg.emc";
            String esxId = client.getEsxId(clusterId,esxName);
        } catch (Rp4vmClientException e) {
            e.printStackTrace();
        } catch (Rp4vmEsxNotFoundException e) {
            e.printStackTrace();
        } catch (Rp4vmClusterNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Rp4vmEsxNotFoundException.class)
    public void testGetEsxIdFailure() throws Rp4vmEsxNotFoundException {
        try {
            long clusterId = 5639176933751451868l;
            String esxName = "bdg-deva3esx01.dmbubdg.em";
            String esxId = client.getEsxId(clusterId,esxName);
        } catch (Rp4vmClientException e) {
            e.printStackTrace();

        } catch (Rp4vmClusterNotFoundException e) {
            e.printStackTrace();
        }
    }
}
