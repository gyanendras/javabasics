package com.cgi.b3;

import com.cgi.b3.exceptions.NotCheckedForCovidException;

public class Student extends Person implements ViralDiseaseChecks,ExampleMarker,Comparable<Student>{

    public static String  schoolName = "ABC";
	private int rollnum;
	private Week dday;
	
	
	
	

	enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN

	}
	
	static int[][] game = new int[6][6];

	Student(String bloodgroup, String birthmark) {
		super(bloodgroup, birthmark);
		name = "default";
		rollnum = 0;
	}

	Student(String bloodgroup, String birthmark, String stdname, int rn) {
		super(bloodgroup, birthmark);
		name = stdname;
		rollnum = rn;
	}

	Student(String bloodgroup, String birthmark, String stdname, int rn, Week day) {
		super(bloodgroup, birthmark);
		name = stdname;
		rollnum = rn;
		dday = day;
	}

	// Method overriding the method of parent class with same name and parameters.
	String introduce() {
		return "I am a student My Name is " + name + " Duty day is " + dday + "school is " + schoolName + "rollnum is"+ rollnum;
	}
	
	
	//method overloading whne same name but different parameters
    String introduce(boolean brief) {
    	return "I am a student My Name is " + name ;
    }

	public void printArgs(String... ab) {
		System.out.println(ab.length + ab[0]);
	}
	
	
	@Override
	public String getMedicalInfo() {
		
		return bloodgroup +" "+ birthmark ;
	}

	public static void main(String[] args) {

		int[][] arr2D = { { 2, 4, 6, 8 }, { 1, 3, 6, 9 }, { 2, 8, 12, 16 }, { 1, 1, 1, 1 } };

		for (int j = 0; j < arr2D.length; ++j) {
			for (int i = 0; i < arr2D[j].length; ++i) {
                if(i==2)continue;
				System.out.print(" " + arr2D[j][i]);

			}
			System.out.println();
		}
		// int[][][] arr3D ;
		// int[][][][] arr4D ;

		Student ron = new Student("O+","moleOnEar","Ron", 11);
		ron.schoolName = "dEF";
		ron.rollnum = 12;
		Student simi = new Student("O+","moleOnEar","Simi", 2);
		Student sonu = new Student("O+","moleOnEar","Sonu", 3);
		Student monu = new Student("O+","moleOnEar", "Monu", 4, Week.SAT);
		Student pat = new Student("O+","moleOnEar", "Pat", 5, Week.MON);

		Student[] stdArr = { ron, simi, sonu };
		int sum = 0;

		for (int i = 0; i < stdArr.length; i++) {
			sum = sum + stdArr[i].rollnum;
		}

		float avg = sum / stdArr.length;

		System.out.println("the avg roll num is " + avg);

		Student anony = new Student("O+","moleOnEar");

		String s = ron.introduce();

		System.out.println(s);

		String r = simi.introduce();
		System.out.println(r);

		String d = anony.introduce();
		System.out.println(d);
		System.out.println(monu.introduce());
		System.out.println(Week.MON.ordinal() < Week.TUE.ordinal());
		System.out.println(Week.MON.ordinal() - Week.SAT.ordinal());

		String[] s1 = { "one", "two", "threee" };

		pat.printArgs(s1);
		pat.printArgs("five", "six", "seven");
		String password = "he4llO";
		boolean cond1 = password.matches(".*[A-Z].*");
		
		System.out.println(password.matches(".*[A-Z].*"));
		boolean cond2 = password.matches(".*\\d.*");
		System.out.println(password.matches(".*\\d.*"));
		
		Human s11 = new Student("O+","moleOnEar");
		Visitor vs1 = new Visitor("O+","moleOnEar");
        if (vs1 instanceof Human ) {
        	System.out.println("Take some action as per disease check");
        }
	}

	@Override
	public boolean checkForCovid() throws NotCheckedForCovidException {
		if(true) throw new NotCheckedForCovidException();
		if(true) throw new ExamPostPonedExeception("Exam delayed");
		return false;
	}

	@Override
	public boolean checkforFlu() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name) ;
	}

}
