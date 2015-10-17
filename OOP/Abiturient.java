public class Abiturient implements Comparable<Abiturient> {
	
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int phone;
	private int rating;
	
	public Abiturient() {
	}
	public Abiturient(int id, String surname, String name, String patronymic, String address, int phone, int rating) {
		setId(id);
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setAddress(address);
		setPhone(phone);
		setRating(rating);
	}
	
	@Override
	public int compareTo (Abiturient obj){
		Abiturient tmp = (Abiturient)obj;
		if (this.getRating()<tmp.getRating())
			return -1;
		else if (this.getRating()>tmp.getRating())
			return 1;
		else
			return 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
