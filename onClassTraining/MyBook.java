package onClassTraining;

class MyBook extends Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook mb1=new MyBook();
		mb1.setTitle("Book 1");
		String value=mb1.getTitle();
		System.out.println("Title of the book is: "+value);
	}

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		title=s;
	}

}
abstract class Book{
String title;

	abstract void setTitle(String s);

	String getTitle(){
		return title;
	}

}
