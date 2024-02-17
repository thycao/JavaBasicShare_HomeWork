package thy.com.homework.JavaBasic.JavaBasic5;

import java.util.ArrayList;

public class JavaBasic4_withArrayList {
    static ArrayList<String> EmployeeList = new ArrayList<String>();

    public static void AddEmpyemployeeInformation() {
        EmployeeList.add("Name: Hoang Nguyen");
        EmployeeList.add("Email: hoangnguyen@gmail.com");
        EmployeeList.add("Address: Sai Gon");
        for (int i = 0; i < EmployeeList.size(); i++) {
            System.out.println(EmployeeList.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("-----------In So chan tu 0-50------------");
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                arraylist.add(i);
                System.out.println(i);
            }

        }
        System.out.println("----------------------------------------------------------------");
        AddEmpyemployeeInformation();
        System.out.println("------------------------------END-------------------------------");
    }

}
