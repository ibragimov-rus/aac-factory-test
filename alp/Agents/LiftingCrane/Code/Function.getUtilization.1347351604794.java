double downtime = statisticsDowntime.sum();
if (inState(Waiting)) downtime += time() - downtimeStart;
return  time()>Main.warmingTime*day() ? 1 - downtime/(time()-Main.warmingTime*day()) : 0;