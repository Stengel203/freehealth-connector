package org.taktik.connector.business.memberdata.service;

import org.taktik.connector.technical.exception.TechnicalConnectorException;
import org.taktik.connector.technical.service.sts.security.SAMLToken;
import be.fgov.ehealth.mycarenet.memberdata.protocol.v1.MemberDataConsultationRequest;
import be.fgov.ehealth.mycarenet.memberdata.protocol.v1.MemberDataConsultationResponse;

public interface MemberDataService {
   MemberDataConsultationResponse consultMemberData(SAMLToken var1, MemberDataConsultationRequest var2) throws TechnicalConnectorException;
}
