package parsers;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Commentparse extends DefaultHandler {
	boolean comment_id = false;
	boolean comment_time = false;
	boolean comment = false;
	boolean comment_type = false;

	public static void main(String[] args){

		try {	
			File xmlFile = new File("xmls/Comment.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			Customerparse userhandler = new Customerparse();
			saxParser.parse(xmlFile, userhandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void startElement(String uri, 
			String localName, String qName, Attributes attributes)
					throws SAXException {
		if (qName.equalsIgnoreCase("comment_id")) {
			comment_id = true;
		}else  if (qName.equalsIgnoreCase("customer_title")) {
			customer_title = true;
		}
}


