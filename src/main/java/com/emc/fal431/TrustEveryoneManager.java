package com.emc.fal431;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

class TrustEveryoneManager implements X509TrustManager {
    @Override
    public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException { }

    @Override
    public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException { }

    @Override
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}