package com.fkhrayef.absher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/business")
public class BusinessController {

    @GetMapping("/services")
    public String[] getServices() {
        return new String[] {"Create Iqama for a worker",
                "Renew Iqama for Employees",
                "Issue Exit/Re-Entry visa for Workers",
                "Update worker information",
                "Transfer worker",
        };
    }

    @GetMapping("/iqama-issuance")
    public String getIqamaIssuanace() {
        return "IQAMA ISSUANCE";
    }

    @GetMapping("/iqama-renewal")
    public String getIqamaRenewal() {
        return "IQAMA RENEWAL";
    }

    @GetMapping("/visa-issuance")
    public String getVisaIssuance() {
        return "VISA ISSUANCE";
    }

    @GetMapping("/worker-information-update")
    public String getWorkerInformationUpdate() {
        return "WORKER INFORMATION UPDATE";
    }

    @GetMapping("/worker-transfer")
    public String getWorkerTransfer() {
        return "WORKER TRANSFER";
    }
}
