if (inState(Loading))
	if (transition17.getRest() > loadTime/2)
		return -(loadTime*minute() - transition17.getRest())/(loadTime*minute()/2)*(destination == out ? 18 - cakeToBogey.get(currentCake).blocks*6 + 2 : 22 );
	else return (-transition17.getRest())/(loadTime*minute()/2)*(destination == out ? 18 - cakeToBogey.get(currentCake).blocks*6 + 2 : 22 );
if (inState(Unloading))
	if (transition19.getRest() > loadTime/2)
		return -(loadTime*minute() - transition19.getRest())/(loadTime*minute()/2)*(destination != out ? 18-cakeToBogey.get(currentCake).blocks*6 + 2 : 22 );
	else return -transition19.getRest()/(loadTime*minute()/2)*(destination != out ? 18 - cakeToBogey.get(currentCake).blocks*6 + 2 : 22 );
return 0;