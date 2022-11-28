package Templates.News;

import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

public class MyBaseNewsServiceTest extends BaseNewsServiceTest {

	@Override
	protected NewsService getNewsService() {

		return new SafeNewService(new NewsServiceImpl());

	}

}
