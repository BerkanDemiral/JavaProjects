package oopOdev;

public class Main {

    public static void main(String[] args) {
        Programming program1 = new Programming(
                1,
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                ".../javalogo.jpg",
                "Engin Demirog"
        );
        Programming program2 = new Programming(
                1,
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                ".../c#logo.jpg",
                "Engin Demirog"
        );
        Programming program3 = new Programming(
                1,
                "Programlamaya Giriş İçin Temel Kurs",
                ".../pythonlogo.jpg",
                "Engin Demirog"
        );

        Categories categorie1 = new Categories(
                1,
                "Programming"
        );

        Programming[] programs = {program1,program2,program3};
        Categories[] categories = {categorie1};

        System.out.println("----Program İsimleri-------");
        for(Programming program : programs){
            System.out.println(program.name);
        }
        System.out.println("\n-----Kategori İsimleri-------");
        for(Categories categorie : categories){
            System.out.println(categorie.name);
        }

        ProgrammingManage programmingManage = new ProgrammingManage();
        programmingManage.changeName(program3,"Programlamaya Giriş Kursu");

        System.out.println("\n----Metod Kullanımı Sonrası Program İsimleri------");
        for(Programming program : programs){
            System.out.println(program.name);
        }
        System.out.println("--------------------");
        programmingManage.joinToCourse(program2);

    }
}
