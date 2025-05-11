public class animal {
    int age;
    float weight;
    boolean run;
    boolean eat;

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isRun() {
        return run;
    }

    public boolean isEat() {
        return eat;
    }

    public animal(int age, float weight, boolean run, boolean eat) {
        this.age = age;
        this.weight = weight;
        this.run = run;
        this.eat = eat;
    }
}
