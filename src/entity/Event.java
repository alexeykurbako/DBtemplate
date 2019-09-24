package entity;

import java.util.Objects;

public class Event implements Entity {
    private long id;
    private Competition competition;
    private double firstTeamCoefficient;
    private double secondTeamCoefficient;

    public Event(long id, Competition competition, double firstTeamCoefficient, double secondTeamCoefficient) {
        this.id = id;
        this.competition = competition;
        this.firstTeamCoefficient = firstTeamCoefficient;
        this.secondTeamCoefficient = secondTeamCoefficient;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public double getFirstTeamCoefficient() {
        return firstTeamCoefficient;
    }

    public void setFirstTeamCoefficient(double firstTeamCoefficient) {
        this.firstTeamCoefficient = firstTeamCoefficient;
    }

    public double getSecondTeamCoefficient() {
        return secondTeamCoefficient;
    }

    public void setSecondTeamCoefficient(double secondTeamKoefficient) {
        this.secondTeamCoefficient = secondTeamKoefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id &&
                Double.compare(event.firstTeamCoefficient, firstTeamCoefficient) == 0 &&
                Double.compare(event.secondTeamCoefficient, secondTeamCoefficient) == 0 &&
                Objects.equals(competition, event.competition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, competition, firstTeamCoefficient, secondTeamCoefficient);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", competition=" + competition +
                ", firstTeamCoefficient=" + firstTeamCoefficient +
                ", secondTeamCoefficient=" + secondTeamCoefficient +
                '}';
    }

    @Override
    public long getId() {
        return id;
    }
}
