public class EstacionDeTren
{
    private String ciudad;
    private TicketMachine maquina1;
    private TicketMachine maquina2;
    
    /**
     * Constructor de la estacion de tren
     */
    public EstacionDeTren(String nombreCiudad, int Ticket1, int Ticket2)
    {
        ciudad = nombreCiudad;
        maquina1 = new TicketMachine(Ticket1);
        maquina2 = new TicketMachine(Ticket2);    
    }
    
    /**
     * Simula la venta de un billete en la maquina 1
     */
    public void ventaBilleteMaquina1()
    {
        maquina1.insertMoney(500);
        maquina1.printTicket();
    }
    
    /**
     * Simula la venta de un billete en la maquina 2
     */
    public void ventaBilleteMaquina2()
    {
        maquina2.insertMoney(600);
        maquina2.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado
     * por la maquina 1 hasta el momento
     */
    public int ventaTotalMaquina1()
    {
        return maquina1.getTotal();
    }
    
    /**
     * Devuelve el total de dinero recaudado
     * por la maquina 1 hasta el momento
     */
    public int ventaTotalMaquina2()
    {
        return maquina2.getTotal();
    }
    
    /**
     * Devuelve el total de dinero recaudado por las maquinas 
     * de la estacion hasta el momento
     */
    public int ventaTotal()
    {
        return maquina1.getTotal() + maquina2.getTotal();
    }
    
    /**
     * Imprime por pantalla la cantidad recaudada por la
     * maquina 1, por la maquina 2 y el total de ambas
     */
    public void printTickets()
    {
        System.out.println("La cantidad total es " + ventaTotal());
        System.out.println("La cantidad de la maquina1 es " + ventaTotalMaquina1());
        System.out.println("La cantidad de la maquina2 es " + ventaTotalMaquina2());
    }
}