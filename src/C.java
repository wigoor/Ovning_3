public class C {

    private static int totaltAntal;
    private int id;

    public void C() {

        totaltAntal++;
        id = totaltAntal;
    }

    public static int getTotaltAntal() {

        return totaltAntal;
    }

    public int getId() {

        return id;
    }
}
