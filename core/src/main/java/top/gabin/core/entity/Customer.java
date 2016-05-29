package top.gabin.core.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Class description
 *
 * @author linjiabin on  16/5/29
 */
@Entity
@Table(name = "GE_CUSTOMER")
public class Customer implements Serializable {
    @Id
    @TableGenerator(name = "CUSTOMER_SEQUENCE", table = "GE_SEQUENCE", pkColumnName = "SEQUENCE_NAME",
            valueColumnName = "SEQ_NEXT_HI_VALUE", initialValue = 1000, allocationSize = 100)
    @GeneratedValue(generator = "CUSTOMER_SEQUENCE", strategy = GenerationType.TABLE)
    private Long id;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "REAL_NAME")
    private String realName;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "TOTAL")
    private String total;
    @OneToOne(targetEntity = Customer.class)
    @JoinColumn(name = "SOURCE_CUSTOMER")
    private Customer sourceCustomer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Customer getSourceCustomer() {
        return sourceCustomer;
    }

    public void setSourceCustomer(Customer sourceCustomer) {
        this.sourceCustomer = sourceCustomer;
    }
}
