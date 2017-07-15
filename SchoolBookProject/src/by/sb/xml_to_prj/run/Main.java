package by.sb.xml_to_prj.run;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import by.sb.xml_to_prj.*;

public class Main {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		Source source = new Source();
		source.parseXML( "xml/project.xml" );
		Writer writer = new Writer();
		writer.writeXML( "xml/output.xml" );
	}

}
