package View;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrap {

	public static void main(String[] args) {

		
		try {
			Document doc = Jsoup.connect("https://www.amazon.com.br/s?k=xiaomi&i=electronics&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&ref=nb_sb_noss_2").userAgent("mozilla/17.0").get();
			Elements temp = doc.select("div.class");
			
			
			for (Element element : temp) {
			
				System.out.println(element.getElementsByTag("a").first().text());
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
