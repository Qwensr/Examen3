package task1;

import java.util.Scanner;

public class UserAccountManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное количество учетных записей");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        BasicUserAccount userAccountManager = new BasicUserAccount(capacity);

        while (true) {
            System.out.println("Ввыберите действие");
            System.out.println("1. Создать аккаунт");
            System.out.println("2. Обновить аккаунт");
            System.out.println("3. Удалить аккаунт");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите имя");
                    String createUsername = scanner.nextLine();
                    System.out.println("Введите пароль");
                    String createPassword = scanner.nextLine();
                    userAccountManager.createAccount(createUsername, createPassword);
                    break;
                case 2:
                    System.out.println("Введите имя");
                    String updateUsername = scanner.nextLine();
                    System.out.println("Введите пароль");
                    String newPassword = scanner.nextLine();
                    userAccountManager.updateAccount(updateUsername, newPassword);
                    break;
                case 3:
                    System.out.println("Введите имя");
                    String deleteUsername = scanner.nextLine();
                    userAccountManager.deleteAccount(deleteUsername);
                    break;
                case 4:
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Вы выбрали неправильное дейтсвие проверьте заново");
            }
        }
    }
}

