public class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    private TicketBooking(TicketBookingBuilder builder) {
        this.movieTitle = builder.movieTitle;
        this.seatNumber = builder.seatNumber;
        this.snackCombo = builder.snackCombo;
    }

    @Override
    public String toString() {
        return "TicketBooking [Movie: " + movieTitle + ", Seat: " + seatNumber + ", Snack Combo: " + snackCombo + "]";
    }

    public static class TicketBookingBuilder {
        private String movieTitle;
        private String seatNumber;
        private String snackCombo;

        public TicketBookingBuilder setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
            return this;
        }

        public TicketBookingBuilder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public TicketBookingBuilder setSnackCombo(String snackCombo) {
            this.snackCombo = snackCombo;
            return this;
        }

        public TicketBooking build() {
            return new TicketBooking(this);
        }
    }
}
