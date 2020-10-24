package text3;

public class Curriculum {
    String ID;
    String title;
    String place;
    String time;
    String tcr;
    String tsex;
    Curriculum(String ID,String title,String place,String time,String tcr,String tsex){
        this.ID=ID;
        this.title=title;
        this.place=place;
        this.time=time;
        this.tcr=tcr;
        this.tsex=tsex;
    }
    public String toString(){
        return "课程号："+ID+",课程名称:"+title+",上课地点:"+place+",教学时间:"+time+",授课教师姓名:"+tcr+",授课教师性别:"+tsex;
    }
}
