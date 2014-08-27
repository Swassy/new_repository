package links;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Links {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter url name :");
		String fore[]=sc.nextLine().split("//");
		String a[]=fore[1].split("/");
		//System.out.println(fore[0]);
		String url=fore[0]+"//"+a[0];
		String baseUrl="";
		/*for(String n: a)
			System.out.println("\n"+n);*/
		for(int i=1;i<a.length;i++)
		{
			baseUrl+="/"+a[i];
		}
		//System.out.println(baseUrl);
		//System.out.println(url+" "+baseUrl);
		url=url+baseUrl;
		Document doc = Jsoup.connect(url).get(); 
		//System.out.println(doc.select("a[href]"));
		for (Element link :  doc.select("a[href]")) {/*System.out.print("entered");System.out.println(link);*/
		    System.out.println(link.attr("href"));
		}
		

	}

}
