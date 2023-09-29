if (inState(Loading))
	if (transition17.getRest() > loadTime/2)
		return -(loadTime*minute() - transition17.getRest())/(loadTime*minute()/2)*20;
	else return (-transition17.getRest())/(loadTime*minute()/2)*20;
if (inState(Unloading))
	if (transition19.getRest() > loadTime/2)
		return -(loadTime*minute() - transition19.getRest())/(loadTime*minute()/2)*((getY() != out.getY() || unloading.batch.size() == 0) ? 20 : 14);
	else return -transition19.getRest()/(loadTime*minute()/2)*(( unloading.batch.size() == 0 || getY() != out.getY()) ? 20 : 14);
return 0;