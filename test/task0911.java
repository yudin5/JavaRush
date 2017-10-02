//package com.javarush.task.task09.task0911;

import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
Требования:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
*/

public class task0911 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
