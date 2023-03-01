package com.icicilombard.marine;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.blazesoft.server.base.NdServerException;
import com.blazesoft.server.base.NdServerRuntimeException;
import com.blazesoft.server.deploy.webservice.NdWebServiceDeploymentBase;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


//==> Import Application specific code here
//@WebService(
//		portName = "MarinePort",
//		serviceName = "MarineService",
//		targetNamespace = "http://marine.icicilombard.com")
@Endpoint
public class Marine extends NdWebServiceDeploymentBase {

    private static final String NAMESPACE_URI = "http://marine.icicilombard.com";

    public Marine() {
        super();
    }

    /**
     * invokes a server process based on the entry point "calcMarinePremium"
     * in the service "Marine" configured in the Quick Deployer.
     *
     * @param arg0 ==>Enter a description here
     * @return String    ==>Enter a description of the return value
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "calcMarinePremium")
    @ResponsePayload
    @ResponseBody
    public JAXBElement<String> calcMarinePremium(@RequestPayload JAXBElement<CalcMarinePremium> arg0) throws Exception {
        Object[] applicationArgs = new Object[1];
        applicationArgs[0] = arg0.getValue().getArg0();
        return new JAXBElement(new QName(NAMESPACE_URI, "calcMarinePremium"),
                String.class, (String) getDelegateServer().invokeService("Marine", "calcMarinePremium", null, applicationArgs));
    }

    @PostConstruct
    public void init() {
        try {
            super.initialize();
        } catch (NdServerException e) {
            throw new NdServerRuntimeException(e);
        }
    }

    @PreDestroy
    public void destroy() {
        try {
            super.shutdown();
        } catch (NdServerException e) {
            throw new NdServerRuntimeException(e);
        }
    }

}
