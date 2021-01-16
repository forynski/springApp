package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue

    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

////    @Column(nullable = false)
//    private String role;

    @Column()
    private String role = "ROLE_ADMIN";

    @Column(columnDefinition = "boolean not null default false")
    private Boolean enabled;

//    @OneToOne(fetch = FetchType.LAZY)
//    private Customer customer;
}

// KOPIA CUSTOMERA
//@Entity(name = "customer")
//public class Customer {
//    @Id
//    @GeneratedValue
//    private Long id;
//    @NotNull
////    @Pattern(regexp = "[a-zA-Z]", message = "First name must contain only alphabetic characters")
//    private String firstName;
//    @NotNull
////    @Pattern(regexp = "[a-zA-Z]", message = "Last name must contain only alphabetic characters")
//    private String lastName;
//    @NotNull
//    @Pattern(regexp = "[[0-9]]+", message = "Phone number must contain digits only")
//    private String phoneNumber;
//    @NotNull
//    @Email
//    private String email;

//    @OneToOne(mappedBy = "customer")
//    @Getter(value=AccessLevel.NONE)
//    private User user;

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
//    @Setter(value = AccessLevel.NONE)
//    private List<Booking> bookings = new ArrayList<>();
//
//    public void addBooking(Booking booking) {
//        bookings.add(booking);
//    }
