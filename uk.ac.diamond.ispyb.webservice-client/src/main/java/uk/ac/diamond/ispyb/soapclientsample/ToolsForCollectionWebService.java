package uk.ac.diamond.ispyb.soapclientsample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-10T14:38:29.473Z
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://ispyb.ejb3.webservices.collection", name = "ToolsForCollectionWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface ToolsForCollectionWebService {

    @WebMethod
    @RequestWrapper(localName = "updateDataCollectionStatus", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.UpdateDataCollectionStatus")
    @ResponseWrapper(localName = "updateDataCollectionStatusResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.UpdateDataCollectionStatusResponse")
    public void updateDataCollectionStatus(
        @WebParam(mode = WebParam.Mode.INOUT, name = "dataCollectionId", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> dataCollectionId,
        @WebParam(name = "runStatus", targetNamespace = "")
        java.lang.String runStatus
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "findSession", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindSession")
    @ResponseWrapper(localName = "findSessionResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindSessionResponse")
    @WebResult(name = "session", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.SessionWS3VO findSession(
        @WebParam(name = "sessionId", targetNamespace = "")
        java.lang.Integer sessionId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeRobotAction", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreRobotAction")
    @ResponseWrapper(localName = "storeRobotActionResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreRobotActionResponse")
    @WebResult(name = "robotActionId", targetNamespace = "")
    public java.lang.Integer storeRobotAction(
        @WebParam(name = "robotAction", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.RobotActionWS3VO robotAction
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateXFEFluorescenceSpectrum", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateXFEFluorescenceSpectrum")
    @ResponseWrapper(localName = "storeOrUpdateXFEFluorescenceSpectrumResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateXFEFluorescenceSpectrumResponse")
    @WebResult(name = "xfeFluorescenceSpectrumId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateXFEFluorescenceSpectrum(
        @WebParam(name = "xfeFluorescenceSpectrum", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.XfeFluorescenceSpectrumWS3VO xfeFluorescenceSpectrum
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "setImagesPositions", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetImagesPositions")
    @ResponseWrapper(localName = "setImagesPositionsResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetImagesPositionsResponse")
    @WebResult(name = "arrayImageIdsAndIsCreated", targetNamespace = "")
    public java.util.List<uk.ac.diamond.ispyb.soapclientsample.ImageCreation> setImagesPositions(
        @WebParam(name = "listImagePosition", targetNamespace = "")
        java.util.List<uk.ac.diamond.ispyb.soapclientsample.ImagePosition> listImagePosition
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "setDataCollectionsPositions", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetDataCollectionsPositions")
    @ResponseWrapper(localName = "setDataCollectionsPositionsResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetDataCollectionsPositionsResponse")
    @WebResult(name = "dataCollectionIds", targetNamespace = "")
    public java.util.List<java.lang.Integer> setDataCollectionsPositions(
        @WebParam(name = "listDataCollectionPosition", targetNamespace = "")
        java.util.List<uk.ac.diamond.ispyb.soapclientsample.DataCollectionPosition> listDataCollectionPosition
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "findDataCollectionFromImageDirectoryAndImagePrefixAndNumber", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber")
    @ResponseWrapper(localName = "findDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse")
    @WebResult(name = "dataCollection", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.DataCollectionWS3VO findDataCollectionFromImageDirectoryAndImagePrefixAndNumber(
        @WebParam(name = "imageDirectory", targetNamespace = "")
        java.lang.String imageDirectory,
        @WebParam(name = "imagePrefix", targetNamespace = "")
        java.lang.String imagePrefix,
        @WebParam(name = "dataCollectionNumber", targetNamespace = "")
        java.lang.Integer dataCollectionNumber
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateGridInfo", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateGridInfo")
    @ResponseWrapper(localName = "storeOrUpdateGridInfoResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateGridInfoResponse")
    @WebResult(name = "gridInfoId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateGridInfo(
        @WebParam(name = "gridInfo", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.GridInfoWS3VO gridInfo
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "findDataCollectionGroup", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollectionGroup")
    @ResponseWrapper(localName = "findDataCollectionGroupResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollectionGroupResponse")
    @WebResult(name = "dataCollectionGroup", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.DataCollectionGroupWS3VO findDataCollectionGroup(
        @WebParam(name = "dataCollectionGroupId", targetNamespace = "")
        java.lang.Integer dataCollectionGroupId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "getXDSInfo", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GetXDSInfo")
    @ResponseWrapper(localName = "getXDSInfoResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GetXDSInfoResponse")
    @WebResult(name = "XDSInfo", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.XdsInfo getXDSInfo(
        @WebParam(name = "dataCollectionId", targetNamespace = "")
        java.lang.Integer dataCollectionId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateEnergyScan", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateEnergyScan")
    @ResponseWrapper(localName = "storeOrUpdateEnergyScanResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateEnergyScanResponse")
    @WebResult(name = "energyScanId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateEnergyScan(
        @WebParam(name = "energyScan", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.EnergyScanWS3VO energyScan
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "findDataCollection", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollection")
    @ResponseWrapper(localName = "findDataCollectionResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollectionResponse")
    @WebResult(name = "dataCollection", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.DataCollectionWS3VO findDataCollection(
        @WebParam(name = "dataCollectionId", targetNamespace = "")
        java.lang.Integer dataCollectionId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateDataCollectionGroup", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateDataCollectionGroup")
    @ResponseWrapper(localName = "storeOrUpdateDataCollectionGroupResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateDataCollectionGroupResponse")
    @WebResult(name = "dataCollectionGroupId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateDataCollectionGroup(
        @WebParam(name = "dataCollectionGroup", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.DataCollectionGroupWS3VO dataCollectionGroup
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeWorkflowStep", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreWorkflowStep")
    @ResponseWrapper(localName = "storeWorkflowStepResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreWorkflowStepResponse")
    @WebResult(name = "workflowId", targetNamespace = "")
    public java.lang.Integer storeWorkflowStep(
        @WebParam(name = "workflowStep", targetNamespace = "")
        java.lang.String workflowStep
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "updateWorkflowStatus", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.UpdateWorkflowStatus")
    @ResponseWrapper(localName = "updateWorkflowStatusResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.UpdateWorkflowStatusResponse")
    @WebResult(name = "workflowId", targetNamespace = "")
    public java.lang.Integer updateWorkflowStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "setImageQualityIndicatorsPlot", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetImageQualityIndicatorsPlot")
    @ResponseWrapper(localName = "setImageQualityIndicatorsPlotResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetImageQualityIndicatorsPlotResponse")
    @WebResult(name = "dataCollectionId", targetNamespace = "")
    public java.lang.Integer setImageQualityIndicatorsPlot(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "imageQualityIndicatorsPlotPath", targetNamespace = "")
        java.lang.String imageQualityIndicatorsPlotPath,
        @WebParam(name = "imageQualityIndicatorsCSVPath", targetNamespace = "")
        java.lang.String imageQualityIndicatorsCSVPath
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "findSessionsByProposalAndBeamLine", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindSessionsByProposalAndBeamLine")
    @ResponseWrapper(localName = "findSessionsByProposalAndBeamLineResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindSessionsByProposalAndBeamLineResponse")
    @WebResult(name = "Sessions", targetNamespace = "")
    public java.util.List<uk.ac.diamond.ispyb.soapclientsample.SessionWS3VO> findSessionsByProposalAndBeamLine(
        @WebParam(name = "code", targetNamespace = "")
        java.lang.String code,
        @WebParam(name = "number", targetNamespace = "")
        java.lang.String number,
        @WebParam(name = "beamLineName", targetNamespace = "")
        java.lang.String beamLineName
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "updateDataCollectionGroupWorkflowId", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.UpdateDataCollectionGroupWorkflowId")
    @ResponseWrapper(localName = "updateDataCollectionGroupWorkflowIdResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.UpdateDataCollectionGroupWorkflowIdResponse")
    @WebResult(name = "dataCollectionGroupId", targetNamespace = "")
    public java.lang.Integer updateDataCollectionGroupWorkflowId(
        @WebParam(name = "fileLocation", targetNamespace = "")
        java.lang.String fileLocation,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName,
        @WebParam(name = "workflowId", targetNamespace = "")
        java.lang.Integer workflowId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "getDataCollectionInfo", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GetDataCollectionInfo")
    @ResponseWrapper(localName = "getDataCollectionInfoResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GetDataCollectionInfoResponse")
    @WebResult(name = "dataCollectionInfo", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.DataCollectionInfo getDataCollectionInfo(
        @WebParam(name = "dataCollectionId", targetNamespace = "")
        java.lang.Integer dataCollectionId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "setBestWilsonPlotPath", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetBestWilsonPlotPath")
    @ResponseWrapper(localName = "setBestWilsonPlotPathResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetBestWilsonPlotPathResponse")
    @WebResult(name = "dataCollectionId", targetNamespace = "")
    public java.lang.Integer setBestWilsonPlotPath(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "bestWilsonPlotPath", targetNamespace = "")
        java.lang.String bestWilsonPlotPath
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "getPdbFilePath", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GetPdbFilePath")
    @ResponseWrapper(localName = "getPdbFilePathResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GetPdbFilePathResponse")
    @WebResult(name = "PdbFilePath", targetNamespace = "")
    public java.lang.String getPdbFilePath(
        @WebParam(name = "dataCollectionId", targetNamespace = "")
        java.lang.Integer dataCollectionId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateSession", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateSession")
    @ResponseWrapper(localName = "storeOrUpdateSessionResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateSessionResponse")
    @WebResult(name = "sessionId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateSession(
        @WebParam(name = "session", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.SessionWS3VO session
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateBeamLineSetup", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateBeamLineSetup")
    @ResponseWrapper(localName = "storeOrUpdateBeamLineSetupResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateBeamLineSetupResponse")
    @WebResult(name = "beamLineSetupId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateBeamLineSetup(
        @WebParam(name = "beamLineSetup", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.BeamLineSetup3VO beamLineSetup
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "findDetectorByParam", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDetectorByParam")
    @ResponseWrapper(localName = "findDetectorByParamResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDetectorByParamResponse")
    @WebResult(name = "Detector", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.Detector3VO findDetectorByParam(
        @WebParam(name = "detectorType", targetNamespace = "")
        java.lang.String detectorType,
        @WebParam(name = "detectorManufacturer", targetNamespace = "")
        java.lang.String detectorManufacturer,
        @WebParam(name = "detectorModel", targetNamespace = "")
        java.lang.String detectorModel,
        @WebParam(name = "detectorMode", targetNamespace = "")
        java.lang.String detectorMode
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateDataCollection", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateDataCollection")
    @ResponseWrapper(localName = "storeOrUpdateDataCollectionResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateDataCollectionResponse")
    @WebResult(name = "dataCollectionId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateDataCollection(
        @WebParam(name = "dataCollection", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.DataCollectionWS3VO dataCollection
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "groupDataCollections", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GroupDataCollections")
    @ResponseWrapper(localName = "groupDataCollectionsResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.GroupDataCollectionsResponse")
    @WebResult(name = "dataCollectionIds", targetNamespace = "")
    public java.util.List<java.lang.Integer> groupDataCollections(
        @WebParam(name = "dataCollectionGroupId", targetNamespace = "")
        java.lang.Integer dataCollectionGroupId,
        @WebParam(name = "arrayOfFileLocation", targetNamespace = "")
        java.util.List<java.lang.String> arrayOfFileLocation,
        @WebParam(name = "arrayOfFileName", targetNamespace = "")
        java.util.List<java.lang.String> arrayOfFileName
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "echo", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.Echo")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.EchoResponse")
    @WebResult(name = "echo", targetNamespace = "")
    public java.lang.String echo();

    @WebMethod
    @RequestWrapper(localName = "findDataCollectionFromFileLocationAndFileName", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollectionFromFileLocationAndFileName")
    @ResponseWrapper(localName = "findDataCollectionFromFileLocationAndFileNameResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.FindDataCollectionFromFileLocationAndFileNameResponse")
    @WebResult(name = "dataCollection", targetNamespace = "")
    public uk.ac.diamond.ispyb.soapclientsample.DataCollectionWS3VO findDataCollectionFromFileLocationAndFileName(
        @WebParam(name = "fileLocation", targetNamespace = "")
        java.lang.String fileLocation,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateWorkflow", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateWorkflow")
    @ResponseWrapper(localName = "storeOrUpdateWorkflowResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateWorkflowResponse")
    @WebResult(name = "workflowId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateWorkflow(
        @WebParam(name = "workflow", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.Workflow3VO workflow
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateImage", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateImage")
    @ResponseWrapper(localName = "storeOrUpdateImageResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateImageResponse")
    @WebResult(name = "imageId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateImage(
        @WebParam(name = "image", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.ImageWS3VO image
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "setDataCollectionPosition", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetDataCollectionPosition")
    @ResponseWrapper(localName = "setDataCollectionPositionResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.SetDataCollectionPositionResponse")
    @WebResult(name = "dataCollectionId", targetNamespace = "")
    public java.lang.Integer setDataCollectionPosition(
        @WebParam(name = "fileLocation", targetNamespace = "")
        java.lang.String fileLocation,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdatePosition", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdatePosition")
    @ResponseWrapper(localName = "storeOrUpdatePositionResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdatePositionResponse")
    @WebResult(name = "positionId", targetNamespace = "")
    public java.lang.Integer storeOrUpdatePosition(
        @WebParam(name = "position", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.PositionWS3VO position
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "storeOrUpdateWorkflowMesh", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateWorkflowMesh")
    @ResponseWrapper(localName = "storeOrUpdateWorkflowMeshResponse", targetNamespace = "http://ispyb.ejb3.webservices.collection", className = "uk.ac.diamond.ispyb.soapclientsample.StoreOrUpdateWorkflowMeshResponse")
    @WebResult(name = "workflowMeshId", targetNamespace = "")
    public java.lang.Integer storeOrUpdateWorkflowMesh(
        @WebParam(name = "workflowMesh", targetNamespace = "")
        uk.ac.diamond.ispyb.soapclientsample.WorkflowMeshWS3VO workflowMesh
    ) throws Exception_Exception;
}
