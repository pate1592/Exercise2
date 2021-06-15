package ca.sheridan.pate1592.exercise2.repository;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class ControllerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CUSTOMER_ID;

    @Column(name = "firstname")
    private String FIRST_NAME;

    @Column(name = "lastname")
    private String LAST_NAME;

    @Column(name = "Email")
    private String EMAIL;

    @Column(name = "Street")
    private String STREET;

    @Column(name = "City")
    private String CITY;

    @Column(name = "State")
    private String STATE;

    @Column(name = "Zipcode")
    private String ZIP_CODE;

    public Integer getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(Integer CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSTREET() {
        return STREET;
    }

    public void setSTREET(String STREET) {
        this.STREET = STREET;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getZIP_CODE() {
        return ZIP_CODE;
    }

    public void setZIP_CODE(String ZIP_CODE) {
        this.ZIP_CODE = ZIP_CODE;
    }

}
