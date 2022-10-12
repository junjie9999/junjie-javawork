package methodref;

public class Test {
	public static void main(String[] args) {
		School sch=new School();
		Noteable nt=sch::noteLecture;
		nt.note("lecture nt ");
		
		Noteable nt1=sch::noteObservation;
		nt1.note("note nt1");
		
		Noteable nt2=sch::noteOnlineClass;
		nt2.note("online nt2");
		
		School mySchool=new School();
		mySchool.noteLecture("lecture");
		mySchool.noteObservation("lecture");
		mySchool.noteOnlineClass("lecture");
	}

}
