package by.htp.linklibr.libr;

import java.util.Arrays;

public class LinkLibrary {
	
	private String title;

	public LinkLibrary() {
		// TODO Auto-generated constructor stub
	}

	public void addNode( NodeLibr node, NodeLibr newNode ) {
		NodeLibr next = node.getNext();
		while( next != null ){
			next = next.getNext();
		}
		newNode.setPrevious( next );
		newNode.setNext(null);
		next.setNext( newNode );
	}
	
	public void addNode( NodeLibr node, NodeLibr newNode, int index ){
		NodeLibr previous = node.getPrevious();
		while( previous != null ) {
			previous = previous.getPrevious();
		}
		for ( int i = 0; i < index; i++ ){
			previous = previous.getNext();
		}
		//Node
	}

}
