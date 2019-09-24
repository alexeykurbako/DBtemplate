package entity;

import java.util.Objects;

public class Competition implements Entity {
    private long id;
    private Team firstTeam;
    private Team secondTeam;
    private String status;
    private int firstTeamScore;
    private int secondTeamScore;

    public Competition(long id, Team firstTeam, Team secondTeam, String status, int firstTeamScore, int secondTeamScore) {
        this.id = id;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.status = status;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFirstTeamScore() {
        return firstTeamScore;
    }

    public void setFirstTeamScore(int firstTeamScore) {
        this.firstTeamScore = firstTeamScore;
    }

    public int getSecondTeamScore() {
        return secondTeamScore;
    }

    public void setSecondTeamScore(int secondTeamScore) {
        this.secondTeamScore = secondTeamScore;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "id=" + id +
                ", firstTeam=" + firstTeam +
                ", secondTeam=" + secondTeam +
                ", status='" + status + '\'' +
                ", firstTeamScore=" + firstTeamScore +
                ", secondTeamScore=" + secondTeamScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Competition that = (Competition) o;
        return id == that.id &&
                firstTeamScore == that.firstTeamScore &&
                secondTeamScore == that.secondTeamScore &&
                Objects.equals(firstTeam, that.firstTeam) &&
                Objects.equals(secondTeam, that.secondTeam) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstTeam, secondTeam, status, firstTeamScore, secondTeamScore);
    }

    @Override
    public long getId() {
        return id;
    }
}
