import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class News {
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	
	
	
	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "NewsId:" + newsId + ", PostedByUser: " + postedByUser + ", CommentByUser: " + commentByUser
				+ ", Comment: " + comment ;
	}
	
	public static void main(String[] args) 
	{
		List<News> ls=Arrays.asList(
				new News(01, "Iron Man", "Thanos", "Finance Minister Nirmala Sitharaman on Saturday said that the government, undeterred by the COVID-19 pandemic, has been pursuing reforms for achieving sustained long-term growth in a bid to make India one of the top economies of the world in the coming decades."),
				new News(02, "Thor", "Loki", "Replying to debate on Budget 2021-22 in Lok Sabha, she said, the Prime Minister did not lose any opportunity to continue with the reforms and this Budget has set the pace for India to become self-reliant or Aatmanirbhar."),
				new News(03, "Hulk", "She Hulk", "She Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence."),
				new News(04, "Hulk", "Loki", "She said her Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence.")
				);
		
		
		System.out.println("\"Question no -->04");
		ls.stream().max(Comparator.comparing(News::getComment).reversed())
				.map(News::getNewsId)
				.ifPresent(System.out::println);
		
		
		System.out.println("Question no -->05");
		int count=(int) ls.stream()
				.filter(x-> x.comment.contains("Budget"))
				.count();
		System.out.println(count);
		
		
		System.out.println("Question no -->06");
		Optional<String> op=ls.stream()
				.map(News::getCommentByUser)
				.max((i,j)->i.compareTo(j));
		System.out.println(op);
		
		System.out.println("Question no -->07");
		ls.stream()
		.max(Comparator.comparing(News::getNewsId).reversed())
        .map(News::getCommentByUser)
        .ifPresent(System.out::println);
		 
		

	}
	
	

}
