package easy_reservation.model;

import easy_reservation.enumeration.PermissionStatus;
import easy_reservation.enumeration.RoleStatus;

import javax.persistence.*;


@Entity
public class Customers {

    @Id
    @Column(name = "customers_id")
    private Long customersId;
    @Column(name = "is_user_Active")
    private Boolean isUserActive;
    @Column(name = "customers_name")
    private String customersName;
    @Column(name = "customers_surname")
    private String customersSurname;
    @Column(name = "customers_email")
    private String customersEmail;
    @Column(name = "customers_password")
    private String customersPassword;
    @Column(name = "role_status")
    private RoleStatus roleStatus;
    @Column(name = "permission_status")
    private PermissionStatus permissionStatus;

    protected Customers(){}

    public Customers(Long customersId, Boolean isUserActive, String customersName, String customersSurname, String customersEmail, String customersPassword, RoleStatus roleStatus, PermissionStatus permissionStatus) {
        this.customersId = customersId;
        this.isUserActive = isUserActive;
        this.customersName = customersName;
        this.customersSurname = customersSurname;
        this.customersEmail = customersEmail;
        this.customersPassword = customersPassword;
        this.roleStatus = roleStatus;
        this.permissionStatus = permissionStatus;
    }

    public Long getCustomersId() {
        return customersId;
    }

    public void setCustomersId(Long customersId) {
        this.customersId = customersId;
    }

    public Boolean getUserActive() {
        return isUserActive;
    }

    public void setUserActive(Boolean userActive) {
        isUserActive = userActive;
    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public String getCustomersSurname() {
        return customersSurname;
    }

    public void setCustomersSurname(String customersSurname) {
        this.customersSurname = customersSurname;
    }

    public String getCustomersEmail() {
        return customersEmail;
    }

    public void setCustomersEmail(String customersEmail) {
        this.customersEmail = customersEmail;
    }

    public String getCustomersPassword() {
        return customersPassword;
    }

    public void setCustomersPassword(String customersPassword) {
        this.customersPassword = customersPassword;
    }

    public RoleStatus getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(RoleStatus roleStatus) {
        this.roleStatus = roleStatus;
    }

    public PermissionStatus getPermissionStatus() {
        return permissionStatus;
    }

    public void setPermissionStatus(PermissionStatus permissionStatus) {
        this.permissionStatus = permissionStatus;
    }
}

