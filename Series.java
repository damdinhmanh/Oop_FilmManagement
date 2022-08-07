public class Series extends Film {
    private int episodeNum;
    private int durationAvg;

    //Series constructor
    public Series(String id, String title, Type type, double rank, int episodeNum, int durationAvg) {
        setId(id);
        setTitle(title);
        setType(type);
        setRank(rank);
        setEpisodeNum(episodeNum);
        setDurationAvg(durationAvg);
    }

    //get/set total episode number
    public void setEpisodeNum(int episodeNum) {
        this.episodeNum = episodeNum;
    }

    public int getEpisodeNum() {
        return this.episodeNum;
    }

    //get/set average duration
    public void setDurationAvg(int durationAvg) {
        this.durationAvg = durationAvg;
    }

    public int getDurationAvg() {
        return this.durationAvg;
    }

    public void showSeriesInfo() {
        System.out.println("Film info-> director: " + getId() + ", title: " + getTitle() + ", type: " + getType().getTypeString() + 
                            ", rank: " + getRank() + ", total episode: " + getEpisodeNum() + ", average duration: " + getDurationAvg());
    }

}
