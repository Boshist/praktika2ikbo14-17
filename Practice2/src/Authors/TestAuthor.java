package Authors;

public class TestAuthor {
	
	public static void main(String[] args) {
		
		Author Auth1 = new Author("MyName", "emailMyName@example.com", 'M');
		System.out.println(Auth1);
		System.out.println(Auth1.getName());
		System.out.println(Auth1.getEmail());
		Auth1.setEmail("NotAFake@mail.ru");
		System.out.println(Auth1);
		System.out.println(Auth1.getGender());
	}
}
