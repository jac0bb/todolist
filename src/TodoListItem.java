
public class TodoListItem {
	
	private final String description;
	
	private final int priority; 
	
	private boolean done;
	
	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
		this.done = false;
	}
	
	public int getPriority() {
		
		return priority;
	}

	public String getDescription() {
	
		return description;
	}

	public boolean isDone() {
		
		return done;
	}

	public void markDone() {
		done = true;
		
	}

}
