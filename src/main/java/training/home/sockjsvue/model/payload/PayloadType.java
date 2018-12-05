package training.home.sockjsvue.model.payload;

public enum PayloadType {
    LOGIN("LOGIN");



    private String type;

    PayloadType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
