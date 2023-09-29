//return cake color during rising process
if (cake.state == RISING_FINISHED) 
	return Cake.colorCake1;
double delta = (time() - storagePlace.loadTime)/(main.risingArea.precureTime*hour());
return lerpColor(delta, Cake.colorCake0, Cake.colorCake1);