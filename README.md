# javatext3
# 计191 高亮 2019310199
# 实验三 学生选课模拟系统

## 一、实验目的
### 1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
### 2.掌握面向对象的类设计方法（属性、方法）；
### 3.掌握类的继承用法，通过构造方法实例化对象；
### 4.学会使用super()，用于实例化子类；
### 5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二、业务要求
### 1.说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
### 2.对象：
            Person(ID、name、sex)
            Student i(ID:5,name:杰木,sex:男)
            Teacher a(ID:1,name:袁潇芸,sex:女,taught:生物进化论)
            Teacher b(ID:2,name:高亮,sex:男,taught:战争心理学)
            Teacher c(ID:3,name:董梓潇,sex:男,taught:演讲口才与公众表达)
            Teacher d(ID:4,name:贾忱健,sex:男,taught:动物肢体语言学)
            Curriculum e(ID:YXY-HZ,title:生物进化论,place:教100,time:7:50-9:40,a.name,a.sex)
            Curriculum f(ID:GL-CS,title:战争心理学,place:教101,time:9:40-12:05,a.name,a.sex)
            Curriculum g(ID:DZX-LZR,title:演讲口才与公众表达,place:教102,time:13:30-15:05,a.name,a.sex)
            Curriculum h(ID:JCJ-LJ,title:动物肢体语言学,place:教103,time:19:00-21:25,a.name,a.sex)
## 三、实验要求
### 1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
### 2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 ）；模拟学生退课操作，再打印课程信息。
### 3.编写实验报告。
## 四、实验过程
### 1.根据实验要求，建立父类：人员类Person,对象属性包含：人员编号，姓名，性别。
### 2.建立子类，教师类，继承父类的方法，并添加特有属性，所授课程。
### 3.建立子类，学生类，继承父类的方法，并添加特有属性，所选课程。
### 4.建立课程类:
         1)添加属性ID,title,place,time,tcr,tsex。
         2)构造方法Curriculum,通过this.给添加的属性赋值。
### 5.创建Test测试类(主类)，要求如下：
         1)创建四个老师a,b,c,d分别赋值。
         2)创建四个课程e,f,g,h分别赋值。
         3)创建一个学生i并且赋值。
         4)打印所有课程信息。
         5)利用while和switch函数实现一位学生多次随意选课。
         6)打印选完课的学生的已选课信息。
         7)询问是否要退课，利用if判断
         8)利用if判断输入的要退课的数量是否正确
         9)利用while和switch函数实现一位学生多次随意退课。
        10)打印学生退完课之后的课程信息。
## 五、流程图
![实验运行截图](https://github.com/1810834412/javatext3/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)
## 六、核心代码
### Student类：
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
### Person类：
 Person(int ID,String name,String sex){
        this.ID=ID;
        this.name=name;
        this.sex=sex;
### Curriculum类：
 Curriculum(String ID,String title,String place,String time,String tcr,String tsex){
        this.ID=ID;
        this.title=title;
        this.place=place;
        this.time=time;
        this.tcr=tcr;
        this.tsex=tsex;
    }
### Teacher类：
 Teacher(int ID, String name, String sex,String taught) {
        super(ID, name, sex);
        this.taught=taught;
    }
### Text类：
#### 选课：
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
#### 退课：
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
## 七、实验结果
![实验运行截图](https://github.com/1810834412/javatext3/blob/main/%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C.png)
## 八、实验感想
    首先，通过这次实验，我对子类父类更加的熟悉，对子父类的继承性更加的了解，学会使用super()，用于实例化子类。其次，掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。并且我对于静态变量的理解更深了。最后，通过这次实验，我自己的独自解决问题的能力得到了提升，对代码的编写能力更强了！
