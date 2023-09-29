//no tasks
if (delayedTasks.size() == 0) return null;

//return prefered task
if (getFreeBogey() != null && destination == out ){
	for (Task task : delayedTasks){
		if (((Cake)task.agent).state == SEPARATED || ((Cake)task.agent).state == TILTED_BACK){
			return task;
		}
	}
}
if ( main.toUnloadCraneCount < 4 && destination != out ){
	for (Task task : delayedTasks){
		if (((Cake)task.agent).state == AUTOCLAVING_FINISHED){
			return task;
		}
	}
}

//return avaliable task, if no prefered
if (main.toUnloadCraneCount < 4){
	for (Task task : delayedTasks){
		if (((Cake)task.agent).state == AUTOCLAVING_FINISHED){
			return task;
		}
	}
}
if (getFreeBogey() != null){
	for (Task task : delayedTasks){	
		if (((Cake)task.agent).state == SEPARATED || ((Cake)task.agent).state == TILTED_BACK){
			return task;
		}
	}
}
return null;