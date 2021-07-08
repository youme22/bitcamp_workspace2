package shop.watchawiki.api.seat.service;

import shop.watchawiki.api.seat.domain.Seat;

import java.time.LocalDate;
import java.util.ArrayList;

public interface SeatService {
    ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay);
    ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay, String reserveTime);
}
