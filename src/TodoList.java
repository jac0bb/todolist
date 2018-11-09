import java.util.ArrayList;
import java.util.List;

public class TodoList {
    /*
     * Add a new item to the list, given a description and priority.
     */
	List<TodoListItem> items = new ArrayList<>();
    public void addItem(String description, int priority) {
        TodoListItem item = new TodoListItem(description, priority);
    	items.add(item);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
       
        return items.get(i);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        
    	return items.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        for(int i =0; i > items.size(); i++) {
        	TodoListItem item = items.get(i);
        	if(item.isDone() == false) {
        		return item;
        	}
        }
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
