if (inState(Loading)) 
	if (transition1.getRest() > loadTime*minute()/2) return -(20 - (transition1.getRest() - loadTime*minute()/2)*20/(loadTime*minute()/2));
	else  return -(transition1.getRest()*20/(loadTime*minute()/2));
if (inState(UnloadCake)) 
	if (transition5.getRest() > loadTime*minute()/2) return -(15 - (transition5.getRest() - loadTime*minute()/2)*15/(loadTime*minute()/2));
	else  return -(transition5.getRest()*15/(loadTime*minute()/2));
if (inState(UnloadMould)) 
	if (transition3.getRest() > loadTime*minute()/2) return -(20 - (transition3.getRest() - loadTime*minute()/2)*20/(loadTime*minute()/2));
	else  return -(transition3.getRest()*20/(loadTime*minute()/2));
if (inState(MouldAsTlt)) 
	if (transition9.getRest() > loadTime*minute()/2) return -(17 - (transition9.getRest() - loadTime*minute()/2)*17/(loadTime*minute()/2));
	else  return -(transition9.getRest()*17/(loadTime*minute()/2));
return 0;