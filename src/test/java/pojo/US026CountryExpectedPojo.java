package pojo;

public class US026CountryExpectedPojo{
	private String name;
	private Object states;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setStates(Object states){
		this.states = states;
	}

	public Object getStates(){
		return states;
	}

	@Override
 	public String toString(){
		return 
			"US026CountryExpectedPojo{" + 
			"name = '" + name + '\'' + 
			",states = '" + states + '\'' + 
			"}";
		}
}
