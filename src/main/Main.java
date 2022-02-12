package main;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("19B00001", "Sample Student1", 3, "情報工学系");
        Student stu2 = new Student("19B00002", "Sample Student2", 2, "材料系");
        Student stu3 = new Student("19B00003", "Sample Student3", 4, "経営工学系");
        Student stu4 = new Student("19B00004", "Sample Student4", 4, "土木・環境工学系");
        Teacher tea = new Teacher("TEA00001", "Sample Teacher1", 1, "情報工学系");
        Teacher tea2 = new Teacher("TEA00002", "Sample Teacher2", 2, "情報工学系");
        Teacher tea3 = new Teacher("TEA00003", "Sample Teacher3", 1, "情報工学系");
        Course cou = new Course("CSC.T361", "オブジェクト指向設計", 2, 4);
        Course cou2 = new Course("CSC.T254", "機械学習", 2, 4);
        // 学生・教員の登録
        stu.attendCource("CSC.T361");
        stu.attendCource("CSC.T254");
        stu2.attendCource("CSC.T361");
        stu3.attendCource("CSC.T361");
        stu3.attendCource("CSC.T254");
        tea.handleCource("CSC.T361");
        tea.handleCource("CSC.T254");
        tea2.handleCource("CSC.T254");
        // 各学生の受講講義一覧を出力
        stu.getCourses();
        stu2.getCourses();
        stu3.getCourses();
        // 各教員の担当講義一覧を出力
        tea.getCourses();
        tea2.getCourses();
        // 各講義の受講生一覧・担当教員一覧・各講義一覧を出力
        cou.getCourseStudents();
        cou.getCourseTeachers();
        cou.getCourseLectures();
        cou2.getCourseStudents();
        cou2.getCourseTeachers();
        cou2.getCourseLectures();
        // 講義の公開状態を更新
        cou.getCourseInfo();
        CourseManager.editCourseStatus("CSC.T361", true);
        CourseManager.editLecture("CSC.T361", 14, "期末試験", "2022-02-15", "演習");
        stu4.attendCource("CSC.T361");
        tea3.handleCource("CSC.T361");
        // 注：今回の実装ではオブジェクトが参照渡しになっており不要だが、実際にDBを使用する際は必要
        Database.notifyObservers();
        cou.getCourseInfo();
        cou.getCourseStudents();
        cou.getCourseTeachers();
        cou.getCourseLectures();
    }
}
