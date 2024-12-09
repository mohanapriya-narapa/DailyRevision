package SeventyFiveProblems;
import java.util.*;
public class LRUCache {
public class Node{
	int key, value;
	Node prev, next;
	Node(int key, int value){
		this.key=key;
		this.value=value;
	}
}
private final HashMap<Integer, Node> map;
private final Node head, tail;
private final int capacity;

public LRUCache(int capacity)
{
	this.capacity=capacity;
	map=new HashMap<>();
	head=new Node(0,0);
	tail=new Node(0,0);
	head.next=tail;
	tail.prev=head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache=new LRUCache(2);
		cache.put(1,1);
		cache.put(1,1);
		 System.out.println(cache.get(1));
		 cache.put(3, 3);               // Evicts key 2, Cache: {1=1, 3=3}
	        System.out.println(cache.get(2)); // Output: -1
	        cache.put(4, 4);               // Evicts key 1, Cache: {3=3, 4=4}
	        System.out.println(cache.get(1)); // Output: -1
	        System.out.println(cache.get(3)); // Output: 3
	        System.out.println(cache.get(4));
	}
	private int get(int key) {
		// TODO Auto-generated method stub
		if(map.containsKey(key))
		{
			Node node=map.get(key);
			remove(node);
			insert(node);
			return node.value;
		}
		return -1;
	}
	private void put(int key, int value) {
		// TODO Auto-generated method stub
		if(map.containsKey(key))
		{
			remove(map.get(key));
		}
		if(map.size()==capacity)
		{
			remove(tail.prev);
		}
		insert(new Node(key, value));
	}
	private void remove(Node n) {
		// TODO Auto-generated method stub
		map.remove(n.key);
		n.prev.next=n.next;
		n.next.prev=n.prev;
	}
	private void insert(Node n) {
		// TODO Auto-generated method stub
		map.put(n.key, n);
		n.next=head.next;
		head.next.prev=n;
		n.prev=head;
		head.next=n;
	}

}
