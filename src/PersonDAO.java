import java.util.Objects;

public class PersonDAO {
    private long id;
    private String username;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "PersonDAO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonDAO personDAO = (PersonDAO) o;
        return id == personDAO.id && Objects.equals(username, personDAO.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
}