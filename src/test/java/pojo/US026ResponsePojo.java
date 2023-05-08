package pojo;

public class US026ResponsePojo {
	private String firstName;
	private String lastName;
	private String mobilePhoneNumber;
	private String address;
	private int id;
	private String userName;
	private int userId;
	private String email;
	private String ssn;
	private String createDate;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber){
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getMobilePhoneNumber(){
		return mobilePhoneNumber;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}

	public String getCreateDate(){
		return createDate;
	}

	@Override
 	public String toString(){
		return 
			"US026Response{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",mobilePhoneNumber = '" + mobilePhoneNumber + '\'' + 
			",address = '" + address + '\'' + 
			",id = '" + id + '\'' + 
			",userName = '" + userName + '\'' + 
			",userId = '" + userId + '\'' + 
			",email = '" + email + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",createDate = '" + createDate + '\'' + 
			"}";
		}
}
