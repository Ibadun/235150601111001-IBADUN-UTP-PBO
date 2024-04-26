class Studio {
    private int index;
    private String type;
    private String movieTitle;

    public Studio(int index, String type, String movieTitle) {
        this.index = index;
        this.type = type;
        this.movieTitle = movieTitle;
    }

    public String getStudioInfo() {
        return "Studio Index: " + index + ", Type: " + type + ", Movie: " + movieTitle;
    }
}