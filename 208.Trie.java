class TrieNode {
    // Initialize your data structure here.
    char c;
    HashMap<Character, TrieNode> childs = new HashMap<Character, TrieNode>();
    boolean isWord;
    public TrieNode() {
        
    }
    public TrieNode(char c) {
        this.c = c;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        
        char [] arrayc = word.toCharArray();
        for (int i = 0; i < arrayc.length; i++){
            char ch = arrayc[i];
            HashMap<Character, TrieNode> curchild = node.childs;
            if (!curchild.containsKey(ch)){
                TrieNode newnode = new TrieNode(ch);
                curchild.put(ch, newnode);
                node = newnode;
            }
            else{
                TrieNode cur = curchild.get(ch);
                node = cur;
            }
            if (i == arrayc.length - 1) {
            node.isWord = true;
        }
        
            
        }
        
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        char [] arrayc = word.toCharArray();
        for (int i = 0; i < arrayc.length; i++) {
            char ch = arrayc[i];
            HashMap <Character, TrieNode> cur = node.childs;
            if (!cur.containsKey(ch)){
                return false;
            }
            node = cur.get(ch); 
        }
        return node.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        char [] array = prefix.toCharArray();
        for (int i = 0; i < array.length; i++){
            char ch = array[i];
            HashMap<Character, TrieNode> cur = node.childs;
            if (!cur.containsKey(ch)) {
                return false;
            }
            node = cur.get(ch);
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
