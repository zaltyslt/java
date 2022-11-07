
import java.util.ArrayList;

import philatelist.Philatelist;
import philatelist.PostStamp;

public class MyPhilatelist implements Philatelist {//©KS
ArrayList<PostStamp> postStamps;
	public MyPhilatelist() {
		postStamps = new ArrayList<PostStamp>();
	}

	@Override
	public void addToCollection(PostStamp postStamp) {
		if(postStamp != null && postStamp.getName() != null && 
				!postStamp.getName().isEmpty()  
				) {
			if(!postStamps.contains(postStamp)) {
			
			this.postStamps.add(postStamp);
			}
		}else {
			throw new IllegalArgumentException();
		}

	}

	@Override
	public double getAveragePostStampPrice() {
		double sum = 0;
		for(PostStamp postStamp : this.postStamps)
		{
			sum += postStamp.getMarketPrice();
		}
			
			return sum / getNumberOfPostStampsInCollection();
	}

	@Override
	public int getNumberOfPostStampsInCollection() {
		
		return postStamps.size();
	}

	@Override
	public PostStamp getTheMostExpensivePostStamByMarketValue() {
		double maxPrice = 0.0;
		PostStamp theMostExpensiveOne = null;
		for (PostStamp postStamp : postStamps) {
			if(maxPrice < postStamp.getMarketPrice()) {
			maxPrice = postStamp.getMarketPrice();
			theMostExpensiveOne = postStamp;
			}
		}
		
		return theMostExpensiveOne;
	}

}
