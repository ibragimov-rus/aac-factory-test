if (inState(TiltingCake) ) 
		return (tiltTime*minute()-transition3.getRest())*PI/2/(tiltTime*minute());
if (inState(TiltingPlatform) ) 
		return (transition5.getRest())*PI/2/(tiltTime*minute());
if (inState(Waiting)||inState(UnloadPlatform) ) 
	return 0;
return PI/2;