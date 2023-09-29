if (inState(Loading) ) 
	if (transition1.getRest() < loadTime*minute()/2)
		return (loadTime*minute()/2-transition1.getRest())*(-PI/2)/(loadTime*minute()/2);
	else return 0;
if (inState(MouldAsTlt) ) 
	if (transition9.getRest() < loadTime*minute()/2)
		return (transition9.getRest())*(-PI/2)/(loadTime*minute()/2);
	else return (-PI/2);
if (inState(UnloadMould) ) 
	return 0;
if (!inState(Waiting) && currentMould != null) 
	return (-PI/2);
return 0;