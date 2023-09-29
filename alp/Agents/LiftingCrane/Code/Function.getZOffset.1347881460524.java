if (inState(Loading))
	if (transition17.getRest() > loadTime/2)
		return -(loadTime*minute() - transition17.getRest())/(loadTime*minute()/2)*15;
	else return (-transition17.getRest())/(loadTime*minute()/2)*15;
if (inState(Unloading))
	if (transition19.getRest() > loadTime/2)
		return -(loadTime*minute() - transition19.getRest())/(loadTime*minute()/2)*17;
	else return -transition19.getRest()/(loadTime*minute()/2)*17;
return 0;