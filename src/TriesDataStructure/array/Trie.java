package TriesDataStructure.array;

public class Trie 
{
	
	char c;
	Trie[]children;
	boolean word;
	
	public Trie() {
	
	this.c =0;
	this.children= new Trie[26];
	this.word =false;
	}
	
	public void add ( String s) {
		if (s.isEmpty()) {
			this.word = true;
			
		}
		
		char letter = s.charAt(0);
		int index = letter-'a';
		if ( this.children[index]==null) {
			this.children[index] = new Trie();
		}
		
		this.children[index].add(s.substring(1));
	}
	
	public boolean isWord(String s) {
		if (s.isEmpty()) {
			return this.word;
		}
		
		char letter = s.charAt(0);
		int index = letter='a';
		if ( this.children[index]==null) {
			return false;
		}
		
		return this.children[index].isWord(s.substring(1));
	}
	
	
	public static void main(String[] args) {
		Trie tr = new Trie();
		tr.add("varadha");
		tr.add("var");
		tr.add("like");
		tr.add("likes");
		
		
		System.out.println(tr.isWord("varadha"));
		System.out.println(tr.isWord("like"));
		System.out.println(tr.isWord("lliksse"));
	}

}

