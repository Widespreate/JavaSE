package inter2;

public class PrintB  implements lnkBox ,Paper {
    @Override
    public void printSize() {
        System.out.println("A6");
    }

    @Override
    public void printColor() {
        System.out.println("彩色");
    }
}
