while (delayedTasks.size() > 0){
	Autoclave a = ((TrackBuffer)delayedTasks.get(0).agent).autoclave;
	if (a.isLoaded()){
		return true;
	}
	if (a.isDisabled() || a.isOnMaintenance()){
		delayedTasks.remove(0);
	} else{
		return true;
	}
}
return false;