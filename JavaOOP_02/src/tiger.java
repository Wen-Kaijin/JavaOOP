public class tiger extends cat{
    public tiger(int age, float weight, boolean run, boolean eat) {
        super(age, weight, run, eat);
    }

    public static void main(String[] args) {
        tiger tiger = new tiger(150, 80, true, true);
        tiger.say();

    }


}
