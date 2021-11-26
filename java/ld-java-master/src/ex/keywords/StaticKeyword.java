package ex.keywords;
// INSTANT PRACTICE : PARTICIPANTS ATTENDING A ZOOM TRAINING.
public class StaticKeyword {
	public static void main(String[] args) {
//		static variables are accessed by the class name
		Learner.training = "JBE";
		System.out.println(Learner.training);
		Learner.getTrainingDetails();
//		cannot access instance method without creating an instance.
//		Learner.getTraineeDetails();

//		creating instance
		Learner roelLearner = new Learner();
		roelLearner.traineeName = "Roel Joseph";
		System.out.println(roelLearner.traineeName);
		
		
		Learner josarLearner = new Learner();
		josarLearner.traineeName = "Josar";
		System.out.println(josarLearner.traineeName);		
		
		roelLearner.traineeName =  "Roel Joseph Maturino";
		System.out.println(roelLearner.traineeName);
		
		josarLearner.traineeName = "Josar Sarte";
		System.out.println(josarLearner.traineeName);	
		
		Learner.training = "Java";
		System.out.println(Learner.training);
		System.out.println(roelLearner.training);
		System.out.println(josarLearner.training);
	}
}

class Learner {
//	BELONGS TO THE ALL LEARNERS (STATIC)
//	static String trainining = "Java Back End Training";
	static String training;
//	BELONGS TO EACH LEARNER (INSTANCE)
	String traineeName;
// static method	
	public static void getTrainingDetails() {
		System.out.println(training);
//		instance varaibles cannot be directly accessed static methods.
//		System.out.println(traineeName);
	}
	
// instance method
	public void getTraineeDetails() {
		System.out.println(training);
		System.out.println(traineeName);
	}
}