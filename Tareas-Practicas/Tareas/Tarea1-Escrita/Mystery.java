public class Mystery {
public static void main(String[] args)
{
  String nieve = "aguanieve";
  String dia = "húmedo";
  String tormenta = "nieve";
  String humedo = "tormenta";
  String clima = nieve + tormenta;
    clima(nieve, tormenta, dia);
    clima(clima, humedo, tormenta);
    clima(tormenta + "tormenta", "nieve" + nieve, clima);
    clima = "sol";
    clima("soleado", clima, humedo);
}
    public static void clima(String nieve, String tormenta, String dia)
    {
	System.out.println("una " + tormenta + " y " + dia + " para " + nieve);
    }
}


