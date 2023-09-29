if (inState(Waiting) || (isEmpty)) return 0;
if (inState(Loading) ) 
	if (transition17.getRest() > (loadTime*minute())*0.5) return (loadTime-transition17.getRest())/(loadTime*minute()/2)*9;
	else return 9;
if (inState(Unloading)) 
	if (transition19.getRest() < (loadTime*minute())*0.5) return (transition19.getRest())/(loadTime*minute()/2)*9;
	else return 9;
return 9;