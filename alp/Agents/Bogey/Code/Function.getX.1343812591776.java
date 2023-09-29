//return bogey x-coordinate depends on bogey n
double defX = 180 + 60*n + 24;
double inAutoclaveX = -235 + 50*n;

//return bogeys offset
if(inAutoclave) return inAutoclaveX;
if(autoclaving.autoclaveTraverse.inState(AutoclaveTraverse.Working) && trackBuffer == autoclaving.autoclaveTraverse.destination)
	if(autoclaving.autoclaveTraverse.destination.state) 
		return defX - (autoclaving.autoclaveTraverse.transition.getRest()*(defX - inAutoclaveX)/(autoclaving.traverseLoadTime*minute()));
	else 
		return defX - (defX - inAutoclaveX)*(1-autoclaving.autoclaveTraverse.transition.getRest()/(autoclaving.traverseLoadTime*minute()));
return defX;