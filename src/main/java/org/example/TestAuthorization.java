package org.example;

public class TestAuthorization {
    public static void main(String[] args) {
        try {
            Authorization.checkAutorizations("admin", "zimin", "zimin");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Валидация не пройдена, ошибка вводимых данных!");
            e.printStackTrace();
        } finally {
            System.out.println("Блок finnaly отработал успешно");
        }
    }
}