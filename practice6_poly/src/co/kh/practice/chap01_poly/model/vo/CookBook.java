package co.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;
	
	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

//	@Override
//	public String toString() {
//		return "CookBook [coupon=" + coupon + "]";
//	}

	@Override
	public String toString() {
		return "CookBook [Book [title=" + getTitle() + ", author=" + getAuthor()
				+ ", publisher=" + getPublisher() + "], coupon="+coupon+"]";
	}

	
	

}
