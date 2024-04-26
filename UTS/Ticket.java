class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, double price, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.price = price;
        this.seat = seat;
    }

    private Movie getmovie() {
        return movie;
    }

    private int studioNumber() {
        return studioNumber;
    }

    private double getTicketInfo() {
        return price;
        switch (studio.getType()) {
            case "Premiere":
                return 50000;
            case "Imax":
                return 80000;
        }
    }

    private String seat() {
        return seat;
    }
}
