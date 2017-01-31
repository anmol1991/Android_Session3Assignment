class Assignment2{

	public static void main (String s[]){
		AssigSubclass a = new AssigSubclass();
		a.printSame();
	} 
}

class AssigSubclass{
	String s1 = "anmol";
	String s2 = "anmol";
	Boolean same;
	AssigSubclass(){
		same = true;
	}
	
	void printSame()
	{	
		if(s1 == s2){
			same = true;
			System.out.println("same = " + same);
		}
		else{
			same = false;
			System.out.println("same = " + same);
		}
	}
}
