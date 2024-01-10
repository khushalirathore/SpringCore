package in.com.rays.instance;



public class ServiceLocatore {
	
	private static  ServiceLocatore intance;
	private ServiceLocatore () {
		
	}
	public static ServiceLocatore getInstance() {
		if (intance == null) {
			intance = new ServiceLocatore();
		
		
	}
		return intance;
	}
}
