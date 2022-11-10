public class Main {
    public static void main(String[] args) {
        System.out.println("Actions on variables (Изучение переменных и их действия)");

        var dog=8.0;
        System.out.println("dog ="+dog);
        var cat = 3.6;
        System.out.println("cat = "+cat);
        var paper = 763789;
        System.out.println("paper = "+paper);
        dog=dog+4;
        System.out.println("increased the value of the variable by + 4");
        System.out.println("dog ="+dog);
        cat = cat+4;
        System.out.println("cat = "+cat);
        paper = paper+4;
        System.out.println("paper = "+paper);
        System.out.println("reduced the value of the variable by : ");
        dog=dog-3.5;
        System.out.println("dog -3,5  ="+dog);
        cat=cat-1.6;
        System.out.println("cat - 1,6 = "+cat);
        paper=paper-7639;
        System.out.println("paper - 7639 = "+paper);
        var friend = 19;
        System.out.println("friend ="+friend);
        friend = friend+2;
        System.out.println("friend +2 ="+friend);
        friend = friend/7;
        System.out.println("friend/7 ="+friend);
        var frog= 3.5;
        System.out.println("frog ="+frog);
        frog=frog*10;
        System.out.println("frog*10 ="+frog);
        frog=frog/3.5;
        System.out.println("frog/3.5 ="+frog);
        frog=frog+4;
        System.out.println("frog+4 ="+frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var summBoxer = boxer1+boxer2;
        System.out.println("Сумма веса двух боксеров = "+summBoxer);
        var difBoxer = boxer1-boxer2;
        System.out.println("Разница между весом двух боксеров = "+Math.abs(difBoxer));
        difBoxer = boxer2-boxer1;
        System.out.println("Разница между весом двух боксеров 1 способ = "+difBoxer);
        difBoxer = boxer2%boxer1;
        System.out.println("Разница между весом двух боксеров 2 способ (%) = "+difBoxer);

    }
}