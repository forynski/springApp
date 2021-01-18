package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "room")
public class Room {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String roomType;
    @NotNull
    private Integer costPerNight;


//    @OneToMany(mappedBy = "rooms")
//    @Setter(value = AccessLevel.NONE)
//    @Getter(value = AccessLevel.NONE)
//    private List<Booking> bookings = new ArrayList<>();
//
//    public void addBooking(Booking booking) {
//        bookings.add(booking);
//    }

}