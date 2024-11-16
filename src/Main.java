//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //cоздать два объекта Child(), Child(“Ivan”)
        System.out.println("Первое обращение: сработают static блоки и instance блоки");
        Parent child1 = new Child();
        System.out.println("-------------------------");

        System.out.println("Второе обращение: сработают только instance блоки");
        Parent child2 = new Child("Ivan");
        System.out.println("-------------------------");
    }
}