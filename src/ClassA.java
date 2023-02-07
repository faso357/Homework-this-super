public class ClassA {
   static void printF(){
        System.out.println("Hello");}
} class ClassB extends ClassA {

}class ClassC extends  ClassB{

};
class Main {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.printF();
    }}