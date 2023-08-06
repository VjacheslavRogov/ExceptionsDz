package ru.geekbrains;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String uString = null;
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Введите строку: ");
            uString =  in.nextLine();
            if(uString == ""){
                throw new RuntimeException();
            }
        } catch (RuntimeException e){
            System.out.println("Пустая строка недопустима");
        }
        System.out.println("Вы ввели: " + uString);

    }
}
