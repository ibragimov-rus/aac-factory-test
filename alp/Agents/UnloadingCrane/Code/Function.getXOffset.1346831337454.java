if (inState(Waiting)) return 0;
if (inState(Loading)) return ((loadTime*minute())-transition17.getRest())/(loadTime*minute())*20;
if (inState(Unloading)) return (transition19.getRest())/(loadTime*minute())*20;
if (isEmpty) return 0;
return 20;