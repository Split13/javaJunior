package lesson9;

public class User {
    private String username;
    private String pathOfName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPathOfName() {
        return pathOfName;
    }

    public void setPathOfName(String pathOfName) {
        this.pathOfName = pathOfName;
    }

    public User(String username, String pathOfName) {
        this.username = username;
        this.pathOfName = pathOfName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        return pathOfName != null ? pathOfName.equals(user.pathOfName) : user.pathOfName == null;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pathOfName='" + pathOfName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (pathOfName != null ? pathOfName.hashCode() : 0);
        return result;
    }
}
