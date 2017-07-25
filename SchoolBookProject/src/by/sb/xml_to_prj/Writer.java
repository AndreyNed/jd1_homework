package by.sb.xml_to_prj;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Writer {

	public void writeXML ( String fileName ) {
		try {
			
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = builder.parse( fileName );
			addNewDocument( document );
			
			//writeDocument( document );
			
		} catch ( ParserConfigurationException ex ) {
			ex.printStackTrace( System.out );
		} catch ( SAXException ex ) {
			ex.printStackTrace( System.out );
		} catch ( IOException ex ) {
			ex.printStackTrace( System.out );
		}
	}
	
	private void addNewDocument( Document document ) throws TransformerFactoryConfigurationError, DOMException, IOException {
		//Корневой элемент
		Node root = document.getDocumentElement();
		//Создание книги по элементам
		//String[] elements = { "book", "meta", "book_id", "title", "book_part" };
		//createElements( document, elements );
		//EntityReference part1 = document.createEntityReference("part1.xml");
		//Element book = document.createElement( "book" );
		//book.setAttribute("xmlns",  "http://www.schoolbook.by/book" );
		Element meta = document.createElement( "meta" );
		Element book_id = document.createElement( "book_id" );
		book_id.setTextContent( "t" );
		Element title = document.createElement( "title" );
		title.setTextContent( "Русский язык" );
		Element book_part = document.createElement( "book_part" );
		book_part.setTextContent( "1" );
		
		meta.appendChild( book_id );
		meta.appendChild( title );
		meta.appendChild( book_part );
		//root.appendChild((Node)part1);
		root.appendChild( meta );
		//root.appendChild( book );
		
		writeDocument( document );
		
		//System.out.println( book.getTagName() );
	}
	
	private void writeDocument( Document document ) throws TransformerFactoryConfigurationError, IOException {
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource( document );
			FileOutputStream fos = new FileOutputStream( "xml/output_final.xml" );
			StreamResult result = new StreamResult( fos );
			transformer.transform(source,  result);
		} catch ( TransformerException ex ) {
			ex.printStackTrace( System.out );
		}
	}
	
	/*private void createElements( Document document, String[] elements ){
		for ( int i = 0; i < elements.length; i++ ){
			document.createElement( elements[ i ] );
		}
	}*/
	
}
