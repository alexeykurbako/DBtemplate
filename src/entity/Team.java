package entity;

import java.util.Objects;

public class Team implements Entity{

    private long id;
    private String teamName;
    private Category category;
    private League league;
    public Team(long id, String teamName, Category category, League league) {
        this.id = id;
        this.teamName = teamName;
        this.category = category;
        this.league = league;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Team() {

    }
    @Override
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return id == team.id &&
                Objects.equals(teamName, team.teamName) &&
                category == team.category &&
                Objects.equals(league, team.league);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teamName, category, league);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", category=" + category +
                ", league=" + league +
                '}';
    }
}
