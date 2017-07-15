package by.sb.xml_to_prj;

//import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Source {

	private int deep;
	
	private void printSpaces ( int countOfSpaces, int mult ){
		for ( int i = 0; i < ( countOfSpaces * mult ); i++ ) {
			System.out.print(" ");
		}
	}
	
	private void printChildren( Node node ) {
		NodeList list = node.getChildNodes();
		deep++;
		for ( int i = 0; i < list.getLength(); i++ ) {
			Node item = list.item( i );
			if ( item.getNodeType() != Node.TEXT_NODE ) {
				printSpaces( 4, deep );
				System.out.print( item.getNodeName() );
				if ( item.hasAttributes() ) {
					NamedNodeMap attributeList = item.getAttributes();
					for ( int j = 0; j < attributeList.getLength(); j++ ) {
						Node attrItem = attributeList.item( j );
						System.out.print(" " + attrItem.getNodeName() + "='" + attrItem.getNodeValue() + "'" );
					}
					System.out.println();
				}
				else {
					System.out.println();
				}
				
				if ( item.hasChildNodes() ) {
					printChildren ( item );
				}
			} else {
				String text = item.getNodeValue();
				if ( !text.trim().equals( "" ) ){
					printSpaces( 4, deep );
					System.out.println("'" + item.getNodeValue() + "'");
				}	
			}
		}
		deep--;
	}
	
	public void parseXML( String name ) {
		
		try{
			//Построитель документа
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			//Дерево DOM документа из файла
			Document doc = builder.parse( name );
			//Корневой элемент
			Node root = doc.getDocumentElement();
			System.out.println(root.getNodeName());
			deep = 0;
			printChildren( root );
		
		} catch ( ParserConfigurationException ex ) {
			ex.printStackTrace( System.out );
		} catch ( SAXException ex ) {
			ex.printStackTrace( System.out );
		} catch ( IOException ex ) {
			ex.printStackTrace( System.out );
		}
		
	}
	
}
