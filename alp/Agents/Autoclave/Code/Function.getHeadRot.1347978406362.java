if (inState(Empty) || 
		inState(Unloading) || 
			inState(Loading) || 
				inState(WatingForUnload)) 
	return PI;
if (inState(WarmingUp) && 
	transition2.getRest() > (2*hour() - minute())) 
	return (PI + PI*(2*hour() - transition2.getRest())/minute());
if (inState(CoolingDown) && 
	transition4.getRest() < minute()) 
	return (PI + PI*(transition4.getRest()/minute()));
return 2*PI;