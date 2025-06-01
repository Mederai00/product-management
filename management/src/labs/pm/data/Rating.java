package labs.pm.data;

public enum Rating {
    NOT_RATED("not"),
    ONE_STAR("1star"),
    TWO_STAR("2star"),
    THREE_STAR("3star"),
    FOUR_STAR("4star"),
    FIVE_STAR("5star");
    private String stars;
    

    private Rating(String stars) {
        this.stars = stars;
    }
    

    public String getStars() {
        return stars;
    }



}
