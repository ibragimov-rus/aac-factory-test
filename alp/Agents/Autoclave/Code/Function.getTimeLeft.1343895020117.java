//returns autoclaving time left
int time = (int)(duration*hour() - (time() - startTime));
int h = time/60;
int m = time%60;
return (h < 10 ? "0" : "" ) + h + ":" + (m < 10 ? "0" : "" ) + m;