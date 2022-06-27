class BeerTester
{
public static void main(String a[])
{

   Beer br = new Beer();
    br.price = 190.00;
    br.alcohalicContent = "7.2%";
    br.quantity = "750ml";
     br.mfgDate = "12 april 2032";
      br.expiry = "best before 36months";
   br.toGetKick();
System.out.println(br.price+" : "+br.alcohalicContent+" : "+br.quantity+" : "+br.quantity+" : "+br.mfgDate+" : "+br.expiry);
}
}