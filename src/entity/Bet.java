package entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Bet implements Entity {
    private long id;
    private long userId;
    private long eventId;
    private long chosenTeamId;
    private BigDecimal size;

    public Bet(long id, long userId, long eventId, long chosenTeamId, BigDecimal size) {
        this.id = id;
        this.userId = userId;
        this.eventId = eventId;
        this.chosenTeamId = chosenTeamId;

        this.size = size;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getChosenTeamId() {
        return chosenTeamId;
    }

    public void setChosenTeamId(long chosenTeamId) {
        this.chosenTeamId = chosenTeamId;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return id == bet.id &&
                userId == bet.userId &&
                eventId == bet.eventId &&
                chosenTeamId == bet.chosenTeamId &&
                Objects.equals(size, bet.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, eventId, chosenTeamId, size);
    }

    @Override
    public String toString() {
        return "Bet{" +
                "id=" + id +
                ", userId=" + userId +
                ", eventId=" + eventId +
                ", chosenTeamId=" + chosenTeamId +
                ", size=" + size +
                '}';
    }

    @Override
    public long getId() {
        return id;
    }
}
