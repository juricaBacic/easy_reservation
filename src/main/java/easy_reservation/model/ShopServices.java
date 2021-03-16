package easy_reservation.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop_services")
public class ShopServices implements Serializable {

    @Id
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Services services;

    @Id
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Shop shop;

    @Id
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Reservation reservationId;

    @Column(name = "service_price")
    private Long servicePrice;

    protected ShopServices(){}

    public ShopServices(Services services, Shop shop, Reservation reservationId, Long servicePrice) {
        this.services = services;
        this.shop = shop;
        this.reservationId = reservationId;
        this.servicePrice = servicePrice;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Shop getShop() {
        return shop;
    }


    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Reservation getReservationId() {
        return reservationId;
    }

    public void setReservationId(Reservation reservationId) {
        this.reservationId = reservationId;
    }

    public Long getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Long servicePrice) {
        this.servicePrice = servicePrice;
    }
}
