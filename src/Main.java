public class Main {
    public static void main(String[] args) {
        Mathe add = (x, y) -> x + y;
        Mathe mult = (int x, int y) -> { return x * y;};
        System.out.println(add.fkt(2,5));


        Printable printable = s ->  {System.out.println("Meow " + s); return "Meow";};
        printThing(printable);
        Main.printThing(printable);


        MyFrame myFrame = new MyFrame();
    }

    interface Mathe {
        int fkt(int x, int y);
    }

    public static void printThing(Printable thing){
        thing.print("!");
    }
}