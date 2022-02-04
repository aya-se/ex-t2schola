package main;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("19B00001", "Sample Student1", 3, "情報工学系");
        Teacher tea = new Teacher("TEA00001", "Sample Teacher1", 1, "情報工学系");
        Course cou = new Course("CSC.T361", "オブジェクト指向設計", 2, 4);
        stu.attendCource("CSC.T361");
        tea.handleCource("CSC.T361");
    }
}
