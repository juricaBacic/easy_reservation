package easy_reservation.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Entity
public class Shop {

    @Id
    @Column(name = "shop_id")
    private Long shopId;
    @Column(name = "shop_name")
    private String shopName;
    @Column(name = "shop_street_location")
    private String shopStreetLocation;
    @Column(name = "shop_city_location")
    private String shopCityLocation;
    @Column(name = "shop_work_time")
    private Time shopWorkTime;
    @Column(name = "is_shop_open")
    private Boolean isShopOpen;


    public Shop(Long shopId, String shopName, String shopStreetLocation, String shopCityLocation, Time shopWorkTime, Boolean isShopOpen) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopStreetLocation = shopStreetLocation;
        this.shopCityLocation = shopCityLocation;
        this.shopWorkTime = shopWorkTime;
        this.isShopOpen = isShopOpen;
    }

    protected Shop(){}

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopStreetLocation() {
        return shopStreetLocation;
    }

    public void setShopStreetLocation(String shopStreetLocation) {
        this.shopStreetLocation = shopStreetLocation;
    }

    public String getShopCityLocation() {
        return shopCityLocation;
    }

    public void setShopCityLocation(String shopCityLocation) {
        this.shopCityLocation = shopCityLocation;
    }

    public Time getShopWorkTime() {
        return shopWorkTime;
    }

    public void setShopWorkTime(Time shopWorkTime) {
        this.shopWorkTime = shopWorkTime;
    }

    public Boolean getShopOpen() {
        return isShopOpen;
    }

    public void setShopOpen(Boolean shopOpen) {
        isShopOpen = shopOpen;
    }
}
