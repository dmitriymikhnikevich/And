import java.util.Scanner;

public class Name {
    public static void main(String[] args)
    {
        Scanner Viach = new Scanner(System.in);
        String str1 = "Вячеслав";
        String str2 = Viach.nextLine ();;
        if (str2.equals(str1)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

