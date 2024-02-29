package dataprovider;

import org.testng.annotations.DataProvider;

public class dataofTNregnlogin {
	
	@DataProvider (name = "TNlogin")
	public Object[][] getloginn(){
		Object [][] data = {{"ahsvfdjd111@gmail.com","5497989261"	},
				{"ahsvfdjd2222@gmail.com","5497989261"	},
				{"ahsvfdjd3333@gmail.com","5497989261"	},
				{"ahsvfdjd4444@gmail.com","5497989261"	},
				{"ahsvfdjd5555@gmail.com","5497989261"	},
				{"ahsvfdjd66666@gmail.com","5497989261"	},
				{"ahsvfdjd7777@gmail.com","5497989261"	},
				{"ahsvfdjd8888@gmail.com","5497989261"	}};
		
		
		return data;
		
	}
	
	@DataProvider(name = "TNregister") 
	public Object [][] getreg(){
		Object [][] data = {{"ahad","manik","absgcvhscv111@gmail.com","959595959","777888999","777888999"},
							{"ahad","manik","absgcvhscv222@gmail.com","959595959","777888999","777888999"},
							{"ahad","manik","absgcvhscv3333@gmail.com","959595959","777888999","777888999"},
							{"ahad","manik","absgcvhscv4444@gmail.com","959595959","777888999","777888999"}};
		
		return data;
			
			
		
		
	}
	
											
}
