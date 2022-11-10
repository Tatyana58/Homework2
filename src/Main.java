public class Main {
    public static void main(String[] args) {
        System.out.println("Actions on variables (Изучение переменных и их действия)");
        //Задание 1
        var dog = 8.0;
        System.out.println("dog =" + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);
        //Задание 2
        dog = dog + 4;
        System.out.println("increased the value of the variable by + 4");
        System.out.println("dog =" + dog);
        cat = cat + 4;
        System.out.println("cat = " + cat);
        paper = paper + 4;
        System.out.println("paper = " + paper);
        //Задание 3
        System.out.println("reduced the value of the variable by : ");
        dog = dog - 3.5;
        System.out.println("dog -3,5  =" + dog);
        cat = cat - 1.6;
        System.out.println("cat - 1,6 = " + cat);
        paper = paper - 7639;
        System.out.println("paper - 7639 = " + paper);
        //Задание 4
        var friend = 19;
        System.out.println("friend =" + friend);
        friend = friend + 2;
        System.out.println("friend +2 =" + friend);
        friend = friend / 7;
        System.out.println("friend/7 =" + friend);
        //Задание 5
        var frog = 3.5;
        System.out.println("frog =" + frog);
        frog = frog * 10;
        System.out.println("frog*10 =" + frog);
        frog = frog / 3.5;
        System.out.println("frog/3.5 =" + frog);
        frog = frog + 4;
        System.out.println("frog+4 =" + frog);
        //Задание 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var summBoxer = boxer1 + boxer2;
        System.out.println("Сумма веса двух боксеров = " + summBoxer);
        var difBoxer = boxer1 - boxer2;
        System.out.println("Разница между весом двух боксеров = " + Math.abs(difBoxer));
        //Задание 7
        difBoxer = boxer2 - boxer1;
        System.out.println("Разница между весом двух боксеров 1 способ = " + difBoxer);
        difBoxer = boxer2 % boxer1;
        System.out.println("Разница между весом двух боксеров 2 способ (%) = " + difBoxer);
        //Задание 8
        var totalTime = 640;
        var time1Worker = 8;
        var totalEmployees = totalTime / time1Worker;
        System.out.println("Всего работников в компании "+totalEmployees+" человек");
        totalEmployees=totalEmployees+94;
        time1Worker=time1Worker*totalEmployees;
        System.out.println("Если в компании работает "+totalEmployees+" человека, то всего "+time1Worker+" часа работы может быть поделено между сотрудниками.");
    }
}
