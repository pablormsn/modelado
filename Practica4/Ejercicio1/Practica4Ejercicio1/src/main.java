public class main {

    public static void main(String[] args){
        XService xservice = new XService();
        ClientA clientA = new ClientA(xservice);
        ClientB clientB = new ClientB(xservice);
        ClientC clientC = new ClientC(xservice);

        System.out.println("Cliente A: ");
        clientA.rutina1();
        clientA.rutina2();
        clientA.rutina3();
        clientA.rutina4();

        System.out.println("Cliente B: ");
        clientB.rutina1();
        clientB.rutina2();
        clientB.rutina3();
        clientB.rutina4();

        System.out.println("Cliente C: ");
        clientC.rutina1();
        clientC.rutina2();
        clientC.rutina3();
        clientC.rutina4();



    }
}
