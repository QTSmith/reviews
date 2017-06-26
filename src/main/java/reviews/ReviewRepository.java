package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	//Creating review map
	Map<Long,Review> reviewMap = new HashMap<Long, Review>();
	
	//Constructor
	public ReviewRepository() {
    
	//Constructor
	Review review1 = new Review(02537, "Hairless Bunny Rabbit", "/images/baldbunny.jpg", "10/10", "This naked Bunny is so stinking cute. Reminds me of some adorabble grandpa!", "Baby bunnies are called kits, and are born blind and hairless", "tag");
	reviewMap.put(review1.getId(),review1);
	Review review2 = new Review(84623, "Hairless Cat", "/images/baldcat.jpg", "8/10", "The wrinkles on this cutie, and beautiful eyes make me want a bald cat!", "American Sphynx cats are the results of selective breeding of a naturally occuring genetic mutation.", "tag");
	reviewMap.put(review2.getId(),review2);
	Review review3 = new Review(62438, "Hairless Hedgehog", "/images/baldhedgehog.jpg", "5/10", "This normally adorable animal takes on a strange look wothout his quills. Not a huge fan", "Without his spines this hedgehog is defenseless. He cannot be released into the wild, so volunteersat his shelter massage oil into his skin daily as part of his care.", "tag");
	reviewMap.put(review3.getId(),review3);
	Review review4 = new Review(75935, "Hairless Racoon", "/images/baldracoon.jpg", "8/10", "This little guy is totally adorable with his inquisitive face", "This raccon is probably suffering from a form of alopecia", "tag");
	reviewMap.put(review4.getId(),review4);
	Review review5 = new Review(93745, "Hairless Squirrel", "/images/baldsquirrel.jpg", "9/10", "I am an avid 'Ninja Turtle' fan, so this little guy is giving me Master Splinter vibes and I love it!", "Most squirrel baldness occurs from mites, or mange. This particular squirrel is perfectley healthy, yet bald. Scientest are baffled as to why.", "tag");
	reviewMap.put(review5.getId(),review5);
	Review review6 = new Review(39562, "Haireless Horse", "/images/hairlesshorse.jpg", "10/10", "This majestic creature has a ghostly feel that I love.", "Unfortunatly for this beautiful creature, those born with the gene tend to die between a few weeks and three years.", "tag"); 
	
	}	
	//Method find all values in review map
    public Collection<Review> findAll() {
    	return reviewMap.values();
    }
    //Find one review in the map
    public Review findOne(Long id) {
    	return reviewMap.get(id);
    }
}