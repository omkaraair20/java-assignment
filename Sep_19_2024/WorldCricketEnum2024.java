enum Cricket{
	India,
	Austria,
	Pakistan,
	Afghanistan,
	SriLanka,
	NewZealand,
	England,
	SouthAfrica,
	Netherlands,
	WestIndies
}

public class WorldCricketEnum2024 {

	public static void main(String[] args) {
		   Cricket team=Cricket.India;
		   
		   switch(team) {
		   case India:
			   System.out.println("It's India!");
			   break;
		   case Pakistan:
			   System.out.println("It's Pakistan!");
			   break;
		   default:
			   System.out.println("It's is not cricket team tournament");
		   }
		   
		   Cricket[] cricketteam=Cricket.values();
		   for(Cricket cricket:cricketteam) {
			   System.out.println(cricket);
		   }

	}

}
