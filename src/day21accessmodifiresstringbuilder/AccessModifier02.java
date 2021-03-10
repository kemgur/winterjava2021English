package day21accessmodifiresstringbuilder;

public class AccessModifier02 {

	/*
	1) To access a class member in another class you have 2 ways;
	 		a) You can use "class name" ==> Use that way for static class members
	 		b) You can use object of the class. ==> Use that way for "non-static class member"
	 	2) If a class member is private, you cannot access to it from another classes.
	 	3) If you do not type anything for access modifier, it means access modifier is "default".
	 	NOTE: If a class member has "default" access modifier, then you cannot access to it from another packages.
	 		"default" and "package private" are synonyms(es anlamli)
	 	4) In java, some classes can be "child" of another classes.
	 */
	public static void main(String[] args) {
	
		AccessModifier01 obj1 = new AccessModifier01();
		System.out.println(obj1.name);//Ali Can
		System.out.println(obj1);
		
		
	}	

	

}
