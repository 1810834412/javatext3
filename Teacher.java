package text3;

public class Teacher extends Person {
    String taught;
    Teacher(int ID, String name, String sex,String taught) {
        super(ID, name, sex);
        this.taught=taught;
    }
}

