package Second;
import java.util.Scanner;
public class JavaBean {
    String name;
    int marks;

    public JavaBean() {
        this.name = name;
        this.marks = marks;
    }
@Override
 public String toString(){
        System.out.println(name);
        System.out.print(marks);
      return null;
 }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        JavaBean j=new JavaBean();
        System.out.println("Enter number of Student");
        int n=s.nextInt();

        JavaBean student[]=new JavaBean[n];
        for(int i=0;i<n;i++){
            JavaBean s1=new JavaBean();
            System.out.println("Enter the Student Name:");
            j.name=s.next();
            System.out.println("Enter the Student Marks:");
            j.marks=s.nextInt();

            student[i]=j;
        }
int sum=0;
        for(int i=0;i<student.length;i++){
            System.out.println(student[i].getMarks());
            System.out.println(student[i].getName());
            sum=sum+ student[i].getMarks();
        }
        int a=sum/n;
        System.out.println("Average of Student Marks is "+a);
    }


}