package library;

import com.loopj.android.http.*;

public class library1 {

	public static void main(String args[]){
		AsyncHttpClient client = new AsyncHttpClient();
		client.get("http://www.google.com", new AsyncHttpResponseHandler(){
			
			public void onSuccess(String response){
				System.out.println(response);
			}
		});
	}
	
}
