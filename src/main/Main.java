package main;

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
        // 各学生の受講講義一覧を出力
        stu.getCourses();
        stu2.getCourses();
        stu3.getCourses();
        // 各教員の担当講義一覧を出力
        tea.getCourses();
        tea2.getCourses();
        // 受講生一覧・担当教員一覧・各講義一覧を出力
        cou.getCourseStudents();
        cou.getCourseTeachers();
        cou.getCourseLectures();
    }
}
