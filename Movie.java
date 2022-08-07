public class Movie extends Film{
    private int duration;

    //Movie constructor
    public Movie(String id, String title, Type type, double rank, int duration) {
        setId(id);
        setTitle(title);
        setType(type);
        setRank(rank);
        setDuration(duration);
    }

    //get/set duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public void showMovieInfo() {
        System.out.println("Film info-> director: " + getId() + ", title: " + getTitle() + ", type: " + getType().getTypeString() + 
                            ", rank: " + getRank() + ", duration: " + getDuration());
    }
}
