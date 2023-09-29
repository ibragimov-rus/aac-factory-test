//return the place where mould storing
for (StoragePlace i : storage.places)
	if (i.currentMould == mould)
		return i;
return null;