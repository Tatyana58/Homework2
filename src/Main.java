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
    }
}