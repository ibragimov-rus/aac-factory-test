double timeLeft = 0;
if (greenSeparationEnabled) 
	if (greenSeparation.delaySize() > 0) timeLeft = greenSeparation.delay.getRemainingTime(greenSeparation.delay.get(0));
	else return 0;
if (!greenSeparationEnabled) 
	if (unloading.whiteSeparation.delaySize() > 0) timeLeft = unloading.whiteSeparation.delay.getRemainingTime(unloading.whiteSeparation.delay.get(0));
	else return 0;

if (timeLeft > separationTime*minute()/2) return 7*(separationTime*minute()-timeLeft)/(separationTime*minute()/2);
return 7*timeLeft/(separationTime*minute()/2);