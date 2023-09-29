//no tasks
if (delayedTasks.size() == 0)
	return null;

//first priority - to storage
if (getFreePlace() != null)
	for (Task task : delayedTasks)
		if (((Mould)task.agent).cake.state == AT_STORAGE_ENTER){
			return task;
		}
		
//second priority - from storage
if (main.fromRisingArea.canEnter())
	for (Task task : delayedTasks)
		if (((Mould)task.agent).cake.state == RISING_FINISHED){
			return task;
		}
return null;