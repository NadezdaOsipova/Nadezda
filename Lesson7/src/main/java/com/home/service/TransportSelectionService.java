package com.home.service;

import com.home.models.*;

public class TransportSelectionService {
    public TransportServiсe createService(Transport transport) {
        TransportServiсe transportServiсe = null;
        switch (transport.getType()) {
            case CIVIL:
                transportServiсe = new CivilAirTransportServiceImpl((CivilAirTransport) transport);
                break;
            case FREIGHT:
                transportServiсe = new FleightLandTransportServiceImpl((FleightLandTransport) transport);
                break;
            case MILITARY:
                transportServiсe = new MilitaryAirTransportServiceImpl((MilitaryAirTransport) transport);
                break;
            case LIGHT:
                transportServiсe = new LightLandTtransportServiceImpl((LightLandTtransport) transport);
                break;
        }
        return transportServiсe;
    }
}


