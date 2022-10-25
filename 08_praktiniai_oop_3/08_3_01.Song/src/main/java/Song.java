
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object song) {
    	if(this == song) {
    		return true;
    	}
    	
    	if(!(song instanceof Song)){ 
    		return false;
    	}; 
    	
    	Song tempSong = (Song) song;
    	
    	if (this.artist != tempSong.artist) { 
    		return false;
    	}
    	if (!this.name.equals(tempSong.name)) { 
    		return false;
    	}
    	if (this.durationInSeconds != tempSong.durationInSeconds) { 
    		return false;
    	}
    	System.out.println("Same!");
    	return true;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
