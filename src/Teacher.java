//Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
// Create 3 subclasses MathTeacher, ChemistryTeacher and
// PianoTeacher that would have it their own features and behaviour. Test all 4 classes

public class Teacher {
    String teacherName;
    String teacherId;
    void homework(){
        System.out.println("Doing homework makes good student");
    }void grade(){
    System.out.println("Practice more to get better grade");
      }void attend(){
    System.out.println("All student must attend the class");
}
void quiz(){
    System.out.println("Do all quiz's on time  ");
}
}class Mathteacher extends Teacher{
    String test;
    String homework;
    void grade(){
        System.out.println("Grade a is great ");
    }
}class ChemistryTeacher extends Teacher{
    String grade;
    String subject;
    void practice(){
        System.out.println("Practice everyday ");
    }
}class PianoTeacher extends Teacher{
    String classic;
    String tools;
    void fun(){
        System.out.println("Music class is fun ");
    }

    public static void main(String[] args) {
        Teacher tech = new Teacher();
        tech.teacherName="Asel";
        tech.teacherId="87uy";
        tech.attend();

        Mathteacher tech1 = new Mathteacher();
        tech1.teacherName="Kare";
        tech1.teacherId="Kare";
        tech1.grade();
        tech1.test="Finish test on time ";


    }

}
