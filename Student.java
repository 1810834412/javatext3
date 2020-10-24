package text3;

public class Student extends Person{
    Curriculum selected1=null;
    Curriculum selected2=null;
    Curriculum selected3=null;
    Curriculum selected4=null;
    Student(int ID,String name,String sex){
       super(ID,name,sex);
    }
    public void setSelected1(Curriculum selected){
        this.selected1=selected;
    }
    public void setSelected2(Curriculum selected){
        this.selected2=selected;
    }
    public void setSelected3(Curriculum selected){
        this.selected3=selected;
    }
    public void setSelected4(Curriculum selected){
        this.selected4=selected;
    }
    public String toString() {
        if (selected1!=null&&selected2==null&&selected3==null&&selected4==null) {
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1;
        }
        else if (selected1==null&&selected2!=null&&selected3==null&&selected4==null) {
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected2;
        }
        else if (selected1==null&&selected2==null&&selected3!=null&&selected4==null) {
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected3;
        }
        else if (selected1==null&&selected2==null&&selected3==null&&selected4!=null) {
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected4;
        }
        else if (selected1!=null&&selected2!=null&&selected3==null&&selected4==null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1 +"\n"+"                               "+ selected2;
        }
        else if (selected1!=null&&selected2==null&&selected3!=null&&selected4==null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1 +"\n"+"                               "+ selected3;
        }
        else if (selected1!=null&&selected2==null&&selected3==null&&selected4!=null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1 +"\n"+"                               "+ selected4;
        }
        else if (selected1==null&&selected2!=null&&selected3!=null&&selected4==null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected2 +"\n"+"                               "+ selected3;
        }
        else if (selected1==null&&selected2!=null&&selected3==null&&selected4!=null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected2 +"\n"+"                               "+ selected4;
        }
        else if (selected1==null&&selected2==null&&selected3!=null&&selected4!=null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected3 +"\n"+"                               "+ selected4;
        }
        else if (selected1!=null&&selected2!=null&&selected3!=null&&selected4==null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1 +"\n"+"                               "+ selected2 +"\n"+"                               "+ selected3;
        }
        else if (selected1==null&&selected2!=null&&selected3!=null&&selected4!=null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected2 + "\n"+"                               "+selected3 +"\n"+"                               "+ selected4;
        }
        else if (selected1!=null&&selected2==null&&selected3!=null&&selected4!=null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1 + "\n"+"                               "+selected3 +"\n"+"                               "+ selected4;
        }
        else if (selected1!=null&&selected2!=null&&selected3==null&&selected4!=null){
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1 + "\n"+"                               "+selected2 +"\n"+"                               "+ selected4;
        }
        else{
            return "学号:" + ID + ",姓名:" + name + ",性别:" + sex + ",所选课程为：" + selected1 +"\n"+"                               "+ selected2 + "\n"+"                               "+selected3 +"\n"+"                               "+ selected4;
        }
    }
}

