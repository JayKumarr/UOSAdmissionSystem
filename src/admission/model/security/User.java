package admission.model.security;
// Generated Jun 30, 2014 5:25:15 PM by Hibernate Tools 3.6.0

import admission.enums.StatusEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "YOG_USER", uniqueConstraints = @UniqueConstraint(columnNames = "username")
)
public class User implements java.io.Serializable {

    private Integer id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String username;
    private String password;
    private String type;
    private StatusEnum status;
    private String remarks;
    private Long dateOfCreated;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String name, String surname, String mobileNo, String username, String password, String type, StatusEnum status, String remarks) {
        this.firstName = name;
        this.lastName = surname;
        this.mobileNo = mobileNo;
        this.username = username;
        this.password = password;
        this.type = type;
        this.status = status;
        this.remarks = remarks;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "first_name", length = 45)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", length = 45)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "mobile_no", length = 45)
    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Column(name = "username", unique = true, nullable = false, length = 45)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = false, length = 128)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "type", length = 1)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "status", length = 1)
    @Enumerated
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Column(name = "date_of_created")
    public Long getDateOfCreated() {
        return dateOfCreated;
    }

    public void setDateOfCreated(Long dateOfCreated) {
        this.dateOfCreated = dateOfCreated;
    }

    @Override
    public String toString() {
        return firstName;
    }

}