public class CinemaManagementApp {
    public static void main(String[] args) {
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Starlight Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());

        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());

        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();

        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A1")
                .setSnackCombo("Popcorn and Soda")
                .build();
        System.out.println(booking);

        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");

        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);
        eveningSchedule.printSchedule();

        System.out.println("Cinema Management System initialized.");
    }
}
