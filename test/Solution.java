package test;
//Created by Tigrenok on 30.06.2017.
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
/*
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//запрашиваем имена всех котов
        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandPa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(catGrandMa,motherName);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


//выводим на печать всех котов
        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }
        //конструктор, когда есть только папа
        Cat(String name, Cat parent) {
            this.name = name;
            this.father = parent;
        }
//конструктор, когда есть только мама - поменял местами порядок переменных в параметрах метода
        Cat(Cat parent, String name) {
            this.name = name;
            this.mother = parent;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }


        @Override
        public String toString() {
            if ((mother == null) && (father == null))
                return "Cat name is " + name + ", no mother " + ", no father";
            else if (!(mother == null) && (father == null))
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else if ((mother == null) && !(father == null))
                return "Cat name is " + name + ", no mother " + ", father is " + father.name;
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}