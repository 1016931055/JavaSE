import java.util.Objects;

public class Student06 {
    private int num;
    private String name;

    private int score;

    public Student06(int num, String name, int score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student06{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student06 student06 = (Student06) o;
        return num == student06.num;
    }
}
