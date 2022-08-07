public enum Type {
    HORROR("horror"),
    COMEDY("comedy"), 
    DOCUMENTATRY("documentary"),
    DRAMA("drama"),
    ACTION("action");

    private String typeStr;

    Type(String type) {
        this.typeStr = type;
    }

    public String getTypeString() {
        return this.typeStr;
    }
}
