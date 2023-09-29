//returns autoclave utilization
double downtime = statistcsDowntime.sum();
if (inState(Empty)) downtime += time() - downtimeStart;
return  time() > main.warmingTime*day() ? 1 - downtime/(time() - main.warmingTime*day()) : 0;