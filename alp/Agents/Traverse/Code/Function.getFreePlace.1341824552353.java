//return free place nearest to enter
double dst = infinity;
StoragePlace result = null;
for (StoragePlace i : storage.places)
	if (i.isEmpty && abs(i.position.getY() - in.getY()) < dst){
		result = i;
		dst = abs(i.position.getY() - in.getY());
	}
return result;