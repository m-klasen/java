
public class DoubleList {
	
	private DoubleNode head,cursor;
	
	public DoubleList(){
		head = null;
		cursor = null;
	}
	
	public void add(double d){
		DoubleNode node = new DoubleNode(head, d);
		cursor=head;
		if (head==null)
			head = node;
		while (cursor.next != null){
			cursor = cursor.next;
		}
			cursor.setData(node.Data);
		
	}
	
	public void insertFirst(double d){
		DoubleNode node = new DoubleNode(head, d);
		
		if (head==null)
			head = cursor = node;
		else
			head = cursor = node;
			cursor = cursor.next;
			node.next = cursor.next;
			
		
	}
	
	double get(int i){
		
		for (int x=0;x<i;i++){
			while (cursor.next != null)
				cursor = cursor.next;
		}
		return cursor.getData();
	}
	
	void remove(int i){
		
		for (int x=0;x<i;i++){
			while (cursor.next != null)
				cursor = cursor.next;
		}
		if (cursor.next != null){
			cursor.setData(null);
		}
		else
			cursor.setData();
	}
	
	public String toString(){
		
		StringBuffer sb = new StringBuffer();
		
		while (cursor != null){
			sb.append(cursor.getData());
			sb.append(";");
			cursor = cursor.next;
		}
		return sb.toString();
	}
}
