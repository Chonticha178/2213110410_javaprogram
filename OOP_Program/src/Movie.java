public class Movie {
	private String id;
	private String name;
	private Director director;
	
	public Movie(String id,String name,Director director) {
		this.id=id;
		this.name=name;
		this.director=director;
	}
	public Movie() {
		this.id=null;
		this.name=null;
		this.director=null;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Director director() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public String toString() {
		return getId()+getName()+"direct by"+director;
	}
}
