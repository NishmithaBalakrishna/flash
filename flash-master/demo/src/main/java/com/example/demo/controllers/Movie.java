package com.example.demo.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {

	long id;

	@JsonProperty("vote_count")
	int voteCount;
	 String title;
	
	@JsonProperty("poster_path")
	private String posterPath;
	
	private String description;

	private String imageurl;
	
	
	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	
	/*vote_count":6603,"
			+ ""id":198663,"
					+ ""video":false,"
							+ ""vote_average":7,"title":"
									+ ""The Maze Runner","
											+ ""popularity":460.57938,"
													+ ""poster_path":"\/coss7RgL0NH6g4fC2s5atvf3dFO.jpg","
															+ ""original_language":"en","
																	+ ""original_title":"The Maze Runner","
																			+ ""genre_ids":[28,9648,878,53],"
																					+ ""backdrop_path":"\/lkOZcsXcOLZYeJ2YxJd3vSldvU4.jpg","
																							+ ""adult":false,"
																									+ ""overview":"Set in a post-apocalyptic world, young Thomas is deposited in a community of boys after his memory is erased, soon learning they're all trapped in a maze that will require him to join forces with fellow “runners” for a shot at escape.",
																									"release_date":"2014-09-10"},{""
																											+ "vote_count":6673,
																											"id":245891,"video":false,"vote_average":7,"title":"John Wick","popularity":337.234621,"poster_path":"\/5vHssUeVe25bMrof1HyaPyWgaP.jpg","original_language":"en","original_title":"John Wick","genre_ids":[28,53],"backdrop_path":"\/umC04Cozevu8nn3JTDJ1pc7PVTn.jpg","adult":false,"overview":"Ex-hitman John Wick comes out of retirement to track down the gangsters that took everything from him.","release_date":"2014-10-22"},{"vote_count":6266,"id":346364,"video":false,"vote_average":7.1,"title":"It","popularity":297.38534,"poster_path":"\/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg","original_language":"en","original_title":"It","genre_ids":[18,27,53],"backdrop_path":"\/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg","adult":false,"overview":"In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.","release_date":"2017-09-05"},{"vote_count":1817,"id":354912,"video":false,"vote_average":7.7,"title":"Coco","popularity":268.471977,"poster_path":"\/eKi8dIrr8voobbaGzDpe8w0PVbC.jpg","original_language":"en","original_title":"Coco","genre_ids":[16,12,35],"backdrop_path":"\/askg3SMvhqEl4OL52YuvdtY40Yb.jpg","adult":false,"overview":"Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.","release_date":"2017-10-27"},"
																											+ "
*/}
