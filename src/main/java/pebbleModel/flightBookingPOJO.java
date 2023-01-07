package pebbleModel;

import javax.persistence.*;
@Entity
@Table(name = "FlightBooking")
public class flightBookingPOJO {
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

    public flightBookingPOJO ( ) {
    }

    public flightBookingPOJO (Long id, String fullName, long mobile, int age, String email, String address) {
        this.id = id;
        this.fullName = fullName;
        Mobile = mobile;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getFullName ( ) {
        return fullName;
    }

    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    public long getMobile ( ) {
        return Mobile;
    }

    public void setMobile (long mobile) {
        Mobile = mobile;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    @Override
    public String toString ( ) {
        return "flightBookingPOJO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", Mobile=" + Mobile +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}