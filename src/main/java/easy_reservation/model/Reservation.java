package easy_reservation.model;

import easy_reservation.enumeration.PaymentStatus;
import easy_reservation.enumeration.ReservationStatus;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Reservation {

    @Id
    @Column(name = "reservation_id")
    private Long reservationId;
    @Column(name = "shop_id")
    private Long shopId;
    @Column(name = "reservation_date_time")
    private LocalDateTime reservationDateTime;
    @Column(name = "reservation_status")
    private ReservationStatus reservationStatus;
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;
    @ManyToOne
    private Customers customers;

    protected Reservation(){}

    public Reservation(Long reservationId, Long shopId, LocalDateTime reservationDateTime, ReservationStatus reservationStatus, PaymentStatus paymentStatus, Customers customers) {
        this.reservationId = reservationId;
        this.shopId = shopId;
        this.reservationDateTime = reservationDateTime;
        this.reservationStatus = reservationStatus;
        this.paymentStatus = paymentStatus;
        this.customers = customers;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public LocalDateTime getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
}
