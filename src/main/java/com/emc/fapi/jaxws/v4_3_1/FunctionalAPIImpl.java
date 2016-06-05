package com.emc.fapi.jaxws.v4_3_1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name="FunctionalAPIImpl", targetNamespace="http://impl.version4_3_1.fapi.emc.com/")
@XmlSeeAlso({ObjectFactory.class})
public abstract interface FunctionalAPIImpl
{
  @WebMethod
  @RequestWrapper(localName="clearSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ClearSettings")
  @ResponseWrapper(localName="clearSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ClearSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearSettings/Fault/FunctionalAPIInternalError")})
  public abstract void clearSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGlobalLinksState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGlobalLinksState")
  @ResponseWrapper(localName="getGlobalLinksStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGlobalLinksStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGlobalLinksStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGlobalLinksStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGlobalLinksState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGlobalLinksState/Fault/FunctionalAPIInternalError")})
  public abstract List<GlobalLinkState> getGlobalLinksState()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllRecoveryActivities", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllRecoveryActivities")
  @ResponseWrapper(localName="getAllRecoveryActivitiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllRecoveryActivitiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoveryActivitiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoveryActivitiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoveryActivities/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoveryActivities/Fault/FunctionalAPIInternalError")})
  public abstract List<BaseRecoveryActivity> getAllRecoveryActivities()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getMonitoredParametersStatus", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetMonitoredParametersStatus")
  @ResponseWrapper(localName="getMonitoredParametersStatusResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetMonitoredParametersStatusResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getMonitoredParametersStatusRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getMonitoredParametersStatusResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getMonitoredParametersStatus/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getMonitoredParametersStatus/Fault/FunctionalAPIInternalError")})
  public abstract MonitoredParametersStatus getMonitoredParametersStatus()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRPAsStateFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRPAsStateFromAllClusters")
  @ResponseWrapper(localName="getRPAsStateFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRPAsStateFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterRPAsState> getRPAsStateFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRPAsStateFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRPAsStateFromCluster")
  @ResponseWrapper(localName="getRPAsStateFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRPAsStateFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAsStateFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterRPAsState getRPAsStateFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRPAState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRPAState")
  @ResponseWrapper(localName="getRPAStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRPAStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRPAState/Fault/FunctionalAPIInternalError")})
  public abstract RPAState getRPAState(@WebParam(name="rpa", targetNamespace="") RpaUID paramRpaUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemSettings")
  @ResponseWrapper(localName="getSystemSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettings/Fault/FunctionalAPIInternalError")})
  public abstract SystemSettings getSystemSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemSettingsConflicts", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemSettingsConflicts")
  @ResponseWrapper(localName="getSystemSettingsConflictsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemSettingsConflictsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettingsConflictsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettingsConflictsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettingsConflicts/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemSettingsConflicts/Fault/FunctionalAPIInternalError")})
  public abstract SystemSettingsConflicts getSystemSettingsConflicts()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getManagementSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetManagementSettings")
  @ResponseWrapper(localName="getManagementSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetManagementSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getManagementSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getManagementSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getManagementSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getManagementSettings/Fault/FunctionalAPIInternalError")})
  public abstract ManagementSettings getManagementSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemStatus", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemStatus")
  @ResponseWrapper(localName="getSystemStatusResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemStatusResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatusRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatusResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatus/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatus/Fault/FunctionalAPIInternalError")})
  public abstract SystemStatus getSystemStatus()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifyRPAStateWithDefaultTimeout", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyRPAStateWithDefaultTimeout")
  @ResponseWrapper(localName="verifyRPAStateWithDefaultTimeoutResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyRPAStateWithDefaultTimeoutResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAStateWithDefaultTimeoutRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAStateWithDefaultTimeoutResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAStateWithDefaultTimeout/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAStateWithDefaultTimeout/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifyRPAStateWithDefaultTimeout(@WebParam(name="rpa", targetNamespace="") RpaUID paramRpaUID, @WebParam(name="state", targetNamespace="") VerifyRPAStateParam paramVerifyRPAStateParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifyRPAState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyRPAState")
  @ResponseWrapper(localName="verifyRPAStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyRPAStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyRPAState/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifyRPAState(@WebParam(name="rpa", targetNamespace="") RpaUID paramRpaUID, @WebParam(name="state", targetNamespace="") VerifyRPAStateParam paramVerifyRPAStateParam, @WebParam(name="timeoutInSeconds", targetNamespace="") long paramLong)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="collectLogs", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CollectLogs")
  @ResponseWrapper(localName="collectLogsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CollectLogsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/collectLogsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/collectLogsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/collectLogs/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/collectLogs/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID collectLogs(@WebParam(name="params", targetNamespace="") CollectLogsParams paramCollectLogsParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemGlobalPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemGlobalPolicy")
  @ResponseWrapper(localName="getSystemGlobalPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemGlobalPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemGlobalPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemGlobalPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemGlobalPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemGlobalPolicy/Fault/FunctionalAPIInternalError")})
  public abstract SystemGlobalPolicy getSystemGlobalPolicy()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultSystemGlobalPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultSystemGlobalPolicy")
  @ResponseWrapper(localName="getDefaultSystemGlobalPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultSystemGlobalPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultSystemGlobalPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultSystemGlobalPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultSystemGlobalPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultSystemGlobalPolicy/Fault/FunctionalAPIInternalError")})
  public abstract SystemGlobalPolicy getDefaultSystemGlobalPolicy()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSystemGlobalPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemGlobalPolicy")
  @ResponseWrapper(localName="setSystemGlobalPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemGlobalPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemGlobalPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemGlobalPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemGlobalPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemGlobalPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setSystemGlobalPolicy(@WebParam(name="policy", targetNamespace="") SystemGlobalPolicy paramSystemGlobalPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="resolveSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResolveSettings")
  @ResponseWrapper(localName="resolveSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResolveSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resolveSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resolveSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resolveSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resolveSettings/Fault/FunctionalAPIInternalError")})
  public abstract void resolveSettings(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultConsistencyGroupPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultConsistencyGroupPolicy")
  @ResponseWrapper(localName="getDefaultConsistencyGroupPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultConsistencyGroupPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupPolicy/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupPolicy getDefaultConsistencyGroupPolicy()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultConsistencyGroupCopyPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultConsistencyGroupCopyPolicy")
  @ResponseWrapper(localName="getDefaultConsistencyGroupCopyPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultConsistencyGroupCopyPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupCopyPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupCopyPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupCopyPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupCopyPolicy/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupCopyPolicy getDefaultConsistencyGroupCopyPolicy()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultConsistencyGroupLinkPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultConsistencyGroupLinkPolicy")
  @ResponseWrapper(localName="getDefaultConsistencyGroupLinkPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultConsistencyGroupLinkPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupLinkPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupLinkPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupLinkPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultConsistencyGroupLinkPolicy/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupLinkPolicy getDefaultConsistencyGroupLinkPolicy(@WebParam(name="isLocalLink", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableSplittersFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSplittersFromAllClusters")
  @ResponseWrapper(localName="getAvailableSplittersFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSplittersFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterAvailableSplitters> getAvailableSplittersFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableSplittersFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSplittersFromCluster")
  @ResponseWrapper(localName="getAvailableSplittersFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSplittersFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterAvailableSplitters getAvailableSplittersFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableSplittersToAttachToVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSplittersToAttachToVolume")
  @ResponseWrapper(localName="getAvailableSplittersToAttachToVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSplittersToAttachToVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersToAttachToVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersToAttachToVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersToAttachToVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSplittersToAttachToVolume/Fault/FunctionalAPIInternalError")})
  public abstract List<SplitterUID> getAvailableSplittersToAttachToVolume(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplittersWithUnattachedVolumes", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersWithUnattachedVolumes")
  @ResponseWrapper(localName="getSplittersWithUnattachedVolumesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersWithUnattachedVolumesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersWithUnattachedVolumesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersWithUnattachedVolumesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersWithUnattachedVolumes/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersWithUnattachedVolumes/Fault/FunctionalAPIInternalError")})
  public abstract List<SplitterUID> getSplittersWithUnattachedVolumes(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableVolumesToAttachToSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVolumesToAttachToSplitter")
  @ResponseWrapper(localName="getAvailableVolumesToAttachToSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVolumesToAttachToSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesToAttachToSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesToAttachToSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesToAttachToSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesToAttachToSplitter/Fault/FunctionalAPIInternalError")})
  public abstract List<DeviceUID> getAvailableVolumesToAttachToSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="filterUnseenVolumes", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplitterName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterName")
  @ResponseWrapper(localName="getSplitterNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterName/Fault/FunctionalAPIInternalError")})
  public abstract String getSplitterName(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSplitter")
  @ResponseWrapper(localName="addSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSplitter/Fault/FunctionalAPIInternalError")})
  public abstract void addSplitter(@WebParam(name="splitterInfo", targetNamespace="") SplitterInfo paramSplitterInfo)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setAttachedVolumesForSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetAttachedVolumesForSplitter")
  @ResponseWrapper(localName="setAttachedVolumesForSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetAttachedVolumesForSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setAttachedVolumesForSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setAttachedVolumesForSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setAttachedVolumesForSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setAttachedVolumesForSplitter/Fault/FunctionalAPIInternalError")})
  public abstract void setAttachedVolumesForSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumes", targetNamespace="") List<SetVolumeParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetAttachedVolumesForSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetAttachedVolumesForSplitter")
  @ResponseWrapper(localName="validateSetAttachedVolumesForSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetAttachedVolumesForSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetAttachedVolumesForSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetAttachedVolumesForSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetAttachedVolumesForSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetAttachedVolumesForSplitter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetAttachedVolumesForSplitter/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetAttachedVolumesForSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumes", targetNamespace="") List<SetVolumeParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="attachVolumeToSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AttachVolumeToSplitter")
  @ResponseWrapper(localName="attachVolumeToSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AttachVolumeToSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumeToSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumeToSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumeToSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumeToSplitter/Fault/FunctionalAPIInternalError")})
  public abstract void attachVolumeToSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumeParam", targetNamespace="") SetVolumeParam paramSetVolumeParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAttachVolumeToSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAttachVolumeToSplitter")
  @ResponseWrapper(localName="validateAttachVolumeToSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAttachVolumeToSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumeToSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumeToSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumeToSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumeToSplitter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumeToSplitter/Fault/FunctionalAPIValidationException")})
  public abstract void validateAttachVolumeToSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumeParam", targetNamespace="") SetVolumeParam paramSetVolumeParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="attachVolumesToSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AttachVolumesToSplitter")
  @ResponseWrapper(localName="attachVolumesToSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AttachVolumesToSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumesToSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumesToSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumesToSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachVolumesToSplitter/Fault/FunctionalAPIInternalError")})
  public abstract void attachVolumesToSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumesParams", targetNamespace="") List<SetVolumeParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAttachVolumesToSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAttachVolumesToSplitter")
  @ResponseWrapper(localName="validateAttachVolumesToSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAttachVolumesToSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumesToSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumesToSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumesToSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumesToSplitter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAttachVolumesToSplitter/Fault/FunctionalAPIValidationException")})
  public abstract void validateAttachVolumesToSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumesParams", targetNamespace="") List<SetVolumeParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="detachVolumeFromSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetachVolumeFromSplitter")
  @ResponseWrapper(localName="detachVolumeFromSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetachVolumeFromSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumeFromSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumeFromSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumeFromSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumeFromSplitter/Fault/FunctionalAPIInternalError")})
  public abstract void detachVolumeFromSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDetachVolumeFromSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDetachVolumeFromSplitter")
  @ResponseWrapper(localName="validateDetachVolumeFromSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDetachVolumeFromSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumeFromSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumeFromSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumeFromSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumeFromSplitter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumeFromSplitter/Fault/FunctionalAPIValidationException")})
  public abstract void validateDetachVolumeFromSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="detachVolumesFromSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetachVolumesFromSplitter")
  @ResponseWrapper(localName="detachVolumesFromSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetachVolumesFromSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumesFromSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumesFromSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumesFromSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachVolumesFromSplitter/Fault/FunctionalAPIInternalError")})
  public abstract void detachVolumesFromSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumesIDs", targetNamespace="") List<DeviceUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDetachVolumesFromSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDetachVolumesFromSplitter")
  @ResponseWrapper(localName="validateDetachVolumesFromSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDetachVolumesFromSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumesFromSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumesFromSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumesFromSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumesFromSplitter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDetachVolumesFromSplitter/Fault/FunctionalAPIValidationException")})
  public abstract void validateDetachVolumesFromSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="volumesIDs", targetNamespace="") List<DeviceUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplittersSANViewFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSANViewFromAllClusters")
  @ResponseWrapper(localName="getSplittersSANViewFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSANViewFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterSplittersSANView> getSplittersSANViewFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplittersSANViewFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSANViewFromCluster")
  @ResponseWrapper(localName="getSplittersSANViewFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSANViewFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSANViewFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterSplittersSANView getSplittersSANViewFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplitterSANView", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterSANView")
  @ResponseWrapper(localName="getSplitterSANViewResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterSANViewResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSANViewRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSANViewResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSANView/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSANView/Fault/FunctionalAPIInternalError")})
  public abstract SplitterSANView getSplitterSANView(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplittersSettingsFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSettingsFromAllClusters")
  @ResponseWrapper(localName="getSplittersSettingsFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSettingsFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterSplittersSettings> getSplittersSettingsFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplittersSettingsFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSettingsFromCluster")
  @ResponseWrapper(localName="getSplittersSettingsFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersSettingsFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersSettingsFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterSplittersSettings getSplittersSettingsFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplitterSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterSettings")
  @ResponseWrapper(localName="getSplitterSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterSettings/Fault/FunctionalAPIInternalError")})
  public abstract SplitterSettings getSplitterSettings(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplittersStateFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersStateFromAllClusters")
  @ResponseWrapper(localName="getSplittersStateFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersStateFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterSplittersState> getSplittersStateFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplittersStateFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersStateFromCluster")
  @ResponseWrapper(localName="getSplittersStateFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplittersStateFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplittersStateFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterSplittersState getSplittersStateFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSplitterState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterState")
  @ResponseWrapper(localName="getSplitterStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSplitterStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSplitterState/Fault/FunctionalAPIInternalError")})
  public abstract SplitterState getSplitterState(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSplitterAutoRegisterRPAsInitiatorsPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSplitterAutoRegisterRPAsInitiatorsPolicy")
  @ResponseWrapper(localName="setSplitterAutoRegisterRPAsInitiatorsPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSplitterAutoRegisterRPAsInitiatorsPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSplitterAutoRegisterRPAsInitiatorsPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSplitterAutoRegisterRPAsInitiatorsPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSplitterAutoRegisterRPAsInitiatorsPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSplitterAutoRegisterRPAsInitiatorsPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setSplitterAutoRegisterRPAsInitiatorsPolicy(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="autoRegisterRPAsInitiatorsPolicy", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSplitter")
  @ResponseWrapper(localName="removeSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSplitter/Fault/FunctionalAPIInternalError")})
  public abstract void removeSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveSplitter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveSplitter")
  @ResponseWrapper(localName="validateRemoveSplitterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveSplitterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSplitterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSplitterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSplitter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSplitter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSplitter/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveSplitter(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterVirtualEntitiesInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterVirtualEntitiesInformation")
  @ResponseWrapper(localName="getClusterVirtualEntitiesInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterVirtualEntitiesInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualEntitiesInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualEntitiesInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualEntitiesInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualEntitiesInformation/Fault/FunctionalAPIInternalError")})
  public abstract ClusterVirtualEntitiesInformation getClusterVirtualEntitiesInformation(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVirtualEntitiesInformationFromClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVirtualEntitiesInformationFromClusters")
  @ResponseWrapper(localName="getVirtualEntitiesInformationFromClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVirtualEntitiesInformationFromClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualEntitiesInformationFromClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualEntitiesInformationFromClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualEntitiesInformationFromClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualEntitiesInformationFromClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterVirtualEntitiesInformation> getVirtualEntitiesInformationFromClusters(@WebParam(name="clusters", targetNamespace="") List<ClusterUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifySplitterStateWithDefaultTimeout", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifySplitterStateWithDefaultTimeout")
  @ResponseWrapper(localName="verifySplitterStateWithDefaultTimeoutResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifySplitterStateWithDefaultTimeoutResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterStateWithDefaultTimeoutRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterStateWithDefaultTimeoutResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterStateWithDefaultTimeout/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterStateWithDefaultTimeout/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifySplitterStateWithDefaultTimeout(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="state", targetNamespace="") VerifySplitterStateParam paramVerifySplitterStateParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifySplitterState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifySplitterState")
  @ResponseWrapper(localName="verifySplitterStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifySplitterStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifySplitterState/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifySplitterState(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID, @WebParam(name="state", targetNamespace="") VerifySplitterStateParam paramVerifySplitterStateParam, @WebParam(name="timeoutInSeconds", targetNamespace="") long paramLong)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="createClariionRaidGroups", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CreateClariionRaidGroups")
  @ResponseWrapper(localName="createClariionRaidGroupsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CreateClariionRaidGroupsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createClariionRaidGroupsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createClariionRaidGroupsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createClariionRaidGroups/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createClariionRaidGroups/Fault/FunctionalAPIInternalError")})
  public abstract void createClariionRaidGroups(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="numberOfGroups", targetNamespace="") int paramInt)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="createBookmark", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CreateBookmark")
  @ResponseWrapper(localName="createBookmarkResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CreateBookmarkResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmarkRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmarkResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmark/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmark/Fault/FunctionalAPIInternalError")})
  public abstract void createBookmark(@WebParam(name="groups", targetNamespace="") List<ConsistencyGroupUID> paramList, @WebParam(name="bookmarkName", targetNamespace="") String paramString, @WebParam(name="consolidationPolicy", targetNamespace="") BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy, @WebParam(name="consistencyType", targetNamespace="") SnapshotConsistencyType paramSnapshotConsistencyType)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setBookmarkConsolidationPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkConsolidationPolicy")
  @ResponseWrapper(localName="setBookmarkConsolidationPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkConsolidationPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsolidationPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsolidationPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsolidationPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsolidationPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setBookmarkConsolidationPolicy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="snapshot", targetNamespace="") Snapshot paramSnapshot, @WebParam(name="consolidationPolicy", targetNamespace="") BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setBookmarkConsistencyType", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkConsistencyType")
  @ResponseWrapper(localName="setBookmarkConsistencyTypeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkConsistencyTypeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsistencyTypeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsistencyTypeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsistencyType/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkConsistencyType/Fault/FunctionalAPIInternalError")})
  public abstract void setBookmarkConsistencyType(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="snapshot", targetNamespace="") Snapshot paramSnapshot, @WebParam(name="consistencyType", targetNamespace="") SnapshotConsistencyType paramSnapshotConsistencyType)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setBookmarkSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkSettings")
  @ResponseWrapper(localName="setBookmarkSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setBookmarkSettings(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="snapshot", targetNamespace="") Snapshot paramSnapshot, @WebParam(name="consistencyType", targetNamespace="") SnapshotConsistencyType paramSnapshotConsistencyType, @WebParam(name="consolidationPolicy", targetNamespace="") BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="markGroupCopyVolumesAsClean", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupCopyVolumesAsClean")
  @ResponseWrapper(localName="markGroupCopyVolumesAsCleanResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupCopyVolumesAsCleanResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsCleanRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsCleanResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsClean/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsClean/Fault/FunctionalAPIInternalError")})
  public abstract void markGroupCopyVolumesAsClean(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="markGroupVolumesAsClean", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupVolumesAsClean")
  @ResponseWrapper(localName="markGroupVolumesAsCleanResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupVolumesAsCleanResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsCleanRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsCleanResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsClean/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsClean/Fault/FunctionalAPIInternalError")})
  public abstract void markGroupVolumesAsClean(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="consolidateSnapshots", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ConsolidateSnapshots")
  @ResponseWrapper(localName="consolidateSnapshotsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ConsolidateSnapshotsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/consolidateSnapshotsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/consolidateSnapshotsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/consolidateSnapshots/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/consolidateSnapshots/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID consolidateSnapshots(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="start", targetNamespace="") Snapshot paramSnapshot1, @WebParam(name="end", targetNamespace="") Snapshot paramSnapshot2)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateConsolidateSnapshots", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateConsolidateSnapshots")
  @ResponseWrapper(localName="validateConsolidateSnapshotsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateConsolidateSnapshotsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateConsolidateSnapshotsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateConsolidateSnapshotsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateConsolidateSnapshots/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateConsolidateSnapshots/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateConsolidateSnapshots/Fault/FunctionalAPIValidationException")})
  public abstract void validateConsolidateSnapshots(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="start", targetNamespace="") Snapshot paramSnapshot1, @WebParam(name="end", targetNamespace="") Snapshot paramSnapshot2)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="abortSnapshotsConsolidation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AbortSnapshotsConsolidation")
  @ResponseWrapper(localName="abortSnapshotsConsolidationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AbortSnapshotsConsolidationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortSnapshotsConsolidationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortSnapshotsConsolidationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortSnapshotsConsolidation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortSnapshotsConsolidation/Fault/FunctionalAPIInternalError")})
  public abstract void abortSnapshotsConsolidation(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAbortSnapshotsConsolidation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAbortSnapshotsConsolidation")
  @ResponseWrapper(localName="validateAbortSnapshotsConsolidationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAbortSnapshotsConsolidationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortSnapshotsConsolidationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortSnapshotsConsolidationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortSnapshotsConsolidation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortSnapshotsConsolidation/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortSnapshotsConsolidation/Fault/FunctionalAPIValidationException")})
  public abstract void validateAbortSnapshotsConsolidation(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="addConsistencyGroupSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupSet")
  @ResponseWrapper(localName="addConsistencyGroupSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupSet/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupSetUID addConsistencyGroupSet(@WebParam(name="groupSetSettings", targetNamespace="") ConsistencyGroupSetSettings paramConsistencyGroupSetSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddConsistencyGroupSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupSet")
  @ResponseWrapper(localName="validateAddConsistencyGroupSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupSet/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupSet/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddConsistencyGroupSet(@WebParam(name="groupSetSettings", targetNamespace="") ConsistencyGroupSetSettings paramConsistencyGroupSetSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupSetSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupSetSettings")
  @ResponseWrapper(localName="setConsistencyGroupSetSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupSetSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSetSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSetSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSetSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSetSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupSetSettings(@WebParam(name="groupSetSettings", targetNamespace="") ConsistencyGroupSetSettings paramConsistencyGroupSetSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setBookmarkFrequency", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkFrequency")
  @ResponseWrapper(localName="setBookmarkFrequencyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetBookmarkFrequencyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkFrequencyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkFrequencyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkFrequency/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setBookmarkFrequency/Fault/FunctionalAPIInternalError")})
  public abstract void setBookmarkFrequency(@WebParam(name="groupSet", targetNamespace="") ConsistencyGroupSetUID paramConsistencyGroupSetUID, @WebParam(name="frequencyInMicroSeconds", targetNamespace="") long paramLong)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableConsistencyGroup")
  @ResponseWrapper(localName="disableConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroup/Fault/FunctionalAPIInternalError")})
  public abstract void disableConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDisableConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableConsistencyGroup")
  @ResponseWrapper(localName="validateDisableConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroup/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroup/Fault/FunctionalAPIValidationException")})
  public abstract void validateDisableConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableConsistencyGroupCopy")
  @ResponseWrapper(localName="disableConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableConsistencyGroupCopy/Fault/FunctionalAPIInternalError")})
  public abstract void disableConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDisableConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableConsistencyGroupCopy")
  @ResponseWrapper(localName="validateDisableConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroupCopy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableConsistencyGroupCopy/Fault/FunctionalAPIValidationException")})
  public abstract void validateDisableConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableImageAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableImageAccess")
  @ResponseWrapper(localName="disableImageAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableImageAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccess/Fault/FunctionalAPIInternalError")})
  public abstract void disableImageAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDisableImageAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableImageAccess")
  @ResponseWrapper(localName="validateDisableImageAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableImageAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccess/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccess/Fault/FunctionalAPIValidationException")})
  public abstract void validateDisableImageAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableConsistencyGroup")
  @ResponseWrapper(localName="enableConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroup/Fault/FunctionalAPIInternalError")})
  public abstract void enableConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableConsistencyGroup")
  @ResponseWrapper(localName="validateEnableConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroup/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroup/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableConsistencyGroupCopy")
  @ResponseWrapper(localName="enableConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableConsistencyGroupCopy/Fault/FunctionalAPIInternalError")})
  public abstract void enableConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableConsistencyGroupCopy")
  @ResponseWrapper(localName="validateEnableConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroupCopy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableConsistencyGroupCopy/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableImageAccessWithParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessWithParams")
  @ResponseWrapper(localName="enableImageAccessWithParamsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessWithParamsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithParamsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithParamsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithParams/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithParams/Fault/FunctionalAPIInternalError")})
  public abstract void enableImageAccessWithParams(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="params", targetNamespace="") ImageAccessParameters paramImageAccessParameters, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableImageAccessWithParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessWithParams")
  @ResponseWrapper(localName="validateEnableImageAccessWithParamsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessWithParamsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithParamsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithParamsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithParams/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithParams/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithParams/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableImageAccessWithParams(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="params", targetNamespace="") ImageAccessParameters paramImageAccessParameters, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableImageAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccess")
  @ResponseWrapper(localName="enableImageAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccess/Fault/FunctionalAPIInternalError")})
  public abstract void enableImageAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="snapshot", targetNamespace="") Snapshot paramSnapshot, @WebParam(name="mode", targetNamespace="") ImageAccessMode paramImageAccessMode, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableImageAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccess")
  @ResponseWrapper(localName="validateEnableImageAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccess/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccess/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableImageAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="snapshot", targetNamespace="") Snapshot paramSnapshot, @WebParam(name="mode", targetNamespace="") ImageAccessMode paramImageAccessMode, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="moveToImage", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MoveToImage")
  @ResponseWrapper(localName="moveToImageResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MoveToImageResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/moveToImageRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/moveToImageResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/moveToImage/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/moveToImage/Fault/FunctionalAPIInternalError")})
  public abstract void moveToImage(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="accessType", targetNamespace="") SpecificImageAccessType paramSpecificImageAccessType, @WebParam(name="imageType", targetNamespace="") SearchImageType paramSearchImageType, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateMoveToImage", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateMoveToImage")
  @ResponseWrapper(localName="validateMoveToImageResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateMoveToImageResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateMoveToImageRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateMoveToImageResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateMoveToImage/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateMoveToImage/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateMoveToImage/Fault/FunctionalAPIValidationException")})
  public abstract void validateMoveToImage(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="accessType", targetNamespace="") SpecificImageAccessType paramSpecificImageAccessType, @WebParam(name="imageType", targetNamespace="") SearchImageType paramSearchImageType, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="failover", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.Failover")
  @ResponseWrapper(localName="failoverResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FailoverResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failoverRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failoverResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failover/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failover/Fault/FunctionalAPIInternalError")})
  public abstract void failover(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateFailover", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateFailover")
  @ResponseWrapper(localName="validateFailoverResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateFailoverResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailoverRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailoverResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailover/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailover/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailover/Fault/FunctionalAPIValidationException")})
  public abstract void validateFailover(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllGroupCopiesProtectionWindows", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupCopiesProtectionWindows")
  @ResponseWrapper(localName="getAllGroupCopiesProtectionWindowsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupCopiesProtectionWindowsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupCopiesProtectionWindowsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupCopiesProtectionWindowsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupCopiesProtectionWindows/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupCopiesProtectionWindows/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupCopyProtectionWindowsInfo> getAllGroupCopiesProtectionWindows()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllGroupSets", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupSets")
  @ResponseWrapper(localName="getAllGroupSetsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupSetsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupSetsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupSetsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupSets/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupSets/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupSetSettings> getAllGroupSets()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllGroupsSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsSettings")
  @ResponseWrapper(localName="getAllGroupsSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsSettings/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupSettings> getAllGroupsSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSpecificGroupsSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsSettings")
  @ResponseWrapper(localName="getSpecificGroupsSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsSettings/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupSettings> getSpecificGroupsSettings(@WebParam(name="groups", targetNamespace="") List<ConsistencyGroupUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupName")
  @ResponseWrapper(localName="getGroupNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupName/Fault/FunctionalAPIInternalError")})
  public abstract String getGroupName(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupCopyName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupCopyName")
  @ResponseWrapper(localName="getGroupCopyNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupCopyNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopyNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopyNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopyName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopyName/Fault/FunctionalAPIInternalError")})
  public abstract String getGroupCopyName(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getReplicationSetName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetReplicationSetName")
  @ResponseWrapper(localName="getReplicationSetNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetReplicationSetNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getReplicationSetNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getReplicationSetNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getReplicationSetName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getReplicationSetName/Fault/FunctionalAPIInternalError")})
  public abstract String getReplicationSetName(@WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupSetName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSetName")
  @ResponseWrapper(localName="getGroupSetNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSetNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSetNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSetNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSetName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSetName/Fault/FunctionalAPIInternalError")})
  public abstract String getGroupSetName(@WebParam(name="groupSet", targetNamespace="") ConsistencyGroupSetUID paramConsistencyGroupSetUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSettings")
  @ResponseWrapper(localName="getGroupSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSettings/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupSettings getGroupSettings(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getFullConsistencyGroupPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullConsistencyGroupPolicy")
  @ResponseWrapper(localName="getFullConsistencyGroupPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullConsistencyGroupPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullConsistencyGroupPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullConsistencyGroupPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullConsistencyGroupPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullConsistencyGroupPolicy/Fault/FunctionalAPIInternalError")})
  public abstract FullConsistencyGroupPolicy getFullConsistencyGroupPolicy(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setFullConsistencyGroupPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetFullConsistencyGroupPolicy")
  @ResponseWrapper(localName="setFullConsistencyGroupPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetFullConsistencyGroupPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setFullConsistencyGroupPolicy(@WebParam(name="newPolicy", targetNamespace="") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetFullConsistencyGroupPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetFullConsistencyGroupPolicy")
  @ResponseWrapper(localName="validateSetFullConsistencyGroupPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetFullConsistencyGroupPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupPolicy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupPolicy/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetFullConsistencyGroupPolicy(@WebParam(name="newPolicy", targetNamespace="") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setFullConsistencyGroupCopyPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetFullConsistencyGroupCopyPolicy")
  @ResponseWrapper(localName="setFullConsistencyGroupCopyPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetFullConsistencyGroupCopyPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupCopyPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupCopyPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupCopyPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setFullConsistencyGroupCopyPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setFullConsistencyGroupCopyPolicy(@WebParam(name="newCopyPolicy", targetNamespace="") FullConsistencyGroupCopyPolicy paramFullConsistencyGroupCopyPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetFullConsistencyGroupCopyPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetFullConsistencyGroupCopyPolicy")
  @ResponseWrapper(localName="validateSetFullConsistencyGroupCopyPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetFullConsistencyGroupCopyPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupCopyPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupCopyPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupCopyPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupCopyPolicy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetFullConsistencyGroupCopyPolicy/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetFullConsistencyGroupCopyPolicy(@WebParam(name="newCopyPolicy", targetNamespace="") FullConsistencyGroupCopyPolicy paramFullConsistencyGroupCopyPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getUserVolumeSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUserVolumeSettings")
  @ResponseWrapper(localName="getUserVolumeSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUserVolumeSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserVolumeSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserVolumeSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserVolumeSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserVolumeSettings/Fault/FunctionalAPIInternalError")})
  public abstract UserVolumeSettings getUserVolumeSettings(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVolumeInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumeInformation")
  @ResponseWrapper(localName="getVolumeInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumeInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformation/Fault/FunctionalAPIInternalError")})
  public abstract VolumeInformation getVolumeInformation(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVolumeInformationFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumeInformationFromAllClusters")
  @ResponseWrapper(localName="getVolumeInformationFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumeInformationFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<VolumeInformation> getVolumeInformationFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVolumePaths", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumePaths")
  @ResponseWrapper(localName="getVolumePathsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumePathsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumePathsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumePathsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumePaths/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumePaths/Fault/FunctionalAPIInternalError")})
  public abstract List<VolumePath> getVolumePaths(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVolumeInformationAndPaths", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumeInformationAndPaths")
  @ResponseWrapper(localName="getVolumeInformationAndPathsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVolumeInformationAndPathsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationAndPathsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationAndPathsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationAndPaths/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVolumeInformationAndPaths/Fault/FunctionalAPIInternalError")})
  public abstract VolumeInformationAndPaths getVolumeInformationAndPaths(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllGroupsState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsState")
  @ResponseWrapper(localName="getAllGroupsStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsState/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupState> getAllGroupsState()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSpecificGroupsState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsState")
  @ResponseWrapper(localName="getSpecificGroupsStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsState/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupState> getSpecificGroupsState(@WebParam(name="groups", targetNamespace="") List<ConsistencyGroupUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupState")
  @ResponseWrapper(localName="getGroupStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupState/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupState getGroupState(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupsTransferState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupsTransferState")
  @ResponseWrapper(localName="getGroupsTransferStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupsTransferStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupsTransferStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupsTransferStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupsTransferState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupsTransferState/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupTransferState> getGroupsTransferState()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllGroupsStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsStatistics")
  @ResponseWrapper(localName="getAllGroupsStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsStatistics/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupStatistics> getAllGroupsStatistics()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSpecificGroupsStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsStatistics")
  @ResponseWrapper(localName="getSpecificGroupsStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsStatistics/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupStatistics> getSpecificGroupsStatistics(@WebParam(name="groups", targetNamespace="") List<ConsistencyGroupUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupStatistics")
  @ResponseWrapper(localName="getGroupStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupStatistics/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupStatistics getGroupStatistics(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllConsistencyGroups", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllConsistencyGroups")
  @ResponseWrapper(localName="getAllConsistencyGroupsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllConsistencyGroupsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroupsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroupsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroups/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroups/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupUID> getAllConsistencyGroups()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupSnapshots", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSnapshots")
  @ResponseWrapper(localName="getGroupSnapshotsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSnapshotsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshotsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshotsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshots/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshots/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupSnapshots getGroupSnapshots(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupSnapshotsForTimeFrameAndName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSnapshotsForTimeFrameAndName")
  @ResponseWrapper(localName="getGroupSnapshotsForTimeFrameAndNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupSnapshotsForTimeFrameAndNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshotsForTimeFrameAndNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshotsForTimeFrameAndNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshotsForTimeFrameAndName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupSnapshotsForTimeFrameAndName/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupSnapshots getGroupSnapshotsForTimeFrameAndName(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="timeFrame", targetNamespace="") TimeFrame paramTimeFrame, @WebParam(name="name", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRecoveryGroupCopySnapshots", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecoveryGroupCopySnapshots")
  @ResponseWrapper(localName="getRecoveryGroupCopySnapshotsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecoveryGroupCopySnapshotsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoveryGroupCopySnapshotsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoveryGroupCopySnapshotsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoveryGroupCopySnapshots/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoveryGroupCopySnapshots/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupCopySnapshots getRecoveryGroupCopySnapshots(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupCopySnapshotsForTimeFrameAndName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupCopySnapshotsForTimeFrameAndName")
  @ResponseWrapper(localName="getGroupCopySnapshotsForTimeFrameAndNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupCopySnapshotsForTimeFrameAndNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshotsForTimeFrameAndNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshotsForTimeFrameAndNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshotsForTimeFrameAndName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshotsForTimeFrameAndName/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupCopySnapshots getGroupCopySnapshotsForTimeFrameAndName(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="timeFrame", targetNamespace="") TimeFrame paramTimeFrame, @WebParam(name="name", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupCopySnapshots", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupCopySnapshots")
  @ResponseWrapper(localName="getGroupCopySnapshotsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupCopySnapshotsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshotsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshotsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshots/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupCopySnapshots/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupCopySnapshots getGroupCopySnapshots(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="pauseGroupTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.PauseGroupTransfer")
  @ResponseWrapper(localName="pauseGroupTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.PauseGroupTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupTransfer/Fault/FunctionalAPIInternalError")})
  public abstract void pauseGroupTransfer(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validatePauseGroupTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidatePauseGroupTransfer")
  @ResponseWrapper(localName="validatePauseGroupTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidatePauseGroupTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupTransfer/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupTransfer/Fault/FunctionalAPIValidationException")})
  public abstract void validatePauseGroupTransfer(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="pauseGroupCopyTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.PauseGroupCopyTransfer")
  @ResponseWrapper(localName="pauseGroupCopyTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.PauseGroupCopyTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupCopyTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupCopyTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupCopyTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseGroupCopyTransfer/Fault/FunctionalAPIInternalError")})
  public abstract void pauseGroupCopyTransfer(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validatePauseGroupCopyTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidatePauseGroupCopyTransfer")
  @ResponseWrapper(localName="validatePauseGroupCopyTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidatePauseGroupCopyTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupCopyTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupCopyTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupCopyTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupCopyTransfer/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseGroupCopyTransfer/Fault/FunctionalAPIValidationException")})
  public abstract void validatePauseGroupCopyTransfer(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="recoverProduction", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RecoverProduction")
  @ResponseWrapper(localName="recoverProductionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RecoverProductionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProductionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProductionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProduction/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProduction/Fault/FunctionalAPIInternalError")})
  public abstract void recoverProduction(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRecoverProduction", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRecoverProduction")
  @ResponseWrapper(localName="validateRecoverProductionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRecoverProductionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProductionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProductionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProduction/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProduction/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProduction/Fault/FunctionalAPIValidationException")})
  public abstract void validateRecoverProduction(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="resumeProduction", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResumeProduction")
  @ResponseWrapper(localName="resumeProductionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResumeProductionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProductionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProductionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProduction/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProduction/Fault/FunctionalAPIInternalError")})
  public abstract void resumeProduction(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateResumeProduction", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateResumeProduction")
  @ResponseWrapper(localName="validateResumeProductionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateResumeProductionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProductionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProductionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProduction/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProduction/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProduction/Fault/FunctionalAPIValidationException")})
  public abstract void validateResumeProduction(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroup")
  @ResponseWrapper(localName="removeConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroup/Fault/FunctionalAPIInternalError")})
  public abstract void removeConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupCopy")
  @ResponseWrapper(localName="removeConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopy/Fault/FunctionalAPIInternalError")})
  public abstract void removeConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveConsistencyGroupCopy")
  @ResponseWrapper(localName="validateRemoveConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroupCopy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroupCopy/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeConsistencyGroupSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupSet")
  @ResponseWrapper(localName="removeConsistencyGroupSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupSet/Fault/FunctionalAPIInternalError")})
  public abstract void removeConsistencyGroupSet(@WebParam(name="getGroupSetName", targetNamespace="") ConsistencyGroupSetUID paramConsistencyGroupSetUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="renameConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameConsistencyGroup")
  @ResponseWrapper(localName="renameConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroup/Fault/FunctionalAPIInternalError")})
  public abstract void renameConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRenameConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameConsistencyGroup")
  @ResponseWrapper(localName="validateRenameConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroup/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroup/Fault/FunctionalAPIValidationException")})
  public abstract void validateRenameConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="renameConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameConsistencyGroupCopy")
  @ResponseWrapper(localName="renameConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameConsistencyGroupCopy/Fault/FunctionalAPIInternalError")})
  public abstract void renameConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRenameConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameConsistencyGroupCopy")
  @ResponseWrapper(localName="validateRenameConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroupCopy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameConsistencyGroupCopy/Fault/FunctionalAPIValidationException")})
  public abstract void validateRenameConsistencyGroupCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rollToImage", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RollToImage")
  @ResponseWrapper(localName="rollToImageResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RollToImageResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImageRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImageResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImage/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImage/Fault/FunctionalAPIInternalError")})
  public abstract void rollToImage(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRollToImage", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRollToImage")
  @ResponseWrapper(localName="validateRollToImageResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRollToImageResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImageRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImageResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImage/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImage/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImage/Fault/FunctionalAPIValidationException")})
  public abstract void validateRollToImage(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableDirectAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableDirectAccess")
  @ResponseWrapper(localName="enableDirectAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableDirectAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccess/Fault/FunctionalAPIInternalError")})
  public abstract void enableDirectAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableDirectAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableDirectAccess")
  @ResponseWrapper(localName="validateEnableDirectAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableDirectAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccess/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccess/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableDirectAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="markGroupCopyVolumesAsDirty", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupCopyVolumesAsDirty")
  @ResponseWrapper(localName="markGroupCopyVolumesAsDirtyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupCopyVolumesAsDirtyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsDirtyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsDirtyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsDirty/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupCopyVolumesAsDirty/Fault/FunctionalAPIInternalError")})
  public abstract void markGroupCopyVolumesAsDirty(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="replicationSets", targetNamespace="") List<ReplicationSetUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="markGroupVolumesAsDirty", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupVolumesAsDirty")
  @ResponseWrapper(localName="markGroupVolumesAsDirtyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.MarkGroupVolumesAsDirtyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsDirtyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsDirtyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsDirty/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/markGroupVolumesAsDirty/Fault/FunctionalAPIInternalError")})
  public abstract void markGroupVolumesAsDirty(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="replicationSets", targetNamespace="") List<ReplicationSetUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupPolicy")
  @ResponseWrapper(localName="setConsistencyGroupPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupPolicy(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="newPolicy", targetNamespace="") ConsistencyGroupPolicy paramConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetConsistencyGroupPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupPolicy")
  @ResponseWrapper(localName="validateSetConsistencyGroupPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupPolicy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupPolicy/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetConsistencyGroupPolicy(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="newPolicy", targetNamespace="") ConsistencyGroupPolicy paramConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupCopyPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupCopyPolicy")
  @ResponseWrapper(localName="setConsistencyGroupCopyPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupCopyPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupCopyPolicy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="newPolicy", targetNamespace="") ConsistencyGroupCopyPolicy paramConsistencyGroupCopyPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetConsistencyGroupCopyPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupCopyPolicy")
  @ResponseWrapper(localName="validateSetConsistencyGroupCopyPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupCopyPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopyPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopyPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopyPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopyPolicy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopyPolicy/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetConsistencyGroupCopyPolicy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="newPolicy", targetNamespace="") ConsistencyGroupCopyPolicy paramConsistencyGroupCopyPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addConsistencyGroupCopies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupCopies")
  @ResponseWrapper(localName="addConsistencyGroupCopiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupCopiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopies/Fault/FunctionalAPIInternalError")})
  public abstract void addConsistencyGroupCopies(@WebParam(name="newCopies", targetNamespace="") List<NewConsistencyGroupCopySettingsParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddConsistencyGroupCopies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupCopies")
  @ResponseWrapper(localName="validateAddConsistencyGroupCopiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupCopiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopies/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopies/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddConsistencyGroupCopies(@WebParam(name="newCopies", targetNamespace="") List<NewConsistencyGroupCopySettingsParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupCopiesSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupCopiesSettings")
  @ResponseWrapper(localName="setConsistencyGroupCopiesSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupCopiesSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopiesSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopiesSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopiesSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopiesSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupCopiesSettings(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="copiesChanges", targetNamespace="") List<ConsistencyGroupCopySettingsChangesParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetConsistencyGroupCopiesSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupCopiesSettings")
  @ResponseWrapper(localName="validateSetConsistencyGroupCopiesSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupCopiesSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopiesSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopiesSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopiesSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopiesSettings/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupCopiesSettings/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetConsistencyGroupCopiesSettings(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="copiesChanges", targetNamespace="") List<ConsistencyGroupCopySettingsChangesParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setReplicationSetsSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetReplicationSetsSettings")
  @ResponseWrapper(localName="setReplicationSetsSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetReplicationSetsSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setReplicationSetsSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setReplicationSetsSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setReplicationSetsSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setReplicationSetsSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setReplicationSetsSettings(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="replicationSetsChanges", targetNamespace="") List<ReplicationSetSettingsChangesParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetReplicationSetsSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetReplicationSetsSettings")
  @ResponseWrapper(localName="validateSetReplicationSetsSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetReplicationSetsSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetReplicationSetsSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetReplicationSetsSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetReplicationSetsSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetReplicationSetsSettings/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetReplicationSetsSettings/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetReplicationSetsSettings(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="replicationSetsChanges", targetNamespace="") List<ReplicationSetSettingsChangesParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupLinkPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupLinkPolicy")
  @ResponseWrapper(localName="setConsistencyGroupLinkPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupLinkPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupLinkPolicy(@WebParam(name="groupLink", targetNamespace="") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name="newPolicy", targetNamespace="") ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetConsistencyGroupLinkPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupLinkPolicy")
  @ResponseWrapper(localName="validateSetConsistencyGroupLinkPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupLinkPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupLinkPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupLinkPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupLinkPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupLinkPolicy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupLinkPolicy/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetConsistencyGroupLinkPolicy(@WebParam(name="groupLink", targetNamespace="") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name="newPolicy", targetNamespace="") ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addConsistencyGroupLink", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupLink")
  @ResponseWrapper(localName="addConsistencyGroupLinkResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupLinkResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLinkRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLinkResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLink/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLink/Fault/FunctionalAPIInternalError")})
  public abstract void addConsistencyGroupLink(@WebParam(name="groupLink", targetNamespace="") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name="policy", targetNamespace="") ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddConsistencyGroupLink", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupLink")
  @ResponseWrapper(localName="validateAddConsistencyGroupLinkResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupLinkResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupLinkRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupLinkResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupLink/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupLink/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupLink/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddConsistencyGroupLink(@WebParam(name="groupLink", targetNamespace="") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name="policy", targetNamespace="") ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removePassiveConsistencyGroupLink", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemovePassiveConsistencyGroupLink")
  @ResponseWrapper(localName="removePassiveConsistencyGroupLinkResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemovePassiveConsistencyGroupLinkResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removePassiveConsistencyGroupLinkRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removePassiveConsistencyGroupLinkResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removePassiveConsistencyGroupLink/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removePassiveConsistencyGroupLink/Fault/FunctionalAPIInternalError")})
  public abstract void removePassiveConsistencyGroupLink(@WebParam(name="groupLink", targetNamespace="") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemovePassiveConsistencyGroupLink", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemovePassiveConsistencyGroupLink")
  @ResponseWrapper(localName="validateRemovePassiveConsistencyGroupLinkResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemovePassiveConsistencyGroupLinkResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemovePassiveConsistencyGroupLinkRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemovePassiveConsistencyGroupLinkResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemovePassiveConsistencyGroupLink/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemovePassiveConsistencyGroupLink/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemovePassiveConsistencyGroupLink/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemovePassiveConsistencyGroupLink(@WebParam(name="groupLink", targetNamespace="") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setProductionCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetProductionCopy")
  @ResponseWrapper(localName="setProductionCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetProductionCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionCopy/Fault/FunctionalAPIInternalError")})
  public abstract void setProductionCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetProductionCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetProductionCopy")
  @ResponseWrapper(localName="validateSetProductionCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetProductionCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionCopy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionCopy/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetProductionCopy(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setProductionAndConsistencyGroupTopology", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetProductionAndConsistencyGroupTopology")
  @ResponseWrapper(localName="setProductionAndConsistencyGroupTopologyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetProductionAndConsistencyGroupTopologyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionAndConsistencyGroupTopologyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionAndConsistencyGroupTopologyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionAndConsistencyGroupTopology/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionAndConsistencyGroupTopology/Fault/FunctionalAPIInternalError")})
  public abstract void setProductionAndConsistencyGroupTopology(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="params", targetNamespace="") ConsistencyGroupTopologyParams paramConsistencyGroupTopologyParams, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetProducationAndConsistencyGroupTopology", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetProducationAndConsistencyGroupTopology")
  @ResponseWrapper(localName="validateSetProducationAndConsistencyGroupTopologyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetProducationAndConsistencyGroupTopologyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProducationAndConsistencyGroupTopologyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProducationAndConsistencyGroupTopologyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProducationAndConsistencyGroupTopology/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProducationAndConsistencyGroupTopology/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProducationAndConsistencyGroupTopology/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetProducationAndConsistencyGroupTopology(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="params", targetNamespace="") ConsistencyGroupTopologyParams paramConsistencyGroupTopologyParams, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="startGroupTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartGroupTransfer")
  @ResponseWrapper(localName="startGroupTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartGroupTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupTransfer/Fault/FunctionalAPIInternalError")})
  public abstract void startGroupTransfer(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateStartGroupTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateStartGroupTransfer")
  @ResponseWrapper(localName="validateStartGroupTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateStartGroupTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupTransfer/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupTransfer/Fault/FunctionalAPIValidationException")})
  public abstract void validateStartGroupTransfer(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="startGroupCopyTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartGroupCopyTransfer")
  @ResponseWrapper(localName="startGroupCopyTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartGroupCopyTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupCopyTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupCopyTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupCopyTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startGroupCopyTransfer/Fault/FunctionalAPIInternalError")})
  public abstract void startGroupCopyTransfer(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateStartGroupCopyTransfer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateStartGroupCopyTransfer")
  @ResponseWrapper(localName="validateStartGroupCopyTransferResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateStartGroupCopyTransferResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupCopyTransferRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupCopyTransferResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupCopyTransfer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupCopyTransfer/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartGroupCopyTransfer/Fault/FunctionalAPIValidationException")})
  public abstract void validateStartGroupCopyTransfer(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="undoGroupWrites", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UndoGroupWrites")
  @ResponseWrapper(localName="undoGroupWritesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UndoGroupWritesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoGroupWritesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoGroupWritesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoGroupWrites/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoGroupWrites/Fault/FunctionalAPIInternalError")})
  public abstract void undoGroupWrites(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateUndoGroupWrites", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateUndoGroupWrites")
  @ResponseWrapper(localName="validateUndoGroupWritesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateUndoGroupWritesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoGroupWritesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoGroupWritesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoGroupWrites/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoGroupWrites/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoGroupWrites/Fault/FunctionalAPIValidationException")})
  public abstract void validateUndoGroupWrites(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="forceLongInitialization", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ForceLongInitialization")
  @ResponseWrapper(localName="forceLongInitializationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ForceLongInitializationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/forceLongInitializationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/forceLongInitializationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/forceLongInitialization/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/forceLongInitialization/Fault/FunctionalAPIInternalError")})
  public abstract void forceLongInitialization(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateForceLongInitialization", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateForceLongInitialization")
  @ResponseWrapper(localName="validateForceLongInitializationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateForceLongInitializationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateForceLongInitializationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateForceLongInitializationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateForceLongInitialization/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateForceLongInitialization/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateForceLongInitialization/Fault/FunctionalAPIValidationException")})
  public abstract void validateForceLongInitialization(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifyConsistencyGroupStateWithDefaultTimeout", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyConsistencyGroupStateWithDefaultTimeout")
  @ResponseWrapper(localName="verifyConsistencyGroupStateWithDefaultTimeoutResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyConsistencyGroupStateWithDefaultTimeoutResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupStateWithDefaultTimeoutRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupStateWithDefaultTimeoutResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupStateWithDefaultTimeout/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupStateWithDefaultTimeout/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifyConsistencyGroupStateWithDefaultTimeout(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="state", targetNamespace="") VerifyConsistencyGroupStateParam paramVerifyConsistencyGroupStateParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifyConsistencyGroupState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyConsistencyGroupState")
  @ResponseWrapper(localName="verifyConsistencyGroupStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyConsistencyGroupStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyConsistencyGroupState/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifyConsistencyGroupState(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="state", targetNamespace="") VerifyConsistencyGroupStateParam paramVerifyConsistencyGroupStateParam, @WebParam(name="timeoutInSeconds", targetNamespace="") long paramLong)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifyGroupCopySnapshotsWithDefaultTimeout", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyGroupCopySnapshotsWithDefaultTimeout")
  @ResponseWrapper(localName="verifyGroupCopySnapshotsWithDefaultTimeoutResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyGroupCopySnapshotsWithDefaultTimeoutResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshotsWithDefaultTimeoutRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshotsWithDefaultTimeoutResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshotsWithDefaultTimeout/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshotsWithDefaultTimeout/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifyGroupCopySnapshotsWithDefaultTimeout(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="state", targetNamespace="") VerifyGroupCopySnapshotsParam paramVerifyGroupCopySnapshotsParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="verifyGroupCopySnapshots", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyGroupCopySnapshots")
  @ResponseWrapper(localName="verifyGroupCopySnapshotsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.VerifyGroupCopySnapshotsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshotsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshotsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshots/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/verifyGroupCopySnapshots/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID verifyGroupCopySnapshots(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="state", targetNamespace="") VerifyGroupCopySnapshotsParam paramVerifyGroupCopySnapshotsParam, @WebParam(name="timeoutInSeconds", targetNamespace="") long paramLong)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="unregulateAllConsistencyGroupCopies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UnregulateAllConsistencyGroupCopies")
  @ResponseWrapper(localName="unregulateAllConsistencyGroupCopiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UnregulateAllConsistencyGroupCopiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregulateAllConsistencyGroupCopiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregulateAllConsistencyGroupCopiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregulateAllConsistencyGroupCopies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregulateAllConsistencyGroupCopies/Fault/FunctionalAPIInternalError")})
  public abstract void unregulateAllConsistencyGroupCopies()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSignaturesUsageDuringInitialization", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSignaturesUsageDuringInitialization")
  @ResponseWrapper(localName="setSignaturesUsageDuringInitializationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSignaturesUsageDuringInitializationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSignaturesUsageDuringInitializationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSignaturesUsageDuringInitializationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSignaturesUsageDuringInitialization/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSignaturesUsageDuringInitialization/Fault/FunctionalAPIInternalError")})
  public abstract void setSignaturesUsageDuringInitialization(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="useSignatures", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getBalanceLoadRecommendationWithGroupsToExclude", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetBalanceLoadRecommendationWithGroupsToExclude")
  @ResponseWrapper(localName="getBalanceLoadRecommendationWithGroupsToExcludeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetBalanceLoadRecommendationWithGroupsToExcludeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendationWithGroupsToExcludeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendationWithGroupsToExcludeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendationWithGroupsToExclude/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendationWithGroupsToExclude/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID getBalanceLoadRecommendationWithGroupsToExclude(@WebParam(name="groupsToExclude", targetNamespace="") List<ConsistencyGroupUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getBalanceLoadRecommendation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetBalanceLoadRecommendation")
  @ResponseWrapper(localName="getBalanceLoadRecommendationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetBalanceLoadRecommendationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getBalanceLoadRecommendation/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID getBalanceLoadRecommendation()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="applyBalanceLoadRecommendation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ApplyBalanceLoadRecommendation")
  @ResponseWrapper(localName="applyBalanceLoadRecommendationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ApplyBalanceLoadRecommendationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/applyBalanceLoadRecommendationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/applyBalanceLoadRecommendationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/applyBalanceLoadRecommendation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/applyBalanceLoadRecommendation/Fault/FunctionalAPIInternalError")})
  public abstract void applyBalanceLoadRecommendation(@WebParam(name="recommendation", targetNamespace="") BalanceLoadRecommendation paramBalanceLoadRecommendation)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateApplyBalanceLoadRecommendation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateApplyBalanceLoadRecommendation")
  @ResponseWrapper(localName="validateApplyBalanceLoadRecommendationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateApplyBalanceLoadRecommendationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateApplyBalanceLoadRecommendationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateApplyBalanceLoadRecommendationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateApplyBalanceLoadRecommendation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateApplyBalanceLoadRecommendation/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateApplyBalanceLoadRecommendation/Fault/FunctionalAPIValidationException")})
  public abstract void validateApplyBalanceLoadRecommendation(@WebParam(name="recommendation", targetNamespace="") BalanceLoadRecommendation paramBalanceLoadRecommendation)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="addConsistencyGroupAndCopies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupAndCopies")
  @ResponseWrapper(localName="addConsistencyGroupAndCopiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupAndCopiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupAndCopiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupAndCopiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupAndCopies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupAndCopies/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupUID addConsistencyGroupAndCopies(@WebParam(name="fullGroupPolicy", targetNamespace="") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddConsistencyGroupAndCopies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupAndCopies")
  @ResponseWrapper(localName="validateAddConsistencyGroupAndCopiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupAndCopiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupAndCopiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupAndCopiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupAndCopies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupAndCopies/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupAndCopies/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddConsistencyGroupAndCopies(@WebParam(name="fullGroupPolicy", targetNamespace="") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="addConsistencyGroupWithDefaultPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupWithDefaultPolicy")
  @ResponseWrapper(localName="addConsistencyGroupWithDefaultPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupWithDefaultPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupWithDefaultPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupWithDefaultPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupUID addConsistencyGroupWithDefaultPolicy(@WebParam(name="groupName", targetNamespace="") String paramString, @WebParam(name="primaryRPA", targetNamespace="") RpaUID paramRpaUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="addConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroup")
  @ResponseWrapper(localName="addConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroup/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupUID addConsistencyGroup(@WebParam(name="groupName", targetNamespace="") String paramString, @WebParam(name="policy", targetNamespace="") ConsistencyGroupPolicy paramConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="addDistributedConsistencyGroupWithDefaultPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddDistributedConsistencyGroupWithDefaultPolicy")
  @ResponseWrapper(localName="addDistributedConsistencyGroupWithDefaultPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddDistributedConsistencyGroupWithDefaultPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addDistributedConsistencyGroupWithDefaultPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addDistributedConsistencyGroupWithDefaultPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addDistributedConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addDistributedConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupUID addDistributedConsistencyGroupWithDefaultPolicy(@WebParam(name="groupName", targetNamespace="") String paramString, @WebParam(name="primaryRPA", targetNamespace="") RpaUID paramRpaUID, @WebParam(name="secondaryRPAsList", targetNamespace="") List<RpaUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddConsistencyGroupWithDefaultPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupWithDefaultPolicy")
  @ResponseWrapper(localName="validateAddConsistencyGroupWithDefaultPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupWithDefaultPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupWithDefaultPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupWithDefaultPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddConsistencyGroupWithDefaultPolicy(@WebParam(name="groupName", targetNamespace="") String paramString, @WebParam(name="primaryRPA", targetNamespace="") RpaUID paramRpaUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroup")
  @ResponseWrapper(localName="validateAddConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroup/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroup/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddConsistencyGroup(@WebParam(name="groupName", targetNamespace="") String paramString, @WebParam(name="policy", targetNamespace="") ConsistencyGroupPolicy paramConsistencyGroupPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddDistributedConsistencyGroupWithDefaultPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddDistributedConsistencyGroupWithDefaultPolicy")
  @ResponseWrapper(localName="validateAddDistributedConsistencyGroupWithDefaultPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddDistributedConsistencyGroupWithDefaultPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddDistributedConsistencyGroupWithDefaultPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddDistributedConsistencyGroupWithDefaultPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddDistributedConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddDistributedConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddDistributedConsistencyGroupWithDefaultPolicy/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddDistributedConsistencyGroupWithDefaultPolicy(@WebParam(name="groupName", targetNamespace="") String paramString, @WebParam(name="primaryRPA", targetNamespace="") RpaUID paramRpaUID, @WebParam(name="secondaryRPAsList", targetNamespace="") List<RpaUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupCopy")
  @ResponseWrapper(localName="addConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopy/Fault/FunctionalAPIInternalError")})
  public abstract void addConsistencyGroupCopy(@WebParam(name="copySettingsParam", targetNamespace="") ConsistencyGroupCopySettingsParam paramConsistencyGroupCopySettingsParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddConsistencyGroupCopy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupCopy")
  @ResponseWrapper(localName="validateAddConsistencyGroupCopyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddConsistencyGroupCopyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopy/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddConsistencyGroupCopy/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddConsistencyGroupCopy(@WebParam(name="copySettingsParam", targetNamespace="") ConsistencyGroupCopySettingsParam paramConsistencyGroupCopySettingsParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addJournalVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddJournalVolume")
  @ResponseWrapper(localName="addJournalVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddJournalVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addJournalVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addJournalVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addJournalVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addJournalVolume/Fault/FunctionalAPIInternalError")})
  public abstract void addJournalVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddJournalVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddJournalVolume")
  @ResponseWrapper(localName="validateAddJournalVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddJournalVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddJournalVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddJournalVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddJournalVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddJournalVolume/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddJournalVolume/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddJournalVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeJournalVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveJournalVolume")
  @ResponseWrapper(localName="removeJournalVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveJournalVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeJournalVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeJournalVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeJournalVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeJournalVolume/Fault/FunctionalAPIInternalError")})
  public abstract void removeJournalVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveJournalVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveJournalVolume")
  @ResponseWrapper(localName="validateRemoveJournalVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveJournalVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveJournalVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveJournalVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveJournalVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveJournalVolume/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveJournalVolume/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveJournalVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterSANVolumes", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSANVolumes")
  @ResponseWrapper(localName="getClusterSANVolumesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSANVolumesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumes/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumes/Fault/FunctionalAPIInternalError")})
  public abstract ClusterSANVolumes getClusterSANVolumes(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="refreshView", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterSANVolumesByVendorAndProduct", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSANVolumesByVendorAndProduct")
  @ResponseWrapper(localName="getClusterSANVolumesByVendorAndProductResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSANVolumesByVendorAndProductResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesByVendorAndProductRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesByVendorAndProductResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesByVendorAndProduct/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesByVendorAndProduct/Fault/FunctionalAPIInternalError")})
  public abstract ClusterSANVolumes getClusterSANVolumesByVendorAndProduct(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="refreshView", targetNamespace="") boolean paramBoolean, @WebParam(name="vendor", targetNamespace="") String paramString1, @WebParam(name="product", targetNamespace="") String paramString2)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterClariionVolumes", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterClariionVolumes")
  @ResponseWrapper(localName="getClusterClariionVolumesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterClariionVolumesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterClariionVolumesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterClariionVolumesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterClariionVolumes/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterClariionVolumes/Fault/FunctionalAPIInternalError")})
  public abstract ClusterClariionVolumes getClusterClariionVolumes(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="refreshView", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableClusterClariionVolumes", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableClusterClariionVolumes")
  @ResponseWrapper(localName="getAvailableClusterClariionVolumesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableClusterClariionVolumesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableClusterClariionVolumesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableClusterClariionVolumesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableClusterClariionVolumes/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableClusterClariionVolumes/Fault/FunctionalAPIInternalError")})
  public abstract ClusterClariionVolumes getAvailableClusterClariionVolumes(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="refreshView", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddReplicationSet")
  @ResponseWrapper(localName="addReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addReplicationSet/Fault/FunctionalAPIInternalError")})
  public abstract void addReplicationSet(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="replicationSetName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddReplicationSet")
  @ResponseWrapper(localName="validateAddReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddReplicationSet/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddReplicationSet/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddReplicationSet(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="replicationSetName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveReplicationSet")
  @ResponseWrapper(localName="removeReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeReplicationSet/Fault/FunctionalAPIInternalError")})
  public abstract void removeReplicationSet(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveReplicationSet")
  @ResponseWrapper(localName="validateRemoveReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveReplicationSet/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveReplicationSet/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveReplicationSet(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="renameReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameReplicationSet")
  @ResponseWrapper(localName="renameReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameReplicationSet/Fault/FunctionalAPIInternalError")})
  public abstract void renameReplicationSet(@WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRenameReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameReplicationSet")
  @ResponseWrapper(localName="validateRenameReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameReplicationSet/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameReplicationSet/Fault/FunctionalAPIValidationException")})
  public abstract void validateRenameReplicationSet(@WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSANVolumesInAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANVolumesInAllClusters")
  @ResponseWrapper(localName="rescanSANVolumesInAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANVolumesInAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSANVolumesInAllClusters(@WebParam(name="checkExistingVolumesAsWell", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSANVolumesInCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANVolumesInCluster")
  @ResponseWrapper(localName="rescanSANVolumesInClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANVolumesInClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANVolumesInCluster/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSANVolumesInCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="checkExistingVolumesAsWell", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSANSplittersInAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANSplittersInAllClusters")
  @ResponseWrapper(localName="rescanSANSplittersInAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANSplittersInAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSANSplittersInAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSANSplittersInCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANSplittersInCluster")
  @ResponseWrapper(localName="rescanSANSplittersInClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSANSplittersInClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSANSplittersInCluster/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSANSplittersInCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSplittersVolumesConnectionsInAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSplittersVolumesConnectionsInAllClusters")
  @ResponseWrapper(localName="rescanSplittersVolumesConnectionsInAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSplittersVolumesConnectionsInAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSplittersVolumesConnectionsInAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSplittersVolumesConnectionsInCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSplittersVolumesConnectionsInCluster")
  @ResponseWrapper(localName="rescanSplittersVolumesConnectionsInClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSplittersVolumesConnectionsInClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplittersVolumesConnectionsInCluster/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSplittersVolumesConnectionsInCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSpecificSplittersVolumesConnections", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSpecificSplittersVolumesConnections")
  @ResponseWrapper(localName="rescanSpecificSplittersVolumesConnectionsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSpecificSplittersVolumesConnectionsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSpecificSplittersVolumesConnectionsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSpecificSplittersVolumesConnectionsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSpecificSplittersVolumesConnections/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSpecificSplittersVolumesConnections/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSpecificSplittersVolumesConnections(@WebParam(name="splitters", targetNamespace="") List<SplitterUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rescanSplitterVolumesConnections", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSplitterVolumesConnections")
  @ResponseWrapper(localName="rescanSplitterVolumesConnectionsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RescanSplitterVolumesConnectionsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplitterVolumesConnectionsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplitterVolumesConnectionsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplitterVolumesConnections/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rescanSplitterVolumesConnections/Fault/FunctionalAPIInternalError")})
  public abstract void rescanSplitterVolumesConnections(@WebParam(name="splitter", targetNamespace="") SplitterUID paramSplitterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllGroupsVolumeStates", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsVolumeStates")
  @ResponseWrapper(localName="getAllGroupsVolumeStatesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllGroupsVolumeStatesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsVolumeStatesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsVolumeStatesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsVolumeStates/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllGroupsVolumeStates/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupVolumesState> getAllGroupsVolumeStates()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSpecificGroupsVolumeStates", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsVolumeStates")
  @ResponseWrapper(localName="getSpecificGroupsVolumeStatesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSpecificGroupsVolumeStatesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsVolumeStatesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsVolumeStatesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsVolumeStates/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSpecificGroupsVolumeStates/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupVolumesState> getSpecificGroupsVolumeStates(@WebParam(name="groups", targetNamespace="") List<ConsistencyGroupUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getGroupVolumeStates", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupVolumeStates")
  @ResponseWrapper(localName="getGroupVolumeStatesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetGroupVolumeStatesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupVolumeStatesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupVolumeStatesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupVolumeStates/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getGroupVolumeStates/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupVolumesState getGroupVolumeStates(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRepositoryVolumeStateFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRepositoryVolumeStateFromAllClusters")
  @ResponseWrapper(localName="getRepositoryVolumeStateFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRepositoryVolumeStateFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeStateFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeStateFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeStateFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeStateFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<RepositoryVolumeState> getRepositoryVolumeStateFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRepositoryVolumeState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRepositoryVolumeState")
  @ResponseWrapper(localName="getRepositoryVolumeStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRepositoryVolumeStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRepositoryVolumeState/Fault/FunctionalAPIInternalError")})
  public abstract RepositoryVolumeState getRepositoryVolumeState(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupSettings")
  @ResponseWrapper(localName="setConsistencyGroupSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupSettings(@WebParam(name="settingsParam", targetNamespace="") ConsistencyGroupSettingsChangesParam paramConsistencyGroupSettingsChangesParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetConsistencyGroupSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupSettings")
  @ResponseWrapper(localName="validateSetConsistencyGroupSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetConsistencyGroupSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupSettings/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetConsistencyGroupSettings/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetConsistencyGroupSettings(@WebParam(name="settingsParam", targetNamespace="") ConsistencyGroupSettingsChangesParam paramConsistencyGroupSettingsChangesParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addUserVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddUserVolume")
  @ResponseWrapper(localName="addUserVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddUserVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserVolume/Fault/FunctionalAPIInternalError")})
  public abstract void addUserVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddUserVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddUserVolume")
  @ResponseWrapper(localName="validateAddUserVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddUserVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserVolume/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserVolume/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddUserVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addAndAttachUserVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddAndAttachUserVolume")
  @ResponseWrapper(localName="addAndAttachUserVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddAndAttachUserVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addAndAttachUserVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addAndAttachUserVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addAndAttachUserVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addAndAttachUserVolume/Fault/FunctionalAPIInternalError")})
  public abstract void addAndAttachUserVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddAndAttachUserVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddAndAttachUserVolume")
  @ResponseWrapper(localName="validateAddAndAttachUserVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddAndAttachUserVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddAndAttachUserVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddAndAttachUserVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddAndAttachUserVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddAndAttachUserVolume/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddAndAttachUserVolume/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddAndAttachUserVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeUserVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveUserVolume")
  @ResponseWrapper(localName="removeUserVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveUserVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserVolume/Fault/FunctionalAPIInternalError")})
  public abstract void removeUserVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveUserVolume", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveUserVolume")
  @ResponseWrapper(localName="validateRemoveUserVolumeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveUserVolumeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserVolumeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserVolumeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserVolume/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserVolume/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserVolume/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveUserVolume(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="volumeID", targetNamespace="") DeviceUID paramDeviceUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableVolumes", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVolumes")
  @ResponseWrapper(localName="getAvailableVolumesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVolumesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumes/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumes/Fault/FunctionalAPIInternalError")})
  public abstract ClusterSANVolumes getAvailableVolumes(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="refreshView", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableVolumesFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVolumesFromAllClusters")
  @ResponseWrapper(localName="getAvailableVolumesFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVolumesFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVolumesFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract AllClustersSANVolumesInfo getAvailableVolumesFromAllClusters(@WebParam(name="refreshView", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServersViewSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersViewSettings")
  @ResponseWrapper(localName="getVCenterServersViewSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersViewSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewSettings/Fault/FunctionalAPIInternalError")})
  public abstract VCenterServersViewSettings getVCenterServersViewSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setVCenterServersViewSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVCenterServersViewSettings")
  @ResponseWrapper(localName="setVCenterServersViewSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVCenterServersViewSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServersViewSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServersViewSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServersViewSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServersViewSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setVCenterServersViewSettings(@WebParam(name="settings", targetNamespace="") VCenterServersViewSettings paramVCenterServersViewSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServersFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersFromAllClusters")
  @ResponseWrapper(localName="getVCenterServersFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterVCenterServers> getVCenterServersFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServersFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersFromCluster")
  @ResponseWrapper(localName="getVCenterServersFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterVCenterServers getVCenterServersFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServer", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServer")
  @ResponseWrapper(localName="getVCenterServerResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServer/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServer/Fault/FunctionalAPIInternalError")})
  public abstract VCenterServer getVCenterServer(@WebParam(name="vCenterServer", targetNamespace="") VCenterServerUID paramVCenterServerUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServersViewFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersViewFromAllClusters")
  @ResponseWrapper(localName="getVCenterServersViewFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersViewFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterVCenterServerView> getVCenterServersViewFromAllClusters(@WebParam(name="shouldRescan", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServersViewFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersViewFromCluster")
  @ResponseWrapper(localName="getVCenterServersViewFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServersViewFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServersViewFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterVCenterServerView getVCenterServersViewFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="shouldRescan", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServerView", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerView")
  @ResponseWrapper(localName="getVCenterServerViewResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerViewResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerViewRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerViewResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerView/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerView/Fault/FunctionalAPIInternalError")})
  public abstract VCenterServerView getVCenterServerView(@WebParam(name="vCenterServer", targetNamespace="") VCenterServerUID paramVCenterServerUID, @WebParam(name="shouldRescan", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServerFiltersFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerFiltersFromCluster")
  @ResponseWrapper(localName="getVCenterServerFiltersFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerFiltersFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFiltersFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFiltersFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFiltersFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFiltersFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract List<VCenterServerFilters> getVCenterServerFiltersFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServerFilters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerFilters")
  @ResponseWrapper(localName="getVCenterServerFiltersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerFiltersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFiltersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFiltersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFilters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerFilters/Fault/FunctionalAPIInternalError")})
  public abstract VCenterServerFilters getVCenterServerFilters(@WebParam(name="vCenterServer", targetNamespace="") VCenterServerUID paramVCenterServerUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="removeAllVCenterServerFilters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveAllVCenterServerFilters")
  @ResponseWrapper(localName="removeAllVCenterServerFiltersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveAllVCenterServerFiltersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeAllVCenterServerFiltersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeAllVCenterServerFiltersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeAllVCenterServerFilters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeAllVCenterServerFilters/Fault/FunctionalAPIInternalError")})
  public abstract VCenterServerFilters removeAllVCenterServerFilters(@WebParam(name="vCenterServer", targetNamespace="") VCenterServerUID paramVCenterServerUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeVCenterServerFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveVCenterServerFilter")
  @ResponseWrapper(localName="removeVCenterServerFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveVCenterServerFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVCenterServerFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVCenterServerFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVCenterServerFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVCenterServerFilter/Fault/FunctionalAPIInternalError")})
  public abstract void removeVCenterServerFilter(@WebParam(name="vCenterServer", targetNamespace="") VCenterServerUID paramVCenterServerUID, @WebParam(name="filter", targetNamespace="") VCenterServerFilter paramVCenterServerFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addVCenterServerFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddVCenterServerFilter")
  @ResponseWrapper(localName="addVCenterServerFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddVCenterServerFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVCenterServerFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVCenterServerFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVCenterServerFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVCenterServerFilter/Fault/FunctionalAPIInternalError")})
  public abstract void addVCenterServerFilter(@WebParam(name="vCenterServer", targetNamespace="") VCenterServerUID paramVCenterServerUID, @WebParam(name="filter", targetNamespace="") VCenterServerFilter paramVCenterServerFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setVCenterServerFilters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVCenterServerFilters")
  @ResponseWrapper(localName="setVCenterServerFiltersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVCenterServerFiltersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFiltersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFiltersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFilters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFilters/Fault/FunctionalAPIInternalError")})
  public abstract void setVCenterServerFilters(@WebParam(name="filters", targetNamespace="") VCenterServerFilters paramVCenterServerFilters)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setVCenterServerFilterForUnknownLuns", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVCenterServerFilterForUnknownLuns")
  @ResponseWrapper(localName="setVCenterServerFilterForUnknownLunsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVCenterServerFilterForUnknownLunsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFilterForUnknownLunsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFilterForUnknownLunsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFilterForUnknownLuns/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVCenterServerFilterForUnknownLuns/Fault/FunctionalAPIInternalError")})
  public abstract void setVCenterServerFilterForUnknownLuns(@WebParam(name="vCenterServer", targetNamespace="") VCenterServerUID paramVCenterServerUID, @WebParam(name="shouldFilterUnknownLuns", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getConsistencyGroupUIDAccordingToVMBiosUuid", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupUIDAccordingToVMBiosUuid")
  @ResponseWrapper(localName="getConsistencyGroupUIDAccordingToVMBiosUuidResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupUIDAccordingToVMBiosUuidResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupUIDAccordingToVMBiosUuidRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupUIDAccordingToVMBiosUuidResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupUIDAccordingToVMBiosUuid/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupUIDAccordingToVMBiosUuid/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupUID getConsistencyGroupUIDAccordingToVMBiosUuid(@WebParam(name="vmBiosUuid", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAccountSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAccountSettings")
  @ResponseWrapper(localName="getAccountSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAccountSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountSettings/Fault/FunctionalAPIInternalError")})
  public abstract AccountSettings getAccountSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAccountState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAccountState")
  @ResponseWrapper(localName="getAccountStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAccountStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccountState/Fault/FunctionalAPIInternalError")})
  public abstract AccountState getAccountState()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="addSystemEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSystemEventLogsFilter")
  @ResponseWrapper(localName="addSystemEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSystemEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSystemEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSystemEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSystemEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSystemEventLogsFilter/Fault/FunctionalAPIInternalError")})
  public abstract SystemEventLogsFilterUID addSystemEventLogsFilter(@WebParam(name="filter", targetNamespace="") SystemEventLogsFilter paramSystemEventLogsFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddSystemEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddSystemEventLogsFilter")
  @ResponseWrapper(localName="validateAddSystemEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddSystemEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddSystemEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddSystemEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddSystemEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddSystemEventLogsFilter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddSystemEventLogsFilter/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddSystemEventLogsFilter(@WebParam(name="filter", targetNamespace="") SystemEventLogsFilter paramSystemEventLogsFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSystemEventLogsFilters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemEventLogsFilters")
  @ResponseWrapper(localName="setSystemEventLogsFiltersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemEventLogsFiltersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemEventLogsFiltersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemEventLogsFiltersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemEventLogsFilters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemEventLogsFilters/Fault/FunctionalAPIInternalError")})
  public abstract void setSystemEventLogsFilters(@WebParam(name="filters", targetNamespace="") List<SystemEventLogsFilter> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetSystemEventLogsFilters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemEventLogsFilters")
  @ResponseWrapper(localName="validateSetSystemEventLogsFiltersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemEventLogsFiltersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemEventLogsFiltersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemEventLogsFiltersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemEventLogsFilters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemEventLogsFilters/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemEventLogsFilters/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetSystemEventLogsFilters(@WebParam(name="filters", targetNamespace="") List<SystemEventLogsFilter> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllSystemEventLogsFilters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllSystemEventLogsFilters")
  @ResponseWrapper(localName="getAllSystemEventLogsFiltersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllSystemEventLogsFiltersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSystemEventLogsFiltersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSystemEventLogsFiltersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSystemEventLogsFilters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSystemEventLogsFilters/Fault/FunctionalAPIInternalError")})
  public abstract List<SystemEventLogsFilter> getAllSystemEventLogsFilters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeSystemEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSystemEventLogsFilter")
  @ResponseWrapper(localName="removeSystemEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSystemEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSystemEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSystemEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSystemEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSystemEventLogsFilter/Fault/FunctionalAPIInternalError")})
  public abstract void removeSystemEventLogsFilter(@WebParam(name="filter", targetNamespace="") SystemEventLogsFilterUID paramSystemEventLogsFilterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveSystemEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveSystemEventLogsFilter")
  @ResponseWrapper(localName="validateRemoveSystemEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveSystemEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSystemEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSystemEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSystemEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSystemEventLogsFilter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveSystemEventLogsFilter/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveSystemEventLogsFilter(@WebParam(name="filter", targetNamespace="") SystemEventLogsFilterUID paramSystemEventLogsFilterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="renameSystemEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameSystemEventLogsFilter")
  @ResponseWrapper(localName="renameSystemEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RenameSystemEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameSystemEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameSystemEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameSystemEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/renameSystemEventLogsFilter/Fault/FunctionalAPIInternalError")})
  public abstract void renameSystemEventLogsFilter(@WebParam(name="filter", targetNamespace="") SystemEventLogsFilterUID paramSystemEventLogsFilterUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRenameSystemEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameSystemEventLogsFilter")
  @ResponseWrapper(localName="validateRenameSystemEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRenameSystemEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameSystemEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameSystemEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameSystemEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameSystemEventLogsFilter/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRenameSystemEventLogsFilter/Fault/FunctionalAPIValidationException")})
  public abstract void validateRenameSystemEventLogsFilter(@WebParam(name="filter", targetNamespace="") SystemEventLogsFilterUID paramSystemEventLogsFilterUID, @WebParam(name="newName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getTrackedEventIDs", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTrackedEventIDs")
  @ResponseWrapper(localName="getTrackedEventIDsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTrackedEventIDsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTrackedEventIDsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTrackedEventIDsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTrackedEventIDs/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTrackedEventIDs/Fault/FunctionalAPIInternalError")})
  public abstract List<Integer> getTrackedEventIDs()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllEventLogs", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllEventLogs")
  @ResponseWrapper(localName="getAllEventLogsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllEventLogsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllEventLogsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllEventLogsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllEventLogs/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllEventLogs/Fault/FunctionalAPIInternalError")})
  public abstract SystemEventLogs getAllEventLogs()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getEventLogsByFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetEventLogsByFilter")
  @ResponseWrapper(localName="getEventLogsByFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetEventLogsByFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByFilter/Fault/FunctionalAPIInternalError")})
  public abstract SystemEventLogs getEventLogsByFilter(@WebParam(name="filter", targetNamespace="") UserEventLogsFilter paramUserEventLogsFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getEventLogsWithLargerUID", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetEventLogsWithLargerUID")
  @ResponseWrapper(localName="getEventLogsWithLargerUIDResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetEventLogsWithLargerUIDResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsWithLargerUIDRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsWithLargerUIDResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsWithLargerUID/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsWithLargerUID/Fault/FunctionalAPIInternalError")})
  public abstract SystemEventLogs getEventLogsWithLargerUID(@WebParam(name="eventUID", targetNamespace="") SystemEventUID paramSystemEventUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getEventLogsByUID", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetEventLogsByUID")
  @ResponseWrapper(localName="getEventLogsByUIDResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetEventLogsByUIDResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByUIDRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByUIDResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByUID/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getEventLogsByUID/Fault/FunctionalAPIInternalError")})
  public abstract SystemEventLogs getEventLogsByUID(@WebParam(name="eventUID", targetNamespace="") SystemEventUID paramSystemEventUID, @WebParam(name="maxEventsLimit", targetNamespace="") int paramInt)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemStatistics")
  @ResponseWrapper(localName="getSystemStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatistics/Fault/FunctionalAPIInternalError")})
  public abstract SystemStatistics getSystemStatistics()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllRPAStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllRPAStatistics")
  @ResponseWrapper(localName="getAllRPAStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllRPAStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRPAStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRPAStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRPAStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRPAStatistics/Fault/FunctionalAPIInternalError")})
  public abstract List<RPAStatistics> getAllRPAStatistics()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterStatistics")
  @ResponseWrapper(localName="getClusterStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterStatistics/Fault/FunctionalAPIInternalError")})
  public abstract ClusterStatistics getClusterStatistics(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getUsersSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUsersSettings")
  @ResponseWrapper(localName="getUsersSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUsersSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUsersSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUsersSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUsersSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUsersSettings/Fault/FunctionalAPIInternalError")})
  public abstract UsersSettings getUsersSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setUsersSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetUsersSettings")
  @ResponseWrapper(localName="setUsersSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetUsersSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUsersSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUsersSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUsersSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUsersSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setUsersSettings(@WebParam(name="settings", targetNamespace="") UsersSettings paramUsersSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetUsersSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetUsersSettings")
  @ResponseWrapper(localName="validateSetUsersSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetUsersSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetUsersSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetUsersSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetUsersSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetUsersSettings/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetUsersSettings/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetUsersSettings(@WebParam(name="settings", targetNamespace="") UsersSettings paramUsersSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addUserRole", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddUserRole")
  @ResponseWrapper(localName="addUserRoleResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddUserRoleResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserRoleRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserRoleResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserRole/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addUserRole/Fault/FunctionalAPIInternalError")})
  public abstract void addUserRole(@WebParam(name="role", targetNamespace="") UserRole paramUserRole)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddUserRole", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddUserRole")
  @ResponseWrapper(localName="validateAddUserRoleResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddUserRoleResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserRoleRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserRoleResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserRole/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserRole/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddUserRole/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddUserRole(@WebParam(name="role", targetNamespace="") UserRole paramUserRole)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="editUserRole", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditUserRole")
  @ResponseWrapper(localName="editUserRoleResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditUserRoleResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editUserRoleRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editUserRoleResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editUserRole/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editUserRole/Fault/FunctionalAPIInternalError")})
  public abstract void editUserRole(@WebParam(name="oldRoleName", targetNamespace="") String paramString, @WebParam(name="newRole", targetNamespace="") UserRole paramUserRole)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEditUserRole", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditUserRole")
  @ResponseWrapper(localName="validateEditUserRoleResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditUserRoleResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditUserRoleRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditUserRoleResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditUserRole/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditUserRole/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditUserRole/Fault/FunctionalAPIValidationException")})
  public abstract void validateEditUserRole(@WebParam(name="oldRoleName", targetNamespace="") String paramString, @WebParam(name="newRole", targetNamespace="") UserRole paramUserRole)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeUserRole", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveUserRole")
  @ResponseWrapper(localName="removeUserRoleResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveUserRoleResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserRoleRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserRoleResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserRole/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeUserRole/Fault/FunctionalAPIInternalError")})
  public abstract void removeUserRole(@WebParam(name="role", targetNamespace="") UserRole paramUserRole)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveUserRole", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveUserRole")
  @ResponseWrapper(localName="validateRemoveUserRoleResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveUserRoleResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserRoleRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserRoleResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserRole/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserRole/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveUserRole/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveUserRole(@WebParam(name="role", targetNamespace="") UserRole paramUserRole)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getUserRoles", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUserRoles")
  @ResponseWrapper(localName="getUserRolesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUserRolesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserRolesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserRolesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserRoles/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserRoles/Fault/FunctionalAPIInternalError")})
  public abstract List<UserRole> getUserRoles()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableSystemAlerts", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSystemAlerts")
  @ResponseWrapper(localName="disableSystemAlertsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSystemAlertsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemAlertsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemAlertsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemAlerts/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemAlerts/Fault/FunctionalAPIInternalError")})
  public abstract void disableSystemAlerts()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableSystemAlerts", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSystemAlerts")
  @ResponseWrapper(localName="enableSystemAlertsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSystemAlertsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemAlertsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemAlertsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemAlerts/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemAlerts/Fault/FunctionalAPIInternalError")})
  public abstract void enableSystemAlerts()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemAlertsSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemAlertsSettings")
  @ResponseWrapper(localName="getSystemAlertsSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemAlertsSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemAlertsSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemAlertsSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemAlertsSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemAlertsSettings/Fault/FunctionalAPIInternalError")})
  public abstract SystemAlertsSettings getSystemAlertsSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSystemAlertsSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemAlertsSettings")
  @ResponseWrapper(localName="setSystemAlertsSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemAlertsSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemAlertsSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemAlertsSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemAlertsSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemAlertsSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setSystemAlertsSettings(@WebParam(name="settings", targetNamespace="") SystemAlertsSettings paramSystemAlertsSettings, @WebParam(name="requestedSmtpServerAddress", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableSystemReport", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSystemReport")
  @ResponseWrapper(localName="disableSystemReportResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSystemReportResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemReportRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemReportResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemReport/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSystemReport/Fault/FunctionalAPIInternalError")})
  public abstract void disableSystemReport()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDisableSystemReport", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableSystemReport")
  @ResponseWrapper(localName="validateDisableSystemReportResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableSystemReportResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableSystemReportRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableSystemReportResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableSystemReport/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableSystemReport/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableSystemReport/Fault/FunctionalAPIValidationException")})
  public abstract void validateDisableSystemReport()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableSystemReport", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSystemReport")
  @ResponseWrapper(localName="enableSystemReportResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSystemReportResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemReportRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemReportResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemReport/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSystemReport/Fault/FunctionalAPIInternalError")})
  public abstract void enableSystemReport()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableSystemReport", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableSystemReport")
  @ResponseWrapper(localName="validateEnableSystemReportResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableSystemReportResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableSystemReportRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableSystemReportResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableSystemReport/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableSystemReport/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableSystemReport/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableSystemReport()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemReportSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemReportSettings")
  @ResponseWrapper(localName="getSystemReportSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemReportSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemReportSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemReportSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemReportSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemReportSettings/Fault/FunctionalAPIInternalError")})
  public abstract SystemReportSettings getSystemReportSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSystemReportSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemReportSettings")
  @ResponseWrapper(localName="setSystemReportSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemReportSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemReportSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemReportSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemReportSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemReportSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setSystemReportSettings(@WebParam(name="settings", targetNamespace="") SystemReportSettings paramSystemReportSettings, @WebParam(name="requestedSmtpServerAddress", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetSystemReportSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemReportSettings")
  @ResponseWrapper(localName="validateSetSystemReportSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemReportSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemReportSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemReportSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemReportSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemReportSettings/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemReportSettings/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetSystemReportSettings(@WebParam(name="settings", targetNamespace="") SystemReportSettings paramSystemReportSettings, @WebParam(name="requestedSmtpServerAddress", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getUserDefinedProperties", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUserDefinedProperties")
  @ResponseWrapper(localName="getUserDefinedPropertiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetUserDefinedPropertiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserDefinedPropertiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserDefinedPropertiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserDefinedProperties/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getUserDefinedProperties/Fault/FunctionalAPIInternalError")})
  public abstract UserDefinedProperties getUserDefinedProperties()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setUserDefinedProperties", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetUserDefinedProperties")
  @ResponseWrapper(localName="setUserDefinedPropertiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetUserDefinedPropertiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUserDefinedPropertiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUserDefinedPropertiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUserDefinedProperties/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setUserDefinedProperties/Fault/FunctionalAPIInternalError")})
  public abstract void setUserDefinedProperties(@WebParam(name="userDefinedProperties", targetNamespace="") UserDefinedProperties paramUserDefinedProperties)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addSSHKey", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSSHKey")
  @ResponseWrapper(localName="addSSHKeyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSSHKeyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSSHKeyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSSHKeyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSSHKey/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSSHKey/Fault/FunctionalAPIInternalError")})
  public abstract void addSSHKey(@WebParam(name="key", targetNamespace="") SSHKey paramSSHKey)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeSSHKey", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSSHKey")
  @ResponseWrapper(localName="removeSSHKeyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSSHKeyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSSHKeyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSSHKeyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSSHKey/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSSHKey/Fault/FunctionalAPIInternalError")})
  public abstract void removeSSHKey(@WebParam(name="key", targetNamespace="") SSHKey paramSSHKey)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllSSHKeys", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllSSHKeys")
  @ResponseWrapper(localName="getAllSSHKeysResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllSSHKeysResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSSHKeysRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSSHKeysResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSSHKeys/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllSSHKeys/Fault/FunctionalAPIInternalError")})
  public abstract List<SSHKey> getAllSSHKeys()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addSNMPUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSNMPUser")
  @ResponseWrapper(localName="addSNMPUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddSNMPUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSNMPUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSNMPUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSNMPUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addSNMPUser/Fault/FunctionalAPIInternalError")})
  public abstract void addSNMPUser(@WebParam(name="user", targetNamespace="") SNMPUser paramSNMPUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeSNMPUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSNMPUser")
  @ResponseWrapper(localName="removeSNMPUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveSNMPUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSNMPUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSNMPUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSNMPUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeSNMPUser/Fault/FunctionalAPIInternalError")})
  public abstract void removeSNMPUser(@WebParam(name="user", targetNamespace="") SNMPUser paramSNMPUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableSNMP", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSNMP")
  @ResponseWrapper(localName="enableSNMPResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSNMPResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSNMPRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSNMPResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSNMP/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSNMP/Fault/FunctionalAPIInternalError")})
  public abstract void enableSNMP()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableSNMP", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSNMP")
  @ResponseWrapper(localName="disableSNMPResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSNMPResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSNMPRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSNMPResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSNMP/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSNMP/Fault/FunctionalAPIInternalError")})
  public abstract void disableSNMP()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSNMPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSNMPSettings")
  @ResponseWrapper(localName="getSNMPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSNMPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSNMPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSNMPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSNMPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSNMPSettings/Fault/FunctionalAPIInternalError")})
  public abstract SNMPSettings getSNMPSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSNMPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSNMPSettings")
  @ResponseWrapper(localName="setSNMPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSNMPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSNMPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSNMPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSNMPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSNMPSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setSNMPSettings(@WebParam(name="settings", targetNamespace="") SNMPSettings paramSNMPSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getLDAPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLDAPSettings")
  @ResponseWrapper(localName="getLDAPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLDAPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPSettings/Fault/FunctionalAPIInternalError")})
  public abstract LDAPSettings getLDAPSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetLDAPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetLDAPSettings")
  @ResponseWrapper(localName="validateSetLDAPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetLDAPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetLDAPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetLDAPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetLDAPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetLDAPSettings/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetLDAPSettings/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetLDAPSettings(@WebParam(name="settings", targetNamespace="") LDAPSettings paramLDAPSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setLDAPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetLDAPSettings")
  @ResponseWrapper(localName="setLDAPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetLDAPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setLDAPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setLDAPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setLDAPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setLDAPSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setLDAPSettings(@WebParam(name="settings", targetNamespace="") LDAPSettings paramLDAPSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getLDAPServerInfo", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLDAPServerInfo")
  @ResponseWrapper(localName="getLDAPServerInfoResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLDAPServerInfoResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPServerInfoRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPServerInfoResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPServerInfo/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLDAPServerInfo/Fault/FunctionalAPIInternalError")})
  public abstract LDAPServerInfo getLDAPServerInfo()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableLDAP", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableLDAP")
  @ResponseWrapper(localName="enableLDAPResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableLDAPResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLDAPRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLDAPResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLDAP/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLDAP/Fault/FunctionalAPIInternalError")})
  public abstract void enableLDAP()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableLDAP", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableLDAP")
  @ResponseWrapper(localName="disableLDAPResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableLDAPResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableLDAPRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableLDAPResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableLDAP/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableLDAP/Fault/FunctionalAPIInternalError")})
  public abstract void disableLDAP()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="clearLDAPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ClearLDAPSettings")
  @ResponseWrapper(localName="clearLDAPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ClearLDAPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLDAPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLDAPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLDAPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLDAPSettings/Fault/FunctionalAPIInternalError")})
  public abstract void clearLDAPSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="testCurrentLDAPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TestCurrentLDAPSettings")
  @ResponseWrapper(localName="testCurrentLDAPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TestCurrentLDAPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testCurrentLDAPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testCurrentLDAPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testCurrentLDAPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testCurrentLDAPSettings/Fault/FunctionalAPIInternalError")})
  public abstract void testCurrentLDAPSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="testLDAPSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TestLDAPSettings")
  @ResponseWrapper(localName="testLDAPSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TestLDAPSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testLDAPSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testLDAPSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testLDAPSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testLDAPSettings/Fault/FunctionalAPIInternalError")})
  public abstract void testLDAPSettings(@WebParam(name="settings", targetNamespace="") LDAPSettings paramLDAPSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addRecoverPointUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddRecoverPointUser")
  @ResponseWrapper(localName="addRecoverPointUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddRecoverPointUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUser/Fault/FunctionalAPIInternalError")})
  public abstract void addRecoverPointUser(@WebParam(name="user", targetNamespace="") RecoverPointUser paramRecoverPointUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddRecoverPointUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddRecoverPointUser")
  @ResponseWrapper(localName="validateAddRecoverPointUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddRecoverPointUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUser/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUser/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddRecoverPointUser(@WebParam(name="user", targetNamespace="") RecoverPointUser paramRecoverPointUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="editRecoverPointUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditRecoverPointUser")
  @ResponseWrapper(localName="editRecoverPointUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditRecoverPointUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editRecoverPointUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editRecoverPointUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editRecoverPointUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editRecoverPointUser/Fault/FunctionalAPIInternalError")})
  public abstract void editRecoverPointUser(@WebParam(name="oldUserName", targetNamespace="") String paramString, @WebParam(name="user", targetNamespace="") RecoverPointUser paramRecoverPointUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEditRecoverPointUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditRecoverPointUser")
  @ResponseWrapper(localName="validateEditRecoverPointUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditRecoverPointUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditRecoverPointUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditRecoverPointUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditRecoverPointUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditRecoverPointUser/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditRecoverPointUser/Fault/FunctionalAPIValidationException")})
  public abstract void validateEditRecoverPointUser(@WebParam(name="oldUserName", targetNamespace="") String paramString, @WebParam(name="user", targetNamespace="") RecoverPointUser paramRecoverPointUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addRecoverPointUsers", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddRecoverPointUsers")
  @ResponseWrapper(localName="addRecoverPointUsersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddRecoverPointUsersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUsersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUsersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUsers/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addRecoverPointUsers/Fault/FunctionalAPIInternalError")})
  public abstract void addRecoverPointUsers(@WebParam(name="users", targetNamespace="") List<RecoverPointUser> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddRecoverPointUsers", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddRecoverPointUsers")
  @ResponseWrapper(localName="validateAddRecoverPointUsersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddRecoverPointUsersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUsersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUsersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUsers/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUsers/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddRecoverPointUsers/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddRecoverPointUsers(@WebParam(name="users", targetNamespace="") List<RecoverPointUser> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeRecoverPointUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveRecoverPointUser")
  @ResponseWrapper(localName="removeRecoverPointUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveRecoverPointUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUser/Fault/FunctionalAPIInternalError")})
  public abstract void removeRecoverPointUser(@WebParam(name="user", targetNamespace="") RecoverPointUser paramRecoverPointUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveRecoverPointUser", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveRecoverPointUser")
  @ResponseWrapper(localName="validateRemoveRecoverPointUserResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveRecoverPointUserResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUserRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUserResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUser/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUser/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUser/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveRecoverPointUser(@WebParam(name="user", targetNamespace="") RecoverPointUser paramRecoverPointUser)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeRecoverPointUsers", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveRecoverPointUsers")
  @ResponseWrapper(localName="removeRecoverPointUsersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveRecoverPointUsersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUsersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUsersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUsers/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeRecoverPointUsers/Fault/FunctionalAPIInternalError")})
  public abstract void removeRecoverPointUsers(@WebParam(name="users", targetNamespace="") List<RecoverPointUser> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveRecoverPointUsers", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveRecoverPointUsers")
  @ResponseWrapper(localName="validateRemoveRecoverPointUsersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveRecoverPointUsersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUsersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUsersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUsers/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUsers/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveRecoverPointUsers/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveRecoverPointUsers(@WebParam(name="users", targetNamespace="") List<RecoverPointUser> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getCurrentUserEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentUserEventLogsFilter")
  @ResponseWrapper(localName="getCurrentUserEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentUserEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserEventLogsFilter/Fault/FunctionalAPIInternalError")})
  public abstract UserEventLogsFilter getCurrentUserEventLogsFilter()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setCurrentUserEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetCurrentUserEventLogsFilter")
  @ResponseWrapper(localName="setCurrentUserEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetCurrentUserEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCurrentUserEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCurrentUserEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCurrentUserEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCurrentUserEventLogsFilter/Fault/FunctionalAPIInternalError")})
  public abstract void setCurrentUserEventLogsFilter(@WebParam(name="filter", targetNamespace="") UserEventLogsFilter paramUserEventLogsFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllRecoverPointUsers", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllRecoverPointUsers")
  @ResponseWrapper(localName="getAllRecoverPointUsersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllRecoverPointUsersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoverPointUsersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoverPointUsersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoverPointUsers/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllRecoverPointUsers/Fault/FunctionalAPIInternalError")})
  public abstract List<RecoverPointUser> getAllRecoverPointUsers()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getTimeSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTimeSettings")
  @ResponseWrapper(localName="getTimeSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTimeSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTimeSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTimeSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTimeSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTimeSettings/Fault/FunctionalAPIInternalError")})
  public abstract TimeSettings getTimeSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setTimeSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetTimeSettings")
  @ResponseWrapper(localName="setTimeSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetTimeSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setTimeSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setTimeSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setTimeSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setTimeSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setTimeSettings(@WebParam(name="settings", targetNamespace="") TimeSettings paramTimeSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSyslogSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSyslogSettings")
  @ResponseWrapper(localName="getSyslogSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSyslogSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSyslogSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSyslogSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSyslogSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSyslogSettings/Fault/FunctionalAPIInternalError")})
  public abstract SyslogSettings getSyslogSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSyslogSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSyslogSettings")
  @ResponseWrapper(localName="setSyslogSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSyslogSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSyslogSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSyslogSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSyslogSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSyslogSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setSyslogSettings(@WebParam(name="settings", targetNamespace="") SyslogSettings paramSyslogSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableSyslog", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSyslog")
  @ResponseWrapper(localName="enableSyslogResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableSyslogResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSyslogRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSyslogResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSyslog/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableSyslog/Fault/FunctionalAPIInternalError")})
  public abstract void enableSyslog()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableSyslog", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSyslog")
  @ResponseWrapper(localName="disableSyslogResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableSyslogResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSyslogRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSyslogResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSyslog/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableSyslog/Fault/FunctionalAPIInternalError")})
  public abstract void disableSyslog()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemMiscellaneousSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemMiscellaneousSettings")
  @ResponseWrapper(localName="getSystemMiscellaneousSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemMiscellaneousSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemMiscellaneousSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemMiscellaneousSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemMiscellaneousSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemMiscellaneousSettings/Fault/FunctionalAPIInternalError")})
  public abstract SystemMiscellaneousSettings getSystemMiscellaneousSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSystemMiscellaneousSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemMiscellaneousSettings")
  @ResponseWrapper(localName="setSystemMiscellaneousSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemMiscellaneousSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemMiscellaneousSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemMiscellaneousSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemMiscellaneousSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemMiscellaneousSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setSystemMiscellaneousSettings(@WebParam(name="settings", targetNamespace="") SystemMiscellaneousSettings paramSystemMiscellaneousSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetSystemMiscellaneousSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemMiscellaneousSettings")
  @ResponseWrapper(localName="validateSetSystemMiscellaneousSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemMiscellaneousSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemMiscellaneousSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemMiscellaneousSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemMiscellaneousSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemMiscellaneousSettings/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemMiscellaneousSettings/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetSystemMiscellaneousSettings(@WebParam(name="settings", targetNamespace="") SystemMiscellaneousSettings paramSystemMiscellaneousSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSystemSecurityLevel", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemSecurityLevel")
  @ResponseWrapper(localName="setSystemSecurityLevelResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSystemSecurityLevelResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemSecurityLevelRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemSecurityLevelResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemSecurityLevel/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSystemSecurityLevel/Fault/FunctionalAPIInternalError")})
  public abstract void setSystemSecurityLevel(@WebParam(name="securityLevel", targetNamespace="") SystemSecurityLevel paramSystemSecurityLevel)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetSystemSecurityLevel", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemSecurityLevel")
  @ResponseWrapper(localName="validateSetSystemSecurityLevelResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetSystemSecurityLevelResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemSecurityLevelRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemSecurityLevelResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemSecurityLevel/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemSecurityLevel/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetSystemSecurityLevel/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetSystemSecurityLevel(@WebParam(name="securityLevel", targetNamespace="") SystemSecurityLevel paramSystemSecurityLevel)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="detectBottlenecks", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetectBottlenecks")
  @ResponseWrapper(localName="detectBottlenecksResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetectBottlenecksResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detectBottlenecksRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detectBottlenecksResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detectBottlenecks/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detectBottlenecks/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID detectBottlenecks(@WebParam(name="filter", targetNamespace="") DetectBottlenecksFilter paramDetectBottlenecksFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailablePhoenixClustersForCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailablePhoenixClustersForCluster")
  @ResponseWrapper(localName="getAvailablePhoenixClustersForClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailablePhoenixClustersForClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePhoenixClustersForClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePhoenixClustersForClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePhoenixClustersForCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePhoenixClustersForCluster/Fault/FunctionalAPIInternalError")})
  public abstract List<String> getAvailablePhoenixClustersForCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getPhoenixClusterState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetPhoenixClusterState")
  @ResponseWrapper(localName="getPhoenixClusterStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetPhoenixClusterStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClusterStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClusterStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClusterState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClusterState/Fault/FunctionalAPIInternalError")})
  public abstract PhoenixClusterState getPhoenixClusterState(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getPhoenixClustersStateForAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetPhoenixClustersStateForAllClusters")
  @ResponseWrapper(localName="getPhoenixClustersStateForAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetPhoenixClustersStateForAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClustersStateForAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClustersStateForAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClustersStateForAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getPhoenixClustersStateForAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<PhoenixClusterState> getPhoenixClustersStateForAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="attachPhoenixCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AttachPhoenixCluster")
  @ResponseWrapper(localName="attachPhoenixClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AttachPhoenixClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachPhoenixClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachPhoenixClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachPhoenixCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/attachPhoenixCluster/Fault/FunctionalAPIInternalError")})
  public abstract void attachPhoenixCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="phoenixClusterName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="detachPhoenixCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetachPhoenixCluster")
  @ResponseWrapper(localName="detachPhoenixClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DetachPhoenixClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachPhoenixClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachPhoenixClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachPhoenixCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/detachPhoenixCluster/Fault/FunctionalAPIInternalError")})
  public abstract void detachPhoenixCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllStatisticsCategories", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllStatisticsCategories")
  @ResponseWrapper(localName="getAllStatisticsCategoriesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllStatisticsCategoriesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllStatisticsCategoriesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllStatisticsCategoriesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllStatisticsCategories/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllStatisticsCategories/Fault/FunctionalAPIInternalError")})
  public abstract List<String> getAllStatisticsCategories()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="exportStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportStatistics")
  @ResponseWrapper(localName="exportStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatistics/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID exportStatistics(@WebParam(name="filter", targetNamespace="") StatisticsFilter paramStatisticsFilter, @WebParam(name="fileName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="exportStatisticsToDefaultFile", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportStatisticsToDefaultFile")
  @ResponseWrapper(localName="exportStatisticsToDefaultFileResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportStatisticsToDefaultFileResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatisticsToDefaultFileRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatisticsToDefaultFileResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatisticsToDefaultFile/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportStatisticsToDefaultFile/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID exportStatisticsToDefaultFile(@WebParam(name="filter", targetNamespace="") StatisticsFilter paramStatisticsFilter)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableLongTermStatisticsTimeFrames", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableLongTermStatisticsTimeFrames")
  @ResponseWrapper(localName="getAvailableLongTermStatisticsTimeFramesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableLongTermStatisticsTimeFramesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableLongTermStatisticsTimeFramesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableLongTermStatisticsTimeFramesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableLongTermStatisticsTimeFrames/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableLongTermStatisticsTimeFrames/Fault/FunctionalAPIInternalError")})
  public abstract LongTermStatisticsTimeFrames getAvailableLongTermStatisticsTimeFrames()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="exportConsolidatedStatisticsByTimeFrame", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportConsolidatedStatisticsByTimeFrame")
  @ResponseWrapper(localName="exportConsolidatedStatisticsByTimeFrameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportConsolidatedStatisticsByTimeFrameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFrameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFrameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFrame/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFrame/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID exportConsolidatedStatisticsByTimeFrame(@WebParam(name="timeFrame", targetNamespace="") LongTermStatisticsTimeFrame paramLongTermStatisticsTimeFrame)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="exportConsolidatedStatisticsByTimeFrames", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportConsolidatedStatisticsByTimeFrames")
  @ResponseWrapper(localName="exportConsolidatedStatisticsByTimeFramesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ExportConsolidatedStatisticsByTimeFramesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFramesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFramesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFrames/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/exportConsolidatedStatisticsByTimeFrames/Fault/FunctionalAPIInternalError")})
  public abstract TransactionID exportConsolidatedStatisticsByTimeFrames(@WebParam(name="timeFrames", targetNamespace="") LongTermStatisticsTimeFrames paramLongTermStatisticsTimeFrames)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="clearLongTermStatistics", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ClearLongTermStatistics")
  @ResponseWrapper(localName="clearLongTermStatisticsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ClearLongTermStatisticsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLongTermStatisticsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLongTermStatisticsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLongTermStatistics/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/clearLongTermStatistics/Fault/FunctionalAPIInternalError")})
  public abstract void clearLongTermStatistics()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="suspendConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SuspendConsistencyGroup")
  @ResponseWrapper(localName="suspendConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SuspendConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suspendConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suspendConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suspendConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suspendConsistencyGroup/Fault/FunctionalAPIInternalError")})
  public abstract void suspendConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="resumeConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResumeConsistencyGroup")
  @ResponseWrapper(localName="resumeConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResumeConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeConsistencyGroup/Fault/FunctionalAPIInternalError")})
  public abstract void resumeConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="acquireClusterManagementIP", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AcquireClusterManagementIP")
  @ResponseWrapper(localName="acquireClusterManagementIPResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AcquireClusterManagementIPResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/acquireClusterManagementIPRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/acquireClusterManagementIPResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/acquireClusterManagementIP/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/acquireClusterManagementIP/Fault/FunctionalAPIInternalError")})
  public abstract void acquireClusterManagementIP(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="releaseClusterManagementIP", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ReleaseClusterManagementIP")
  @ResponseWrapper(localName="releaseClusterManagementIPResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ReleaseClusterManagementIPResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/releaseClusterManagementIPRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/releaseClusterManagementIPResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/releaseClusterManagementIP/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/releaseClusterManagementIP/Fault/FunctionalAPIInternalError")})
  public abstract void releaseClusterManagementIP(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="startClusterMaintenance", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartClusterMaintenance")
  @ResponseWrapper(localName="startClusterMaintenanceResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartClusterMaintenanceResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startClusterMaintenanceRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startClusterMaintenanceResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startClusterMaintenance/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startClusterMaintenance/Fault/FunctionalAPIInternalError")})
  public abstract void startClusterMaintenance(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="maintenanceMode", targetNamespace="") ClusterMaintenanceMode paramClusterMaintenanceMode)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="finishClusterMaintenance", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FinishClusterMaintenance")
  @ResponseWrapper(localName="finishClusterMaintenanceResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FinishClusterMaintenanceResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishClusterMaintenanceRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishClusterMaintenanceResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishClusterMaintenance/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishClusterMaintenance/Fault/FunctionalAPIInternalError")})
  public abstract void finishClusterMaintenance(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="startRPAMaintenance", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartRPAMaintenance")
  @ResponseWrapper(localName="startRPAMaintenanceResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartRPAMaintenanceResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startRPAMaintenanceRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startRPAMaintenanceResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startRPAMaintenance/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startRPAMaintenance/Fault/FunctionalAPIInternalError")})
  public abstract void startRPAMaintenance(@WebParam(name="rpa", targetNamespace="") RpaUID paramRpaUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="finishRPAMaintenance", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FinishRPAMaintenance")
  @ResponseWrapper(localName="finishRPAMaintenanceResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FinishRPAMaintenanceResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishRPAMaintenanceRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishRPAMaintenanceResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishRPAMaintenance/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/finishRPAMaintenance/Fault/FunctionalAPIInternalError")})
  public abstract void finishRPAMaintenance(@WebParam(name="rpa", targetNamespace="") RpaUID paramRpaUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getLocalCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLocalCluster")
  @ResponseWrapper(localName="getLocalClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLocalClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLocalClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLocalClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLocalCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLocalCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterUID getLocalCluster()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getCurrentRPA", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentRPA")
  @ResponseWrapper(localName="getCurrentRPAResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentRPAResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentRPARequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentRPAResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentRPA/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentRPA/Fault/FunctionalAPIInternalError")})
  public abstract RpaUID getCurrentRPA()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getCurrentTime", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentTime")
  @ResponseWrapper(localName="getCurrentTimeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentTimeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentTimeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentTimeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentTime/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentTime/Fault/FunctionalAPIInternalError")})
  public abstract RecoverPointTimeStamp getCurrentTime()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemInternalConfigParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemInternalConfigParams")
  @ResponseWrapper(localName="getSystemInternalConfigParamsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemInternalConfigParamsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParamsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParamsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParams/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParams/Fault/FunctionalAPIInternalError")})
  public abstract SystemInternalConfigParams getSystemInternalConfigParams()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemInternalConfigParamsConflicts", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemInternalConfigParamsConflicts")
  @ResponseWrapper(localName="getSystemInternalConfigParamsConflictsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemInternalConfigParamsConflictsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParamsConflictsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParamsConflictsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParamsConflicts/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemInternalConfigParamsConflicts/Fault/FunctionalAPIInternalError")})
  public abstract String getSystemInternalConfigParamsConflicts()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRecoverPointVersion", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecoverPointVersion")
  @ResponseWrapper(localName="getRecoverPointVersionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecoverPointVersionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointVersionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointVersionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointVersion/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointVersion/Fault/FunctionalAPIInternalError")})
  public abstract RecoverPointVersion getRecoverPointVersion()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getTransactionStatus", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTransactionStatus")
  @ResponseWrapper(localName="getTransactionStatusResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTransactionStatusResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionStatusRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionStatusResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionStatus/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionStatus/Fault/FunctionalAPIInternalError")})
  public abstract TransactionStatus getTransactionStatus(@WebParam(name="transactionID", targetNamespace="") TransactionID paramTransactionID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getTransactionResult", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTransactionResult")
  @ResponseWrapper(localName="getTransactionResultResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTransactionResultResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionResultRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionResultResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionResult/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTransactionResult/Fault/FunctionalAPIInternalError")})
  public abstract TransactionResult getTransactionResult(@WebParam(name="transactionID", targetNamespace="") TransactionID paramTransactionID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="abortTransaction", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AbortTransaction")
  @ResponseWrapper(localName="abortTransactionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AbortTransactionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortTransactionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortTransactionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortTransaction/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/abortTransaction/Fault/FunctionalAPIInternalError")})
  public abstract void abortTransaction(@WebParam(name="transactionID", targetNamespace="") TransactionID paramTransactionID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAbortTransaction", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAbortTransaction")
  @ResponseWrapper(localName="validateAbortTransactionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAbortTransactionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortTransactionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortTransactionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortTransaction/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortTransaction/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAbortTransaction/Fault/FunctionalAPIValidationException")})
  public abstract void validateAbortTransaction(@WebParam(name="transactionID", targetNamespace="") TransactionID paramTransactionID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getFullRecoverPointContext", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointContext")
  @ResponseWrapper(localName="getFullRecoverPointContextResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointContextResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointContextRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointContextResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointContext/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointContext/Fault/FunctionalAPIInternalError")})
  public abstract FullRecoverPointContext getFullRecoverPointContext()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClariionVolumesContext", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClariionVolumesContext")
  @ResponseWrapper(localName="getClariionVolumesContextResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClariionVolumesContextResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClariionVolumesContextRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClariionVolumesContextResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClariionVolumesContext/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClariionVolumesContext/Fault/FunctionalAPIInternalError")})
  public abstract ClariionVolumesContext getClariionVolumesContext(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemStatusContext", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemStatusContext")
  @ResponseWrapper(localName="getSystemStatusContextResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemStatusContextResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatusContextRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatusContextResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatusContext/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemStatusContext/Fault/FunctionalAPIInternalError")})
  public abstract SystemStatusContext getSystemStatusContext()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getFullRecoverPointStateContext", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointStateContext")
  @ResponseWrapper(localName="getFullRecoverPointStateContextResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointStateContextResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointStateContextRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointStateContextResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointStateContext/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointStateContext/Fault/FunctionalAPIInternalError")})
  public abstract FullRecoverPointStateContext getFullRecoverPointStateContext()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getFullRecoverPointSettingsContext", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointSettingsContext")
  @ResponseWrapper(localName="getFullRecoverPointSettingsContextResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointSettingsContextResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettingsContextRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettingsContextResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettingsContext/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettingsContext/Fault/FunctionalAPIInternalError")})
  public abstract FullRecoverPointSettingsContext getFullRecoverPointSettingsContext()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getFullRecoverPointSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointSettings")
  @ResponseWrapper(localName="getFullRecoverPointSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointSettings/Fault/FunctionalAPIInternalError")})
  public abstract FullRecoverPointSettings getFullRecoverPointSettings()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="areThereSystemSettingsConflicts", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AreThereSystemSettingsConflicts")
  @ResponseWrapper(localName="areThereSystemSettingsConflictsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AreThereSystemSettingsConflictsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/areThereSystemSettingsConflictsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/areThereSystemSettingsConflictsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/areThereSystemSettingsConflicts/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/areThereSystemSettingsConflicts/Fault/FunctionalAPIInternalError")})
  public abstract boolean areThereSystemSettingsConflicts()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getFullRecoverPointState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointState")
  @ResponseWrapper(localName="getFullRecoverPointStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetFullRecoverPointStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getFullRecoverPointState/Fault/FunctionalAPIInternalError")})
  public abstract FullRecoverPointState getFullRecoverPointState()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getProtectedVmCount", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetProtectedVmCount")
  @ResponseWrapper(localName="getProtectedVmCountResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetProtectedVmCountResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getProtectedVmCountRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getProtectedVmCountResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getProtectedVmCount/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getProtectedVmCount/Fault/FunctionalAPIInternalError")})
  public abstract List<VirtualCenterProtectedVmCountState> getProtectedVmCount()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCenterServerViewContext", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerViewContext")
  @ResponseWrapper(localName="getVCenterServerViewContextResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCenterServerViewContextResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerViewContextRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerViewContextResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerViewContext/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCenterServerViewContext/Fault/FunctionalAPIInternalError")})
  public abstract VCenterServerViewContext getVCenterServerViewContext(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterSANVolumesContext", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSANVolumesContext")
  @ResponseWrapper(localName="getClusterSANVolumesContextResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSANVolumesContextResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesContextRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesContextResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesContext/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSANVolumesContext/Fault/FunctionalAPIInternalError")})
  public abstract ClusterSANVolumesContext getClusterSANVolumesContext(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getConnectionInfo", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConnectionInfo")
  @ResponseWrapper(localName="getConnectionInfoResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConnectionInfoResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConnectionInfoRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConnectionInfoResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConnectionInfo/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConnectionInfo/Fault/FunctionalAPIInternalError")})
  public abstract ConnectionInfo getConnectionInfo()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getCurrentUserInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentUserInformation")
  @ResponseWrapper(localName="getCurrentUserInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCurrentUserInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCurrentUserInformation/Fault/FunctionalAPIInternalError")})
  public abstract UserInformation getCurrentUserInformation()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setPassword", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetPassword")
  @ResponseWrapper(localName="setPasswordResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetPasswordResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setPasswordRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setPasswordResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setPassword/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setPassword/Fault/FunctionalAPIInternalError")})
  public abstract void setPassword(@WebParam(name="username", targetNamespace="") String paramString, @WebParam(name="currentPassword", targetNamespace="") byte[] paramArrayOfByte1, @WebParam(name="newPassword", targetNamespace="") byte[] paramArrayOfByte2)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getServerCharsetName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetServerCharsetName")
  @ResponseWrapper(localName="getServerCharsetNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetServerCharsetNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getServerCharsetNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getServerCharsetNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getServerCharsetName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getServerCharsetName/Fault/FunctionalAPIInternalError")})
  public abstract String getServerCharsetName()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableFirstTimeWizard", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableFirstTimeWizard")
  @ResponseWrapper(localName="disableFirstTimeWizardResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableFirstTimeWizardResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableFirstTimeWizardRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableFirstTimeWizardResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableFirstTimeWizard/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableFirstTimeWizard/Fault/FunctionalAPIInternalError")})
  public abstract void disableFirstTimeWizard()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultUserEventLogsFilter", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultUserEventLogsFilter")
  @ResponseWrapper(localName="getDefaultUserEventLogsFilterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultUserEventLogsFilterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUserEventLogsFilterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUserEventLogsFilterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUserEventLogsFilter/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUserEventLogsFilter/Fault/FunctionalAPIInternalError")})
  public abstract UserEventLogsFilter getDefaultUserEventLogsFilter()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultUsersNames", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultUsersNames")
  @ResponseWrapper(localName="getDefaultUsersNamesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultUsersNamesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUsersNamesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUsersNamesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUsersNames/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultUsersNames/Fault/FunctionalAPIInternalError")})
  public abstract List<String> getDefaultUsersNames()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultRolesNames", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultRolesNames")
  @ResponseWrapper(localName="getDefaultRolesNamesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultRolesNamesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultRolesNamesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultRolesNamesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultRolesNames/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultRolesNames/Fault/FunctionalAPIInternalError")})
  public abstract List<String> getDefaultRolesNames()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableSymmetrixArrays", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSymmetrixArrays")
  @ResponseWrapper(localName="getAvailableSymmetrixArraysResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableSymmetrixArraysResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSymmetrixArraysRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSymmetrixArraysResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSymmetrixArrays/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableSymmetrixArrays/Fault/FunctionalAPIInternalError")})
  public abstract SymmetrixArrayList getAvailableSymmetrixArrays(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSymmetrixGateKeepersInfo", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSymmetrixGateKeepersInfo")
  @ResponseWrapper(localName="getSymmetrixGateKeepersInfoResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSymmetrixGateKeepersInfoResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSymmetrixGateKeepersInfoRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSymmetrixGateKeepersInfoResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSymmetrixGateKeepersInfo/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSymmetrixGateKeepersInfo/Fault/FunctionalAPIInternalError")})
  public abstract SymmetrixGateKeepersInfo getSymmetrixGateKeepersInfo(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="symmetrixID", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAccessIdsForSymmetrix", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAccessIdsForSymmetrix")
  @ResponseWrapper(localName="getAccessIdsForSymmetrixResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAccessIdsForSymmetrixResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccessIdsForSymmetrixRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccessIdsForSymmetrixResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccessIdsForSymmetrix/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAccessIdsForSymmetrix/Fault/FunctionalAPIInternalError")})
  public abstract SymmetrixHostIDsInfo getAccessIdsForSymmetrix(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="runCallHomeEvent", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RunCallHomeEvent")
  @ResponseWrapper(localName="runCallHomeEventResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RunCallHomeEventResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/runCallHomeEventRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/runCallHomeEventResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/runCallHomeEvent/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/runCallHomeEvent/Fault/FunctionalAPIInternalError")})
  public abstract void runCallHomeEvent()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getCallHomeEvents", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCallHomeEvents")
  @ResponseWrapper(localName="getCallHomeEventsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCallHomeEventsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCallHomeEventsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCallHomeEventsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCallHomeEvents/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCallHomeEvents/Fault/FunctionalAPIInternalError")})
  public abstract CallHomeEvents getCallHomeEvents()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="generateCallHomeEvents", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GenerateCallHomeEvents")
  @ResponseWrapper(localName="generateCallHomeEventsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GenerateCallHomeEventsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/generateCallHomeEventsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/generateCallHomeEventsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/generateCallHomeEvents/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/generateCallHomeEvents/Fault/FunctionalAPIInternalError")})
  public abstract CallHomeEvents generateCallHomeEvents(@WebParam(name="script", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setCallHomeEvents", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetCallHomeEvents")
  @ResponseWrapper(localName="setCallHomeEventsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetCallHomeEventsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCallHomeEventsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCallHomeEventsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCallHomeEvents/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setCallHomeEvents/Fault/FunctionalAPIInternalError")})
  public abstract void setCallHomeEvents(@WebParam(name="callHomeEvents", targetNamespace="") CallHomeEvents paramCallHomeEvents)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setArrayIRThrottlingPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetArrayIRThrottlingPolicy")
  @ResponseWrapper(localName="setArrayIRThrottlingPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetArrayIRThrottlingPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArrayIRThrottlingPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArrayIRThrottlingPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArrayIRThrottlingPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArrayIRThrottlingPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setArrayIRThrottlingPolicy(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="policy", targetNamespace="") ArrayIRThrottlingPolicyParams paramArrayIRThrottlingPolicyParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setClusterIRThrottlingPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetClusterIRThrottlingPolicy")
  @ResponseWrapper(localName="setClusterIRThrottlingPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetClusterIRThrottlingPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterIRThrottlingPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterIRThrottlingPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterIRThrottlingPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterIRThrottlingPolicy/Fault/FunctionalAPIInternalError")})
  public abstract void setClusterIRThrottlingPolicy(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="policy", targetNamespace="") ArrayIRThrottlingPolicy paramArrayIRThrottlingPolicy)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayIRThrottlingPolicy", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayIRThrottlingPolicy")
  @ResponseWrapper(localName="getArrayIRThrottlingPolicyResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayIRThrottlingPolicyResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayIRThrottlingPolicyRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayIRThrottlingPolicyResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayIRThrottlingPolicy/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayIRThrottlingPolicy/Fault/FunctionalAPIInternalError")})
  public abstract ArrayIRThrottlingPolicy getArrayIRThrottlingPolicy(@WebParam(name="array", targetNamespace="") String paramString, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSystemVersionState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemVersionState")
  @ResponseWrapper(localName="getSystemVersionStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSystemVersionStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemVersionStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemVersionStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemVersionState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSystemVersionState/Fault/FunctionalAPIInternalError")})
  public abstract SystemVersionState getSystemVersionState()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="resizeReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResizeReplicationSet")
  @ResponseWrapper(localName="resizeReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResizeReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resizeReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resizeReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resizeReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resizeReplicationSet/Fault/FunctionalAPIInternalError")})
  public abstract void resizeReplicationSet(@WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="resizeReplicationSetParam", targetNamespace="") ResizeReplicationSetParam paramResizeReplicationSetParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateResizeReplicationSet", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateResizeReplicationSet")
  @ResponseWrapper(localName="validateResizeReplicationSetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateResizeReplicationSetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResizeReplicationSetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResizeReplicationSetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResizeReplicationSet/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResizeReplicationSet/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResizeReplicationSet/Fault/FunctionalAPIValidationException")})
  public abstract void validateResizeReplicationSet(@WebParam(name="replicationSet", targetNamespace="") ReplicationSetUID paramReplicationSetUID, @WebParam(name="resizeReplicationSetParam", targetNamespace="") ResizeReplicationSetParam paramResizeReplicationSetParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRecommendedPrimaryRPANumber", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecommendedPrimaryRPANumber")
  @ResponseWrapper(localName="getRecommendedPrimaryRPANumberResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecommendedPrimaryRPANumberResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecommendedPrimaryRPANumberRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecommendedPrimaryRPANumberResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecommendedPrimaryRPANumber/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecommendedPrimaryRPANumber/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecommendedPrimaryRPANumber/Fault/FunctionalAPIValidationException")})
  public abstract Integer getRecommendedPrimaryRPANumber()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="testSyRConnectivity", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TestSyRConnectivity")
  @ResponseWrapper(localName="testSyRConnectivityResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TestSyRConnectivityResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testSyRConnectivityRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testSyRConnectivityResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testSyRConnectivity/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/testSyRConnectivity/Fault/FunctionalAPIInternalError")})
  public abstract void testSyRConnectivity(@WebParam(name="contactEmail", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVCCertificateInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCCertificateInformation")
  @ResponseWrapper(localName="getVCCertificateInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVCCertificateInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCCertificateInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCCertificateInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCCertificateInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVCCertificateInformation/Fault/FunctionalAPIInternalError")})
  public abstract CertificateInformation getVCCertificateInformation(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="ip", targetNamespace="") String paramString, @WebParam(name="port", targetNamespace="") int paramInt)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addLicense", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddLicense")
  @ResponseWrapper(localName="addLicenseResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddLicenseResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addLicenseRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addLicenseResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addLicense/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addLicense/Fault/FunctionalAPIInternalError")})
  public abstract void addLicense(@WebParam(name="license", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateAddLicense", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddLicense")
  @ResponseWrapper(localName="validateAddLicenseResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateAddLicenseResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddLicenseRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddLicenseResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddLicense/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddLicense/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateAddLicense/Fault/FunctionalAPIValidationException")})
  public abstract void validateAddLicense(@WebParam(name="license", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeLicense", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveLicense")
  @ResponseWrapper(localName="removeLicenseResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveLicenseResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeLicenseRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeLicenseResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeLicense/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeLicense/Fault/FunctionalAPIInternalError")})
  public abstract void removeLicense(@WebParam(name="license", targetNamespace="") LicenseUID paramLicenseUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveLicense", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveLicense")
  @ResponseWrapper(localName="validateRemoveLicenseResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveLicenseResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveLicenseRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveLicenseResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveLicense/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveLicense/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveLicense/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveLicense(@WebParam(name="license", targetNamespace="") LicenseUID paramLicenseUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getLicenseReport", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLicenseReport")
  @ResponseWrapper(localName="getLicenseReportResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetLicenseReportResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLicenseReportRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLicenseReportResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLicenseReport/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getLicenseReport/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterLicenseReport> getLicenseReport()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="sendLoginEvent", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SendLoginEvent")
  @ResponseWrapper(localName="sendLoginEventResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SendLoginEventResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/sendLoginEventRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/sendLoginEventResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/sendLoginEvent/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/sendLoginEvent/Fault/FunctionalAPIInternalError")})
  public abstract void sendLoginEvent(@WebParam(name="isLoginSuccessful", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getTargetVmCandidates", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTargetVmCandidates")
  @ResponseWrapper(localName="getTargetVmCandidatesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetTargetVmCandidatesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTargetVmCandidatesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTargetVmCandidatesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTargetVmCandidates/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getTargetVmCandidates/Fault/FunctionalAPIInternalError")})
  public abstract TargetVmCandidates getTargetVmCandidates(@WebParam(name="sourceVmParam", targetNamespace="") SourceVmParam paramSourceVmParam, @WebParam(name="vmReplicationTarget", targetNamespace="") VmReplicationTarget paramVmReplicationTarget)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addVmsToCG", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddVmsToCG")
  @ResponseWrapper(localName="addVmsToCGResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddVmsToCGResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVmsToCGRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVmsToCGResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVmsToCG/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addVmsToCG/Fault/FunctionalAPIInternalError")})
  public abstract void addVmsToCG(@WebParam(name="vms", targetNamespace="") List<VMReplicationSetParam> paramList, @WebParam(name="cgUID", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeVmsFromCG", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveVmsFromCG")
  @ResponseWrapper(localName="removeVmsFromCGResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveVmsFromCGResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVmsFromCGRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVmsFromCGResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVmsFromCG/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeVmsFromCG/Fault/FunctionalAPIInternalError")})
  public abstract void removeVmsFromCG(@WebParam(name="vms", targetNamespace="") List<VmUID> paramList, @WebParam(name="cgUID", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="replicateVms", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ReplicateVms")
  @ResponseWrapper(localName="replicateVmsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ReplicateVmsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/replicateVmsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/replicateVmsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/replicateVms/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/replicateVms/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupUID replicateVms(@WebParam(name="params", targetNamespace="") ReplicateVmsParam paramReplicateVmsParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateReplicateVms", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateReplicateVms")
  @ResponseWrapper(localName="validateReplicateVmsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateReplicateVmsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateReplicateVmsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateReplicateVmsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateReplicateVms/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateReplicateVms/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateReplicateVms/Fault/FunctionalAPIValidationException")})
  public abstract void validateReplicateVms(@WebParam(name="vms", targetNamespace="") ReplicateVmsParam paramReplicateVmsParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="changeGroupPowerUpSequence", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ChangeGroupPowerUpSequence")
  @ResponseWrapper(localName="changeGroupPowerUpSequenceResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ChangeGroupPowerUpSequenceResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeGroupPowerUpSequenceRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeGroupPowerUpSequenceResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeGroupPowerUpSequence/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeGroupPowerUpSequence/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeGroupPowerUpSequence/Fault/FunctionalAPIValidationException")})
  public abstract void changeGroupPowerUpSequence(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="powerUpGroup", targetNamespace="") Long paramLong)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="editVMsReplicationParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditVMsReplicationParams")
  @ResponseWrapper(localName="editVMsReplicationParamsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditVMsReplicationParamsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsReplicationParamsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsReplicationParamsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsReplicationParams/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsReplicationParams/Fault/FunctionalAPIInternalError")})
  public abstract void editVMsReplicationParams(@WebParam(name="params", targetNamespace="") ConsistencyGroupVMReplicationParams paramConsistencyGroupVMReplicationParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEditVMsReplicationParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditVMsReplicationParams")
  @ResponseWrapper(localName="validateEditVMsReplicationParamsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditVMsReplicationParamsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsReplicationParamsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsReplicationParamsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsReplicationParams/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsReplicationParams/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsReplicationParams/Fault/FunctionalAPIValidationException")})
  public abstract void validateEditVMsReplicationParams(@WebParam(name="params", targetNamespace="") ConsistencyGroupVMReplicationParams paramConsistencyGroupVMReplicationParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="editVMsHardwareReplicationParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditVMsHardwareReplicationParams")
  @ResponseWrapper(localName="editVMsHardwareReplicationParamsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EditVMsHardwareReplicationParamsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsHardwareReplicationParamsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsHardwareReplicationParamsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsHardwareReplicationParams/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/editVMsHardwareReplicationParams/Fault/FunctionalAPIInternalError")})
  public abstract void editVMsHardwareReplicationParams(@WebParam(name="params", targetNamespace="") ConsistencyGroupVMHardwareReplicationParams paramConsistencyGroupVMHardwareReplicationParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEditVMsHardwareReplicationParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditVMsHardwareReplicationParams")
  @ResponseWrapper(localName="validateEditVMsHardwareReplicationParamsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEditVMsHardwareReplicationParamsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsHardwareReplicationParamsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsHardwareReplicationParamsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsHardwareReplicationParams/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsHardwareReplicationParams/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEditVMsHardwareReplicationParams/Fault/FunctionalAPIValidationException")})
  public abstract void validateEditVMsHardwareReplicationParams(@WebParam(name="params", targetNamespace="") ConsistencyGroupVMHardwareReplicationParams paramConsistencyGroupVMHardwareReplicationParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterSpecificVMsEntitiesInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSpecificVMsEntitiesInformation")
  @ResponseWrapper(localName="getClusterSpecificVMsEntitiesInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSpecificVMsEntitiesInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsEntitiesInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsEntitiesInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsEntitiesInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsEntitiesInformation/Fault/FunctionalAPIInternalError")})
  public abstract List<VMEntitiesInformation> getClusterSpecificVMsEntitiesInformation(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="vmUIDs", targetNamespace="") List<VmUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterSpecificVMsState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSpecificVMsState")
  @ResponseWrapper(localName="getClusterSpecificVMsStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterSpecificVMsStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterSpecificVMsState/Fault/FunctionalAPIInternalError")})
  public abstract List<VmState> getClusterSpecificVMsState(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="vmUIDs", targetNamespace="") List<VmUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVmReplicationCandidateClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVmReplicationCandidateClusters")
  @ResponseWrapper(localName="getVmReplicationCandidateClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVmReplicationCandidateClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVmReplicationCandidateClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVmReplicationCandidateClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVmReplicationCandidateClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVmReplicationCandidateClusters/Fault/FunctionalAPIInternalError")})
  public abstract VmReplicationCandidateClusters getVmReplicationCandidateClusters(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="existingVmsParams", targetNamespace="") List<ExistingVMParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getRecoverPointClustersInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecoverPointClustersInformation")
  @ResponseWrapper(localName="getRecoverPointClustersInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetRecoverPointClustersInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointClustersInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointClustersInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointClustersInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getRecoverPointClustersInformation/Fault/FunctionalAPIInternalError")})
  public abstract RecoverPointClustersInformation getRecoverPointClustersInformation()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVirtualInfrastructuresStateFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVirtualInfrastructuresStateFromAllClusters")
  @ResponseWrapper(localName="getVirtualInfrastructuresStateFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVirtualInfrastructuresStateFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterVirtualInfrastructuresState> getVirtualInfrastructuresStateFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVirtualInfrastructuresStateFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVirtualInfrastructuresStateFromCluster")
  @ResponseWrapper(localName="getVirtualInfrastructuresStateFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVirtualInfrastructuresStateFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVirtualInfrastructuresStateFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterVirtualInfrastructuresState getVirtualInfrastructuresStateFromCluster(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableImageAccessWithGeneralParameters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessWithGeneralParameters")
  @ResponseWrapper(localName="enableImageAccessWithGeneralParametersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessWithGeneralParametersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithGeneralParametersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithGeneralParametersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithGeneralParameters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessWithGeneralParameters/Fault/FunctionalAPIInternalError")})
  public abstract void enableImageAccessWithGeneralParameters(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="params", targetNamespace="") ImageAccessGeneralParameters paramImageAccessGeneralParameters)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableImageAccessWithGeneralParameters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessWithGeneralParameters")
  @ResponseWrapper(localName="validateEnableImageAccessWithGeneralParametersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessWithGeneralParametersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithGeneralParametersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithGeneralParametersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithGeneralParameters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithGeneralParameters/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessWithGeneralParameters/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableImageAccessWithGeneralParameters(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="params", targetNamespace="") ImageAccessGeneralParameters paramImageAccessGeneralParameters)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableVirtualNetworksForVm", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVirtualNetworksForVm")
  @ResponseWrapper(localName="getAvailableVirtualNetworksForVmResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVirtualNetworksForVmResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVmRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVmResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVm/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVm/Fault/FunctionalAPIInternalError")})
  public abstract List<VirtualNetworkConfiguration> getAvailableVirtualNetworksForVm(@WebParam(name="vmUid", targetNamespace="") VmUID paramVmUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableVirtualNetworksForVms", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVirtualNetworksForVms")
  @ResponseWrapper(localName="getAvailableVirtualNetworksForVmsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVirtualNetworksForVmsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVmsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVmsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVms/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVirtualNetworksForVms/Fault/FunctionalAPIInternalError")})
  public abstract List<VirtualNetworkConfiguration> getAvailableVirtualNetworksForVms(@WebParam(name="vmUids", targetNamespace="") List<VmUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveConsistencyGroup", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveConsistencyGroup")
  @ResponseWrapper(localName="validateRemoveConsistencyGroupResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveConsistencyGroupResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroupRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroupResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroup/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroup/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveConsistencyGroup/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveConsistencyGroup(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addConsistencyGroupCopyPolicyTemplate", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupCopyPolicyTemplate")
  @ResponseWrapper(localName="addConsistencyGroupCopyPolicyTemplateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupCopyPolicyTemplateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopyPolicyTemplateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopyPolicyTemplateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopyPolicyTemplate/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupCopyPolicyTemplate/Fault/FunctionalAPIInternalError")})
  public abstract void addConsistencyGroupCopyPolicyTemplate(@WebParam(name="template", targetNamespace="") ConsistencyGroupCopyPolicyTemplate paramConsistencyGroupCopyPolicyTemplate)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupCopyPolicyTemplate", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupCopyPolicyTemplate")
  @ResponseWrapper(localName="setConsistencyGroupCopyPolicyTemplateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupCopyPolicyTemplateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicyTemplateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicyTemplateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicyTemplate/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupCopyPolicyTemplate/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupCopyPolicyTemplate(@WebParam(name="template", targetNamespace="") ConsistencyGroupCopyPolicyTemplate paramConsistencyGroupCopyPolicyTemplate, @WebParam(name="newTemplateName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeConsistencyGroupCopyPolicyTemplate", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupCopyPolicyTemplate")
  @ResponseWrapper(localName="removeConsistencyGroupCopyPolicyTemplateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupCopyPolicyTemplateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopyPolicyTemplateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopyPolicyTemplateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopyPolicyTemplate/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupCopyPolicyTemplate/Fault/FunctionalAPIInternalError")})
  public abstract void removeConsistencyGroupCopyPolicyTemplate(@WebParam(name="name", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addConsistencyGroupLinkPolicyTemplate", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupLinkPolicyTemplate")
  @ResponseWrapper(localName="addConsistencyGroupLinkPolicyTemplateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddConsistencyGroupLinkPolicyTemplateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLinkPolicyTemplateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLinkPolicyTemplateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLinkPolicyTemplate/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addConsistencyGroupLinkPolicyTemplate/Fault/FunctionalAPIInternalError")})
  public abstract void addConsistencyGroupLinkPolicyTemplate(@WebParam(name="template", targetNamespace="") ConsistencyGroupLinkPolicyTemplate paramConsistencyGroupLinkPolicyTemplate)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setConsistencyGroupLinkPolicyTemplate", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupLinkPolicyTemplate")
  @ResponseWrapper(localName="setConsistencyGroupLinkPolicyTemplateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetConsistencyGroupLinkPolicyTemplateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicyTemplateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicyTemplateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicyTemplate/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setConsistencyGroupLinkPolicyTemplate/Fault/FunctionalAPIInternalError")})
  public abstract void setConsistencyGroupLinkPolicyTemplate(@WebParam(name="template", targetNamespace="") ConsistencyGroupLinkPolicyTemplate paramConsistencyGroupLinkPolicyTemplate, @WebParam(name="newTemplateName", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeConsistencyGroupLinkPolicyTemplate", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupLinkPolicyTemplate")
  @ResponseWrapper(localName="removeConsistencyGroupLinkPolicyTemplateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveConsistencyGroupLinkPolicyTemplateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupLinkPolicyTemplateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupLinkPolicyTemplateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupLinkPolicyTemplate/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeConsistencyGroupLinkPolicyTemplate/Fault/FunctionalAPIInternalError")})
  public abstract void removeConsistencyGroupLinkPolicyTemplate(@WebParam(name="name", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getVPLEXCertificateInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVPLEXCertificateInformation")
  @ResponseWrapper(localName="getVPLEXCertificateInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetVPLEXCertificateInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVPLEXCertificateInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVPLEXCertificateInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVPLEXCertificateInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getVPLEXCertificateInformation/Fault/FunctionalAPIInternalError")})
  public abstract CertificateInformation getVPLEXCertificateInformation(@WebParam(name="ip", targetNamespace="") String paramString, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayCertificateInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayCertificateInformation")
  @ResponseWrapper(localName="getArrayCertificateInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayCertificateInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCertificateInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCertificateInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCertificateInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCertificateInformation/Fault/FunctionalAPIInternalError")})
  public abstract CertificateInformation getArrayCertificateInformation(@WebParam(name="certificateInfoParam", targetNamespace="") ArrayCertificateInformationParam paramArrayCertificateInformationParam)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayCapabilitiesByType", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayCapabilitiesByType")
  @ResponseWrapper(localName="getArrayCapabilitiesByTypeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayCapabilitiesByTypeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByTypeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByTypeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByType/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByType/Fault/FunctionalAPIInternalError")})
  public abstract ArrayCapabilities getArrayCapabilitiesByType(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="arrayType", targetNamespace="") ArrayType paramArrayType)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayCapabilitiesByID", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayCapabilitiesByID")
  @ResponseWrapper(localName="getArrayCapabilitiesByIDResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayCapabilitiesByIDResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByIDRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByIDResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByID/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayCapabilitiesByID/Fault/FunctionalAPIInternalError")})
  public abstract ArrayCapabilities getArrayCapabilitiesByID(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayConfigurationRequirements", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayConfigurationRequirements")
  @ResponseWrapper(localName="getArrayConfigurationRequirementsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayConfigurationRequirementsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayConfigurationRequirementsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayConfigurationRequirementsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayConfigurationRequirements/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayConfigurationRequirements/Fault/FunctionalAPIInternalError")})
  public abstract List<ArrayConfigRequirement> getArrayConfigurationRequirements(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="arrayType", targetNamespace="") ArrayType paramArrayType)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableArraysFromCluster", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableArraysFromCluster")
  @ResponseWrapper(localName="getAvailableArraysFromClusterResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableArraysFromClusterResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArraysFromClusterRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArraysFromClusterResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArraysFromCluster/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArraysFromCluster/Fault/FunctionalAPIInternalError")})
  public abstract ClusterAvailableArrays getAvailableArraysFromCluster(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="addArray", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddArray")
  @ResponseWrapper(localName="addArrayResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddArrayResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addArrayRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addArrayResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addArray/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addArray/Fault/FunctionalAPIInternalError")})
  public abstract void addArray(@WebParam(name="addArrayParams", targetNamespace="") AddArrayParams paramAddArrayParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeArray", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveArray")
  @ResponseWrapper(localName="removeArrayResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveArrayResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeArrayRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeArrayResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeArray/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeArray/Fault/FunctionalAPIInternalError")})
  public abstract void removeArray(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveArray", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveArray")
  @ResponseWrapper(localName="validateRemoveArrayResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveArrayResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveArrayRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveArrayResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveArray/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveArray/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveArray/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveArray(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayName", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayName")
  @ResponseWrapper(localName="getArrayNameResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayNameResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayNameRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayNameResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayName/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayName/Fault/FunctionalAPIInternalError")})
  public abstract String getArrayName(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setArraySettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetArraySettings")
  @ResponseWrapper(localName="setArraySettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetArraySettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArraySettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArraySettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArraySettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setArraySettings/Fault/FunctionalAPIInternalError")})
  public abstract void setArraySettings(@WebParam(name="params", targetNamespace="") SetArraySettingsParams paramSetArraySettingsParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArraySettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArraySettings")
  @ResponseWrapper(localName="getArraySettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArraySettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArraySettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArraySettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArraySettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArraySettings/Fault/FunctionalAPIInternalError")})
  public abstract ArraySettings getArraySettings(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayState")
  @ResponseWrapper(localName="getArrayStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayState/Fault/FunctionalAPIInternalError")})
  public abstract ArrayState getArrayState(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableArrayResourcePools", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableArrayResourcePools")
  @ResponseWrapper(localName="getAvailableArrayResourcePoolsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableArrayResourcePoolsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArrayResourcePoolsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArrayResourcePoolsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArrayResourcePools/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableArrayResourcePools/Fault/FunctionalAPIInternalError")})
  public abstract AvailableArrayResourcePools getAvailableArrayResourcePools(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID, @WebParam(name="useCache", targetNamespace="") boolean paramBoolean1, @WebParam(name="filterManaged", targetNamespace="") boolean paramBoolean2)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="registerArrayResourcePools", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RegisterArrayResourcePools")
  @ResponseWrapper(localName="registerArrayResourcePoolsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RegisterArrayResourcePoolsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerArrayResourcePoolsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerArrayResourcePoolsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerArrayResourcePools/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerArrayResourcePools/Fault/FunctionalAPIInternalError")})
  public abstract void registerArrayResourcePools(@WebParam(name="resourcePools", targetNamespace="") List<RegisterArrayResourcePoolParams> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="unregisterArrayResourcePools", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UnregisterArrayResourcePools")
  @ResponseWrapper(localName="unregisterArrayResourcePoolsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UnregisterArrayResourcePoolsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterArrayResourcePoolsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterArrayResourcePoolsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterArrayResourcePools/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterArrayResourcePools/Fault/FunctionalAPIInternalError")})
  public abstract void unregisterArrayResourcePools(@WebParam(name="resourcePools", targetNamespace="") List<ResourcePoolUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateUnregisterArrayResourcePools", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateUnregisterArrayResourcePools")
  @ResponseWrapper(localName="validateUnregisterArrayResourcePoolsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateUnregisterArrayResourcePoolsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUnregisterArrayResourcePoolsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUnregisterArrayResourcePoolsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUnregisterArrayResourcePools/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUnregisterArrayResourcePools/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUnregisterArrayResourcePools/Fault/FunctionalAPIValidationException")})
  public abstract void validateUnregisterArrayResourcePools(@WebParam(name="resourcePools", targetNamespace="") List<ResourcePoolUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getDefaultArrayResourcePool", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultArrayResourcePool")
  @ResponseWrapper(localName="getDefaultArrayResourcePoolResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetDefaultArrayResourcePoolResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultArrayResourcePoolRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultArrayResourcePoolResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultArrayResourcePool/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getDefaultArrayResourcePool/Fault/FunctionalAPIInternalError")})
  public abstract DefaultArrayResourcePool getDefaultArrayResourcePool(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="params", targetNamespace="") DefaultArrayResourcePoolParams paramDefaultArrayResourcePoolParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="checkArrayConnectivity", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CheckArrayConnectivity")
  @ResponseWrapper(localName="checkArrayConnectivityResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CheckArrayConnectivityResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkArrayConnectivityRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkArrayConnectivityResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkArrayConnectivity/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkArrayConnectivity/Fault/FunctionalAPIInternalError")})
  public abstract void checkArrayConnectivity(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="arrayType", targetNamespace="") ArrayType paramArrayType, @WebParam(name="configurationParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/") ConfigurationParams paramConfigurationParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSupportedArrayManagementProviderAndArrayTypesForAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSupportedArrayManagementProviderAndArrayTypesForAllClusters")
  @ResponseWrapper(localName="getSupportedArrayManagementProviderAndArrayTypesForAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSupportedArrayManagementProviderAndArrayTypesForAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypesForAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypesForAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypesForAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypesForAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterSupportedArrayManagementProviderAndArrayTypes> getSupportedArrayManagementProviderAndArrayTypesForAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getSupportedArrayManagementProviderAndArrayTypes", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSupportedArrayManagementProviderAndArrayTypes")
  @ResponseWrapper(localName="getSupportedArrayManagementProviderAndArrayTypesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetSupportedArrayManagementProviderAndArrayTypesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypes/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getSupportedArrayManagementProviderAndArrayTypes/Fault/FunctionalAPIInternalError")})
  public abstract SupportedArrayManagementProviderAndArrayTypes getSupportedArrayManagementProviderAndArrayTypes(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayManagementProviderState", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayManagementProviderState")
  @ResponseWrapper(localName="getArrayManagementProviderStateResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayManagementProviderStateResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderStateRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderStateResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderState/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderState/Fault/FunctionalAPIInternalError")})
  public abstract ArrayManagementProviderState getArrayManagementProviderState(@WebParam(name="ampUID", targetNamespace="") ArrayManagementProviderUID paramArrayManagementProviderUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayManagementProviderSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayManagementProviderSettings")
  @ResponseWrapper(localName="getArrayManagementProviderSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayManagementProviderSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderSettings/Fault/FunctionalAPIInternalError")})
  public abstract ArrayManagementProviderSettings getArrayManagementProviderSettings(@WebParam(name="ampUID", targetNamespace="") ArrayManagementProviderUID paramArrayManagementProviderUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayManagementProviderStateFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayManagementProviderStateFromAllClusters")
  @ResponseWrapper(localName="getArrayManagementProviderStateFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayManagementProviderStateFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderStateFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderStateFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderStateFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayManagementProviderStateFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterArrayManagementProvidersState> getArrayManagementProviderStateFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getArrayMamagementProviderSettingsFromAllClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayMamagementProviderSettingsFromAllClusters")
  @ResponseWrapper(localName="getArrayMamagementProviderSettingsFromAllClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetArrayMamagementProviderSettingsFromAllClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayMamagementProviderSettingsFromAllClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayMamagementProviderSettingsFromAllClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayMamagementProviderSettingsFromAllClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getArrayMamagementProviderSettingsFromAllClusters/Fault/FunctionalAPIInternalError")})
  public abstract List<ClusterArrayManagementProviderSettings> getArrayMamagementProviderSettingsFromAllClusters()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableImageAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessForGroupSetSubset")
  @ResponseWrapper(localName="enableImageAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void enableImageAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="params", targetNamespace="") ImageAccessParameters paramImageAccessParameters, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalEnableImageAccessGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableImageAccessGroupSetProblems")
  @ResponseWrapper(localName="getIllegalEnableImageAccessGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableImageAccessGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalEnableImageAccessGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="params", targetNamespace="") ImageAccessParameters paramImageAccessParameters, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableImageAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessForGroupSetSubset")
  @ResponseWrapper(localName="validateEnableImageAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableImageAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="params", targetNamespace="") ImageAccessParameters paramImageAccessParameters, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableImageAccessForGroupSetSubsetWithGeneralParameters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessForGroupSetSubsetWithGeneralParameters")
  @ResponseWrapper(localName="enableImageAccessForGroupSetSubsetWithGeneralParametersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableImageAccessForGroupSetSubsetWithGeneralParametersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubsetWithGeneralParametersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubsetWithGeneralParametersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubsetWithGeneralParameters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableImageAccessForGroupSetSubsetWithGeneralParameters/Fault/FunctionalAPIInternalError")})
  public abstract void enableImageAccessForGroupSetSubsetWithGeneralParameters(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="params", targetNamespace="") ImageAccessGeneralParameters paramImageAccessGeneralParameters)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters")
  @ResponseWrapper(localName="getIllegalEnableImageAccessGroupSetProblemsWithGeneralParametersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParametersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblemsWithGeneralParametersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblemsWithGeneralParametersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="params", targetNamespace="") ImageAccessGeneralParameters paramImageAccessGeneralParameters)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableImageAccessForGroupSetSubsetWithGeneralParameters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters")
  @ResponseWrapper(localName="validateEnableImageAccessForGroupSetSubsetWithGeneralParametersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableImageAccessForGroupSetSubsetWithGeneralParametersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubsetWithGeneralParametersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubsetWithGeneralParametersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubsetWithGeneralParameters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubsetWithGeneralParameters/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableImageAccessForGroupSetSubsetWithGeneralParameters/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableImageAccessForGroupSetSubsetWithGeneralParameters(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="params", targetNamespace="") ImageAccessGeneralParameters paramImageAccessGeneralParameters)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableImageAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableImageAccessForGroupSetSubset")
  @ResponseWrapper(localName="disableImageAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableImageAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableImageAccessForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void disableImageAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalDisableImageAccessGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalDisableImageAccessGroupSetProblems")
  @ResponseWrapper(localName="getIllegalDisableImageAccessGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalDisableImageAccessGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableImageAccessGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableImageAccessGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableImageAccessGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableImageAccessGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableImageAccessGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalDisableImageAccessGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDisableImageAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableImageAccessForGroupSetSubset")
  @ResponseWrapper(localName="validateDisableImageAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableImageAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccessForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableImageAccessForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateDisableImageAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableDirectAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableDirectAccessForGroupSetSubset")
  @ResponseWrapper(localName="enableDirectAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableDirectAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableDirectAccessForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void enableDirectAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalEnableDirectAccessForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableDirectAccessForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalEnableDirectAccessForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableDirectAccessForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableDirectAccessForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableDirectAccessForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableDirectAccessForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableDirectAccessForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableDirectAccessForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalEnableDirectAccessForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableDirectAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableDirectAccessForGroupSetSubset")
  @ResponseWrapper(localName="validateEnableDirectAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableDirectAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccessForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableDirectAccessForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableDirectAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="failoverGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FailoverGroupSetSubset")
  @ResponseWrapper(localName="failoverGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FailoverGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failoverGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failoverGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failoverGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/failoverGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void failoverGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalFailoverGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalFailoverGroupSetProblems")
  @ResponseWrapper(localName="getIllegalFailoverGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalFailoverGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalFailoverGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalFailoverGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalFailoverGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalFailoverGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalFailoverGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalFailoverGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateFailoverGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateFailoverGroupSetSubset")
  @ResponseWrapper(localName="validateFailoverGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateFailoverGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailoverGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailoverGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailoverGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailoverGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateFailoverGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateFailoverGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="recoverProductionForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RecoverProductionForGroupSetSubset")
  @ResponseWrapper(localName="recoverProductionForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RecoverProductionForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProductionForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProductionForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProductionForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/recoverProductionForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void recoverProductionForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalRecoverProductionForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalRecoverProductionForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalRecoverProductionForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalRecoverProductionForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRecoverProductionForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRecoverProductionForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRecoverProductionForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRecoverProductionForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRecoverProductionForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalRecoverProductionForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRecoverProductionForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRecoverProductionForGroupSetSubset")
  @ResponseWrapper(localName="validateRecoverProductionForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRecoverProductionForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProductionForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProductionForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProductionForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProductionForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRecoverProductionForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateRecoverProductionForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="rollToImageForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RollToImageForGroupSetSubset")
  @ResponseWrapper(localName="rollToImageForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RollToImageForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImageForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImageForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImageForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/rollToImageForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void rollToImageForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalRollToImageForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalRollToImageForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalRollToImageForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalRollToImageForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRollToImageForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRollToImageForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRollToImageForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRollToImageForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalRollToImageForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalRollToImageForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRollToImageForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRollToImageForGroupSetSubset")
  @ResponseWrapper(localName="validateRollToImageForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRollToImageForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImageForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImageForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImageForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImageForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRollToImageForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateRollToImageForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="createBookmarkForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CreateBookmarkForGroupSetSubset")
  @ResponseWrapper(localName="createBookmarkForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CreateBookmarkForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmarkForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmarkForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmarkForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/createBookmarkForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void createBookmarkForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="bookmarkName", targetNamespace="") String paramString, @WebParam(name="consolidationPolicy", targetNamespace="") BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy, @WebParam(name="consistencyType", targetNamespace="") SnapshotConsistencyType paramSnapshotConsistencyType)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="resumeProductionForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResumeProductionForGroupSetSubset")
  @ResponseWrapper(localName="resumeProductionForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ResumeProductionForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProductionForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProductionForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProductionForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/resumeProductionForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void resumeProductionForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalResumeProductionForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalResumeProductionForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalResumeProductionForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalResumeProductionForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalResumeProductionForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalResumeProductionForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalResumeProductionForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalResumeProductionForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalResumeProductionForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalResumeProductionForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateResumeProductionForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateResumeProductionForGroupSetSubset")
  @ResponseWrapper(localName="validateResumeProductionForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateResumeProductionForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProductionForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProductionForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProductionForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProductionForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateResumeProductionForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateResumeProductionForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setProductionForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetProductionForGroupSetSubset")
  @ResponseWrapper(localName="setProductionForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetProductionForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setProductionForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void setProductionForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalSetProductionForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalSetProductionForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalSetProductionForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalSetProductionForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalSetProductionForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalSetProductionForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalSetProductionForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalSetProductionForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalSetProductionForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalSetProductionForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetProductionForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetProductionForGroupSetSubset")
  @ResponseWrapper(localName="validateSetProductionForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetProductionForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetProductionForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetProductionForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="undoWritesForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UndoWritesForGroupSetSubset")
  @ResponseWrapper(localName="undoWritesForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UndoWritesForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoWritesForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoWritesForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoWritesForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/undoWritesForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void undoWritesForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalUndoWritesForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalUndoWritesForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalUndoWritesForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalUndoWritesForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalUndoWritesForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalUndoWritesForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalUndoWritesForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalUndoWritesForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalUndoWritesForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalUndoWritesForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateUndoWritesForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateUndoWritesForGroupSetSubset")
  @ResponseWrapper(localName="validateUndoWritesForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateUndoWritesForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoWritesForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoWritesForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoWritesForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoWritesForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateUndoWritesForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateUndoWritesForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="disableGroupsForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableGroupsForGroupSetSubset")
  @ResponseWrapper(localName="disableGroupsForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DisableGroupsForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableGroupsForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableGroupsForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableGroupsForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/disableGroupsForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void disableGroupsForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalDisableGroupsForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalDisableGroupsForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalDisableGroupsForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalDisableGroupsForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableGroupsForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableGroupsForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableGroupsForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableGroupsForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalDisableGroupsForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalDisableGroupsForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateDisableGroupsForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableGroupsForGroupSetSubset")
  @ResponseWrapper(localName="validateDisableGroupsForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateDisableGroupsForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableGroupsForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableGroupsForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableGroupsForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableGroupsForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateDisableGroupsForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateDisableGroupsForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableGroupsForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableGroupsForGroupSetSubset")
  @ResponseWrapper(localName="enableGroupsForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableGroupsForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableGroupsForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableGroupsForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableGroupsForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableGroupsForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void enableGroupsForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalEnableGroupsForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableGroupsForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalEnableGroupsForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableGroupsForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableGroupsForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableGroupsForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableGroupsForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableGroupsForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableGroupsForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalEnableGroupsForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="suppressCallHomeEvents", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SuppressCallHomeEvents")
  @ResponseWrapper(localName="suppressCallHomeEventsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SuppressCallHomeEventsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suppressCallHomeEventsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suppressCallHomeEventsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suppressCallHomeEvents/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/suppressCallHomeEvents/Fault/FunctionalAPIInternalError")})
  public abstract void suppressCallHomeEvents(@WebParam(name="suppressUntilInGmt", targetNamespace="") long paramLong)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableGroupsForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableGroupsForGroupSetSubset")
  @ResponseWrapper(localName="validateEnableGroupsForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableGroupsForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableGroupsForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableGroupsForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableGroupsForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableGroupsForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableGroupsForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableGroupsForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="startTransfer", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="pauseTransferForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.PauseTransferForGroupSetSubset")
  @ResponseWrapper(localName="pauseTransferForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.PauseTransferForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseTransferForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseTransferForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseTransferForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/pauseTransferForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void pauseTransferForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalPauseTransferForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalPauseTransferForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalPauseTransferForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalPauseTransferForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalPauseTransferForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalPauseTransferForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalPauseTransferForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalPauseTransferForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalPauseTransferForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalPauseTransferForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validatePauseTransferForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidatePauseTransferForGroupSetSubset")
  @ResponseWrapper(localName="validatePauseTransferForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidatePauseTransferForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseTransferForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseTransferForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseTransferForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseTransferForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validatePauseTransferForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validatePauseTransferForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="startTransferForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartTransferForGroupSetSubset")
  @ResponseWrapper(localName="startTransferForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.StartTransferForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startTransferForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startTransferForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startTransferForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/startTransferForGroupSetSubset/Fault/FunctionalAPIInternalError")})
  public abstract void startTransferForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalStartTransferForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalStartTransferForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalStartTransferForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalStartTransferForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalStartTransferForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalStartTransferForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalStartTransferForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalStartTransferForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalStartTransferForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalStartTransferForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateStartTransferForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateStartTransferForGroupSetSubset")
  @ResponseWrapper(localName="validateStartTransferForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateStartTransferForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartTransferForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartTransferForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartTransferForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartTransferForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateStartTransferForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateStartTransferForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableLatestImageAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableLatestImageAccessForGroupSetSubset")
  @ResponseWrapper(localName="enableLatestImageAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableLatestImageAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccessForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccessForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void enableLatestImageAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="mode", targetNamespace="") ImageAccessMode paramImageAccessMode, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIllegalEnableLatestImageAccessForGroupSetProblems", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableLatestImageAccessForGroupSetProblems")
  @ResponseWrapper(localName="getIllegalEnableLatestImageAccessForGroupSetProblemsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIllegalEnableLatestImageAccessForGroupSetProblemsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableLatestImageAccessForGroupSetProblemsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableLatestImageAccessForGroupSetProblemsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableLatestImageAccessForGroupSetProblems/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableLatestImageAccessForGroupSetProblems/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIllegalEnableLatestImageAccessForGroupSetProblems/Fault/FunctionalAPIValidationException")})
  public abstract ConsistencyGroupSetProblems getIllegalEnableLatestImageAccessForGroupSetProblems(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="mode", targetNamespace="") ImageAccessMode paramImageAccessMode, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableLatestImageAccessForGroupSetSubset", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableLatestImageAccessForGroupSetSubset")
  @ResponseWrapper(localName="validateEnableLatestImageAccessForGroupSetSubsetResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableLatestImageAccessForGroupSetSubsetResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccessForGroupSetSubsetRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccessForGroupSetSubsetResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccessForGroupSetSubset/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccessForGroupSetSubset/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccessForGroupSetSubset/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableLatestImageAccessForGroupSetSubset(@WebParam(name="groupSetSubset", targetNamespace="") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="mode", targetNamespace="") ImageAccessMode paramImageAccessMode, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="enableLatestImageAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableLatestImageAccess")
  @ResponseWrapper(localName="enableLatestImageAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.EnableLatestImageAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/enableLatestImageAccess/Fault/FunctionalAPIInternalError")})
  public abstract void enableLatestImageAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="mode", targetNamespace="") ImageAccessMode paramImageAccessMode, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateEnableLatestImageAccess", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableLatestImageAccess")
  @ResponseWrapper(localName="validateEnableLatestImageAccessResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateEnableLatestImageAccessResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccessRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccessResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccess/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccess/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateEnableLatestImageAccess/Fault/FunctionalAPIValidationException")})
  public abstract void validateEnableLatestImageAccess(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="mode", targetNamespace="") ImageAccessMode paramImageAccessMode, @WebParam(name="scenario", targetNamespace="") ImageAccessScenario paramImageAccessScenario)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="calculateVolumeSize", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CalculateVolumeSize")
  @ResponseWrapper(localName="calculateVolumeSizeResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CalculateVolumeSizeResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/calculateVolumeSizeRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/calculateVolumeSizeResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/calculateVolumeSize/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/calculateVolumeSize/Fault/FunctionalAPIInternalError")})
  public abstract Long calculateVolumeSize(@WebParam(name="isDistributedCg", targetNamespace="") boolean paramBoolean, @WebParam(name="calculateVolumeSizeParams", targetNamespace="http://impl.version4_3_1.fapi.emc.com/") CalculateVolumeSizeParams paramCalculateVolumeSizeParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setClusterAutoRegistrationInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetClusterAutoRegistrationInformation")
  @ResponseWrapper(localName="setClusterAutoRegistrationInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetClusterAutoRegistrationInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterAutoRegistrationInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterAutoRegistrationInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterAutoRegistrationInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setClusterAutoRegistrationInformation/Fault/FunctionalAPIInternalError")})
  public abstract void setClusterAutoRegistrationInformation(@WebParam(name="clusterUID", targetNamespace="http://impl.version4_3_1.fapi.emc.com/") ClusterUID paramClusterUID, @WebParam(name="autoRegInfo", targetNamespace="") ClusterAutoRegistrationInformation paramClusterAutoRegistrationInformation)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setSuppressAutoRegistrationWarning", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSuppressAutoRegistrationWarning")
  @ResponseWrapper(localName="setSuppressAutoRegistrationWarningResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetSuppressAutoRegistrationWarningResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSuppressAutoRegistrationWarningRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSuppressAutoRegistrationWarningResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSuppressAutoRegistrationWarning/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setSuppressAutoRegistrationWarning/Fault/FunctionalAPIInternalError")})
  public abstract void setSuppressAutoRegistrationWarning(@WebParam(name="shouldSuppress", targetNamespace="") boolean paramBoolean)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="registerContactEmail", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RegisterContactEmail")
  @ResponseWrapper(localName="registerContactEmailResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RegisterContactEmailResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerContactEmailRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerContactEmailResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerContactEmail/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerContactEmail/Fault/FunctionalAPIInternalError")})
  public abstract void registerContactEmail(@WebParam(name="email", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="dismissVmStartUpPrompts", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DismissVmStartUpPrompts")
  @ResponseWrapper(localName="dismissVmStartUpPromptsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DismissVmStartUpPromptsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/dismissVmStartUpPromptsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/dismissVmStartUpPromptsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/dismissVmStartUpPrompts/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/dismissVmStartUpPrompts/Fault/FunctionalAPIInternalError")})
  public abstract void dismissVmStartUpPrompts(@WebParam(name="groupCopy", targetNamespace="") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name="actionUIDs", targetNamespace="") List<VmStartUpActionUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="checkConnectivityToExternalHost", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CheckConnectivityToExternalHost")
  @ResponseWrapper(localName="checkConnectivityToExternalHostResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CheckConnectivityToExternalHostResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExternalHostRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExternalHostResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExternalHost/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExternalHost/Fault/FunctionalAPIInternalError")})
  public abstract HostConnectivityStatus checkConnectivityToExternalHost(@WebParam(name="hostParams", targetNamespace="") ExternalHostParams paramExternalHostParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="checkConnectivityToExistingExternalHost", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CheckConnectivityToExistingExternalHost")
  @ResponseWrapper(localName="checkConnectivityToExistingExternalHostResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.CheckConnectivityToExistingExternalHostResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExistingExternalHostRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExistingExternalHostResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExistingExternalHost/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/checkConnectivityToExistingExternalHost/Fault/FunctionalAPIInternalError")})
  public abstract HostConnectivityStatus checkConnectivityToExistingExternalHost(@WebParam(name="externalHost", targetNamespace="") ExternalHostUID paramExternalHostUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="addExternalHost", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddExternalHost")
  @ResponseWrapper(localName="addExternalHostResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.AddExternalHostResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addExternalHostRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addExternalHostResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addExternalHost/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/addExternalHost/Fault/FunctionalAPIInternalError")})
  public abstract ExternalHostUID addExternalHost(@WebParam(name="hostParams", targetNamespace="") ExternalHostParams paramExternalHostParams)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setExternalHostSettings", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetExternalHostSettings")
  @ResponseWrapper(localName="setExternalHostSettingsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetExternalHostSettingsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setExternalHostSettingsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setExternalHostSettingsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setExternalHostSettings/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setExternalHostSettings/Fault/FunctionalAPIInternalError")})
  public abstract void setExternalHostSettings(@WebParam(name="hostSettings", targetNamespace="") ExternalHostSettings paramExternalHostSettings)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="removeExternalHost", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveExternalHost")
  @ResponseWrapper(localName="removeExternalHostResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RemoveExternalHostResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeExternalHostRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeExternalHostResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeExternalHost/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/removeExternalHost/Fault/FunctionalAPIInternalError")})
  public abstract void removeExternalHost(@WebParam(name="externalHost", targetNamespace="") ExternalHostUID paramExternalHostUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateRemoveExternalHost", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveExternalHost")
  @ResponseWrapper(localName="validateRemoveExternalHostResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateRemoveExternalHostResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveExternalHostRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveExternalHostResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveExternalHost/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveExternalHost/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateRemoveExternalHost/Fault/FunctionalAPIValidationException")})
  public abstract void validateRemoveExternalHost(@WebParam(name="externalHost", targetNamespace="") ExternalHostUID paramExternalHostUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getConsistencyGroupReports", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupReports")
  @ResponseWrapper(localName="getConsistencyGroupReportsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupReportsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReports/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReports/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupReport> getConsistencyGroupReports(@WebParam(name="reportsUIDs", targetNamespace="") List<ReportUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getConsistencyGroupReportStats", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupReportStats")
  @ResponseWrapper(localName="getConsistencyGroupReportStatsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupReportStatsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportStatsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportStatsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportStats/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportStats/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupReportStats> getConsistencyGroupReportStats(@WebParam(name="reportsUIDs", targetNamespace="") List<ReportUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getConsistencyGroupReportsContexts", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupReportsContexts")
  @ResponseWrapper(localName="getConsistencyGroupReportsContextsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupReportsContextsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportsContextsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportsContextsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportsContexts/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupReportsContexts/Fault/FunctionalAPIInternalError")})
  public abstract List<ConsistencyGroupReportContextInfo> getConsistencyGroupReportsContexts(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="deleteConsistencyGroupReports", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DeleteConsistencyGroupReports")
  @ResponseWrapper(localName="deleteConsistencyGroupReportsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.DeleteConsistencyGroupReportsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/deleteConsistencyGroupReportsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/deleteConsistencyGroupReportsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/deleteConsistencyGroupReports/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/deleteConsistencyGroupReports/Fault/FunctionalAPIInternalError")})
  public abstract void deleteConsistencyGroupReports(@WebParam(name="reportUID", targetNamespace="") ReportUID paramReportUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAllConsistencyGroupsInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllConsistencyGroupsInformation")
  @ResponseWrapper(localName="getAllConsistencyGroupsInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAllConsistencyGroupsInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroupsInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroupsInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroupsInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroupsInformation/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAllConsistencyGroupsInformation/Fault/FunctionalAPIValidationException")})
  public abstract List<ConsistencyGroupInformation> getAllConsistencyGroupsInformation()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getConsistencyGroupInformation", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupInformation")
  @ResponseWrapper(localName="getConsistencyGroupInformationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetConsistencyGroupInformationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupInformationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupInformationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupInformation/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getConsistencyGroupInformation/Fault/FunctionalAPIInternalError")})
  public abstract ConsistencyGroupInformation getConsistencyGroupInformation(@WebParam(name="groupUID", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailableVMsForReplication", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVMsForReplication")
  @ResponseWrapper(localName="getAvailableVMsForReplicationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailableVMsForReplicationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVMsForReplicationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVMsForReplicationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVMsForReplication/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailableVMsForReplication/Fault/FunctionalAPIInternalError")})
  public abstract List<VMEntitiesInformation> getAvailableVMsForReplication(@WebParam(name="replicationTarget", targetNamespace="") VmReplicationTarget paramVmReplicationTarget)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="changeVmsPowerUpSequence", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ChangeVmsPowerUpSequence")
  @ResponseWrapper(localName="changeVmsPowerUpSequenceResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ChangeVmsPowerUpSequenceResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeVmsPowerUpSequenceRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeVmsPowerUpSequenceResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeVmsPowerUpSequence/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeVmsPowerUpSequence/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changeVmsPowerUpSequence/Fault/FunctionalAPIValidationException")})
  public abstract void changeVmsPowerUpSequence(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="powerUpSequenceParams", targetNamespace="") List<VmPowerUpSequenceParam> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClustersVirtualInfraConfiguration", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClustersVirtualInfraConfiguration")
  @ResponseWrapper(localName="getClustersVirtualInfraConfigurationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClustersVirtualInfraConfigurationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClustersVirtualInfraConfigurationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClustersVirtualInfraConfigurationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClustersVirtualInfraConfiguration/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClustersVirtualInfraConfiguration/Fault/FunctionalAPIInternalError")})
  public abstract ClustersVirtualInfraConfiguration getClustersVirtualInfraConfiguration(@WebParam(name="clusterUIDs", targetNamespace="") List<ClusterUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getClusterVirtualInfraConfiguration", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterVirtualInfraConfiguration")
  @ResponseWrapper(localName="getClusterVirtualInfraConfigurationResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetClusterVirtualInfraConfigurationResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualInfraConfigurationRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualInfraConfigurationResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualInfraConfiguration/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getClusterVirtualInfraConfiguration/Fault/FunctionalAPIInternalError")})
  public abstract ClusterVirtualInfraConfiguration getClusterVirtualInfraConfiguration(@WebParam(name="clusterUID", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetVMsReplicationSetsPolicies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetVMsReplicationSetsPolicies")
  @ResponseWrapper(localName="validateSetVMsReplicationSetsPoliciesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetVMsReplicationSetsPoliciesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsReplicationSetsPoliciesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsReplicationSetsPoliciesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsReplicationSetsPolicies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsReplicationSetsPolicies/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsReplicationSetsPolicies/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetVMsReplicationSetsPolicies(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="vmReplicationSetsPolicies", targetNamespace="") List<FullVmReplicationSetPolicy> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setVMsReplicationSetsPolicies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVMsReplicationSetsPolicies")
  @ResponseWrapper(localName="setVMsReplicationSetsPoliciesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVMsReplicationSetsPoliciesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsReplicationSetsPoliciesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsReplicationSetsPoliciesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsReplicationSetsPolicies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsReplicationSetsPolicies/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsReplicationSetsPolicies/Fault/FunctionalAPIValidationException")})
  public abstract void setVMsReplicationSetsPolicies(@WebParam(name="group", targetNamespace="") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name="vmReplicationSetsPolicies", targetNamespace="") List<FullVmReplicationSetPolicy> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getAvailablePluginVersions", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailablePluginVersions")
  @ResponseWrapper(localName="getAvailablePluginVersionsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetAvailablePluginVersionsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePluginVersionsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePluginVersionsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePluginVersions/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getAvailablePluginVersions/Fault/FunctionalAPIInternalError")})
  public abstract List<String> getAvailablePluginVersions()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="changePluginVersion", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ChangePluginVersion")
  @ResponseWrapper(localName="changePluginVersionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ChangePluginVersionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changePluginVersionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changePluginVersionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changePluginVersion/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/changePluginVersion/Fault/FunctionalAPIInternalError")})
  public abstract void changePluginVersion(@WebParam(name="vcuid", targetNamespace="") VirtualCenterUID paramVirtualCenterUID, @WebParam(name="newVersion", targetNamespace="") String paramString)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="validateSetVMsNetworkPolicies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetVMsNetworkPolicies")
  @ResponseWrapper(localName="validateSetVMsNetworkPoliciesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.ValidateSetVMsNetworkPoliciesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsNetworkPoliciesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsNetworkPoliciesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsNetworkPolicies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsNetworkPolicies/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/validateSetVMsNetworkPolicies/Fault/FunctionalAPIValidationException")})
  public abstract void validateSetVMsNetworkPolicies(@WebParam(name="networkSettingsForVMs", targetNamespace="") List<VmNetworkPolicy> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @RequestWrapper(localName="setVMsNetworkPolicies", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVMsNetworkPolicies")
  @ResponseWrapper(localName="setVMsNetworkPoliciesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.SetVMsNetworkPoliciesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsNetworkPoliciesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsNetworkPoliciesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsNetworkPolicies/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsNetworkPolicies/Fault/FunctionalAPIInternalError"), @javax.xml.ws.FaultAction(className=FunctionalAPIValidationException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/setVMsNetworkPolicies/Fault/FunctionalAPIValidationException")})
  public abstract void setVMsNetworkPolicies(@WebParam(name="networkSettingsForVMs", targetNamespace="") List<VmNetworkPolicy> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getIsTrialVersion", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIsTrialVersion")
  @ResponseWrapper(localName="getIsTrialVersionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetIsTrialVersionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIsTrialVersionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIsTrialVersionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIsTrialVersion/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getIsTrialVersion/Fault/FunctionalAPIInternalError")})
  public abstract boolean getIsTrialVersion()
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="registerEsxClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RegisterEsxClusters")
  @ResponseWrapper(localName="registerEsxClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.RegisterEsxClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerEsxClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerEsxClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerEsxClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/registerEsxClusters/Fault/FunctionalAPIInternalError")})
  public abstract void registerEsxClusters(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="vcUID", targetNamespace="") VirtualCenterUID paramVirtualCenterUID, @WebParam(name="esxClusterUIDs", targetNamespace="") List<EsxClusterUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="unregisterEsxClusters", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UnregisterEsxClusters")
  @ResponseWrapper(localName="unregisterEsxClustersResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.UnregisterEsxClustersResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterEsxClustersRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterEsxClustersResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterEsxClusters/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/unregisterEsxClusters/Fault/FunctionalAPIInternalError")})
  public abstract void unregisterEsxClusters(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="vcUID", targetNamespace="") VirtualCenterUID paramVirtualCenterUID, @WebParam(name="esxClusterUIDs", targetNamespace="") List<EsxClusterUID> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getCandidateEsxClustersForAddition", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCandidateEsxClustersForAddition")
  @ResponseWrapper(localName="getCandidateEsxClustersForAdditionResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCandidateEsxClustersForAdditionResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAdditionRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAdditionResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAddition/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAddition/Fault/FunctionalAPIInternalError")})
  public abstract List<EsxCluster> getCandidateEsxClustersForAddition(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID, @WebParam(name="vcUID", targetNamespace="") VirtualCenterUID paramVirtualCenterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getCandidateEsxClustersForAdditionFromAllVcs", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCandidateEsxClustersForAdditionFromAllVcs")
  @ResponseWrapper(localName="getCandidateEsxClustersForAdditionFromAllVcsResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.GetCandidateEsxClustersForAdditionFromAllVcsResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAdditionFromAllVcsRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAdditionFromAllVcsResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAdditionFromAllVcs/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/getCandidateEsxClustersForAdditionFromAllVcs/Fault/FunctionalAPIInternalError")})
  public abstract List<EsxCluster> getCandidateEsxClustersForAdditionFromAllVcs(@WebParam(name="cluster", targetNamespace="") ClusterUID paramClusterUID)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="troubleshootEntities", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TroubleshootEntities")
  @ResponseWrapper(localName="troubleshootEntitiesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.TroubleshootEntitiesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/troubleshootEntitiesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/troubleshootEntitiesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/troubleshootEntities/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/troubleshootEntities/Fault/FunctionalAPIInternalError")})
  public abstract List<TroubleshootResult> troubleshootEntities(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID, @WebParam(name="entities", targetNamespace="") List<Entity> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="fixIssues", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FixIssues")
  @ResponseWrapper(localName="fixIssuesResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FixIssuesResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssuesRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssuesResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssues/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssues/Fault/FunctionalAPIInternalError")})
  public abstract void fixIssues(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID, @WebParam(name="entities", targetNamespace="") List<Entity> paramList)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
  
  @WebMethod
  @RequestWrapper(localName="fixIssue", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FixIssue")
  @ResponseWrapper(localName="fixIssueResponse", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", className="com.emc.fapi.jaxws.v4_3_1.FixIssueResponse")
  @Action(input="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssueRequest", output="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssueResponse", fault={@javax.xml.ws.FaultAction(className=FunctionalAPIActionFailedException_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssue/Fault/FunctionalAPIActionFailedException"), @javax.xml.ws.FaultAction(className=FunctionalAPIInternalError_Exception.class, value="http://impl.version4_3_1.fapi.emc.com/FunctionalAPIImpl/fixIssue/Fault/FunctionalAPIInternalError")})
  public abstract void fixIssue(@WebParam(name="arrayUID", targetNamespace="") ArrayUID paramArrayUID, @WebParam(name="entities", targetNamespace="") List<Entity> paramList, @WebParam(name="issueType", targetNamespace="") IssueType paramIssueType)
    throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;
}


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FunctionalAPIImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */