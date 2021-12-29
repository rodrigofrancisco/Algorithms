public class Main {

    private void call(int i) {
        switch (i) {
            case 1:
            case 2:
                System.out.print("even ");
                break;
            default:
                System.out.print("outside ");
            case 3:
                System.out.print("rains ");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.call(1);
        m.call(3);
        m.call(10);
        m.call(2);
    }
}
