package makecarex;

public class MainClass {
	public static void main(String[] args) {
		StarCar starCarLowGrade = new StarCarLowGrade(CarSpecs.COLOR_BLUE, CarSpecs.TIRE_NORMAL, CarSpecs.DISPLACEMENT_2000, CarSpecs.HANDLE_NORMAL);
		StarCar starCarHighGrade = new StarCarLowGrade(CarSpecs.COLOR_RED, CarSpecs.TIRE_WILD, CarSpecs.DISPLACEMENT_2200, CarSpecs.HANDLE_NORMAL);
		
		starCarLowGrade.getSpec();
		System.out.println();
		
		starCarHighGrade.getSpec();
	}

}
