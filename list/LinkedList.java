package list;

import java.util.NoSuchElementException;



import utility.List;
import utility.Iterator;

public class LinkedList<E> implements List<E> {
	private Node<E> start;
	private int 	size;
	
	public LinkedList() {
		start = null;
		size = 0;
	}
	
	public LinkedList(LinkedList<E> other) {
		this.start = other.start;
		this.size = other.size;
	}
	
	public boolean add(E element) {
		int oldSize = size;
		Node<E> oldLastNode = null;
		Node<E> newLastNode = new Node<E>(start, element);
		
		if(size == 0) {
			start = newLastNode;
			start.next = start;
		} else {
			oldLastNode = node(size - 1);
			oldLastNode.next = newLastNode;
			newLastNode.next = start;
		}
		size++;
		return size == oldSize + 1;
	}
	
	public void add(int index, E element) {
		if(index != 0) {
			checkIndex(index - 1);
		}
		if (index == size) {
			add(element);
		} else {
			linkBefore(index, element);
		}
	}
	
	private void checkIndex(int index) {
		String message = "index: " + index + ", size: " + size;
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException(message);
		}
	}
	
	public void clear() {
		for (Node<E> x = start; x != null; x = x.next) {
			x.data = null;
			x.next = null;
		}
		start = null;
		size = 0;
	}
	
	public boolean contains(E element) {
		for(Node<E> x = start.next; x != null; x = x.next) {
			if(x.data.equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	public E get(int index) {
		checkIndex(index);
		return node(index).data;
	}
	
	public Iterator<E> iterator() {
		return new LinkedIterator();
	}
	
	public int indexOf(E element) {
		int count = -1;
		Node<E> x = start; 
		for(int i = 0; i < size; i++) {
			count++;
			if(x.data.equals(element)) {
				return count;
			}
			x = x.next;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		if(start == null) {
			return true;
		}
		return false;
	}
	
	private void linkBefore(int index, E element) {
		checkIndex(index);
		Node<E> prevNode;
		Node<E> current 	= null;
		Node<E> newNode 	= null;
		
		if(index == 0) {
			newNode = new Node<E>(start, element);
			Node<E> lastNode = node(size - 1);
			lastNode.next = newNode;
			start = newNode;
		} else {				
			current 		= node(index);
			newNode 		= new Node<E>(current, element);
			prevNode		= node(index - 1);
			prevNode.next 	= newNode;
			newNode.next	= current;
		}
		size++;
	}
	
	public E peek() {
		if(start == null) {
			throw new NoSuchElementException("No elements in list.");
		}
		return start.data;
	}
	
	public E remove() {
		if (size == 0) {
			throw new NoSuchElementException("No elements in list.");
		}
		if (size == 1) {
			E element = start.data;
			start = null;
			size--;
			return element;
		}
		E element = start.data;
		Node<E> newSNode = start.next;
		Node<E> node = node(size - 1);
		node.next = newSNode;		
		start = newSNode;
		
		size--;
		return element;
	}
	
	public E remove(int index) {
		checkIndex(index);
		Node<E> remNode = node(index);
		
		if(index == 0) {
			return remove();
		} else {
			E element = remNode.data;
			Node<E> prevNode = node(index - 1);
			prevNode.next = remNode.next;
			size--;
			return element;
		}
	}
	
	public boolean remove(E element) {
		if (contains(element)) {
			E item = remove(indexOf(element));
			return element.equals(item);
		}
		return false;
	}
	
	public E set(int index, E element) {
		checkIndex(index);
		E tempData = node(index).data;
		node(index).data = element;
		return tempData;
	}
	
	private Node<E> node(int index){
		checkIndex(index);
		Node<E> current = null;
		if(index < size) {
			current = start;
			for(int i = 0; i < index; i++) {
				current = current.next;
			}
		}
		return current;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		if (start == null) {
			return "[ ]";
		} else {
			String result = "[ " + start.data;
			for (Node<E> x = start.next; x != start; x = x.next) {
				result += ", " + x.data;
			}
			result += " ]";
			return result;
		}
	}
	
	public static class Node<E> {
		private E    data;
		private Node<E> next;
		
		private Node(Node<E> next, E data) {
			this.data = data;
			this.next = next;
		}
	}
	
	private class LinkedIterator implements Iterator<E>{
		private boolean isRemovable;
		private Node<E> current;
		private int position;
		
		public LinkedIterator() {
			isRemovable = false;
			current = start;
			position = 0;
		}
		
		public boolean hasNext() {
			return position < size;
		}
		
		public E next() {
			if(!hasNext()) {
				throw new NoSuchElementException("No elements left in list");
			}
			
			E itrElement = current.data;
			current = current.next;
			position++;
			isRemovable = true;
			return itrElement;
		}
		
		public void remove() {
			if(!isRemovable) {
				throw new IllegalStateException("Unable to remove item");
			}			
			
			if(position == 0) {
				Node<E> lastNode = node(size - 1); 
				lastNode.next = start;
				
			} else if (position == 1) {
				start.next = current.next;
				
			} else {
				Node<E> previous = node(position - 2);
				previous.next 	 = current;
				
			}
			size--;
			isRemovable 	 = false;	
		}
	}
}
