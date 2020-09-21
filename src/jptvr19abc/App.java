/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19abc;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println("----ABC----");
        /**
         * создаем массив из символов алфавита abc[33]
         * попросим ввести строку пользователя (str)
         * проходим по массиву abc и ищем индекс вхождения этого символа в str
         * если возвращается -1 то такого символа нет - записываем его в массив 
         * нехватающих символов notAbc[33];
         * если -1 не встречался то текст содержит все буквы алфавита 
         * если -1 сработал, то выводим набор символов, которые отсутсвуют в тексте
         */
        Scanner scanner = new Scanner (System.in);
        
        int[] abc = new int [33];
        System.out.println("Введите строку пользователя : ");
        String str = scanner.nextLine();
        System.out.println("Кол-во символов : " + str.length() );
        char [] chStr = str.toCharArray();
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
}
