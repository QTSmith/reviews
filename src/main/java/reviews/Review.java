package reviews;

public class Review {
	
	//Instance variables
	private long id;
	private String breed;
	private String imageUrl;
	private String cuteness;
	private String opinion;
	private String funfacts;
	private String tag;
	
	//Constructor
	public Review(long id, String breed, String imageUrl, String cuteness, String opinion, String funfacts, String tag){
	 this.id = id;
	 this.breed = breed;
	 this.imageUrl = imageUrl;
	 this.cuteness = cuteness;
	 this.opinion = opinion;
	 this.funfacts = funfacts;
	 this.tag = tag;
	 
	}
	//Getters
	public long getId() {
		return id;
	}
	public String getTitle() {
		return breed;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getCuteness() {
		return cuteness;
	}
	public String getOpinion() {
		return opinion;
	}
		public String getFunFacts() {
		return funfacts;
	}
	public String getTag() {
		return tag;
	}
	

}
