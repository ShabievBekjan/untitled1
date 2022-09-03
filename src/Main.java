import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     User user = new user();
        Scanner scanner = new Scanner(System.in);

        while (true){
        System.out.println("Введите имя");
        String name = scanner.next();
        try{
          user.setName(name);
            System.out.println("Успешно. Ваше имя " + user.getName());
            System.out.println("Введите возраст");
            Integer age = scanner.nextInt();
            user.setAge(age);
            System.out.println("Успешно. Ваш возраст " + user.getAge());
        } catch (illegalNamelentghException ie){
            System.out.println(ie.getMessage());
        } catch (ilegalAgeException ilegalAgeException){
            System.out.println(ilegalAgeException.getMessage());
        }
    }
    }
}