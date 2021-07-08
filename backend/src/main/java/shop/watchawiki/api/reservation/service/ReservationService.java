package shop.watchawiki.api.reservation.service;

import shop.watchawiki.api.reservation.domain.Reservation;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

public interface ReservationService {
    public Long save(Reservation reserve);
    void remove(Long id);
    Reservation findOne(Long id);
    List<Reservation> findAll(String userid);
    void deleteAll();
    int getSalesByDay(LocalDate date);
    int getSalesByMonth(String startDay, String lastDay);
    int getSalesByMovie(String movieName);
    Reservation settingData(ResultSet rs);

}
