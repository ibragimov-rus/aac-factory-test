this.state = state;
if (main.refreshTimePlotCharts.isActive())
	main.refreshTimePlotCharts.restart(0);
else 
	states.add(this.state);
