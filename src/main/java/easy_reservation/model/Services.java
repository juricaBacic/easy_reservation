package easy_reservation.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Services {

    @Id
    @Column(name = "service_id")
    private Long servicesId;
    @Column(name = "service_name")
    private String serviceName;

    public Services(Long servicesId, String serviceName) {
        this.servicesId = servicesId;
        this.serviceName = serviceName;
    }

    protected Services(){}

    public Long getServicesId() {
        return servicesId;
    }

    public void setServicesId(Long servicesId) {
        this.servicesId = servicesId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
