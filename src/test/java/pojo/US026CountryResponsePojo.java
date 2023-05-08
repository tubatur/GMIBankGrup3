package pojo;

public class US026CountryResponsePojo{
	private String name;
	private int id;
	private Object states;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
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
			"US026CountryResponsePojo{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",states = '" + states + '\'' + 
			"}";
		}
}
