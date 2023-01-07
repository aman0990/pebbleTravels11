package pebbleModel;

import javax.persistence.*;

@Entity
@Table(name = "TrainBooking")
public class trainBookingPOJO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Mobile")
    private long Mobile;

    @Column(name = "age")
    private int age;

    @Column(name = "EmailId")
    private String email;

    @Column(name = "Address")
    private String address;

    public trainBookingPOJO ( ) {
    }

    public trainBookingPOJO (Long id, String fullName, long mobile, int age, String email, String address) {
        this.id = id;
        this.fullName = fullName;
        Mobile = mobile;
        this.age = age;
        this.email = email;
        this.address = address;
    }


    /**
     * get field @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @Column(name = "id", nullable = false)

      *
      * @return id @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @Column(name = "id", nullable = false)

     */
    public Long getId ( ) {
        return this.id;
    }

    /**
     * set field @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @Column(name = "id", nullable = false)

      *
      * @param id @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @Column(name = "id", nullable = false)

     */
    public void setId (Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "FullName")
     *
     * @return fullName @Column(name = "FullName")

     */
    public String getFullName ( ) {
        return this.fullName;
    }

    /**
     * set field @Column(name = "FullName")
     *
     * @param fullName @Column(name = "FullName")

     */
    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    /**
     * get field @Column(name = "Mobile")
     *
     * @return Mobile @Column(name = "Mobile")

     */
    public long getMobile ( ) {
        return this.Mobile;
    }

    /**
     * set field @Column(name = "Mobile")
     *
     * @param Mobile @Column(name = "Mobile")

     */
    public void setMobile (long Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * get field @Column(name = "age")
     *
     * @return age @Column(name = "age")

     */
    public int getAge ( ) {
        return this.age;
    }

    /**
     * set field @Column(name = "age")
     *
     * @param age @Column(name = "age")

     */
    public void setAge (int age) {
        this.age = age;
    }

    /**
     * get field @Column(name = "EmailId")
     *
     * @return email @Column(name = "EmailId")

     */
    public String getEmail ( ) {
        return this.email;
    }

    /**
     * set field @Column(name = "EmailId")
     *
     * @param email @Column(name = "EmailId")

     */
    public void setEmail (String email) {
        this.email = email;
    }

    /**
     * get field @Column(name = "Address")
     *
     * @return address @Column(name = "Address")

     */
    public String getAddress ( ) {
        return this.address;
    }

    /**
     * set field @Column(name = "Address")
     *
     * @param address @Column(name = "Address")

     */
    public void setAddress (String address) {
        this.address = address;
    }

    @Override
    public String toString ( ) {
        return "trainBookingPOJO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", Mobile=" + Mobile +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}