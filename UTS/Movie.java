class Movie {
    private String title;
    private double rating;
    private String genres;

    public Movie(String title, double rating, String genres) {
        this.title = title;
        this.rating = rating;
        this.genres = genres;
    }

    
    public String toString() {
        return "Movie: " + title + " (Rating : " + rating + ", Genres: " + genres + ")";
    }
}

