if (inState(Waiting) || (isEmpty)) return 0;
if (inState(Loading) ) 
	if (transition17.getRest() < (loadTime*minute())*0.5) return (loadTime*0.5-transition17.getRest())/(loadTime*minute()/2)*6;
	else return 0;
if (inState(Unloading)) 
	if (transition19.getRest() > (loadTime*minute())*0.5) return (transition19.getRest() - (loadTime*minute())*0.5)/(loadTime*minute()/2)*6;
	else return 0;
return 6;