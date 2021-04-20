package uy.com.pepeganga.business.common.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "meli_order_buyer")
public class MeliOrderBuyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long buyerId;

    private String nickname;

    private String email;

    private String firstName;

    private String lastName;


    public MeliOrderBuyer() {
        // do nothing
    }

    public MeliOrderBuyer(Long buyerId, String nickname, String email, String firstName, String lastName) {
        this.buyerId = buyerId;
        this.nickname = nickname;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
