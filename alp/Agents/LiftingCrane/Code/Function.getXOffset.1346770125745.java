if (inState(Waiting)) return 0;
if (inState(Loading)) return (20 - transition17.getRest()*20/(loadTime*minute()));
if (inState(Unloading)) return transition19.getRest()*20/(loadTime*minute());
if (isEmpty) return 0;
return 20;