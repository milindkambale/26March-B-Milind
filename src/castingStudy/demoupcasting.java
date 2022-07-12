package castingStudy;

public class demoupcasting {

	public static void main(String[] args) {
		parentclass02 obj=new childexample02();
		obj.parentclassmethod();
		((childexample02)obj).childclassmethod();
		((childexample02)obj).parentclassmethod();
		

	}

}
