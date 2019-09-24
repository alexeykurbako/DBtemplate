package entity;

import java.util.Objects;

public class League implements Entity {
    private long id;
    private String name;

    public League(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public League() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        League league = (League) o;
        return id == league.id &&
                Objects.equals(name, league.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public long getId() {
        return id;
    }
}
