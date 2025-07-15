package com.fkhrayef.absher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/afrad/services")
public class AfradController {

    @GetMapping("")
    public String[] getServices() {
        return new String[] {"Issue a passport",
                "Renew passport",
                "Issue a visa",
                "Renew visa",
                "Issue a driver's license",
                "Renew driver's license",
                "Issue a vehicle registration",
                "Renew vehicle registration",
                "Report lost documents",
                "Dependent Services",
                "Issue Hajj Permit",
        };
    }
    @GetMapping("/passport-issuance")
    public String getPassportIssuance() {
        return "PASSPORT ISSUANCE";
    }

    @GetMapping("/passport-renewal")
    public String getPassportRenewal() {
        return "PASSPORT RENEWAL";
    }

    @GetMapping("/visa-issuance")
    public String getVisaIssuance() {
        return "VISA ISSUANCE";
    }

    @GetMapping("/visa-renewal")
    public String getVisaRenewal() {
        return "VISA RENEWAL";
    }

    @GetMapping("/driver-license-issuance")
    public String getDriverLicenseIssuance() {
        return "DRIVER LICENSE ISSUANCE";
    }

    @GetMapping("/driver-license-renewal")
    public String getDriverLicenseRenewal() {
        return "DRIVER LICENSE RENEWAL";
    }

    @GetMapping("/vehicle-registration-issuance")
    public String getVehicleRegistrationIssuance() {
        return "VEHICLE REGISTRATION ISSUANCE";
    }

    @GetMapping("/vehicle-registration-renewal")
    public String getVehicleRegistrationRenewal() {
        return "VEHICLE REGISTRATION RENEWAL";
    }

    @GetMapping("/lost-documents-report")
    public String getLostDocumentsReport() {
        return "LOST DOCUMENTS REPORT";
    }

    @GetMapping("/dependent-services")
    public String getDependentServices() {
        return "DEPENDENT SERVICES";
    }

    @GetMapping("/hajj-permit-issuance")
    public String getHajjPermitIssuance() {
        return "HAJJ PERMIT ISSUANCE";
    }
}
