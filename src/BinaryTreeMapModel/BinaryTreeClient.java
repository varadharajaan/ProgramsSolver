package BinaryTreeMapModel;

public class BinaryTreeClient {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.put( "f", "eff" );
		tree.put( "c", "sea" );
		tree.put( "a", "aye" );
		tree.put( "e", "eee" );
		tree.put( "i", "eye" );
		tree.put( "h", "aitch" );
		tree.put( "z", "zed" );

		String str = (String) tree.get( "i" ); // str will equal "eye"

		tree.put( "i", "eye updated" );

		str = (String) tree.get( "i" ); // str will equal "eye updated"
	}

}
