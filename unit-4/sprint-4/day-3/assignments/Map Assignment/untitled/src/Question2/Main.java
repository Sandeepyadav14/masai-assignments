package Question2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter how many you want student details:");
        int n = s.nextInt();
        StudentBean[] studentBeans = new StudentBean[n];
        for (int i = 0; i < n; i++) {
            StudentBean sb = new StudentBean();
            System.out.println("Please Enter Student Name:");
            sb.name = s.next();
            System.out.println("Please Enter Student Roll Number:");
            sb.roll = s.nextInt();
            System.out.println("Please Enter Student Marks:");
            sb.marks = s.nextInt();

            studentBeans[i] = sb;
        }

        String[] city = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Please Enter city name along with student details:");
            String cityname=s.next();
            city[i]=cityname;
        }
        Map<String,StudentBean>studentobjtocountry=new HashMap<>();
        for(int i=0;i<n;i++){
            studentobjtocountry.put(city[i],studentBeans[i]);

        }
        Map<String, StudentBean> treeMap = convertToTreeMap(studentobjtocountry);


        System.out.println(treeMap);
        System.exit(1);

    }

    private static Map<String, StudentBean> convertToTreeMap(Map<String, StudentBean> studentobjtocountry) {
        Map<String, StudentBean> treeMap =new TreeMap<>();
        treeMap.putAll(studentobjtocountry);
        return treeMap;
    }

}
