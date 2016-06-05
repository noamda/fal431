package com.emc.fal431;

import com.emc.fal431.exceptions.Rp4vmClientException;
import org.junit.Test;


import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by davidn1 on 15-May-16.
 */
public class TestBasicServices {
    private Rp4vmClient client = new Rp4vmClient(Configuration.ipAddress,Configuration.user,Configuration.password);

    public TestBasicServices() throws KeyManagementException, NoSuchAlgorithmException {
    }

//    @Test
//    public void testGetSystemTime() throws KeyManagementException, NoSuchAlgorithmException {
//        try {
//            System.out.println(client.getRp4vmTime());
//        } catch (Rp4vmClientException e) {
//            e.printStackTrace();
//        }
//    }



//    @Test
//    public void testGetClusterNames() throws KeyManagementException, NoSuchAlgorithmException {
//
//        Map<Long, String> clusters= null;
//        try {
//            clusters = client.getClusterNames();
//        } catch (Rp4vmClientException e) {
//            e.printStackTrace();
//        }
//
//        for(Map.Entry<Long,String > cluster:clusters.entrySet()){
//            System.out.println(cluster.getKey()+" : "+cluster.getValue());
//        }
//
//    }
//
//    @Test
//    public void testGetVmNamesInCluster() throws KeyManagementException, NoSuchAlgorithmException, Rp4vmClientException {
//
//        Map<Long, String> clusters= null;
//        try {
//            clusters = client.getClusterNames();
//        } catch (Rp4vmClientException e) {
//            e.printStackTrace();
//        }
//
//        for(Map.Entry<Long,String > cluster:clusters.entrySet()){
//            System.out.println(cluster.getKey());
//            Long ClustId = cluster.getKey();
//            Map<String, String> VmList = new HashMap<>();
//            VmList = client.getVmNamesInCluster(ClustId);
//            System.out.println(VmList);
//
//        }
//
//
//
//    }
}
