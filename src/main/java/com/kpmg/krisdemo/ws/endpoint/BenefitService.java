package com.kpmg.krisdemo.ws.endpoint;

import com.kpmg.krisdemo.types.benefit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BenefitService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ResponsePayload
    @PayloadRoot(namespace = "http://kpmg.com/krisdemo/types/benefit", localPart = "SpecialtyVisitInput")
    public SpecialtyVisit getSpecialtyVisitSummary(@RequestPayload SpecialtyVisitInput input){
        logger.info("Request received for getSpecialtyVisitSummary with input "+input);
        ObjectFactory objectFactory = new ObjectFactory();
        SpecialtyVisit output = objectFactory.createSpecialtyVisit();
        output.setDeductible("Not applicable");
        output.setCoinsurance("Plan pays 100%");
        output.setCopay(40);
        return output;
    }

    @ResponsePayload
    @PayloadRoot(namespace = "http://kpmg.com/krisdemo/types/benefit", localPart = "PrimaryCareVisitInput")
    public PrimaryCareVisit getPrimaryCareVisitSummary(@RequestPayload PrimaryCareVisitInput input){
        logger.info("Request received for getUrgentCareSummary with input "+input);
        ObjectFactory objectFactory = new ObjectFactory();
        PrimaryCareVisit output = objectFactory.createPrimaryCareVisit();
        output.setDeductible("Not applicable");
        output.setCoinsurance("Plan pays 100%");
        output.setCopay(20);
        return output;
    }

    @ResponsePayload
    @PayloadRoot(namespace = "http://kpmg.com/krisdemo/types/benefit", localPart = "UrgentCareInput")
    public UrgentCare getUrgentCareSummary(@RequestPayload UrgentCareInput input){
        logger.info("Request received for getUrgentCareSummary with input "+input);
        ObjectFactory objectFactory = new ObjectFactory();
        UrgentCare output = objectFactory.createUrgentCare();
        output.setDeductible("Not applicable");
        output.setCoinsurance("Plan pays 100%");
        output.setCopay(50);
        return output;
    }

    @ResponsePayload
    @PayloadRoot(namespace = "http://kpmg.com/krisdemo/types/benefit", localPart = "EmergencyRoomInput")
    public EmergencyRoom getEmergencyRoomSummary(@RequestPayload EmergencyRoomInput input){
        logger.info("Request received for getEmergencyRoomSummary with input "+input);
        ObjectFactory objectFactory = new ObjectFactory();
        EmergencyRoom output = objectFactory.createEmergencyRoom();
        output.setDeductible("Not applicable");
        output.setCoinsurance("Plan pays 100%");
        output.setCopay(250);
        return output;
    }

}
