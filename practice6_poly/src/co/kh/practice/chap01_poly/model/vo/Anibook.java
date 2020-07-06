package co.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{

	private int acessAge;

	public AniBook() {
		// TODO Auto-generated constructor stub
	}
	
	public AniBook(String title, String author, String publisher, int acessAge) {
		super(title, author, publisher);
		this.acessAge = acessAge;
	}
	
	
	public int getAcessAge() {
		return acessAge;
	}

	public void setAcessAge(int acessAge) {
		this.acessAge = acessAge;
	}

//	@Override
//	public String toString() {
//		return "AniBook [acessAge=" + acessAge + "]";
//	}
	

	@Override
	public String toString() {
		return "AniBook [Book [title=" + getTitle() + ", author=" + getAuthor()
				+ ", publisher=" + getPublisher() + "], acessAge="+acessAge+"]";
	}

	
}
