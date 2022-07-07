public class WeaponTester{
    
	public static void main(String a[]){
	
	WeaponDTO we = new WeaponDTO();
	
	we.setName("Gun");
	we.setType("AK47");
	we.setMagzine(20);
	
	System.out.println("name of the weapon "+ we.getName());
	System.out.println("type of gun "+ we.getType());
	System.out.println("magzines to be loaded in gun "+ we.getMagzine());
	}
	}