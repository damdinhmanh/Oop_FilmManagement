public class Film {
    private String id;      //name of the film's director
    private String title;   //name of film
    private Type type;      //type of file
    private double rank;    //ranking of film

    //get/set id
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    //get/set title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    
    //get/set type
    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    //get/set rank
    public void setRank(double rank) {
        this.rank = rank;
    }

    public double getRank() {
        return this.rank;
    }

    //find by title
    public boolean hasTitleContain(String fTitle) {
        return (this.title.contains(fTitle));
    }
}