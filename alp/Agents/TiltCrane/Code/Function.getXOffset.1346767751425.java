if (inState(Waiting)) return 0;
if (inState(Loading)) return (20 - transition1.getRest()*20/(loadTime*minute()));
if (inState(UnloadMould)) return transition3.getRest()*20/(loadTime*minute());
if (currentMould == null) return 0;
return 20;