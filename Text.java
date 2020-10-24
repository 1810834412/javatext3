package text3;

import java.util.Scanner;

public class Text {
    public static void main(String[] args){
        Teacher a = new Teacher(1,"袁潇芸","女","生物进化论");
        Teacher b = new Teacher(2,"高亮","男","战争心理学");
        Teacher c = new Teacher(3,"董梓潇","男","演讲口才与公众表达");
        Teacher d = new Teacher(4,"贾忱健","男","动物肢体语言学");
        Curriculum e=new Curriculum("YXY-HZ","生物进化论","教100","7:50-9:25",a.name,a.sex);
        Curriculum f=new Curriculum("GL-CS","战争心理学","教101","9:40-12:05",b.name, b.sex);
        Curriculum g=new Curriculum("DZX-LZR","演讲口才与公众表达","教102","13:30-15:05",c.name, c.sex);
        Curriculum h=new Curriculum("JCJ-LJ","动物肢体语言学","教103","19:00-21:25",d.name, d.sex);
        Student i = new Student(5,"杰木","男");
        System.out.println("*****************************************************************课程信息******************************************************************");
        System.out.println("课程1："+e);
        System.out.println("课程2："+f);
        System.out.println("课程3："+g);
        System.out.println("课程4："+h);
        System.out.println("*****************************************************************************************************************************************");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要选课程的数量:");
        int k= scan.nextInt();
        while (k>4&&k<0){
            System.out.println("您输入有误请重新输入");
            k= scan.nextInt();
        }
        int z;
        z=k;
        int y=1;
        while (k>0) {
            switch (y) {
                case 1: {
                    System.out.println("请输入所选课程编号:");
                    int j = scan.nextInt();
                    switch (j) {
                        case 1:
                            i.setSelected1(e);
                            break;
                        case 2:
                            i.setSelected1(f);
                            break;
                        case 3:
                            i.setSelected1(g);
                            break;
                        case 4:
                            i.setSelected1(h);
                            break;
                        default:
                            System.out.println("选课无效!");
                            return;
                    }
                    break;
                }
                case 2: {
                    System.out.println("请输入所选课程编号:");
                    int j = scan.nextInt();
                    switch (j) {
                        case 1:
                            i.setSelected2(e);
                            break;
                        case 2:
                            i.setSelected2(f);
                            break;
                        case 3:
                            i.setSelected2(g);
                            break;
                        case 4:
                            i.setSelected2(h);
                            break;
                        default:
                            System.out.println("选课无效!");
                            return;
                    }
                    break;
                }
                case 3: {
                    System.out.println("请输入所选课程编号:");
                    int j = scan.nextInt();
                    switch (j) {
                        case 1:
                            i.setSelected3(e);
                            break;
                        case 2:
                            i.setSelected3(f);
                            break;
                        case 3:
                            i.setSelected3(g);
                            break;
                        case 4:
                            i.setSelected3(h);
                            break;
                        default:
                            System.out.println("选课无效!");
                            return;
                    }
                    break;
                }
                case 4: {
                    System.out.println("请输入所选课程编号:");
                    int j = scan.nextInt();
                    switch (j) {
                        case 1:
                            i.setSelected4(e);
                            break;
                        case 2:
                            i.setSelected4(f);
                            break;
                        case 3:
                            i.setSelected4(g);
                            break;
                        case 4:
                            i.setSelected4(h);
                            break;
                        default:
                            System.out.println("选课无效!");
                            return;
                    }
                    break;
                }
            }
            k=k-1;
            y=y+1;
        }
        System.out.println("*****************************************************************您的选课信息***************************************************************");
        System.out.println(i);
        System.out.println("******************************************************************************************************************************************");
        System.out.println("是否退课：（1是，2否）");
        int x=scan.nextInt();
        if(x==1) {
            System.out.println("请输入要退课程的数量:");
            int l = scan.nextInt();
            if (l > z) {
                while (l>z) {
                    System.out.println("您输入有误请重新输入");
                    System.out.println("请您输入小于或者等于" + z + "的数");
                    int m = scan.nextInt();
                    l = m;
                }
            }
            while (l>0){
                System.out.println("请输入要退课程的在您的课程信息中的位置（第几个）:");
                int u=scan.nextInt();
                switch (u){
                    case 1:{
                        i.setSelected1(null);
                        break;
                    }
                    case 2:{
                        i.setSelected2(null);
                        break;
                    }
                    case 3:{
                        i.setSelected3(null);
                        break;
                    }
                    case 4:{
                        i.setSelected4(null);
                        break;
                    }
                }
                l=l-1;
            }
            System.out.println("*****************************************************************您的选课信息***************************************************************");
            System.out.println(i);
            System.out.println("******************************************************************************************************************************************");
            System.out.println("选课结束!");

        }
        else {
            System.out.println("选课结束!");
        }
    }
}
