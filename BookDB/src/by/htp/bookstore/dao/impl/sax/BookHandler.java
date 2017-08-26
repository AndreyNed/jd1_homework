package by.htp.bookstore.dao.impl.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.bookstore.domain.BookElement;

public class BookHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println( "SAX parser found root element" );

	}

	@Override
	public void endDocument() throws SAXException {
		
		System.out.println( "SAX parser finished parsing" );
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.println("uri: " + uri + "; localName: " + localName + "; qName: " + qName + "; attrs: " + attributes);
		BookElement currentElement = BookElement.valueOf(qName.toUpperCase());
		
		switch ( currentElement ) {
		case BOOK:
			System.out.println( "Found Book: " + qName );
			break;
		case PAGES:
			System.out.println( "Found Book: " + qName );
			break;
		case TITLE:
			System.out.println( "Found Book: " + qName );
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		super.characters(ch, start, length);
	}
	
}
