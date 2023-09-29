//return track buffer with avaliable bogey
//for (TrackBuffer tb : autoclaving.trackBuffers)
//	if (tb.getFreeBogey() != null)
//		return tb;
//return null;

//Returns track buffer with avaliable bogey, which is not on maintenance or disabled
for (TrackBuffer tb : autoclaving.trackBuffers){
	Autoclave a = tb.autoclave;
	if (tb.getFreeBogey() != null && !a.isDisabled() && ! a.isOnMaintenance()){
		return tb;
	}
}
//If not found - returns track buffer with avaliable bogey, which is on maintenance, but not disabled
for (TrackBuffer tb : autoclaving.trackBuffers){
	Autoclave a = tb.autoclave;
	if (tb.getFreeBogey() != null && !a.isDisabled() ){
		return tb;
	}
}
return null;

