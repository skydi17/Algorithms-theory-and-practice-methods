public class Subject {
    private Integer volume;
    private Integer cost;

    Subject(Integer cost, Integer volume) {
        this.cost = cost;
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
