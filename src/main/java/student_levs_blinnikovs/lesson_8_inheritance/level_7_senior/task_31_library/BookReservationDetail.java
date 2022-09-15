package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class BookReservationDetail extends BookLending {

    ReservationStatus reservationStatus;

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
