import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class MyBaseSocialNetworkTest extends BaseSocialNetworkTest {

	@Override
	protected SocialNetwork getSocialNetwork() {
		// TODO Auto-generated method stub
		return new MySocialNetwork();
	}

}
