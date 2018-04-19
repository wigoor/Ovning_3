public class C {

    private static int totaltAntal;
    private int id[];

    public void C() {

        totaltAntal++;
        id[totaltAntal] = totaltAntal;
    }

    public static int getTotaltAntal() {

        return totaltAntal;
    }

    public int getId(int ID) {

        return id[ID];
    }
}
