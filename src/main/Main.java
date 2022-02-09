package main;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("19B00001", "Sample Student1", 3, "情報工学系");
        Student stu2 = new Student("19B00002", "Sample Student2", 2, "材料系");
        Student stu3 = new Student("19B00003", "Sample Student3", 4, "経営工学系");
        Teacher tea = new Teacher("TEA00001", "Sample Teacher1", 1, "情報工学系");
        Teacher tea2 = new Teacher("TEA00002", "Sample Teacher2", 2, "情報工学系");
        Course cou = new Course("CSC.T361", "オブジェクト指向設計", 2, 4);
        // 3人の異なる学生を追加
        stu.attendCource("CSC.T361");
        stu2.attendCource("CSC.T361");
        stu3.attendCource("CSC.T361");
        // 同じ教員を2回追加
        tea.handleCource("CSC.T361");
        tea.handleCource("CSC.T361");
        // 3人の学生を出力
        for (Map.Entry<String, CourseStudent> entry : cou.courseStudents.entrySet()) {
            System.out.println("受講生 : " + entry.getKey() + " : " + entry.getValue().userID);
        }
        // 同じ教員は1つのみ登録
        for (Map.Entry<String, CourseTeacher> entry : cou.courseTeachers.entrySet()) {
            System.out.println("担当教員 : " + entry.getKey() + " : " + entry.getValue().userID);
        }
        // 各講義情報
        for (int i = 0; i < 14; i++) {
            System.out.println((i + 1) + " : " + cou.lectures[i].lectureName);
        }
    }
}
